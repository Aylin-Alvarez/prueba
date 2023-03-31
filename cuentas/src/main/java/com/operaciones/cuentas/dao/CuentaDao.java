package com.operaciones.cuentas.dao;

import com.operaciones.cuentas.entity.CuentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaDao extends JpaRepository <CuentaEntity, Integer>{
}
