package com.operaciones.cuentas.exception;

import java.util.List;

/**
 * The type Prueba tecnica exception.
 */
public class PruebaTecnicaException extends RuntimeException {
    private final EMessageException option;
    private final ApiError body;

    /**
     * Constructor
     *
     * @param folio    the folio
     * @param detalles the detalles
     * @param option   the option
     */
    public PruebaTecnicaException(String folio, List<String> detalles, EMessageException option) {
        super(option.getMensaje());
        this.option = option;
        this.body = new ApiError(option.getCodigo(), option.getMensaje(), folio, option.getInfo(), detalles);

    }

    /**
     * Get exception
     *
     * @return EMensajeException option
     */
    public EMessageException getOption() {
        return this.option;
    }

    /**
     * Get body
     *
     * @return ApiException body
     */
    public ApiError getBody() {
        return body;
    }
}
