package com.operaciones.cuentas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonaDto {
    @NotNull(message = "El nombre")
    @NotBlank(message = "El nombre")
    private String nombre;
    @NotNull(message = "El genero")
    @NotBlank(message = "El genero")
    private String genero;
    @NotNull(message = "La direccion")
    @NotBlank(message = "La direccion")
    private String direccion;
    @NotNull(message = "La identificacion")
    @NotBlank(message = "La identificacion")
    private String identificacion;
    @NotNull(message = "El telefono")
    @NotBlank(message = "El telefono")
    private String telefono;
    private int edad;
    private int id;

}
