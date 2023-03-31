package com.operaciones.cuentas.service;

import com.operaciones.cuentas.dto.ClienteDto;
import com.operaciones.cuentas.dto.CuentaDto;

import java.util.List;

public interface CuentaService {
    CuentaDto agregarCuenta(CuentaDto dto);

    List<CuentaDto> obtenerCuenta();

    CuentaDto editarCuenta(CuentaDto dto);

    String eliminarCuenta(Integer id);
}
