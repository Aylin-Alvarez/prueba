package com.operaciones.cuentas.mapper;

import com.operaciones.cuentas.dto.MovimientosDto;
import com.operaciones.cuentas.entity.MovimientosEntity;

public class MovimientosMapper {
    public static MovimientosEntity dtoToMovimientosEntityAdd(MovimientosDto dto) {
        return MovimientosEntity.builder()
                .idCuenta(CuentaMapper.dtoToCuentaEntity(dto.getIdCuenta()))
                .tipoMovimiento(dto.getTipomovimiento())
                .saldo(dto.getSaldo())
                .fecha(dto.getFecha())
                .valor(dto.getValor())
                .build();
    }

    public static MovimientosEntity dtoToMovimientosEntity(MovimientosDto dto) {
        return MovimientosEntity.builder()
                .idCuenta(CuentaMapper.dtoToCuentaEntity(dto.getIdCuenta()))
                .valor(dto.getValor())
                .fecha(dto.getFecha())
                .saldo(dto.getSaldo())
                .tipoMovimiento(dto.getTipomovimiento())
                .build();
    }
    public static MovimientosDto entityToDto(MovimientosEntity dto) {
        return MovimientosDto.builder()
                .idCuenta(CuentaMapper.entityToDto(dto.getIdCuenta()))
                .fecha(dto.getFecha())
                .saldo(dto.getSaldo())
                .valor(dto.getValor())
                .tipomovimiento(dto.getTipoMovimiento())
                .build();
    }
}
