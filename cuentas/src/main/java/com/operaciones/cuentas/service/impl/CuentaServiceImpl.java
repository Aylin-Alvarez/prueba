package com.operaciones.cuentas.service.impl;

import com.operaciones.cuentas.dao.CuentaDao;
import com.operaciones.cuentas.dto.CuentaDto;
import com.operaciones.cuentas.entity.CuentaEntity;
import com.operaciones.cuentas.mapper.CuentaMapper;
import com.operaciones.cuentas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CuentaServiceImpl implements CuentaService {
    @Autowired
    private CuentaDao cuentaDao;

    @Override
    public CuentaDto agregarCuenta(CuentaDto dto) {
        CuentaEntity cuentaEntity = cuentaDao.save(CuentaMapper.dtoToCuentaEntityAdd(dto));
        return CuentaMapper.entityToDto(cuentaEntity);
    }

    @Override
    public List<CuentaDto> obtenerCuenta() {
        List<CuentaEntity> cuentas = cuentaDao.findAll();
        return cuentas.stream().map(c -> CuentaMapper.entityToDto(c)).collect(Collectors.toList());
    }

    @Override
    public CuentaDto editarCuenta(CuentaDto dto) {
        CuentaEntity cuenta = cuentaDao.save(CuentaMapper.dtoToCuentaEntity(dto));
        return CuentaMapper.entityToDto(cuenta);
    }

    @Override
    public String eliminarCuenta(Integer id) {
        cuentaDao.deleteById(id);
        return "Se elimino correctamente";
    }


}
