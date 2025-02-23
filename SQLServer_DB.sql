USE [master]
GO
/****** Object:  Database [system_ventas]    Script Date: 02/10/2019 18:51:45 ******/
CREATE DATABASE [system_ventas]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'system_ventas', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.DEVELOPMENT\MSSQL\DATA\system_ventas.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'system_ventas_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.DEVELOPMENT\MSSQL\DATA\system_ventas_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [system_ventas] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [system_ventas].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [system_ventas] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [system_ventas] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [system_ventas] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [system_ventas] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [system_ventas] SET ARITHABORT OFF 
GO
ALTER DATABASE [system_ventas] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [system_ventas] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [system_ventas] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [system_ventas] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [system_ventas] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [system_ventas] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [system_ventas] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [system_ventas] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [system_ventas] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [system_ventas] SET  DISABLE_BROKER 
GO
ALTER DATABASE [system_ventas] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [system_ventas] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [system_ventas] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [system_ventas] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [system_ventas] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [system_ventas] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [system_ventas] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [system_ventas] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [system_ventas] SET  MULTI_USER 
GO
ALTER DATABASE [system_ventas] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [system_ventas] SET DB_CHAINING OFF 
GO
ALTER DATABASE [system_ventas] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [system_ventas] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [system_ventas] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [system_ventas] SET QUERY_STORE = OFF
GO
USE [system_ventas]
GO
/****** Object:  Table [dbo].[clientes]    Script Date: 02/10/2019 18:51:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[clientes](
	[id_cliente] [int] IDENTITY(1,1) NOT NULL,
	[id] [varchar](45) NULL,
	[nombre] [varchar](45) NULL,
	[apellido] [varchar](45) NULL,
	[direccion] [varchar](45) NULL,
	[telefono] [varchar](45) NULL,
 CONSTRAINT [PK_clientes] PRIMARY KEY CLUSTERED 
(
	[id_cliente] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[reportes_clientes]    Script Date: 02/10/2019 18:51:45 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[reportes_clientes](
	[id_registro] [int] IDENTITY(1,1) NOT NULL,
	[id_cliente] [int] NULL,
	[id] [varchar](45) NULL,
	[saldo_actual] [varchar](45) NULL,
	[fecha_actual] [varchar](45) NULL,
	[ultimo_pago] [varchar](45) NULL,
	[fecha_pago] [varchar](45) NULL,
 CONSTRAINT [PK_registros_clientes] PRIMARY KEY CLUSTERED 
(
	[id_registro] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[clientes] ON 

INSERT [dbo].[clientes] ([id_cliente], [id], [nombre], [apellido], [direccion], [telefono]) VALUES (2, N'1', N'Alexis', N'Duque', N'Carrera', N'444')
SET IDENTITY_INSERT [dbo].[clientes] OFF
SET IDENTITY_INSERT [dbo].[reportes_clientes] ON 

INSERT [dbo].[reportes_clientes] ([id_registro], [id_cliente], [id], [saldo_actual], [fecha_actual], [ultimo_pago], [fecha_pago]) VALUES (1, 2, N'1', N'$0.00', N'Sin fecha', N'$0.00', N'Sin fecha')
SET IDENTITY_INSERT [dbo].[reportes_clientes] OFF
USE [master]
GO
ALTER DATABASE [system_ventas] SET  READ_WRITE 
GO
