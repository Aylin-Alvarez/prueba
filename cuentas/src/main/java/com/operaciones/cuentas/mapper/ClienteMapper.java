package com.operaciones.cuentas.mapper;

import com.operaciones.cuentas.dto.ClienteDto;
import com.operaciones.cuentas.entity.ClienteEntity;

public class ClienteMapper {
	public static ClienteEntity dtoToClienteEntityAdd(ClienteDto dto) {
		return ClienteEntity.builder()
				.nombre(dto.getNombre())
				.genero(dto.getGenero())
				.edad(dto.getEdad())
				.identificacion(dto.getIdentificacion())
				.direccion(dto.getDireccion())
				.telefono(dto.getTelefono())
				.clienteid(dto.getClienteid())
				.contrasena(dto.getContrasena())
				.estado(dto.getEstado())
				.build();
	}

	public static ClienteEntity dtoToClienteEntity(ClienteDto dto) {
		return ClienteEntity.builder()
				.id(dto.getId())
				.nombre(dto.getNombre())
				.genero(dto.getGenero())
				.edad(dto.getEdad())
				.identificacion(dto.getIdentificacion())
				.direccion(dto.getDireccion())
				.telefono(dto.getTelefono())
				.clienteid(dto.getClienteid())
				.contrasena(dto.getContrasena())
				.estado(dto.getEstado())
				.build();
	}

	public static ClienteDto entityToClienteDto(ClienteEntity entity) {
		ClienteDto dto = new ClienteDto();
		dto.setNombre(entity.getNombre());
		dto.setGenero(entity.getGenero());
		dto.setEdad(entity.getEdad());
		dto.setIdentificacion(entity.getIdentificacion());
		dto.setDireccion(entity.getDireccion());
		dto.setTelefono(entity.getTelefono());
		dto.setClienteid(entity.getClienteid());
		dto.setContrasena(entity.getContrasena());
		dto.setEstado(entity.getEstado());
		return dto;
	}



}
