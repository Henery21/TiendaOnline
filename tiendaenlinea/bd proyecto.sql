create database TiendaLacteos;
go
USE TiendaLacteos;
GO

CREATE TABLE articulo(
	IDarticulo int IDENTITY(1,1)PRIMARY KEY ,
	IDcategoria int NOT NULL,
	codigo varchar(50) NOT NULL,
	Precioventa decimal(11, 2) NOT NULL,
	stock int NOT NULL,
	descripcion varchar(255) NOT NULL,
	imagen varchar(20) NOT NULL,
	estado bit NOT NULL, 
)


CREATE TABLE AsignacionRolesOpciones(
	ID_AsignacionRol int IDENTITY(1,1)PRIMARY KEY,
	ID_Rol int NOT NULL,
	ID_Opcion int NOT NULL
);


CREATE TABLE categoria(
	IDcategoria int IDENTITY(1,1) PRIMARY KEY ,
	nombre varchar(50) NOT NULL,
	descripcion varchar(255) NOT NULL,
	estado bit NOT NULL

);


CREATE TABLE Cliente(
	ID_Cliente int IDENTITY(1,1) PRIMARY KEY,
	NombresCliente nvarchar(60) NOT NULL,
	ApellidosCliente nvarchar(60) NOT NULL,
	TelefonoCliente nvarchar(10) NOT NULL,
	EmailCliente nvarchar(60) NOT NULL,
	ID_Direccion int NOT NULL,
	IDusuario int NOT NULL

);


CREATE TABLE DetalleIngreso(
	IDdestalleingreso int IDENTITY(1,1) PRIMARY KEY,
	IDingreso int NOT NULL,
	IDcategoria int NOT NULL,
	cantidad int NOT NULL,
	Precio decimal(11, 2) NULL,
) ;


CREATE TABLE DetalleVenta(
	IDdetalleventa int IDENTITY(1,1) PRIMARY KEY,
	IDventa int NOT NULL,
	IDarticulo int NOT NULL,
	cantidad int NOT NULL,
	Precio decimal(11, 2) NULL,

);


CREATE TABLE Direcciones(
	ID_Direccion int IDENTITY(1,1)PRIMARY KEY,
	NumeroCasa nvarchar(10) NULL,
	PasajePoligono nvarchar(10) NULL,
	Calle nvarchar(45) NULL,
	Colonia nvarchar(45) NULL,
	Canton nvarchar(45) NULL,
	Caserio nvarchar(45) NULL,
	Municipio nvarchar(45) NOT NULL,
	Departamento nvarchar(45) NOT NULL,
	CodigoPostal char(5) NULL,
	Pais nvarchar(45) NOT NULL,
);


CREATE TABLE Empleados(
	ID_Empleado int IDENTITY(1,1)PRIMARY KEY,
	DUI_Empleado varchar(10) NOT NULL,
	ISSS_Empleado int NOT NULL,
	NombresEmplead varchar(100) NOT NULL,
	ApellidosEmpleado varchar (100) NOT NULL,
	FechaNacEmpleado date NOT NULL,
	Telefono varchar(10) NOT NULL,
	Correo varchar(100) NULL,
	ID_Cargo int NOT NULL,
	ID_Direccion int NOT NULL,

);


CREATE TABLE ingreso(
	IDingreso int IDENTITY(1,1)PRIMARY KEY,
	IDempleado int NOT NULL,
	Tipo_comprobante varchar(20) NOT NULL,
	Serie_comprbante varchar(7) NOT NULL,
	Num_comprobante varchar(10) NOT NULL,
	Fecha datetime NOT NULL,
	impuesto decimal(4, 2) NOT NULL,
	Total decimal(11, 2) NOT NULL,
	Estado varchar(20) NOT NULL,
 
);

CREATE TABLE MetodoPAgo(
	IDmetodoPAgo int IDENTITY(1,1)PRIMARY KEY,
	efectivo int NULL,
	tarjeta int NULL,
	bitcoin int NULL,
	IDventa int NULL,
	IDcliente int NULL,

) ;


CREATE TABLE Opciones(
	ID_Opcion int IDENTITY(1,1) PRIMARY KEY,
	NombreOpcion varchar(60) NOT NULL,

) ;

CREATE TABLE Roles(
	ID_Rol int IDENTITY(1,1)PRIMARY KEY,
	NombreRol varchar(60) NOT NULL,

) ;


CREATE TABLE Usuarios(
	ID_Usuario int IDENTITY(1,1)PRIMARY KEY,
	ID_Empleado int NOT NULL,
	ID_Rol int NOT NULL,
	Usuario varchar(60) NOT NULL,
	Clave varchar(60) NOT NULL,

);


CREATE TABLE venta(
	IDventa int IDENTITY(1,1) PRIMARY KEY,
	IDepleado int NOT NULL,
	Tipo_comprobante varchar(20) NOT NULL,
	Serie_comprobante varchar(7) NOT NULL,
	Num_comprobante varchar(10) NOT NULL,
	Fecha datetime NOT NULL,
	impuesto decimal(4, 2) NOT NULL,
	Total decimal(11, 2) NOT NULL,
	Estado varchar(20) NOT NULL,
);
-- Llaves Foráneas para la tabla [articulo]
ALTER TABLE articulo  
ADD CONSTRAINT articulo_categoria FOREIGN KEY(IDcategoria)
REFERENCES categoria (IDcategoria);

ALTER TABLE articulo 
CHECK CONSTRAINT articulo_categoria;

-- Llaves Foráneas para la tabla [AsignacionRolesOpciones]
ALTER TABLE  AsignacionRolesOpciones
ADD CONSTRAINT AsignacionRolesOpciones_Opciones FOREIGN KEY(ID_Opcion)
REFERENCES Opciones (ID_Opcion)

ALTER TABLE AsignacionRolesOpciones 
CHECK CONSTRAINT AsignacionRolesOpciones_Opciones

ALTER TABLE AsignacionRolesOpciones  
ADD CONSTRAINT AsignacionRolesOpciones_Roles FOREIGN KEY(ID_Rol)
REFERENCES Roles (ID_Rol)

ALTER TABLE  AsignacionRolesOpciones 
CHECK CONSTRAINT AsignacionRolesOpciones_Roles

-- Llaves Foráneas para la tabla [Cliente]
ALTER TABLE Cliente 
ADD CONSTRAINT Cliente_Direcciones FOREIGN KEY(ID_Direccion)
REFERENCES Direcciones (ID_Direccion)

ALTER TABLE Cliente
CHECK CONSTRAINT Cliente_Direcciones

ALTER TABLE Cliente  
ADD CONSTRAINT Cliente_Usuarios FOREIGN KEY(IDusuario)
REFERENCES Usuarios (ID_Usuario)

ALTER TABLE Cliente 
CHECK CONSTRAINT Cliente_Usuarios

-- Llaves Foráneas para la tabla [DetalleIngreso]
ALTER TABLE DetalleIngreso
ADD CONSTRAINT DetalleIngreso_categoria FOREIGN KEY(IDcategoria)
REFERENCES categoria (IDcategoria)

ALTER TABLE DetalleIngreso
CHECK CONSTRAINT DetalleIngreso_categoria

ALTER TABLE DetalleIngreso  
ADD CONSTRAINT DetalleIngreso_ingreso FOREIGN KEY(IDingreso)
REFERENCES ingreso (IDingreso)

ALTER TABLE DetalleIngreso 
CHECK CONSTRAINT DetalleIngreso_ingreso

-- Llaves Foráneas para la tabla [DetalleVenta]
ALTER TABLE DetalleVenta 
ADD CONSTRAINT DetalleVenta_articulo FOREIGN KEY(IDarticulo)
REFERENCES articulo (IDarticulo)

ALTER TABLE DetalleVenta 
CHECK CONSTRAINT DetalleVenta_articulo

ALTER TABLE DetalleVenta  
ADD CONSTRAINT DetalleVenta_venta FOREIGN KEY(IDventa)
REFERENCES venta (IDventa)

ALTER TABLE DetalleVenta 
CHECK CONSTRAINT DetalleVenta_venta

-- Llaves Foráneas para la tabla [Empleados]
ALTER TABLE Empleados  
ADD CONSTRAINT Empleados_Direcciones FOREIGN KEY(ID_Direccion)
REFERENCES Direcciones (ID_Direccion)

ALTER TABLE Empleados 
CHECK CONSTRAINT Empleados_Direcciones

-- Llaves Foráneas para la tabla [ingreso]
ALTER TABLE ingreso  
ADD CONSTRAINT ingreso_Empleados FOREIGN KEY(IDempleado)
REFERENCES Empleados (ID_Empleado)

ALTER TABLE ingreso 
CHECK CONSTRAINT ingreso_Empleados

-- Llaves Foráneas para la tabla [MetodoPAgo]
ALTER TABLE MetodoPAgo  
ADD CONSTRAINT MetodoPAgo_Cliente FOREIGN KEY(IDcliente)
REFERENCES Cliente (ID_Cliente)

ALTER TABLE MetodoPAgo
CHECK CONSTRAINT MetodoPAgo_Cliente

ALTER TABLE MetodoPAgo
ADD CONSTRAINT MetodoPAgo_venta FOREIGN KEY(IDventa)
REFERENCES venta (IDventa)

ALTER TABLE MetodoPAgo 
CHECK CONSTRAINT MetodoPAgo_venta

-- Llaves Foráneas para la tabla [Usuarios]
ALTER TABLE Usuarios 
ADD CONSTRAINT Usuarios_Empleados FOREIGN KEY(ID_Empleado)
REFERENCES Empleados (ID_Empleado)

ALTER TABLE Usuarios 
CHECK CONSTRAINT Usuarios_Empleados

ALTER TABLE Usuarios 
ADD CONSTRAINT Usuarios_Roles FOREIGN KEY(ID_Rol)
REFERENCES Roles (ID_Rol)

ALTER TABLE Usuarios
CHECK CONSTRAINT Usuarios_Roles

-- Llaves Foráneas para la tabla [venta]
ALTER TABLE venta  
ADD CONSTRAINT venta_Empleados FOREIGN KEY(IDepleado)
REFERENCES Empleados (ID_Empleado)

ALTER TABLE venta 
CHECK CONSTRAINT venta_Empleados
