package com.operaciones.cuentas.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.operaciones.cuentas.entity.ClienteEntity;
import com.operaciones.cuentas.mapper.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.cuentas.dao.ClienteDao;
import com.operaciones.cuentas.dto.ClienteDto;
import com.operaciones.cuentas.service.ClienteService;

@Service
public class ClienteServiceImpl  implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;

	@Override
	public ClienteDto agregarCliente(ClienteDto dto) {
		ClienteEntity clienteEntity = clienteDao.save(ClienteMapper.dtoToClienteEntityAdd(dto));
		return ClienteMapper.entityToClienteDto(clienteEntity);
	}

	@Override
	public List<ClienteDto> obtenerClientes() {
		List<ClienteEntity> clientes = clienteDao.findAll();
		return clientes.stream().map(c -> ClienteMapper.entityToClienteDto(c)).collect(Collectors.toList());
	}

	@Override
	public ClienteDto editarCliente(ClienteDto dto) {
		ClienteEntity cliente = clienteDao.save(ClienteMapper.dtoToClienteEntity(dto));
		return ClienteMapper.entityToClienteDto(cliente);
	}

	@Override
	public String eliminarCliente(Integer id) {
		clienteDao.deleteById(id);
		return "Se elimino correctamente";
	}
	


}
