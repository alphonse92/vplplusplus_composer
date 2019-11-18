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
-- Table structure for table `mdl_cache_flags`
--

DROP TABLE IF EXISTS `mdl_cache_flags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_cache_flags` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `flagtype` varchar(255) NOT NULL DEFAULT '',
  `name` varchar(255) NOT NULL DEFAULT '',
  `timemodified` bigint(10) NOT NULL DEFAULT '0',
  `value` longtext NOT NULL,
  `expiry` bigint(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mdl_cachflag_fla_ix` (`flagtype`),
  KEY `mdl_cachflag_nam_ix` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='Cache of time-sensitive flags';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_cache_flags`
--

LOCK TABLES `mdl_cache_flags` WRITE;
/*!40000 ALTER TABLE `mdl_cache_flags` DISABLE KEYS */;
INSERT INTO `mdl_cache_flags` VALUES (1,'userpreferenceschanged','2',1574040020,'1',1574047220),(2,'userpreferenceschanged','3',1573772521,'1',1573779721),(3,'userpreferenceschanged','4',1562961449,'1',1562968649),(4,'userpreferenceschanged','5',1573771461,'1',1573778661),(5,'userpreferenceschanged','6',1562961666,'1',1562968866),(6,'userpreferenceschanged','7',1562961786,'1',1562968986),(7,'accesslib/dirtycontexts','/1/3/33',1562962209,'1',1562969409),(8,'accesslib/dirtycontexts','/1/34',1562962164,'1',1562969364),(9,'accesslib/dirtycontexts','/1/33',1562962209,'1',1562969409),(10,'accesslib/dirtycontexts','/1/33/35',1564425602,'1',1564432802),(11,'accesslib/dirtycontexts','/1/34/36',1562962421,'1',1562969621),(12,'userpreferenceschanged','8',1563893582,'1',1563900782),(13,'userpreferenceschanged','9',1562966110,'1',1562973310),(14,'accesslib/dirtycontexts','/1/3',1563056200,'1',1563063400),(15,'accesslib/dirtycontexts','/1/33/40',1563487614,'1',1563494814),(16,'userpreferenceschanged','10',1564337390,'1',1564344590),(17,'userpreferenceschanged','11',1564337442,'1',1564344642),(18,'userpreferenceschanged','12',1564337529,'1',1564344729),(19,'userpreferenceschanged','13',1564337613,'1',1564344813),(20,'userpreferenceschanged','14',1564337728,'1',1564344928),(21,'userpreferenceschanged','15',1564337897,'1',1564345097),(22,'userpreferenceschanged','16',1564337987,'1',1564345187),(23,'userpreferenceschanged','17',1564338204,'1',1564345404),(24,'userpreferenceschanged','18',1564338464,'1',1564345664),(25,'userpreferenceschanged','19',1573091744,'1',1573098944);
/*!40000 ALTER TABLE `mdl_cache_flags` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:47
