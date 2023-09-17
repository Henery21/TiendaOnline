-- base de datos proyecto 
create database Tiendalacteos;
go
use TiendaLacteos;ihij


create table categoria  (
    IDcategoria int identity(1,1)primary key,
	nombre varchar(50) not null, 
	descripcion varchar(255) not null,
	estado bit not null, 
	);


create table ingreso (
	IDingreso int identity (1,1) primary key,
	IDProveedor  int not null,
	IDusuario int not null,
	Tipo_comprobante varchar (20)not null,
	Serie_comprbante  varchar (7)not null,
	Num_comprobante varchar (10)not null,
	Fecha datetime not null,
	imppuesto decimal(4,2)not null,
	Total decimal (11,2)not null,
	Estado varchar(20)not null,
); 


create table venta (
	IDventa int identity (1,1) primary key,
	IDcliente int not null,
	IDusuario int not null,
	Tipo_comprobante varchar (20)not null,
	Serie_comprobante  varchar (7)not null,
	Num_comprobante varchar (10)not null,
	Fecha datetime not null,
	impuesto decimal(4,2)not null,
	Total decimal (11,2)not null,
	Estado varchar(20)not null
);

create table DetalleVenta(
	IDdetalleventa int identity (1,1) primary key,
	IDventa int not null,
	IDarticulo int not null,
	cantidad int not null,
	Precio decimal(11,2),
	descuento decimal (11,2)
);


create table DetalleIngreso (
	IDdestalleingreso int identity(1,1) primary key, 
	IDingreso int not null,
	IDarticulo int not null,
	cantidad int not null,
	Precio decimal (11,2)
);


create table articulo (
	IDarticulo int identity(1,1)primary key,
	IDcategoria int not null,
	codigo varchar (50) not null,
	Precioventa decimal (11,2) not null,
	stock int not null,
	descripcion varchar(255) not null,
	imagen varchar (20) not null,
	estado bit not null
	);


-- agrregado 

create table VentaDetalleIngreso(
	IDvdingreso int identity (1,1) primary key,
	IDarticulo int not null,
	IDventa int not null,
	IDingreso int not null,
	canatidad int not null
);
Create table Factura(
	IDFactura int identity(1,1) primary key,
	IDventa int not null,
	IDcliente int not null,
	NumFactura varchar (50)not null,
	FechaEmicion datetime not null,
	MontoTotal decimal (11,2)not null
);
create table Caja(
	IDcaja int  identity (1,1) primary key,
	empleado varchar (50) not null,
	fecha  datetime not null,
	IDfactura int not null,
	Montoinicial decimal (11,2) not null,
	MontoFinal decimal (11,2)not null,
	detalles varchar (max)
);

create table Usuarios(
	ID_Usuario int primary key identity(1, 1),	
    ID_Empleado int not null,
	ID_Rol int not null,
    Usuario varchar(60) not null,
    Clave varchar(60) not null,
);

create table Roles(
	ID_Rol int primary key identity(1, 1),
    NombreRol varchar(60) not null
);

create table Opciones(
	ID_Opcion int primary key identity(1, 1),
    NombreOpcion varchar(60) not null
);

create table AsignacionRolesOpciones(
	ID_AsignacionRol int primary key identity(1, 1),
    ID_Rol int not null,
    ID_Opcion int not null
);
create table Empleados(
	ID_Empleado int primary key identity(1, 1),
    DUI_Empleado varchar(10) not null,
    ISSS_Empleado int not null,
    NombresEmpleado varchar(100) not null,
    ApellidosEmpleado varchar(100) not null,
    FechaNacEmpleado date not null,
    Telefono varchar(10) not null,
    Correo varchar(100),
    ID_Cargo int not null,
    ID_Direccion int not null   
);
CREATE TABLE Direcciones (
  ID_Direccion INT PRIMARY KEY IDENTITY(1,1),
  NumeroCasa NVARCHAR(10),
  PasajePoligono NVARCHAR(10),
  Calle NVARCHAR(45),
  Colonia NVARCHAR(45),
  Canton NVARCHAR(45),
  Caserio NVARCHAR(45),
  Municipio NVARCHAR(45) NOT NULL,
  Departamento NVARCHAR(45) NOT NULL,
  CodigoPostal CHAR(5),
  Pais NVARCHAR(45) NOT NULL,
);
CREATE TABLE Cliente (
  ID_Cliente INT PRIMARY KEY IDENTITY(1,1),
  NombresCliente NVARCHAR(60) NOT NULL,
  ApellidosCliente NVARCHAR(60) NOT NULL,
  TelefonoCliente NVARCHAR(10) NOT NULL,
  EmailCliente NVARCHAR(60) NOT NULL,
  ID_Direccion INT NOT NULL,
  ID_ROL int not null
);

create table MetodoPAgo(
 IDmetodoPAgo int identity(1,1) primary key, 
 efectivo int,
 tarjeta int,
 bitcoin int,
 IDventa int
);
