create database TiendaLacteos;
use TiendaLacteos;

-- DIRECCIONES
create table Departamentos(
	ID_Departamento char(2) primary key,
	Departamento varchar(60) not null,
	Pais varchar(60)
);

create table Municipios(
	ID_Municipio char(3) primary key,
	Municipio varchar(60) not null,
	ID_Departamento char(2) not null
);

create table Distritos(
	ID_Distrito varchar(5) primary key,
	Distrito varchar(60) not null,
	ID_Municipio char(3) not null
);

create table Direcciones(
	ID_Direccion int primary key identity(1, 1),
    Linea1 varchar(100) not null,
    Linea2 varchar(100),
    ID_Distrito varchar(5) not null,
    CodigoPostal int
);

-- PERSONAS

create table Cargo(
	ID_Cargo int identity(1,1) primary key,
	Nombre_Cargo varchar(50) not null
);

create table Empleados(
	ID_Empleado int primary key identity(1, 1),
    DUI_Empleado varchar(10) not null,
    NombresEmpleado varchar(60) not null,
    ApellidosEmpleado varchar(60) not null,
    FechaNacEmpleado date not null,
    Telefono varchar(10) not null,
    Correo varchar(100),
	Direccion nvarchar(250),
    ID_Cargo int not null,
	ID_Usuario int not null
);

create table Clientes(
	ID_Cliente int primary key identity(1, 1),
    DUI_Cliente varchar(10) not null,
    NombresCliente varchar(60) not null,
    ApellidosCliente varchar(60) not null,
    Telefono varchar(10) not null,
    Correo varchar(100),
	ID_Direccion int,
	ID_Usuario int not null
);

-- MANEJO DE ROLES
create table Opciones(
	ID_Opcion int primary key identity(1, 1),
    NombreOpcion varchar(60) not null
);

create table Roles(
	ID_Rol int primary key identity(1, 1),
    NombreRol varchar(60) not null
);

create table AsignacionRolesOpciones(
	ID_AsignacionRol int primary key identity(1, 1),
    ID_Rol int not null,
    ID_Opcion int not null
);

create table Usuarios(
	ID_Usuario int primary key identity(1, 1),	
	ID_Rol int not null,
    Usuario varchar(60) not null,
    Clave varchar(60) not null
);

-- PRODUCTOS
create table Articulo(
	ID_Articulo int identity(1,1)primary key ,
	ID_Categoria int NOT NULL,
	Codigo varchar(50) NOT NULL,
	Precio_Venta decimal(11, 2) NOT NULL,
	Fecha_Vencimiento datetime NOT NULL,
	Stock int NOT NULL,
	Descripcion varchar(255) NOT NULL,
	Imagen varchar(20) NOT NULL,
	Estado bit NOT NULL
);

create table Categoria(
	ID_Categoria int identity(1,1) primary key ,
	Nombre varchar(50) NOT NULL,
	Descripcion varchar(255) NOT NULL,
	Estado bit NOT NULL
);

create table Subcategoria(
	ID_Subcategoria int identity primary key,
	Subcategoria varchar(100) not null,
	ID_Categoria int not null
);

-- VENTAS
create table Venta(
	ID_Venta int identity(1,1) primary key,
	ID_Empleado int NOT NULL,
	ID_Cliente int NOT NULL,
	Tipo_Comprobante varchar(20) NOT NULL,
	Serie_Comprobante varchar(7) NOT NULL,
	Num_Comprobante varchar(10) NOT NULL,
	Fecha datetime NOT NULL,
	Impuesto decimal(4, 2) NOT NULL,
	Total decimal(11, 2) NOT NULL,
	Estado varchar(20) NOT NULL
);

create table DetalleVenta(
	ID_Detalle_Venta int identity(1,1) primary key,
	ID_Venta int NOT NULL,
	ID_Articulo int NOT NULL,
	Cantidad int NOT NULL,
	Precio decimal(11, 2) NULL
);

create table MetodoPago(
	ID_Metodo_Pago int identity(1,1)primary key,
	Metodo varchar(100) not null
) ;

-- COMPRA DE PRODUCTO
create table Ingreso(
	ID_Ingreso int identity(1,1)primary key,
	ID_Empleado int NOT NULL,
	Tipo_Comprobante varchar(20) NOT NULL,
	Serie_Comprobante varchar(7) NOT NULL,
	Num_Comprobante varchar(10) NOT NULL,
	Fecha datetime NOT NULL,
	Impuesto decimal(4, 2) NOT NULL,
	Total decimal(11, 2) NOT NULL,
	Estado varchar(20) NOT NULL
);

create table DetalleIngreso(
	ID_Detalle_Ingreso int identity(1,1) primary key,
	ID_Ingreso int NOT NULL,
	ID_Categoria int NOT NULL,
	Cantidad int NOT NULL,
	Precio decimal(11, 2) NULL,
) ;
-- AUDITORÍA Y REGISTRO DE ACTIVIDADES
create table Auditoria(
    ID_Auditoria int identity(1,1) primary key,
    Fecha datetime not null,
    Usuario varchar(60) not null,
    Accion varchar(100) not null,
    Detalles nvarchar(max) not null
);

-- PROVEEDORES
create table Proveedores(
    ID_Proveedor int identity(1,1) primary key,
    Nombre varchar(100) not null,
    Direccion varchar(255),
    Telefono varchar(20),
    Correo varchar(100),
    Notas nvarchar(max)
);

-- ALMACÉN O INVENTARIO
create table Inventario(
    ID_Inventario int identity(1,1) primary key,
    ID_Articulo int not null,
    Cantidad int not null,
    Ubicacion varchar(50),
    Notas nvarchar(max)
);

-- CARRITO DE COMPRAS
create table CarritoCompras(
    ID_Carrito int identity(1,1) primary key,
    ID_Cliente int not null,
    Fecha datetime not null
);

create table DetalleCarrito(
    ID_DetalleCarrito int identity(1,1) primary key,
    ID_Carrito int not null,
    ID_Articulo int not null,
    Cantidad int not null,
    Precio decimal(11, 2) not null
);

-- ENVÍOS Y LOGÍSTICA
create table Envios(
    ID_Envio int identity(1,1) primary key,
    ID_Pedido int not null,
    FechaEnvio datetime not null,
    Estado varchar(50) not null,
    MetodoEnvio varchar(100),
    Notas nvarchar(max)
);

-- VALORACIÓN DE PRODUCTOS
create table Valoraciones(
    ID_Valoracion int identity(1,1) primary key,
    ID_Articulo int not null,
    ID_Cliente int not null,
    Puntuacion int not null,
    Comentario nvarchar(max),
    Fecha datetime not null
);

-- INFORMACIÓN FINANCIERA
create table TransaccionesFinancieras(
    ID_Transaccion int identity(1,1) primary key,
    FechaTransaccion datetime not null,
    TipoTransaccion varchar(50) not null,
    Monto decimal(11, 2) not null,
    Descripcion nvarchar(max),
    ID_CuentaBancaria int not null
);

-- REPORTES Y ANÁLISIS
create table Reportes(
    ID_Reporte int identity(1,1) primary key,
    NombreReporte varchar(100) not null,
    FechaCreacion datetime not null,
    Autor varchar(60) not null,
    Descripcion nvarchar(max),
    ArchivoReporte varchar(100)
);

-- RECURSOS HUMANOS
create table Vacaciones(
    ID_Vacacion int identity(1,1) primary key,
    ID_Empleado int not null,
    FechaInicio datetime not null,
    FechaFin datetime not null,
    Aprobada bit not null
);

-- CLIENTES EMPRESARIALES
create table Empresas(
    ID_Empresa int identity(1,1) primary key,
    NombreEmpresa varchar(100) not null,
    NIT varchar(15) not null,
    Direccion varchar(255),
    Telefono varchar(20),
    Correo varchar(100),
    Notas nvarchar(max)
);

-- GESTIÓN DE PRECIOS Y DESCUENTOS
create table Precios(
    ID_Precio int identity(1,1) primary key,
    ID_Articulo int not null,
    PrecioVenta decimal(11, 2) not null,
    FechaInicio datetime not null,
    FechaFin datetime not null,
    Notas nvarchar(max)
);

-- SISTEMA DE RESERVAS
create table Reservas(
    ID_Reserva int identity(1,1) primary key,
    ID_Cliente int not null,
    FechaInicio datetime not null,
    FechaFin datetime not null,
    Estado varchar(50) not null,
    Notas nvarchar(max)
);


ALTER TABLE Municipios ADD FOREIGN KEY (ID_Departamento) REFERENCES Departamentos(ID_Departamento);
ALTER TABLE Distritos ADD FOREIGN KEY (ID_Municipio) REFERENCES Municipios(ID_Municipio);
ALTER TABLE Direcciones ADD FOREIGN KEY (ID_Distrito) REFERENCES Distritos(ID_Distrito);
ALTER TABLE Empleados ADD FOREIGN KEY(ID_Cargo) REFERENCES Cargo(ID_Cargo);
ALTER TABLE Empleados ADD FOREIGN KEY(ID_Usuario) REFERENCES Usuarios(ID_Usuario);
ALTER TABLE Clientes ADD FOREIGN KEY(ID_Direccion) REFERENCES Direcciones (ID_Direccion );
ALTER TABLE Clientes ADD FOREIGN KEY(ID_Usuario) REFERENCES Usuarios(ID_Usuario);
ALTER TABLE AsignacionRolesOpciones ADD FOREIGN KEY(ID_Opcion) REFERENCES Opciones (ID_Opcion);
ALTER TABLE AsignacionRolesOpciones ADD FOREIGN KEY(ID_Rol) REFERENCES Roles (ID_Rol);
ALTER TABLE Usuarios ADD FOREIGN KEY(ID_Rol) REFERENCES Roles (ID_Rol);
ALTER TABLE Articulo ADD FOREIGN KEY(ID_Categoria) REFERENCES Categoria (IDcategoria);
ALTER TABLE Venta ADD FOREIGN KEY(ID_Empleado) REFERENCES Empleados (ID_Empleado);
ALTER TABLE DetalleVenta ADD FOREIGN KEY(ID_Articulo) REFERENCES Articulo (ID_Articulo);
ALTER TABLE DetalleVenta ADD FOREIGN KEY(ID_Venta) REFERENCES Venta (ID_Venta);
ALTER TABLE MetodoPago ADD FOREIGN KEY(ID_Cliente) REFERENCES Clientes (ID_Cliente);
ALTER TABLE MetodoPago ADD FOREIGN KEY(ID_Venta) REFERENCES Venta (ID_Venta);
ALTER TABLE Ingreso ADD FOREIGN KEY(ID_Empleado) REFERENCES Empleados (ID_Empleado);
ALTER TABLE DetalleIngreso ADD FOREIGN KEY(ID_Categoria) REFERENCES Categoria (ID_Categoria);
ALTER TABLE DetalleIngreso ADD FOREIGN KEY(ID_Ingreso) REFERENCES Ingreso (ID_Ingreso);
