/*
SQLyog - Free MySQL GUI v5.11
Host - 5.6.17 : Database - proyecto
*********************************************************************
Server version : 5.6.17
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `proyecto`;

USE `proyecto`;

DROP TABLE IF EXISTS `perfil`;

CREATE TABLE `perfil` (
  `codigo_perfil` int(11) NOT NULL,
  `nombre_perfil` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`codigo_perfil`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `perfil` */

insert into `perfil` (`codigo_perfil`,`nombre_perfil`) values (1,'Usuario'),(2,'Venderor'),(3,'Administrador');

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `login_usuario` varchar(50) NOT NULL,
  `pass_usuario` varchar(50) NOT NULL,
  `nombre_usuario` varchar(50) NOT NULL,
  `apellido_usuario` varchar(50) NOT NULL,
  `correo_usuario` varchar(50) NOT NULL,
  `codigo_perfil_fk` int(11) NOT NULL,
  `fechaNacimiento_usuario` date NOT NULL,
  PRIMARY KEY (`id_usuario`),
  KEY `FK_usuario` (`codigo_perfil_fk`),
  CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`codigo_perfil_fk`) REFERENCES `perfil` (`codigo_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `usuario` */

insert into `usuario` (`id_usuario`,`login_usuario`,`pass_usuario`,`nombre_usuario`,`apellido_usuario`,`correo_usuario`,`codigo_perfil_fk`,`fechaNacimiento_usuario`) values (1,'user','123','usuario','apellido','correo@correo.com',1,'2017-11-08'),(2,'administrador','123','NombreAdmin','apellidoAdmin','correo@correo.com',3,'2017-11-08');

DROP TABLE IF EXISTS `tipo`;

CREATE TABLE `tipo` (
  `codigo_tipo` int(11) NOT NULL,
  `nombre_tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`codigo_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo` */

insert into `tipo` (`codigo_tipo`,`nombre_tipo`) values (1,'Electronico'),(2,'Hogar');

DROP TABLE IF EXISTS `producto`;

CREATE TABLE `producto` (
  `codigo_producto` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_producto` varchar(50) NOT NULL,
  `codigo_tipo_fk` int(11) NOT NULL,
  `precio_producto` int(11) NOT NULL,
  PRIMARY KEY (`codigo_producto`),
  KEY `FK_producto` (`codigo_tipo_fk`),
  CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`codigo_tipo_fk`) REFERENCES `tipo` (`codigo_tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `producto` */

insert into `producto` (`codigo_producto`,`nombre_producto`,`codigo_tipo_fk`,`precio_producto`) values (1,'ps3',1,20000),(2,'sofa',1,20000);


DROP TABLE IF EXISTS `ventas`;

CREATE TABLE `ventas` (
  `codigo_venta` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_vendedor` int(11) NOT NULL,
  `fecha_venta` date NOT NULL,
  `total_venta` int(11) NOT NULL,
  PRIMARY KEY (`codigo_venta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ventas` */


/*Table structure for table `detalle_ventas` */

DROP TABLE IF EXISTS `detalle_ventas`;

CREATE TABLE `detalle_ventas` (
  `codigo_producto_fk` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `codigo_venta_fk` int(11) NOT NULL,
  KEY `FK_detalle_ventas` (`codigo_producto_fk`),
  KEY `FK_detalle_ventas2` (`codigo_venta_fk`),
  CONSTRAINT `detalle_ventas_ibfk_2` FOREIGN KEY (`codigo_venta_fk`) REFERENCES `ventas` (`codigo_venta`),
  CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`codigo_producto_fk`) REFERENCES `producto` (`codigo_producto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;




/*Table structure for table `tipo` */



/*Table structure for table `usuario` */


/*Table structure for table `ventas` */

