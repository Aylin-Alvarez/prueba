package com.operaciones.cuentas.mapper;

import com.operaciones.cuentas.dto.CuentaDto;
import com.operaciones.cuentas.entity.CuentaEntity;

public class CuentaMapper {
    public static CuentaEntity dtoToCuentaEntityAdd(CuentaDto dto) {
        return CuentaEntity.builder()
                .numeroCuenta(dto.getNumeroCuenta())
                .tipoCuenta(dto.getTipoCuenta())
                .clienteid(ClienteMapper.dtoToClienteEntity(dto.getClienteid()))
                .build();
    }

    public static CuentaEntity dtoToCuentaEntity(CuentaDto dto) {
        return CuentaEntity.builder()
                .idCuenta(dto.getIdCuenta())
                .numeroCuenta(dto.getNumeroCuenta())
                .tipoCuenta(dto.getTipoCuenta())
                .clienteid(ClienteMapper.dtoToClienteEntity(dto.getClienteid()))
                .build();
    }
    public static CuentaDto entityToDto(CuentaEntity dto) {
        return CuentaDto.builder()
                .idCuenta(dto.getIdCuenta())
                .numeroCuenta(dto.getNumeroCuenta())
                .tipoCuenta(dto.getTipoCuenta())
                .clienteid(ClienteMapper.entityToClienteDto(dto.getClienteid()))
                .build();
    }
}
