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
-- Table structure for table `mdl_tool_usertours_tours`
--

DROP TABLE IF EXISTS `mdl_tool_usertours_tours`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_tool_usertours_tours` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `description` longtext,
  `pathmatch` varchar(255) DEFAULT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '0',
  `sortorder` bigint(10) NOT NULL DEFAULT '0',
  `configdata` longtext NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='List of tours';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_tool_usertours_tours`
--

LOCK TABLES `mdl_tool_usertours_tours` WRITE;
/*!40000 ALTER TABLE `mdl_tool_usertours_tours` DISABLE KEYS */;
INSERT INTO `mdl_tool_usertours_tours` VALUES (1,'Boost - administrator','A tour of some new features in the Boost theme, for administrators','FRONTPAGE',1,0,'{\"placement\":\"bottom\",\"orphan\":\"0\",\"backdrop\":\"1\",\"reflex\":\"0\",\"filtervalues\":{\"role\":[\"-1\"],\"theme\":[\"boost\"]},\"majorupdatetime\":1479366244,\"default_tour\":true,\"filename\":\"boost_administrator.json\",\"version\":1,\"shipped_tour\":true,\"shipped_filename\":\"boost_administrator.json\",\"shipped_version\":1}'),(2,'Boost - course view','A tour for introducing administrators and teachers to courses in the Boost theme','/course/view.php%',1,1,'{\"placement\":\"bottom\",\"orphan\":\"0\",\"backdrop\":\"1\",\"reflex\":\"0\",\"filtervalues\":{\"role\":[\"-1\",\"editingteacher\"],\"theme\":[\"boost\"]},\"majorupdatetime\":1480050104,\"shipped_tour\":true,\"shipped_filename\":\"boost_course_view.json\",\"shipped_version\":1}');
/*!40000 ALTER TABLE `mdl_tool_usertours_tours` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:25
