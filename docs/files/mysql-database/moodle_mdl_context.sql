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
-- Table structure for table `mdl_context`
--

DROP TABLE IF EXISTS `mdl_context`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_context` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `contextlevel` bigint(10) NOT NULL DEFAULT '0',
  `instanceid` bigint(10) NOT NULL DEFAULT '0',
  `path` varchar(255) DEFAULT NULL,
  `depth` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_cont_conins_uix` (`contextlevel`,`instanceid`),
  KEY `mdl_cont_ins_ix` (`instanceid`),
  KEY `mdl_cont_pat_ix` (`path`)
) ENGINE=InnoDB AUTO_INCREMENT=92 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='one of these must be set';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_context`
--

LOCK TABLES `mdl_context` WRITE;
/*!40000 ALTER TABLE `mdl_context` DISABLE KEYS */;
INSERT INTO `mdl_context` VALUES (1,10,0,'/1',1),(2,50,1,'/1/2',2),(4,30,1,'/1/4',2),(5,30,2,'/1/5',2),(6,80,1,'/1/6',2),(7,80,2,'/1/7',2),(8,80,3,'/1/8',2),(9,80,4,'/1/9',2),(10,80,5,'/1/10',2),(11,80,6,'/1/11',2),(12,80,7,'/1/12',2),(13,80,8,'/1/13',2),(14,80,9,'/1/5/14',3),(15,80,10,'/1/5/15',3),(16,80,11,'/1/5/16',3),(17,80,12,'/1/5/17',3),(18,80,13,'/1/5/18',3),(19,80,14,'/1/5/19',3),(20,80,15,'/1/5/20',3),(21,30,3,'/1/21',2),(22,80,16,'/1/21/22',3),(23,80,17,'/1/21/23',3),(24,80,18,'/1/21/24',3),(25,80,19,'/1/21/25',3),(26,80,20,'/1/21/26',3),(27,80,21,'/1/21/27',3),(28,80,22,'/1/21/28',3),(29,30,4,'/1/29',2),(30,30,5,'/1/30',2),(31,30,6,'/1/31',2),(32,30,7,'/1/32',2),(33,40,2,'/1/33',2),(34,40,3,'/1/34',2),(35,50,2,'/1/33/35',3),(36,50,3,'/1/34/36',3),(37,70,1,'/1/33/35/37',4),(38,30,8,'/1/38',2),(39,30,9,'/1/39',2),(40,50,4,'/1/33/40',3),(41,70,3,'/1/33/40/41',4),(42,80,23,'/1/30/42',3),(43,80,24,'/1/30/43',3),(44,80,25,'/1/30/44',3),(45,80,26,'/1/30/45',3),(46,80,27,'/1/30/46',3),(47,80,28,'/1/30/47',3),(48,80,29,'/1/30/48',3),(49,70,4,'/1/33/35/49',4),(50,70,5,'/1/33/35/50',4),(51,70,6,'/1/33/35/51',4),(52,70,7,'/1/33/35/52',4),(53,80,30,'/1/38/53',3),(54,80,31,'/1/38/54',3),(55,80,32,'/1/38/55',3),(56,80,33,'/1/38/56',3),(57,80,34,'/1/38/57',3),(58,80,35,'/1/38/58',3),(59,80,36,'/1/38/59',3),(60,70,8,'/1/33/40/60',4),(61,70,9,'/1/33/40/61',4),(62,70,10,'/1/33/40/62',4),(63,70,11,'/1/33/40/63',4),(64,70,12,'/1/33/40/64',4),(65,70,13,'/1/33/40/65',4),(66,70,14,'/1/33/40/66',4),(67,70,15,'/1/33/40/67',4),(68,70,16,'/1/33/40/68',4),(69,70,17,'/1/33/40/69',4),(70,70,18,'/1/33/40/70',4),(71,70,19,'/1/33/40/71',4),(72,70,20,'/1/33/40/72',4),(73,70,21,'/1/33/40/73',4),(74,70,22,'/1/33/40/74',4),(75,70,23,'/1/33/40/75',4),(76,70,24,'/1/33/40/76',4),(77,30,10,'/1/77',2),(78,30,11,'/1/78',2),(79,30,12,'/1/79',2),(80,30,13,'/1/80',2),(81,30,14,'/1/81',2),(82,30,15,'/1/82',2),(83,30,16,'/1/83',2),(84,30,17,'/1/84',2),(85,30,18,'/1/85',2),(86,30,19,'/1/86',2),(87,70,25,'/1/33/35/87',4),(88,70,26,'/1/33/35/88',4),(89,70,27,'/1/33/35/89',4),(90,70,28,'/1/33/35/90',4),(91,70,29,'/1/33/35/91',4);
/*!40000 ALTER TABLE `mdl_context` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:45
