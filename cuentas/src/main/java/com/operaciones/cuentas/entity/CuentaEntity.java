package com.operaciones.cuentas.entity;

import java.math.BigInteger;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Cuenta")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuentaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer idCuenta;
	@Column  
	private String numeroCuenta; 
	@Column
	private String tipoCuenta; 
	@Column
	private BigInteger saldoInicial;
	@Column
	private Boolean estado;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clienteid", referencedColumnName = "id")
	private ClienteEntity clienteid;

}
