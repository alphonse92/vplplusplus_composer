-- MySQL dump 10.13  Distrib 8.0.16, for macos10.14 (x86_64)
--
-- Host: localhost    Database: moodle
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mdl_vpl`
--

DROP TABLE IF EXISTS `mdl_vpl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_vpl` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `course` bigint(10) NOT NULL DEFAULT '0',
  `name` varchar(255) NOT NULL DEFAULT '',
  `shortdescription` longtext NOT NULL,
  `intro` longtext,
  `introformat` tinyint(2) DEFAULT '0',
  `startdate` bigint(10) NOT NULL DEFAULT '0',
  `duedate` bigint(10) NOT NULL DEFAULT '0',
  `maxfiles` smallint(4) DEFAULT NULL,
  `maxfilesize` bigint(10) DEFAULT NULL,
  `requirednet` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `grade` bigint(10) NOT NULL DEFAULT '0',
  `visiblegrade` tinyint(2) NOT NULL DEFAULT '1',
  `usevariations` tinyint(2) NOT NULL DEFAULT '0',
  `variationtitle` varchar(255) DEFAULT NULL,
  `basedon` bigint(10) DEFAULT NULL,
  `run` tinyint(2) NOT NULL DEFAULT '0',
  `debug` tinyint(2) NOT NULL DEFAULT '0',
  `evaluate` tinyint(2) NOT NULL DEFAULT '0',
  `evaluateonsubmission` tinyint(2) NOT NULL DEFAULT '0',
  `automaticgrading` tinyint(2) NOT NULL DEFAULT '0',
  `maxexetime` mediumint(6) DEFAULT NULL,
  `restrictededitor` tinyint(2) NOT NULL DEFAULT '0',
  `example` tinyint(2) NOT NULL DEFAULT '0',
  `maxexememory` bigint(10) DEFAULT NULL,
  `maxexefilesize` bigint(10) DEFAULT NULL,
  `maxexeprocesses` mediumint(6) DEFAULT NULL,
  `jailservers` longtext,
  `worktype` smallint(4) NOT NULL DEFAULT '0',
  `emailteachers` tinyint(2) NOT NULL DEFAULT '0',
  `timemodified` bigint(10) NOT NULL DEFAULT '0',
  `freeevaluations` bigint(10) NOT NULL DEFAULT '0',
  `reductionbyevaluation` varchar(10) NOT NULL DEFAULT '0',
  `sebrequired` tinyint(2) DEFAULT '0',
  `sebkeys` varchar(255) DEFAULT NULL,
  `runscript` varchar(63) DEFAULT NULL,
  `debugscript` varchar(63) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='vpl assignment definition';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_vpl`
--

LOCK TABLES `mdl_vpl` WRITE;
/*!40000 ALTER TABLE `mdl_vpl` DISABLE KEYS */;
INSERT INTO `mdl_vpl` VALUES (1,2,'Ejercicio Calculadora','Programar una calculadora','<p>En este ejercicio deberás crear una clase llamada calculadora. La clase deberá ser llamada \"Calculadora\", respetar el formato CamelCase, es decir la primera letra debe estar en mayúscula.</p><p>Esta clase deberá tener 4 metodos: sumar, restar, dividir, multiplicar. Solo el metodo dividir deberá retornar un double decimal, mientras que los demás deberán retornar un entero.</p><p><br></p>',1,0,0,1,0,'','',100,1,0,NULL,NULL,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,1573584458,0,'0',0,'',NULL,NULL),(2,2,'Ejercicio Calculadora','Programar una calculadora','<p>En este ejercicio deberás crear una clase llamada calculadora. La clase deberá ser llamada \"Calculadora\", respetar el formato CamelCase, es decir la primera letra debe estar en mayúscula.</p><p>Esta clase deberá tener 4 metodos: sumar, restar, dividir, multiplicar. Solo el metodo dividir deberá retornar un double decimal, mientras que los demás deberán retornar un entero.</p><p><br></p>',1,0,0,1,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,'',NULL,NULL),(3,2,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(4,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(5,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,NULL,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(6,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(7,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(8,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(9,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(10,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(11,4,'Practica pruebas unitarias','Pruebas unitarias automáticas','<p>aasdsadas</p>',1,0,0,100,0,'','',100,1,0,NULL,NULL,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(12,4,'My first project','description of ...','description of my first project',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(13,4,'My first project','description of ...','description of my first project',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(14,4,'My first project','description of ...','description of my first project',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(15,4,'My first project','description of ...','description of my first project',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(16,4,'My first project','description of ...','description of my first project',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(17,4,'My first project','description of ...','description of my first project',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(18,2,'Calculadora','Ejercicio básico de calculadora','<p>En este ejercicio deberás crear una clase llamada calculadora, en ella debes implementar las 4 operaciones aritméticas básicas:&nbsp;</p><p>1. sumar</p><p>2. restar</p><p>3. multiplicar</p><p>4. dividir</p><p>Nota:&nbsp; cada metodo de la clase debe tener el mismo nombre de la operación, en minusculas. Además, cada metodo deberá recibir dos enteros como parametros.&nbsp;</p>',1,0,1574380800,1,0,'','',100,1,0,NULL,NULL,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,'',NULL,NULL),(19,2,'Calculadora','En este ejercic...','En este ejercicio deberás crear una clase llamada calculadora, en ella debes implementar las 4 operaciones aritméticas básicas: ',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,0,0,'0',0,NULL,NULL,NULL),(20,2,'Calculadora','En este ejercic...','En este ejercicio deberás crear una clase llamada calculadora, en ella debes implementar las 4 operaciones aritméticas básicas: ',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,0,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,1573686729,0,'0',0,NULL,NULL,NULL),(21,2,'Calculadora','En este ejercic...','En este ejercicio deberás crear una clase llamada calculadora, en ella debes implementar las 4 operaciones aritméticas básicas: ',1,0,0,100,0,'','',100,1,0,NULL,0,1,0,1,1,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,1573693762,0,'0',0,NULL,'',''),(22,2,'Calculadora','En este ejercic...','En este ejercicio deberás crear una clase llamada calculadora, en ella debes implementar las 4 operaciones aritméticas básicas: ',1,0,0,100,0,'','',100,1,0,NULL,0,0,0,1,0,0,NULL,0,0,NULL,NULL,NULL,NULL,0,0,1573773589,0,'0',0,NULL,'','');
/*!40000 ALTER TABLE `mdl_vpl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:33:09
