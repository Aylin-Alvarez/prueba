package com.operaciones.cuentas.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

import javax.persistence.*;

@Entity
@Table(name = "Movimientos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovimientosEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String fecha;
	@Column
	private String tipoMovimiento;
	@Column
	private BigInteger valor;
	@Column
	private BigInteger saldo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCuenta", referencedColumnName = "idCuenta")
	private CuentaEntity idCuenta; 
}
