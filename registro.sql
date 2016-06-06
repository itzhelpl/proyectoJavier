-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 06-06-2016 a las 17:33:28
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `itesz`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE IF NOT EXISTS `registro` (
  `IdRegistro` int(10) NOT NULL AUTO_INCREMENT,
  `nombreCli` varchar(50) NOT NULL,
  `domicilioCli` varchar(100) NOT NULL,
  `hEntrega` varchar(10) NOT NULL,
  `visita` varchar(5) NOT NULL,
  `entregado` varchar(5) NOT NULL,
  `cantidadProd` int(10) NOT NULL,
  `nombreProd` int(5) NOT NULL,
  `fecha` varchar(10) NOT NULL,
  `comentarios` varchar(1000) NOT NULL,
  PRIMARY KEY (`IdRegistro`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=32 ;

--
-- Volcado de datos para la tabla `registro`
--

INSERT INTO `registro` (`IdRegistro`, `nombreCli`, `domicilioCli`, `hEntrega`, `visita`, `entregado`, `cantidadProd`, `nombreProd`, `fecha`, `comentarios`) VALUES
(29, 'Sergio', 'Tancitaro', '3:00pm', 'si', 'si', 100, 2, '04/06/2016', 'no hay'),
(30, 'Javi', 'Zamora', '5:00pm', 'si', 'si', 40, 3, '04/06/2016', 'no hay'),
(31, 'Juan', 'Los Reyes', '4:00pm', 'si', 'si', 100, 2, '04/06/2016', 'no hay');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
