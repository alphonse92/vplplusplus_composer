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
-- Table structure for table `mdl_grade_grades_history`
--

DROP TABLE IF EXISTS `mdl_grade_grades_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_grade_grades_history` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `action` bigint(10) NOT NULL DEFAULT '0',
  `oldid` bigint(10) NOT NULL,
  `source` varchar(255) DEFAULT NULL,
  `timemodified` bigint(10) DEFAULT NULL,
  `loggeduser` bigint(10) DEFAULT NULL,
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
  PRIMARY KEY (`id`),
  KEY `mdl_gradgradhist_act_ix` (`action`),
  KEY `mdl_gradgradhist_tim_ix` (`timemodified`),
  KEY `mdl_gradgradhist_useitetim_ix` (`userid`,`itemid`,`timemodified`),
  KEY `mdl_gradgradhist_old_ix` (`oldid`),
  KEY `mdl_gradgradhist_ite_ix` (`itemid`),
  KEY `mdl_gradgradhist_use_ix` (`userid`),
  KEY `mdl_gradgradhist_raw_ix` (`rawscaleid`),
  KEY `mdl_gradgradhist_use2_ix` (`usermodified`),
  KEY `mdl_gradgradhist_log_ix` (`loggeduser`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='History table';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_grade_grades_history`
--

LOCK TABLES `mdl_grade_grades_history` WRITE;
/*!40000 ALTER TABLE `mdl_grade_grades_history` DISABLE KEYS */;
INSERT INTO `mdl_grade_grades_history` VALUES (1,1,1,'mod/vpl',1573273246,5,2,5,NULL,100.00000,0.00000,NULL,5,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(2,1,2,'system',1573273246,5,1,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(3,1,3,'system',1573273246,5,3,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(4,1,4,'system',1573273246,5,4,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(5,1,5,'system',1573676718,5,18,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(6,1,6,'system',1573681641,5,19,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(7,1,7,'system',1573683649,5,20,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(8,1,8,'system',1573687049,5,21,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(9,1,9,'mod/vpl',1573687797,3,21,3,NULL,100.00000,0.00000,NULL,3,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(10,1,10,'system',1573687797,3,1,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(11,1,11,'system',1573687797,3,2,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(12,1,12,'system',1573687797,3,3,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(13,1,13,'system',1573687797,3,4,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(14,1,14,'system',1573687797,3,18,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(15,1,15,'system',1573687797,3,19,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(16,1,16,'system',1573687797,3,20,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(17,1,17,'system',1573771923,5,22,3,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0),(18,1,18,'system',1573771923,5,22,5,NULL,100.00000,0.00000,NULL,NULL,NULL,0,0,0,0,0,0,NULL,0,NULL,0);
/*!40000 ALTER TABLE `mdl_grade_grades_history` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:28
