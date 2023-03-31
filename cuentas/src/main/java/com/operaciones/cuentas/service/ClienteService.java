package com.operaciones.cuentas.service;

import java.util.List;

import com.operaciones.cuentas.dto.ClienteDto;

public interface ClienteService {
	
	ClienteDto agregarCliente(ClienteDto dto);
	
	List<ClienteDto> obtenerClientes();
	
	ClienteDto editarCliente(ClienteDto dto);
	
	String eliminarCliente(Integer id);
}
