package com.operaciones.cuentas.service;

import com.operaciones.cuentas.dto.MovimientosDto;

import java.util.List;

public interface MovimientosService {
    MovimientosDto agregarMovimiento(MovimientosDto dto);

    List<MovimientosDto> obtenerMovimiento();

    MovimientosDto editarMovimiento(MovimientosDto dto);

    String eliminarMovimiento(Integer id);
}
