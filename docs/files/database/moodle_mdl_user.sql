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
-- Table structure for table `mdl_user`
--

DROP TABLE IF EXISTS `mdl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_user` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `auth` varchar(20) NOT NULL DEFAULT 'manual',
  `confirmed` tinyint(1) NOT NULL DEFAULT '0',
  `policyagreed` tinyint(1) NOT NULL DEFAULT '0',
  `deleted` tinyint(1) NOT NULL DEFAULT '0',
  `suspended` tinyint(1) NOT NULL DEFAULT '0',
  `mnethostid` bigint(10) NOT NULL DEFAULT '0',
  `username` varchar(100) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `idnumber` varchar(255) NOT NULL DEFAULT '',
  `firstname` varchar(100) NOT NULL DEFAULT '',
  `lastname` varchar(100) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  `emailstop` tinyint(1) NOT NULL DEFAULT '0',
  `icq` varchar(15) NOT NULL DEFAULT '',
  `skype` varchar(50) NOT NULL DEFAULT '',
  `yahoo` varchar(50) NOT NULL DEFAULT '',
  `aim` varchar(50) NOT NULL DEFAULT '',
  `msn` varchar(50) NOT NULL DEFAULT '',
  `phone1` varchar(20) NOT NULL DEFAULT '',
  `phone2` varchar(20) NOT NULL DEFAULT '',
  `institution` varchar(255) NOT NULL DEFAULT '',
  `department` varchar(255) NOT NULL DEFAULT '',
  `address` varchar(255) NOT NULL DEFAULT '',
  `city` varchar(120) NOT NULL DEFAULT '',
  `country` varchar(2) NOT NULL DEFAULT '',
  `lang` varchar(30) NOT NULL DEFAULT 'en',
  `calendartype` varchar(30) NOT NULL DEFAULT 'gregorian',
  `theme` varchar(50) NOT NULL DEFAULT '',
  `timezone` varchar(100) NOT NULL DEFAULT '99',
  `firstaccess` bigint(10) NOT NULL DEFAULT '0',
  `lastaccess` bigint(10) NOT NULL DEFAULT '0',
  `lastlogin` bigint(10) NOT NULL DEFAULT '0',
  `currentlogin` bigint(10) NOT NULL DEFAULT '0',
  `lastip` varchar(45) NOT NULL DEFAULT '',
  `secret` varchar(15) NOT NULL DEFAULT '',
  `picture` bigint(10) NOT NULL DEFAULT '0',
  `url` varchar(255) NOT NULL DEFAULT '',
  `description` longtext,
  `descriptionformat` tinyint(2) NOT NULL DEFAULT '1',
  `mailformat` tinyint(1) NOT NULL DEFAULT '1',
  `maildigest` tinyint(1) NOT NULL DEFAULT '0',
  `maildisplay` tinyint(2) NOT NULL DEFAULT '2',
  `autosubscribe` tinyint(1) NOT NULL DEFAULT '1',
  `trackforums` tinyint(1) NOT NULL DEFAULT '0',
  `timecreated` bigint(10) NOT NULL DEFAULT '0',
  `timemodified` bigint(10) NOT NULL DEFAULT '0',
  `trustbitmask` bigint(10) NOT NULL DEFAULT '0',
  `imagealt` varchar(255) DEFAULT NULL,
  `lastnamephonetic` varchar(255) DEFAULT NULL,
  `firstnamephonetic` varchar(255) DEFAULT NULL,
  `middlename` varchar(255) DEFAULT NULL,
  `alternatename` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_user_mneuse_uix` (`mnethostid`,`username`),
  KEY `mdl_user_del_ix` (`deleted`),
  KEY `mdl_user_con_ix` (`confirmed`),
  KEY `mdl_user_fir_ix` (`firstname`),
  KEY `mdl_user_las_ix` (`lastname`),
  KEY `mdl_user_cit_ix` (`city`),
  KEY `mdl_user_cou_ix` (`country`),
  KEY `mdl_user_las2_ix` (`lastaccess`),
  KEY `mdl_user_ema_ix` (`email`),
  KEY `mdl_user_aut_ix` (`auth`),
  KEY `mdl_user_idn_ix` (`idnumber`),
  KEY `mdl_user_fir2_ix` (`firstnamephonetic`),
  KEY `mdl_user_las3_ix` (`lastnamephonetic`),
  KEY `mdl_user_mid_ix` (`middlename`),
  KEY `mdl_user_alt_ix` (`alternatename`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='One record for each person';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_user`
--

LOCK TABLES `mdl_user` WRITE;
/*!40000 ALTER TABLE `mdl_user` DISABLE KEYS */;
INSERT INTO `mdl_user` VALUES (1,'manual',1,0,0,0,1,'guest','$2y$10$.hcFFTyM1qE2topCN03EfecFI5i.ili3WxSeVizLA.WYSaTAImOUe','','Guest user',' ','root@localhost',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','This user is a special user that allows read-only access to some courses.',1,1,0,2,1,0,0,1562895700,0,NULL,NULL,NULL,NULL,NULL),(2,'manual',1,0,0,0,1,'admin','$2y$10$RkJtKIyc7MDQvTh6Rk8o7OGlbV5JVJgs9YVVV/Pgs0sDhk.jGnpse','','Admin','User','alejandromover92+vpladmin@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',1562895851,1574040153,1573678523,1574040020,'10.0.75.1','',0,'','',1,1,0,1,1,0,0,1562943724,0,NULL,'','','',''),(3,'manual',1,0,0,0,1,'alejandro','$2y$10$VVEPJAkcioN7CAOCcd/2JeXU.xKRwu8brm5UiMBdd6DSN5Pc35QOa','','alejandro','student','alejandromover92+vplstudentalejandro@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',1562960954,1573778270,1573687756,1573772521,'10.0.75.1','',0,'','',1,1,0,2,1,0,1562949768,1562949768,0,'','','','',''),(4,'manual',1,0,0,0,1,'camilo','$2y$10$d8zpRxtMNKy5Zd.9/19lY.SKb7w4lRiqMRhaIlJRIeo7Tbf4iwkia','','camilo','student','alejandromover92+vplstudentcamilo@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1562961449,1562961449,0,'','','','',''),(5,'manual',1,0,0,0,1,'eliecer','$2y$10$q9coecbBhIKNjtV8IKsWT.6X03l08JWbb.6fGAthntWU/5AiwNTka','','eliecer','teacher ingsis','alejandromover92+vplteachereliecer@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',1563550366,1573777853,1573687880,1573771461,'10.0.75.1','',0,'','',1,1,0,2,1,0,1562961560,1562961560,0,'','','','',''),(6,'manual',1,0,0,0,1,'alexa','$2y$10$qe3fwVJgYq5HjoyRpP7pBe5upmLlM7kZvUcqcIBRnOCXf4tRpcZ4O','','alexa','teacher chemistry','alejandromover92+vplteacheralexa@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1562961666,1562961666,0,'','','','',''),(7,'manual',1,0,0,0,1,'santiago','$2y$10$7hfODP9ZcDOicKaFkePu/.tEzh9oj7Ur4DES1AT4NkMZFDo.TXJf.','','santiago','chemistry student','alejandromover92+vplstudentsantiago@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1562961786,1562961786,0,'','','','',''),(8,'manual',1,0,0,0,1,'eliecer2','$2y$10$H0o00piD3tZsgbI9tO8AKOouthV7ZpfuWrLij247CKYfPITzBYUsO','','eliecer two','teacher of POO 1 -2','alejandromover92+vplteachereliecer2@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',1563566754,1563893582,1563837842,1563893582,'10.0.0.1','',0,'','',1,1,0,2,1,0,1562965896,1562965896,0,'','','','',''),(9,'manual',1,0,0,0,1,'camilo2','$2y$10$75zg/nRy6HwkxvfKqlPYj.a1pnCU11R/vuQ4oQyw8rHSSwgDgg7Ta','','camilo two','student of poo 1-2','alejandromover92+vplstudentcamilo2@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1562966109,1562966109,0,'','','','',''),(10,'manual',1,0,0,0,1,'student01','$2y$10$DPc253eVcky57R0WAAYGdOC11FZKSVuPX055vUchtgQYTZW.XBRfa','','student','one','alejandromover92+vplstudent1@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337390,1564337390,0,'','','','',''),(11,'manual',1,0,0,0,1,'student02','$2y$10$sdjchiXU.Ln9JFrGNCUdpehFK0qo3K4wOvJ5UXiC7em8osMSAaE7K','','student','two','alejandromover92+vplstudent2@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337441,1564337441,0,'','','','',''),(12,'manual',1,0,0,0,1,'student03','$2y$10$3ODdBEUcP5J.P8ZyRjP/K.us4hqj/0zgzkpF5UgKK0sSrHNblaCEi','','student','three','alejandromover92+vplstudent3@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337529,1564337529,0,'','','','',''),(13,'manual',1,0,0,0,1,'student04','$2y$10$EsuObUEwid3v6tKRlGZSwOZHhlLUIP19nj6qtGrwrB3bOM.LdeoMe','','student','four','alejandromover92+vplstudent4@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337613,1564337613,0,'','','','',''),(14,'manual',1,0,0,0,1,'student05','$2y$10$JYj8HOiAIDAtjlaWkVzNBetm6R/RVvkIyCJNVUEN0gJghwZDf4SIO','','student','five','alejandromover92+vplstudent5@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337728,1564337728,0,'','','','',''),(15,'manual',1,0,0,0,1,'student06','$2y$10$jJkkq3tdxOnc8VNy5uzl9e8QwCuGIlb.XJ7m1BTP0HausHdRMg4TO','','student','six','alejandromover92+vplstudent6@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337897,1564337897,0,'','','','',''),(16,'manual',1,0,0,0,1,'student07','$2y$10$1atZza2P/ekQhUbXQM5hReLAjR9uVE5eLoa59vU2VJMYEQ6gv5krC','','student','seven','alejandromover92+vplstudent7@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564337987,1564337987,0,'','','','',''),(17,'manual',1,0,0,0,1,'student08','$2y$10$ctSGiQg.S3PAnZLqJe6A1u2RAjTWsV1cvqlj2A8am5Widq5LTkPLa','','student','eight','alejandromover92+vplstudent8@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564338204,1564338204,0,'','','','',''),(18,'manual',1,0,0,0,1,'student09','$2y$10$UmvbiZ5Ze9z0FsLL3.2u0.jPkaKFm7iqEBThSloyhws.jseJVFUmy','','student','nine','alejandromover92+vplstudent9@gmail.com',0,'','','','','','','','','','','','','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1564338463,1564338463,0,'','','','',''),(19,'manual',1,0,0,0,1,'elmo','$2y$10$sn1qTRvjfc9RFHI49rrIFeW1pTY86ZNVX2tLScA91Nq7PdqBx.5tS','','Eliecer Alejandro','Molina Vergel','alejandromover92@gmail.com',0,'','','','','','','','','','','Envigado','CO','en','gregorian','','99',0,0,0,0,'','',0,'','',1,1,0,2,1,0,1573091744,1573091744,0,'','','','','');
/*!40000 ALTER TABLE `mdl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:50
