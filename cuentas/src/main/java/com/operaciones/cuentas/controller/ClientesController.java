package com.operaciones.cuentas.controller;

import com.operaciones.cuentas.dto.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.operaciones.cuentas.service.ClienteService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value="/clientes")
public class ClientesController {
	
	@Autowired
	private ClienteService clienteService;
	
    @GetMapping
    public List<ClienteDto> obtenerClientes(){
    	return clienteService.obtenerClientes();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDto agregarCliente(@RequestBody @Valid ClienteDto dto)
    {
        return clienteService.agregarCliente(dto);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ClienteDto editarCliente(@RequestBody ClienteDto dto)
    {
        return clienteService.editarCliente(dto);
    }

 //   @PatchMapping
 //   @ResponseStatus(HttpStatus.OK)
 //   public void cuentaa()
 //   {
 //       return clienteService.
 //   }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminarCliente(@PathVariable Integer id)
    {

        return clienteService.eliminarCliente(id);
    }
}
