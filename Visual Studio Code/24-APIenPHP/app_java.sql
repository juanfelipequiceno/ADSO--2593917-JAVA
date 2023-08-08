-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-08-2023 a las 18:55:53
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `app_java`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `cedula` varchar(100) NOT NULL,
  `nombres` varchar(100) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `telefono` varchar(100) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `correo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`cedula`, `nombres`, `apellidos`, `telefono`, `direccion`, `correo`) VALUES
('1225090', ' felipe', 'quiceno moncada', '3513538', 'wefwefg', 'fherh@ewregw'),
('546554', 'qefwe', 'wef', 'wef', 'wef', 'fherh@ewregw'),
('122509090', 'wefwef', 'wef', 'dfbdfbdf', 'bberbe', 'ererg'),
('10040', 'efweukui', 'oñioñ', 'ioluiñ', 'uoluiol', 'uiluil'),
('5146132', 'jmytutyjt', 'tyjtryjrtj', 'tyjtyj', 'rythrt', 'yjtyjty'),
('2513654', 'ghyjtyj', 'rtet', 'etetjrtj', 'rtjryjty', 'rrhryrt'),
('21358135', 'uikl7kt', 'tuktukyt', 'ytukytuky', 'tyjtyjhgh', 'ghgktuk');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
