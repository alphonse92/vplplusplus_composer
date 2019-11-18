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
-- Table structure for table `mdl_editor_atto_autosave`
--

DROP TABLE IF EXISTS `mdl_editor_atto_autosave`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_editor_atto_autosave` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `elementid` varchar(255) NOT NULL DEFAULT '',
  `contextid` bigint(10) NOT NULL,
  `pagehash` varchar(64) NOT NULL DEFAULT '',
  `userid` bigint(10) NOT NULL,
  `drafttext` longtext NOT NULL,
  `draftid` bigint(10) DEFAULT NULL,
  `pageinstance` varchar(64) NOT NULL DEFAULT '',
  `timemodified` bigint(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_editattoauto_eleconuse_uix` (`elementid`,`contextid`,`userid`,`pagehash`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='Draft text that is auto-saved every 5 seconds while an edito';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_editor_atto_autosave`
--

LOCK TABLES `mdl_editor_atto_autosave` WRITE;
/*!40000 ALTER TABLE `mdl_editor_atto_autosave` DISABLE KEYS */;
INSERT INTO `mdl_editor_atto_autosave` VALUES (16,'id_summary_editor',40,'b51d932252489a96855e29428cf6b4bac43adf30',2,'',885318597,'yui_3_17_2_1_1563487426082_275',1563487428),(17,'id_summary_editor',40,'8f301dd7a0dd794b2fd8d625e0b2e4e4b97bb3b9',2,'',803426556,'yui_3_17_2_1_1563487455435_274',1563487457),(19,'id_summary_editor',40,'8f301dd7a0dd794b2fd8d625e0b2e4e4b97bb3b9',8,'',20603121,'yui_3_17_2_1_1563747156038_283',1563747163),(20,'id_introeditor',72,'4f11d8fdceff851a89d135030991cb2906db65ab',8,'',409864287,'yui_3_17_2_1_1563750873409_324',1563750876),(26,'id_description_editor',81,'67edc00605eee666bb14e73dd3e40bcef6324f15',2,'',930135699,'yui_3_17_2_1_1564337747356_111',1564337748),(27,'id_summary_editor',35,'fdcce9158f145ef11366534d9082c08a90132e52',2,'',888380804,'yui_3_17_2_1_1564425366639_275',1564425369),(29,'id_description_editor',86,'7710fd3208b9d722b69e8fffa04e509d1f47574b',2,'',418182140,'yui_3_17_2_1_1573091784629_111',1573091785),(30,'id_introeditor',49,'50e44864f99aabd4cf9e94ba3f3bee3135a491ba',5,'',252106919,'yui_3_17_2_1_1573676217493_318',1573676220),(31,'id_introeditor',91,'97d858439fcf354475b205ac6db33a0bf3513c33',5,'En este ejercicio deberás crear una clase llamada calculadora, en ella debes implementar las 4 operaciones aritméticas básicas:',82788889,'yui_3_17_2_1_1573772929752_324',1573772991),(32,'id_introeditor',91,'702ea427d676092e105ed601bb0bc886a7a9b047',5,'',779752301,'yui_3_17_2_1_1573773056448_324',1573773058);
/*!40000 ALTER TABLE `mdl_editor_atto_autosave` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:18
