CREATE SCHEMA `practica` ;

USE practica;

CREATE TABLE `practica`.`estado` (
  `n_estado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(20) NOT NULL,
  `capital` VARCHAR(30) NOT NULL,
  `cant_poblacion` INT,
  `cant_costas` INT,
  PRIMARY KEY (`n_estado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create user 'usuario_practica'@'%' identified by 'la_Clave';
grant all privileges on practica.* to 'usuario_practica'@'%';
flush privileges;

select * from estado;




