package com.operaciones.cuentas.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.operaciones.cuentas.dto.ClienteDto;
import com.operaciones.cuentas.service.ClienteService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;
@SpringBootTest
public class ClientesControllerTest {
    @Mock
    private ClienteService clienteService;
    @InjectMocks
    private ClientesController clientesController;
    private ObjectMapper objectMapper = new ObjectMapper();
    @BeforeEach
    public void setUp(){
        when(clienteService.agregarCliente(any(ClienteDto.class))).thenReturn(clienteDto());
        when(clienteService.obtenerClientes()).thenReturn(Arrays.asList(clienteDto()));
        when(clienteService.editarCliente(any(ClienteDto.class))).thenReturn(clienteDto());
        when(clienteService.eliminarCliente(anyInt())).thenReturn("Se elimino correctamente");
    }
    @Test
    public void agregarSuccess() throws Exception {
       assertEquals(clientesController.agregarCliente(clienteDto()).getNombre(), "Jose Lema");
    }
    @Test
    public void editarSuccess() throws Exception {
        assertEquals(clientesController.editarCliente(clienteDto()).getNombre(), "Jose Lema");
    }
    @Test
    public void eliminarSuccess() throws Exception {
        assertEquals(clientesController.eliminarCliente(1), "Se elimino correctamente");
    }
    @Test
    public void obtenerClientesSuccess() throws Exception {
        assertEquals(clientesController.obtenerClientes().size(), 1);
    }
    public ClienteDto clienteDto(){
        return new ClienteDto(1,"Jose Lema","M","direccion","identificacion",
                "098873092",30,1,"passw0rd",true );
    }
}
