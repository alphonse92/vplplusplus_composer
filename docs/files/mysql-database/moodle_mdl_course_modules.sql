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
-- Table structure for table `mdl_course_modules`
--

DROP TABLE IF EXISTS `mdl_course_modules`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_course_modules` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `course` bigint(10) NOT NULL DEFAULT '0',
  `module` bigint(10) NOT NULL DEFAULT '0',
  `instance` bigint(10) NOT NULL DEFAULT '0',
  `section` bigint(10) NOT NULL DEFAULT '0',
  `idnumber` varchar(100) DEFAULT NULL,
  `added` bigint(10) NOT NULL DEFAULT '0',
  `score` smallint(4) NOT NULL DEFAULT '0',
  `indent` mediumint(5) NOT NULL DEFAULT '0',
  `visible` tinyint(1) NOT NULL DEFAULT '1',
  `visibleoncoursepage` tinyint(1) NOT NULL DEFAULT '1',
  `visibleold` tinyint(1) NOT NULL DEFAULT '1',
  `groupmode` smallint(4) NOT NULL DEFAULT '0',
  `groupingid` bigint(10) NOT NULL DEFAULT '0',
  `completion` tinyint(1) NOT NULL DEFAULT '0',
  `completiongradeitemnumber` bigint(10) DEFAULT NULL,
  `completionview` tinyint(1) NOT NULL DEFAULT '0',
  `completionexpected` bigint(10) NOT NULL DEFAULT '0',
  `showdescription` tinyint(1) NOT NULL DEFAULT '0',
  `availability` longtext,
  `deletioninprogress` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `mdl_courmodu_vis_ix` (`visible`),
  KEY `mdl_courmodu_cou_ix` (`course`),
  KEY `mdl_courmodu_mod_ix` (`module`),
  KEY `mdl_courmodu_ins_ix` (`instance`),
  KEY `mdl_courmodu_idncou_ix` (`idnumber`,`course`),
  KEY `mdl_courmodu_gro_ix` (`groupingid`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='course_modules table retrofitted from MySQL';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_course_modules`
--

LOCK TABLES `mdl_course_modules` WRITE;
/*!40000 ALTER TABLE `mdl_course_modules` DISABLE KEYS */;
INSERT INTO `mdl_course_modules` VALUES (1,2,9,1,1,NULL,1562962304,0,0,1,1,1,0,0,0,NULL,0,0,0,NULL,0),(2,3,9,2,6,NULL,1562962422,0,0,1,1,1,0,0,0,NULL,0,0,0,NULL,0),(3,4,9,3,12,NULL,1563487355,0,0,1,1,1,2,0,0,NULL,0,0,0,NULL,1),(4,2,23,1,11,'',1563551556,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(5,2,9,4,1,NULL,1562962304,0,0,1,1,1,0,0,0,NULL,0,0,0,NULL,1),(6,2,23,2,11,'',1563551556,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(7,2,23,3,11,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(8,4,23,4,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(9,4,23,5,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(10,4,23,6,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(11,4,23,7,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(12,4,23,8,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(13,4,23,9,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(14,4,23,0,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(15,4,23,0,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(16,4,23,0,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(17,4,23,10,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(18,4,23,11,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(19,4,23,12,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(20,4,23,13,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(21,4,23,14,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(22,4,23,15,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(23,4,23,16,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(24,4,23,17,12,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0),(25,2,23,18,11,'',1573676717,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(26,2,23,19,11,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(27,2,23,20,11,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(28,2,23,21,11,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,1),(29,2,23,22,11,'',1506898181,0,0,1,1,1,0,0,1,NULL,0,0,0,NULL,0);
/*!40000 ALTER TABLE `mdl_course_modules` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:41
