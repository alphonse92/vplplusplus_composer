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
-- Table structure for table `mdl_block_instances`
--

DROP TABLE IF EXISTS `mdl_block_instances`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_block_instances` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `blockname` varchar(40) NOT NULL DEFAULT '',
  `parentcontextid` bigint(10) NOT NULL,
  `showinsubcontexts` smallint(4) NOT NULL,
  `requiredbytheme` smallint(4) NOT NULL DEFAULT '0',
  `pagetypepattern` varchar(64) NOT NULL DEFAULT '',
  `subpagepattern` varchar(16) DEFAULT NULL,
  `defaultregion` varchar(16) NOT NULL DEFAULT '',
  `defaultweight` bigint(10) NOT NULL,
  `configdata` longtext,
  `timecreated` bigint(10) NOT NULL,
  `timemodified` bigint(10) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `mdl_blocinst_parshopagsub_ix` (`parentcontextid`,`showinsubcontexts`,`pagetypepattern`,`subpagepattern`),
  KEY `mdl_blocinst_tim_ix` (`timemodified`),
  KEY `mdl_blocinst_par_ix` (`parentcontextid`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='This table stores block instances. The type of block this is';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_block_instances`
--

LOCK TABLES `mdl_block_instances` WRITE;
/*!40000 ALTER TABLE `mdl_block_instances` DISABLE KEYS */;
INSERT INTO `mdl_block_instances` VALUES (1,'admin_bookmarks',1,0,0,'admin-*',NULL,'side-pre',2,'',1562895759,1562895759),(2,'private_files',1,0,0,'my-index','2','side-post',0,'',1562895759,1562895759),(3,'online_users',1,0,0,'my-index','2','side-post',1,'',1562895759,1562895759),(4,'badges',1,0,0,'my-index','2','side-post',2,'',1562895759,1562895759),(5,'calendar_month',1,0,0,'my-index','2','side-post',3,'',1562895759,1562895759),(6,'calendar_upcoming',1,0,0,'my-index','2','side-post',4,'',1562895759,1562895759),(7,'lp',1,0,0,'my-index','2','content',0,'',1562895759,1562895759),(8,'myoverview',1,0,0,'my-index','2','content',1,'',1562895759,1562895759),(9,'private_files',5,0,0,'my-index','3','side-post',0,'',1562943996,1562943996),(10,'online_users',5,0,0,'my-index','3','side-post',1,'',1562943996,1562943996),(11,'badges',5,0,0,'my-index','3','side-post',2,'',1562943996,1562943996),(12,'calendar_month',5,0,0,'my-index','3','side-post',3,'',1562943996,1562943996),(13,'calendar_upcoming',5,0,0,'my-index','3','side-post',4,'',1562943996,1562943996),(14,'lp',5,0,0,'my-index','3','content',0,'',1562943996,1562943996),(15,'myoverview',5,0,0,'my-index','3','content',1,'',1562943996,1562943996),(16,'private_files',21,0,0,'my-index','4','side-post',0,'',1562960963,1562960963),(17,'online_users',21,0,0,'my-index','4','side-post',1,'',1562960964,1562960964),(18,'badges',21,0,0,'my-index','4','side-post',2,'',1562960964,1562960964),(19,'calendar_month',21,0,0,'my-index','4','side-post',3,'',1562960964,1562960964),(20,'calendar_upcoming',21,0,0,'my-index','4','side-post',4,'',1562960964,1562960964),(21,'lp',21,0,0,'my-index','4','content',0,'',1562960964,1562960964),(22,'myoverview',21,0,0,'my-index','4','content',1,'',1562960964,1562960964),(23,'private_files',30,0,0,'my-index','5','side-post',0,'',1563550368,1563550368),(24,'online_users',30,0,0,'my-index','5','side-post',1,'',1563550368,1563550368),(25,'badges',30,0,0,'my-index','5','side-post',2,'',1563550368,1563550368),(26,'calendar_month',30,0,0,'my-index','5','side-post',3,'',1563550368,1563550368),(27,'calendar_upcoming',30,0,0,'my-index','5','side-post',4,'',1563550368,1563550368),(28,'lp',30,0,0,'my-index','5','content',0,'',1563550368,1563550368),(29,'myoverview',30,0,0,'my-index','5','content',1,'',1563550368,1563550368),(30,'private_files',38,0,0,'my-index','6','side-post',0,'',1563566756,1563566756),(31,'online_users',38,0,0,'my-index','6','side-post',1,'',1563566756,1563566756),(32,'badges',38,0,0,'my-index','6','side-post',2,'',1563566756,1563566756),(33,'calendar_month',38,0,0,'my-index','6','side-post',3,'',1563566756,1563566756),(34,'calendar_upcoming',38,0,0,'my-index','6','side-post',4,'',1563566756,1563566756),(35,'lp',38,0,0,'my-index','6','content',0,'',1563566756,1563566756),(36,'myoverview',38,0,0,'my-index','6','content',1,'',1563566756,1563566756);
/*!40000 ALTER TABLE `mdl_block_instances` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:39
