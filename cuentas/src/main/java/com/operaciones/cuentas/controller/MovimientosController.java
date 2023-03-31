package com.operaciones.cuentas.controller;

import com.operaciones.cuentas.dto.ClienteDto;
import com.operaciones.cuentas.dto.MovimientosDto;
import com.operaciones.cuentas.service.MovimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/movimientos")
public class MovimientosController {

    @Autowired
    private MovimientosService movimientosService;
    @GetMapping
    public List<MovimientosDto> obtenerMovimientos(){
        return movimientosService.obtenerMovimiento();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MovimientosDto agregarMovimiento(@RequestBody MovimientosDto dto)
    {
        return movimientosService.agregarMovimiento(dto);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public MovimientosDto editarMovimiento(@RequestBody MovimientosDto dto)
    {
        return movimientosService.editarMovimiento(dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String eliminarMovimiento (@PathVariable Integer id){
        return movimientosService.eliminarMovimiento(id);
    }
}
