package com.operaciones.cuentas.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.operaciones.cuentas.entity.ClienteEntity;

@Repository
public interface ClienteDao extends JpaRepository<ClienteEntity, Integer>   {

	//List<ClienteEntity> findByNombreAndIdClienteEntities(String nombre, Integer id);
	//@Query("SELECT c from ClienteEntity c where c.nombre := nombre2")
	//List<ClienteEntity> porNombre(@Param("nombre2")String nombre, @Param("id") Integer id);
	//@Query("select * from Cliente c where c.nombre = nombre2", nativeQuery = true)
	//List<ClienteEntity> porNombre(@Param("nombre2")String nombre);


}
