create databases operaciones;

use operaciones;


create table Cliente(
id int primary key identity,
nombre varchar (60),
genero char(1),
edad int,
identificacion varchar (20),
direccion varchar (250),
telefono varchar (12),
clienteid int,
contrasena varchar(50),
estado bit
)



create table Cuenta (
idCuenta int primary key identity,
numeroCuenta varchar(25),
tipoCuenta varchar(20),
saldoInicial bigint,
estado bit,
clienteid int,
constraint fk_cuenta_cliente foreign key (clienteid) references Cliente(id)
)

create table Movimientos(
id int primary key identity,
fecha varchar(20),
tipoMovimiento varchar(20),
valor bigint,
saldo bigint,
idCuenta int,
constraint fk_movimiento_cuenta foreign key (idCuenta) references Cuenta(idCuenta)
)
