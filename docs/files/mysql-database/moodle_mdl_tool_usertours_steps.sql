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
-- Table structure for table `mdl_tool_usertours_steps`
--

DROP TABLE IF EXISTS `mdl_tool_usertours_steps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_tool_usertours_steps` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `tourid` bigint(10) NOT NULL,
  `title` longtext,
  `content` longtext,
  `targettype` tinyint(2) NOT NULL,
  `targetvalue` longtext NOT NULL,
  `sortorder` bigint(10) NOT NULL DEFAULT '0',
  `configdata` longtext NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mdl_tooluserstep_tousor_ix` (`tourid`,`sortorder`),
  KEY `mdl_tooluserstep_tou_ix` (`tourid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='Steps in an tour';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_tool_usertours_steps`
--

LOCK TABLES `mdl_tool_usertours_steps` WRITE;
/*!40000 ALTER TABLE `mdl_tool_usertours_steps` DISABLE KEYS */;
INSERT INTO `mdl_tool_usertours_steps` VALUES (1,1,'tour1_title_welcome,tool_usertours','tour1_content_welcome,tool_usertours',2,'',0,'{}'),(2,1,'tour1_title_navigation,tool_usertours','tour1_content_navigation,tool_usertours',0,'[data-region=\"drawer-toggle\"] button[data-action=\"toggle-drawer\"]',1,'{}'),(3,1,'tour1_title_customisation,tool_usertours','tour1_content_customisation,tool_usertours',0,'body:not(.editing) #page-header .card-block',2,'{\"placement\":\"bottom\"}'),(4,1,'tour1_title_blockregion,tool_usertours','tour1_content_blockregion,tool_usertours',0,'body.editing [data-region=\"blocks-column\"]',3,'{}'),(5,1,'tour1_title_addingblocks,tool_usertours','tour1_content_addingblocks,tool_usertours',0,'body.editing [data-region=\"blocks-column\"]',4,'{\"placement\":\"bottom\"}'),(6,1,'tour1_title_end,tool_usertours','tour1_content_end,tool_usertours',2,'',5,'{}'),(7,2,'tour2_title_welcome,tool_usertours','tour2_content_welcome,tool_usertours',2,'',0,'{}'),(8,2,'tour2_title_customisation,tool_usertours','tour2_content_customisation,tool_usertours',0,'body:not(.editing) #page-header .card-block',1,'{}'),(9,2,'tour2_title_navigation,tool_usertours','tour2_content_navigation,tool_usertours',0,'[data-region=\"drawer-toggle\"] button[data-action=\"toggle-drawer\"]',2,'{}'),(10,2,'tour2_title_opendrawer,tool_usertours','tour2_content_opendrawer,tool_usertours',0,'body:not(.drawer-open-left) [data-region=\"drawer-toggle\"] button[data-action=\"toggle-drawer\"]',3,'{}'),(11,2,'tour2_title_participants,tool_usertours','tour2_content_participants,tool_usertours',0,'body.drawer-open-left [data-region=\"drawer\"] [data-key=\"participants\"]',4,'{\"placement\":\"bottom\",\"backdrop\":\"0\"}'),(12,2,'tour2_title_addblock,tool_usertours','tour2_content_addblock,tool_usertours',0,'body.drawer-open-left:not(.editing) [data-region=\"drawer\"]',5,'{\"placement\":\"right\",\"orphan\":\"0\",\"backdrop\":\"0\",\"reflex\":\"0\"}'),(13,2,'tour2_title_addingblocks,tool_usertours','tour2_content_addingblocks,tool_usertours',0,'body.drawer-open-left.editing [data-region=\"drawer\"] [data-key=\"addblock\"]',6,'{\"backdrop\":\"0\",\"placement\":\"top\"}'),(14,2,'tour2_title_end,tool_usertours','tour2_content_end,tool_usertours',2,'',7,'{}');
/*!40000 ALTER TABLE `mdl_tool_usertours_steps` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:14
