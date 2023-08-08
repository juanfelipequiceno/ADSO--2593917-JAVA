-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-07-2023 a las 23:57:39
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
-- Base de datos: `hoteldb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `cedula` varchar(50) NOT NULL,
  `nombres` varchar(25) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `telefono` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombres`, `apellidos`, `telefono`, `email`) VALUES
('108800', 'juan esteban ', 'castaño', '3126542135', 'juan@gmail.com'),
('108801', 'felipe', 'quiceno', '36868629', 'felipe@gmail.com'),
('108802', 'pipe juan', 'quiceno', '468684468', 'felipito@gmail.com'),
('108803', 'alberth', 'aricapa', '465846', 'alberth@gamil.com'),
('108804', 'cxthxh', 'rthjr5tjhrt', '68468468', 'rtt6h4thr4thth5y'),
('342354', 'cfhcfh', 'drdry', '564586', 'njkghu@fghcdfh');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `id` int(11) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `piso` varchar(10) NOT NULL,
  `descripcion` varchar(200) NOT NULL,
  `caracteristicas` varchar(200) NOT NULL,
  `precio` int(100) NOT NULL,
  `estado` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`id`, `numero`, `piso`, `descripcion`, `caracteristicas`, `precio`, `estado`) VALUES
(3, '1001', 'Piso 1', 'qdqwdqw', 'fwefqwf', 15000, 'Activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservahabitacion`
--

CREATE TABLE `reservahabitacion` (
  `id` int(11) NOT NULL,
  `numerohabitacion` varchar(200) NOT NULL,
  `cliente` varchar(200) NOT NULL,
  `trabajador` varchar(200) NOT NULL,
  `tiporeserva` varchar(200) NOT NULL,
  `fechareserva` varchar(200) NOT NULL,
  `fechaingreso` varchar(200) NOT NULL,
  `fechasalida` varchar(200) NOT NULL,
  `precio` varchar(200) NOT NULL,
  `estadoreserva` varchar(200) NOT NULL,
  `por` varchar(200) NOT NULL,
  `diasemana` varchar(200) NOT NULL,
  `total` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reservahabitacion`
--

INSERT INTO `reservahabitacion` (`id`, `numerohabitacion`, `cliente`, `trabajador`, `tiporeserva`, `fechareserva`, `fechaingreso`, `fechasalida`, `precio`, `estadoreserva`, `por`, `diasemana`, `total`) VALUES
(1, '1001', 'fwefwe', 'wefwewe', 'Alquiler', '2023-04-15', '2023-04-21', '2023-04-30', '15000', 'Pagada', 'dia', '2', 0),
(2, '1002', 'segwe', 'werwef', 'Alquiler', '2023-05-10', '2023-05-15', '2023-05-20', '20000', 'Pagada', 'dia', '4', 0),
(3, '1001', '108800', 'safefwef wefwe', 'Alquiler', '2023.07.20', '2023.07.20', '2023.07.29', '15000', 'Pagada', 'dia', '9', 135000),
(4, '1001', '108801', 'safefwef wefwe', 'Alquiler', '2023.08.03', '2023.08.05', '2023.08.10', '15000', 'Pagada', 'dia', '5', 75000),
(5, '1001', '342354', 'safefwef wefwe', 'Alquiler', '2023.08.05', '2023.08.10', '2023.08.20', '15000', 'Pagada', 'semana', '10', 1050000),
(6, '1001', '108802', 'safefwef wefwe', 'Alquiler', '13/07/2023', '15/07/2023', '25/07/2023', '15000', 'Pagada', 'dia', '10', 150000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vendedor`
--

CREATE TABLE `vendedor` (
  `cedula` varchar(200) NOT NULL,
  `nombre` varchar(200) NOT NULL,
  `apellido` varchar(200) NOT NULL,
  `telefono` varchar(200) NOT NULL,
  `correo` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vendedor`
--

INSERT INTO `vendedor` (`cedula`, `nombre`, `apellido`, `telefono`, `correo`, `password`, `id`) VALUES
('65465415f', 'wefwe', 'wefwe', 'wefwef', 'fwefw@efefwe', 'felipe', 2),
('12345', 'safefwef', 'wefwe', '34234', 'sdfwefw@qwfqwfq', '1225090', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservahabitacion`
--
ALTER TABLE `reservahabitacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `reservahabitacion`
--
ALTER TABLE `reservahabitacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `vendedor`
--
ALTER TABLE `vendedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
