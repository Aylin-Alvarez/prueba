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
public class MovimientosDto {
   private String fecha, tipomovimiento;
   private BigInteger valor, saldo;

   private CuentaDto idCuenta;


}
