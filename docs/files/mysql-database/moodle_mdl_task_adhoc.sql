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
-- Table structure for table `mdl_task_adhoc`
--

DROP TABLE IF EXISTS `mdl_task_adhoc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_task_adhoc` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `component` varchar(255) NOT NULL DEFAULT '',
  `classname` varchar(255) NOT NULL DEFAULT '',
  `nextruntime` bigint(10) NOT NULL,
  `faildelay` bigint(10) DEFAULT NULL,
  `customdata` longtext,
  `userid` bigint(10) DEFAULT NULL,
  `blocking` tinyint(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `mdl_taskadho_nex_ix` (`nextruntime`),
  KEY `mdl_taskadho_use_ix` (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='List of adhoc tasks waiting to run.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_task_adhoc`
--

LOCK TABLES `mdl_task_adhoc` WRITE;
/*!40000 ALTER TABLE `mdl_task_adhoc` DISABLE KEYS */;
INSERT INTO `mdl_task_adhoc` VALUES (1,'','\\core_course\\task\\course_delete_modules',1563057101,0,'{\"cms\":[],\"userid\":\"2\",\"realuserid\":\"2\"}',NULL,0),(2,'','\\core_course\\task\\course_delete_modules',1563057110,0,'{\"cms\":[],\"userid\":\"2\",\"realuserid\":\"2\"}',NULL,0),(3,'','\\core_course\\task\\course_delete_modules',1563057118,0,'{\"cms\":[],\"userid\":\"2\",\"realuserid\":\"2\"}',NULL,0),(4,'','\\core_course\\task\\course_delete_modules',1563057125,0,'{\"cms\":[],\"userid\":\"2\",\"realuserid\":\"2\"}',NULL,0),(5,'','\\core\\task\\refresh_mod_calendar_events_task',1563552874,0,'{\"courseid\":\"2\"}',NULL,0),(6,'','\\core_course\\task\\course_delete_modules',1563552905,0,'{\"cms\":[{\"id\":\"6\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"2\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1563551556\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(7,'','\\core_course\\task\\course_delete_modules',1563552910,0,'{\"cms\":[{\"id\":\"5\",\"course\":\"2\",\"module\":\"9\",\"instance\":\"4\",\"section\":\"1\",\"idnumber\":null,\"added\":\"1562962304\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"0\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(8,'','\\core\\task\\refresh_mod_calendar_events_task',1563553251,0,'{\"courseid\":2}',NULL,0),(9,'','\\core\\task\\refresh_mod_calendar_events_task',1563573762,0,'{\"courseid\":4}',NULL,0),(10,'','\\core_course\\task\\course_delete_modules',1563573809,0,'{\"cms\":[{\"id\":\"8\",\"course\":\"4\",\"module\":\"23\",\"instance\":\"4\",\"section\":\"13\",\"idnumber\":\"\",\"added\":\"1506898181\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"8\",\"realuserid\":\"8\"}',NULL,0),(11,'','\\core_course\\task\\course_delete_modules',1563574166,0,'{\"cms\":{\"9\":{\"id\":\"9\"},\"10\":{\"id\":\"10\"}},\"userid\":\"8\",\"realuserid\":\"8\"}',NULL,0),(12,'','\\core_course\\task\\course_delete_modules',1563574175,0,'{\"cms\":[],\"userid\":\"8\",\"realuserid\":\"8\"}',NULL,0),(13,'','\\core_course\\task\\course_delete_modules',1563574186,0,'{\"cms\":[],\"userid\":\"8\",\"realuserid\":\"8\"}',NULL,0),(14,'','\\core_course\\task\\course_delete_modules',1563574195,0,'{\"cms\":[],\"userid\":\"8\",\"realuserid\":\"8\"}',NULL,0),(15,'','\\core_course\\task\\course_delete_modules',1563574220,0,'{\"cms\":[{\"id\":\"3\",\"course\":\"4\",\"module\":\"9\",\"instance\":\"3\",\"section\":\"12\",\"idnumber\":null,\"added\":\"1563487355\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"2\",\"groupingid\":\"0\",\"completion\":\"0\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"8\",\"realuserid\":\"8\"}',NULL,0),(16,'','\\core_course\\task\\course_delete_modules',1573676426,0,'{\"cms\":[{\"id\":\"7\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"3\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1506898181\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(17,'','\\core_course\\task\\course_delete_modules',1573676434,0,'{\"cms\":[{\"id\":\"4\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"1\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1563551556\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(18,'','\\core_course\\task\\course_delete_modules',1573681675,0,'{\"cms\":[{\"id\":\"25\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"18\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1573676717\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(19,'','\\core_course\\task\\course_delete_modules',1573683051,0,'{\"cms\":[{\"id\":\"26\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"19\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1506898181\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(20,'','\\core_course\\task\\course_delete_modules',1573686802,0,'{\"cms\":[{\"id\":\"27\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"20\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1506898181\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0),(21,'','\\core_course\\task\\course_delete_modules',1573771777,0,'{\"cms\":[{\"id\":\"28\",\"course\":\"2\",\"module\":\"23\",\"instance\":\"21\",\"section\":\"11\",\"idnumber\":\"\",\"added\":\"1506898181\",\"score\":\"0\",\"indent\":\"0\",\"visible\":\"1\",\"visibleoncoursepage\":\"1\",\"visibleold\":\"1\",\"groupmode\":\"0\",\"groupingid\":\"0\",\"completion\":\"1\",\"completiongradeitemnumber\":null,\"completionview\":\"0\",\"completionexpected\":\"0\",\"showdescription\":\"0\",\"availability\":null,\"deletioninprogress\":\"1\"}],\"userid\":\"5\",\"realuserid\":\"5\"}',NULL,0);
/*!40000 ALTER TABLE `mdl_task_adhoc` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:31:28
