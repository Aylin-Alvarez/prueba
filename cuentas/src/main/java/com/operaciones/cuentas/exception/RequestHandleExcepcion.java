package com.operaciones.cuentas.exception;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * The type Request excepcion.
 */
@RestControllerAdvice
public class RequestHandleExcepcion {
    /**
     * my regex
     */
    private static final Pattern myRegex = Pattern.compile("/\\/");
    /**
     * l o g g e r
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestHandleExcepcion.class);


    /**
     * Handle validation exceptions response entity.
     *
     * @param ex the ex
     * @return the response entity
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<String> stringList =
                ex.getBindingResult().getAllErrors().stream().map(this::generarMensaje).collect(Collectors.toList());
        return new ResponseEntity<>(new PruebaTecnicaException(
                "PT0400", stringList,
                EMessageException.E400).getBody(), HttpStatus.BAD_REQUEST);

    }

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    @ExceptionHandler(value = {MissingServletRequestParameterException.class})
    public ResponseEntity<Object> handleValidationExceptions401(MissingServletRequestParameterException ex) {
        List<String> detalles = new ArrayList<>();

        detalles.add("El campo " + ex.getParameterName() + " es requerido");

        return new ResponseEntity<>(new ApiError(EMessageException.E404.getCodigo(),
                EMessageException.E404.getMensaje(), "PT0404", EMessageException.E404.getInfo(), detalles),
                HttpStatus.NOT_FOUND);
    }


    /**
     * Handle validation exceptions 404 response entity.
     *
     * @param ex the ex
     * @return the response entity
     * @throws IOException the io exception
     */
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleValidationExceptions404(ResponseStatusException ex)
            throws IOException {
        List<String> detalles = new ArrayList<>();
        ApiError apiException = null;
        String str = ex.getMessage();
        str = str.substring(str.indexOf('{')).replaceAll(myRegex.pattern(), "");
        Map<String, String> map = new ObjectMapper().readValue(str, HashMap.class);
        detalles.add(map.get("detalle"));
        if (ex.getMessage().contains("E404")) {
            apiException = new ApiError(EMessageException.E404.getCodigo(),
                    EMessageException.E404.getMensaje(), "PT0404", EMessageException.E404.getInfo(), detalles);
        }
        if (ex.getMessage().contains("E401")) {
            apiException = new ApiError(EMessageException.E401.getCodigo(),
                    EMessageException.E401.getMensaje(), "PT0401", EMessageException.E401.getInfo(), detalles);
        }
        if (ex.getMessage().contains("E400")) {
            apiException = new ApiError(EMessageException.E400.getCodigo(),
                    EMessageException.E400.getMensaje(), "PT0400", EMessageException.E400.getInfo(), detalles);
        }
        return new ResponseEntity<>(apiException, ex.getStatus());
    }
    /**
     * Se construye str con msj de error
     *
     * @param error
     * @return String
     */

    private String generarMensaje(ObjectError error) {
        String mensaje = null;
        String code = error.getCode();
        if (code.contains("NotNull")) {
            mensaje = String.format("%s es requerido", error.getDefaultMessage());
        }
        else {
            mensaje = String.format("%s esta mal formado", error.getDefaultMessage());
        }
        return mensaje;
    }
}

