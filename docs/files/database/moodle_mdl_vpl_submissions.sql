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
-- Table structure for table `mdl_vpl_submissions`
--

DROP TABLE IF EXISTS `mdl_vpl_submissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_vpl_submissions` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `vpl` bigint(10) NOT NULL,
  `userid` bigint(10) NOT NULL,
  `datesubmitted` bigint(10) NOT NULL,
  `comments` longtext,
  `grader` bigint(10) DEFAULT NULL,
  `dategraded` bigint(10) DEFAULT NULL,
  `grade` decimal(10,5) DEFAULT NULL,
  `mailed` tinyint(2) NOT NULL DEFAULT '0',
  `highlight` tinyint(2) NOT NULL DEFAULT '0',
  `nevaluations` bigint(10) DEFAULT '0',
  `groupid` bigint(10) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `mdl_vplsubm_vpl_ix` (`vpl`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='Information about submission and grade';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_vpl_submissions`
--

LOCK TABLES `mdl_vpl_submissions` WRITE;
/*!40000 ALTER TABLE `mdl_vpl_submissions` DISABLE KEYS */;
INSERT INTO `mdl_vpl_submissions` VALUES (1,1,5,1573273246,'',0,0,NULL,0,0,0,0),(2,1,5,1573519213,'',0,0,NULL,0,0,0,0),(3,1,5,1573520257,'',0,0,NULL,0,0,0,0),(4,20,5,1573683715,'',0,0,NULL,0,0,0,0),(5,21,5,1573687282,'',0,0,NULL,0,0,0,0),(6,21,3,1573687797,'',0,0,NULL,0,0,0,0),(7,21,3,1573688550,'',0,0,NULL,0,0,0,0),(8,21,3,1573688670,'',0,0,NULL,0,0,0,0),(9,21,3,1573689419,'',0,0,NULL,0,0,0,0),(10,21,3,1573691095,'',0,0,NULL,0,0,0,0),(11,21,3,1573691115,'',0,0,NULL,0,0,0,0),(12,21,3,1573691161,'',0,0,NULL,0,0,0,0),(13,21,3,1573692682,'',0,0,NULL,0,0,0,0),(14,21,3,1573692733,'',0,0,NULL,0,0,0,0),(15,21,3,1573692747,'',0,0,NULL,0,0,0,0),(16,22,5,1573771975,'',0,0,NULL,0,0,0,0),(17,22,3,1573773179,'',0,0,NULL,0,0,0,0),(18,22,3,1573773295,'',0,0,NULL,0,0,0,0),(19,22,3,1573773315,'',0,0,NULL,0,0,0,0);
/*!40000 ALTER TABLE `mdl_vpl_submissions` ENABLE KEYS */;
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
