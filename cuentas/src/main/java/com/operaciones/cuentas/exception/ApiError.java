package com.operaciones.cuentas.exception;

import lombok.Data;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * The
 * type
 * Api
 * error.
 */
@Data
public class ApiError implements Serializable {

    private static final long serialVersionUID = -81257429738086978L;

    /**
     * codigo.
     */
    protected String codigo;
    /**
     * mensaje.
     */
    protected String mensaje;
    /**
     * folio.
     */
    protected String folio;
    /**
     * info.
     */
    protected String info;
    /**
     * detalles.
     */
    protected List<String> detalles;

    /**
     * Instantiates a new Api error.
     */
    public ApiError() {
        super();
    }

    /**
     * Instantiates
     * a new
     * Api
     * error.
     *
     * @param codigo   the codigo
     * @param mensaje  the mensaje
     * @param folio    the folio
     * @param info     the info
     * @param detalles the detalles
     */
    public ApiError(String codigo, String mensaje, String folio, String info, List<String> detalles) {
        super();
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.folio = folio;
        this.info = info;
        this.detalles = Collections.unmodifiableList(detalles);
    }

    /**
     * Constructor
     * Enum.
     *
     * @param error    the error
     * @param folio    the folio
     * @param detalles the detalles
     */
    public ApiError(EMessageException error, String folio, List<String> detalles) {
        super();
        this.codigo = error.getCodigo();
        this.mensaje = error.getMensaje();
        this.info = error.getInfo();
        this.folio = folio;
        this.detalles = Collections.unmodifiableList(detalles);
    }

}

