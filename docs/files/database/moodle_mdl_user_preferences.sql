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
-- Table structure for table `mdl_user_preferences`
--

DROP TABLE IF EXISTS `mdl_user_preferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_user_preferences` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `userid` bigint(10) NOT NULL DEFAULT '0',
  `name` varchar(255) NOT NULL DEFAULT '',
  `value` varchar(1333) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_userpref_usenam_uix` (`userid`,`name`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='Allows modules to store arbitrary user preferences';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_user_preferences`
--

LOCK TABLES `mdl_user_preferences` WRITE;
/*!40000 ALTER TABLE `mdl_user_preferences` DISABLE KEYS */;
INSERT INTO `mdl_user_preferences` VALUES (1,2,'auth_manual_passwordupdatetime','1562943724'),(2,2,'email_bounce_count','1'),(3,2,'email_send_count','1'),(4,3,'auth_forcepasswordchange','0'),(5,3,'email_bounce_count','1'),(6,3,'email_send_count','1'),(7,3,'login_failed_count_since_success','1'),(8,2,'login_failed_count_since_success','1'),(9,4,'auth_forcepasswordchange','0'),(10,4,'email_bounce_count','1'),(11,4,'email_send_count','1'),(12,5,'auth_forcepasswordchange','0'),(13,5,'email_bounce_count','1'),(14,5,'email_send_count','1'),(15,6,'auth_forcepasswordchange','0'),(16,6,'email_bounce_count','1'),(17,6,'email_send_count','1'),(18,7,'auth_forcepasswordchange','0'),(19,7,'email_bounce_count','1'),(20,7,'email_send_count','1'),(21,8,'auth_forcepasswordchange','0'),(22,8,'email_bounce_count','1'),(23,8,'email_send_count','1'),(24,9,'auth_forcepasswordchange','0'),(25,9,'email_bounce_count','1'),(26,9,'email_send_count','1'),(27,2,'tool_usertours_tour_completion_time_2','1563056890'),(28,5,'tool_usertours_tour_completion_time_2','1563550396'),(29,5,'filepicker_recentrepository','2'),(30,5,'filepicker_recentlicense','allrightsreserved'),(31,8,'tool_usertours_tour_completion_time_2','1563566773'),(32,8,'filepicker_recentrepository','4'),(33,10,'auth_forcepasswordchange','0'),(34,10,'email_bounce_count','1'),(35,10,'email_send_count','1'),(36,11,'auth_forcepasswordchange','0'),(37,11,'email_bounce_count','1'),(38,11,'email_send_count','1'),(39,12,'auth_forcepasswordchange','0'),(40,12,'email_bounce_count','1'),(41,12,'email_send_count','1'),(42,13,'auth_forcepasswordchange','0'),(43,13,'email_bounce_count','1'),(44,13,'email_send_count','1'),(45,14,'auth_forcepasswordchange','0'),(46,14,'email_bounce_count','1'),(47,14,'email_send_count','1'),(48,15,'auth_forcepasswordchange','0'),(49,15,'email_bounce_count','1'),(50,15,'email_send_count','1'),(51,16,'auth_forcepasswordchange','0'),(52,16,'email_bounce_count','1'),(53,16,'email_send_count','1'),(54,17,'auth_forcepasswordchange','0'),(55,17,'email_bounce_count','1'),(56,17,'email_send_count','1'),(57,18,'auth_forcepasswordchange','0'),(58,18,'email_bounce_count','1'),(59,18,'email_send_count','1'),(60,19,'auth_forcepasswordchange','0'),(61,19,'email_bounce_count','1'),(62,19,'email_send_count','1');
/*!40000 ALTER TABLE `mdl_user_preferences` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:53
