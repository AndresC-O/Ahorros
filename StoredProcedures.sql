Use ahorrosbd;

/**INSERTAR**/
DROP procedure IF EXISTS `sp_Insert_tbUsuarios`;
DELIMITER $$
USE `ahorrosbd`$$
CREATE PROCEDURE `sp_Insert_tbUsuarios` 
(
dui varchar(10), nombre varchar(50), apellido varchar(50), contra varchar(50)
)
BEGIN
	Insert into tb_usuarios(DUI, nombres, apellidos, contrasenia) values(dui, nombre, apellido, contra);
END$$

DELIMITER ;

/**INSERTAR**/
DROP procedure IF EXISTS `sp_Insert_tbcuentas`;
DELIMITER $$
USE `ahorrosbd`$$
CREATE PROCEDURE `sp_Insert_tbcuentas` 
(
dui varchar(10), nombreCuenta varchar(20), entrada decimal(18,5), salida decimal(18,5), saldoActual decimal(18,5)
)
BEGIN
	Insert into tb_cuentas(DUI, nombreCuenta, entrada, salida, saldoActual) values(dui, nombreCuenta, entrada, salida, saldoActual);
END$$

DELIMITER ;