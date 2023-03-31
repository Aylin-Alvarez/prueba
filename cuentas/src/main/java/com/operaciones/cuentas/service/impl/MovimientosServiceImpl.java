package com.operaciones.cuentas.service.impl;

import com.operaciones.cuentas.dao.MovimientosDao;
import com.operaciones.cuentas.dto.MovimientosDto;
import com.operaciones.cuentas.entity.CuentaEntity;
import com.operaciones.cuentas.entity.MovimientosEntity;
import com.operaciones.cuentas.mapper.CuentaMapper;
import com.operaciones.cuentas.mapper.MovimientosMapper;
import com.operaciones.cuentas.service.MovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovimientosServiceImpl implements MovimientosService {

    @Autowired
    private MovimientosDao movimientosDao;
    @Override
    public MovimientosDto agregarMovimiento(MovimientosDto dto) {
        MovimientosEntity movimientosEntity = movimientosDao.save(MovimientosMapper.dtoToMovimientosEntityAdd(dto));
        return MovimientosMapper.entityToDto(movimientosEntity);
    }

    @Override
    public List<MovimientosDto> obtenerMovimiento() {
        List<MovimientosEntity> movientos = movimientosDao.findAll();
        return movientos.stream().map(c -> MovimientosMapper.entityToDto(c)).collect(Collectors.toList());
    }

    @Override
    public MovimientosDto editarMovimiento(MovimientosDto dto) {
        MovimientosEntity cuenta = movimientosDao.save(MovimientosMapper.dtoToMovimientosEntity(dto));
        return MovimientosMapper.entityToDto(cuenta);
    }

    @Override
    public String eliminarMovimiento(Integer id) {
        movimientosDao.deleteById(id);
        return "Se elimino correctamente";
    }
}
