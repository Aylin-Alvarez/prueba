package com.operaciones.cuentas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDto extends PersonaDto{
    private Integer clienteid;
    private String contrasena;
    private Boolean estado;

    @Builder
    public ClienteDto(Integer id, String nombre, String genero, String  direccion, String identificacion, String telefono,
                      Integer edad, Integer clienteid, String contrasena, Boolean estado){
        super(nombre, genero, direccion, identificacion, telefono, edad, id);
        this.clienteid = clienteid;
        this.contrasena = contrasena;
        this.estado = estado;
    }
}
