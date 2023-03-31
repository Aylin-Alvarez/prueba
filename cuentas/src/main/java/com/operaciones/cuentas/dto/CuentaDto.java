package com.operaciones.cuentas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CuentaDto {
    private String contrasena, numeroCuenta, tipoCuenta;
    private Boolean estado;
    private BigInteger saldoinicial;
    private ClienteDto clienteid;
    private Integer idCuenta;

}
