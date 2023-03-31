package com.operaciones.cuentas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ClienteEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column
private Integer id;
@Column
private String nombre;
@Column
private String genero;
@Column
private Integer edad;
@Column
private String identificacion;
@Column
private String direccion;
@Column
private String telefono;
@Column
private Integer clienteid;
@Column
private String contrasena;
@Column
private Boolean estado;

}
