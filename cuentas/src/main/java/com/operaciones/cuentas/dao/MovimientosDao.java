package com.operaciones.cuentas.dao;

import com.operaciones.cuentas.entity.MovimientosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientosDao extends JpaRepository <MovimientosEntity, Integer> {
}
