package com.operaciones.cuentas.controller;

import com.operaciones.cuentas.dto.CuentaDto;
import com.operaciones.cuentas.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/cuentas")
public class CuentasController {

    @Autowired
    private CuentaService cuentaService;
    @GetMapping
    public List<CuentaDto> obtenerCuenta(){
        return cuentaService.obtenerCuenta();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CuentaDto agregarCuenta(@RequestBody CuentaDto dto)
    {
        return cuentaService.agregarCuenta(dto);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public CuentaDto editarCuenta(@RequestBody CuentaDto dto)
    {
        return cuentaService.editarCuenta(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminarCuenta(@PathVariable Integer id){
        return cuentaService.eliminarCuenta(id);
    }
}
