package com.operaciones.cuentas.exception;

public enum EMessageException {
    /**
     * The E 400.
     */
    E400("400.PruebaTecnica",
            "Parámetros no válidos, por favor valide su información.",
            "info#400.PruebaTecnica"),
    /**
     * The E 401.
     */
    E401("401.PruebaTecnica",
            "Acceso Denegado, por favor valide su información.",
            "info#401.PruebaTecnica"),
    /**
     * The E 404.
     */
    E404("404.PruebaTecnica",
            "Información no encontrada, favor de validar.",
            "info#404.PruebaTecnica"),
    /**
     * The E 404.
     */
    E405("405.PruebaTecnica",
            "Verbo en el método erroneo favor de validar.",
            "info#405.PruebaTecnica"),
    /**
     * The E 500.
     */
    E500("500.PruebaTecnica",
            "No se recibió respuesta del servidor.",
            "info#500.PruebaTecnica");



    private String codigo;
    private String mensaje;
    private String info;

    EMessageException(String codigo, String mensaje, String info) {
        this.codigo = codigo;
        this.mensaje = mensaje;
        this.info = info;
    }

    public String getCodigo() {
        return codigo;
    }


    public String getMensaje() {
        return mensaje;
    }


    public String getInfo() {
        return info;
    }
}
