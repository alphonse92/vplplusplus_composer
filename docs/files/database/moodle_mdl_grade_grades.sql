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
-- Table structure for table `mdl_grade_grades`
--

DROP TABLE IF EXISTS `mdl_grade_grades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_grade_grades` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `itemid` bigint(10) NOT NULL,
  `userid` bigint(10) NOT NULL,
  `rawgrade` decimal(10,5) DEFAULT NULL,
  `rawgrademax` decimal(10,5) NOT NULL DEFAULT '100.00000',
  `rawgrademin` decimal(10,5) NOT NULL DEFAULT '0.00000',
  `rawscaleid` bigint(10) DEFAULT NULL,
  `usermodified` bigint(10) DEFAULT NULL,
  `finalgrade` decimal(10,5) DEFAULT NULL,
  `hidden` bigint(10) NOT NULL DEFAULT '0',
  `locked` bigint(10) NOT NULL DEFAULT '0',
  `locktime` bigint(10) NOT NULL DEFAULT '0',
  `exported` bigint(10) NOT NULL DEFAULT '0',
  `overridden` bigint(10) NOT NULL DEFAULT '0',
  `excluded` bigint(10) NOT NULL DEFAULT '0',
  `feedback` longtext,
  `feedbackformat` bigint(10) NOT NULL DEFAULT '0',
  `information` longtext,
  `informationformat` bigint(10) NOT NULL DEFAULT '0',
  `timecreated` bigint(10) DEFAULT NULL,
  `timemodified` bigint(10) DEFAULT NULL,
  `aggregationstatus` varchar(10) NOT NULL DEFAULT 'unknown',
  `aggregationweight` decimal(10,5) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_gradgrad_useite_uix` (`userid`,`itemid`),
  KEY `mdl_gradgrad_locloc_ix` (`locked`,`locktime`),
  KEY `mdl_gradgrad_ite_ix` (`itemid`),
  KEY `mdl_gradgrad_use_ix` (`userid`),
  KEY `mdl_gradgrad_raw_ix` (`rawscaleid`),
  KEY `mdl_gradgrad_use2_ix` (`usermodified`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='grade_grades  This table keeps individual grades for each us';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_grade_grades`
--

LOCK TABLES `mdl_grade_grades` WRITE;
/*!40000 ALTER TABLE `mdl_grade_grades` DISABLE KEYS */;
INSERT INTO `mdl_grade_grades` VALUES (1,2,5,NULL,100.00000,0.00000,NULL,5,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(2,1,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'unknown',NULL),(3,3,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(4,4,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(5,18,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(6,19,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(7,20,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(8,21,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(9,21,3,NULL,100.00000,0.00000,NULL,3,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(10,1,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'unknown',NULL),(11,2,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(12,3,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(13,4,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(14,18,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(15,19,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(16,20,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(17,22,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000),(18,22,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0,NULL,NULL,'novalue',0.00000);
/*!40000 ALTER TABLE `mdl_grade_grades` ENABLE KEYS */;
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
