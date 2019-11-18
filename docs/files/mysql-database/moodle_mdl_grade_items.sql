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
-- Table structure for table `mdl_grade_items`
--

DROP TABLE IF EXISTS `mdl_grade_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_grade_items` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `courseid` bigint(10) DEFAULT NULL,
  `categoryid` bigint(10) DEFAULT NULL,
  `itemname` varchar(255) DEFAULT NULL,
  `itemtype` varchar(30) NOT NULL DEFAULT '',
  `itemmodule` varchar(30) DEFAULT NULL,
  `iteminstance` bigint(10) DEFAULT NULL,
  `itemnumber` bigint(10) DEFAULT NULL,
  `iteminfo` longtext,
  `idnumber` varchar(255) DEFAULT NULL,
  `calculation` longtext,
  `gradetype` smallint(4) NOT NULL DEFAULT '1',
  `grademax` decimal(10,5) NOT NULL DEFAULT '100.00000',
  `grademin` decimal(10,5) NOT NULL DEFAULT '0.00000',
  `scaleid` bigint(10) DEFAULT NULL,
  `outcomeid` bigint(10) DEFAULT NULL,
  `gradepass` decimal(10,5) NOT NULL DEFAULT '0.00000',
  `multfactor` decimal(10,5) NOT NULL DEFAULT '1.00000',
  `plusfactor` decimal(10,5) NOT NULL DEFAULT '0.00000',
  `aggregationcoef` decimal(10,5) NOT NULL DEFAULT '0.00000',
  `aggregationcoef2` decimal(10,5) NOT NULL DEFAULT '0.00000',
  `sortorder` bigint(10) NOT NULL DEFAULT '0',
  `display` bigint(10) NOT NULL DEFAULT '0',
  `decimals` tinyint(1) DEFAULT NULL,
  `hidden` bigint(10) NOT NULL DEFAULT '0',
  `locked` bigint(10) NOT NULL DEFAULT '0',
  `locktime` bigint(10) NOT NULL DEFAULT '0',
  `needsupdate` bigint(10) NOT NULL DEFAULT '0',
  `weightoverride` tinyint(1) NOT NULL DEFAULT '0',
  `timecreated` bigint(10) DEFAULT NULL,
  `timemodified` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mdl_graditem_locloc_ix` (`locked`,`locktime`),
  KEY `mdl_graditem_itenee_ix` (`itemtype`,`needsupdate`),
  KEY `mdl_graditem_gra_ix` (`gradetype`),
  KEY `mdl_graditem_idncou_ix` (`idnumber`,`courseid`),
  KEY `mdl_graditem_cou_ix` (`courseid`),
  KEY `mdl_graditem_cat_ix` (`categoryid`),
  KEY `mdl_graditem_sca_ix` (`scaleid`),
  KEY `mdl_graditem_out_ix` (`outcomeid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='This table keeps information about gradeable items (ie colum';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_grade_items`
--

LOCK TABLES `mdl_grade_items` WRITE;
/*!40000 ALTER TABLE `mdl_grade_items` DISABLE KEYS */;
INSERT INTO `mdl_grade_items` VALUES (1,2,NULL,NULL,'course',NULL,1,NULL,NULL,NULL,NULL,1,800.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.00000,1,0,NULL,0,0,0,0,0,1563551223,1573771923),(2,2,1,'Ejercicio Calculadora','mod','vpl',1,0,NULL,'',NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,2,0,NULL,0,0,0,0,0,1563551556,1573771923),(3,2,1,'Ejercicio Calculadora','mod','vpl',2,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,3,0,NULL,0,0,0,0,0,1563552874,1573771923),(4,2,1,'Practica pruebas unitarias','mod','vpl',3,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,4,0,NULL,0,0,0,0,0,1563553252,1573771923),(5,4,NULL,NULL,'course',NULL,2,NULL,NULL,NULL,NULL,1,1200.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.00000,1,0,NULL,0,0,0,0,0,1563573763,1563753286),(6,4,2,'Practica pruebas unitarias','mod','vpl',4,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,4,0,NULL,0,0,0,0,0,1563573763,1563753285),(7,4,2,'Practica pruebas unitarias','mod','vpl',6,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,25,0,NULL,0,0,0,0,0,1563574117,1563753286),(8,4,2,'Practica pruebas unitarias','mod','vpl',7,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,23,0,NULL,0,0,0,0,0,1563574300,1563753286),(9,4,2,'Practica pruebas unitarias','mod','vpl',8,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,21,0,NULL,0,0,0,0,0,1563575110,1563753286),(10,4,2,'Practica pruebas unitarias','mod','vpl',9,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,19,0,NULL,0,0,0,0,0,1563647765,1563753286),(11,4,2,'Practica pruebas unitarias','mod','vpl',10,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,17,0,NULL,0,0,0,0,0,1563652279,1563753286),(12,4,2,'Practica pruebas unitarias','mod','vpl',12,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,15,0,NULL,0,0,0,0,0,1563750215,1563753285),(13,4,2,'Practica pruebas unitarias','mod','vpl',13,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,13,0,NULL,0,0,0,0,0,1563750711,1563753285),(14,4,2,'Practica pruebas unitarias','mod','vpl',14,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,11,0,NULL,0,0,0,0,0,1563751581,1563753285),(15,4,2,'Practica pruebas unitarias','mod','vpl',15,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,9,0,NULL,0,0,0,0,0,1563752002,1563753285),(16,4,2,'Practica pruebas unitarias','mod','vpl',16,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,7,0,NULL,0,0,0,0,0,1563752368,1563753285),(17,4,2,'Practica pruebas unitarias','mod','vpl',17,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.08333,5,0,NULL,0,0,0,0,0,1563753271,1563753285),(18,2,1,'Calculadora','mod','vpl',18,0,NULL,'',NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,13,0,NULL,0,0,0,0,0,1573676717,1573771923),(19,2,1,'Practica pruebas unitarias','mod','vpl',19,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,11,0,NULL,0,0,0,0,0,1573681612,1573771923),(20,2,1,'Practica pruebas unitarias','mod','vpl',20,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,9,0,NULL,0,0,0,0,0,1573683580,1573771923),(21,2,1,'Practica pruebas unitarias','mod','vpl',21,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,7,0,NULL,0,0,0,0,0,1573687026,1573771923),(22,2,1,'Practica pruebas unitarias','mod','vpl',22,0,NULL,NULL,NULL,1,100.00000,0.00000,NULL,NULL,0.00000,1.00000,0.00000,0.00000,0.12500,5,0,NULL,0,0,0,0,0,1573771913,1573771923);
/*!40000 ALTER TABLE `mdl_grade_items` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:31:25
