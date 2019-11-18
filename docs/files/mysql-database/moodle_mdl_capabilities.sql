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
-- Table structure for table `mdl_capabilities`
--

DROP TABLE IF EXISTS `mdl_capabilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_capabilities` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL DEFAULT '',
  `captype` varchar(50) NOT NULL DEFAULT '',
  `contextlevel` bigint(10) NOT NULL DEFAULT '0',
  `component` varchar(100) NOT NULL DEFAULT '',
  `riskbitmask` bigint(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_capa_nam_uix` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=607 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='this defines all capabilities';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_capabilities`
--

LOCK TABLES `mdl_capabilities` WRITE;
/*!40000 ALTER TABLE `mdl_capabilities` DISABLE KEYS */;
INSERT INTO `mdl_capabilities` VALUES (1,'moodle/site:config','write',10,'moodle',62),(2,'moodle/site:configview','read',10,'moodle',0),(3,'moodle/site:readallmessages','read',10,'moodle',8),(4,'moodle/site:manageallmessaging','write',10,'moodle',8),(5,'moodle/site:deleteanymessage','write',10,'moodle',32),(6,'moodle/site:sendmessage','write',10,'moodle',16),(7,'moodle/site:deleteownmessage','write',10,'moodle',0),(8,'moodle/site:approvecourse','write',10,'moodle',4),(9,'moodle/backup:backupcourse','write',50,'moodle',28),(10,'moodle/backup:backupsection','write',50,'moodle',28),(11,'moodle/backup:backupactivity','write',70,'moodle',28),(12,'moodle/backup:backuptargethub','write',50,'moodle',28),(13,'moodle/backup:backuptargetimport','write',50,'moodle',28),(14,'moodle/backup:downloadfile','write',50,'moodle',28),(15,'moodle/backup:configure','write',50,'moodle',28),(16,'moodle/backup:userinfo','read',50,'moodle',8),(17,'moodle/backup:anonymise','read',50,'moodle',8),(18,'moodle/restore:restorecourse','write',50,'moodle',28),(19,'moodle/restore:restoresection','write',50,'moodle',28),(20,'moodle/restore:restoreactivity','write',50,'moodle',28),(21,'moodle/restore:viewautomatedfilearea','write',50,'moodle',28),(22,'moodle/restore:restoretargethub','write',50,'moodle',28),(23,'moodle/restore:restoretargetimport','write',50,'moodle',28),(24,'moodle/restore:uploadfile','write',50,'moodle',28),(25,'moodle/restore:configure','write',50,'moodle',28),(26,'moodle/restore:rolldates','write',50,'moodle',0),(27,'moodle/restore:userinfo','write',50,'moodle',30),(28,'moodle/restore:createuser','write',10,'moodle',24),(29,'moodle/site:manageblocks','write',80,'moodle',20),(30,'moodle/site:accessallgroups','read',50,'moodle',0),(31,'moodle/site:viewfullnames','read',50,'moodle',0),(32,'moodle/site:viewuseridentity','read',50,'moodle',0),(33,'moodle/site:viewreports','read',50,'moodle',8),(34,'moodle/site:trustcontent','write',50,'moodle',4),(35,'moodle/site:uploadusers','write',10,'moodle',24),(36,'moodle/filter:manage','write',50,'moodle',0),(37,'moodle/user:create','write',10,'moodle',24),(38,'moodle/user:delete','write',10,'moodle',40),(39,'moodle/user:update','write',10,'moodle',24),(40,'moodle/user:viewdetails','read',50,'moodle',0),(41,'moodle/user:viewalldetails','read',30,'moodle',8),(42,'moodle/user:viewlastip','read',30,'moodle',8),(43,'moodle/user:viewhiddendetails','read',50,'moodle',8),(44,'moodle/user:loginas','write',50,'moodle',30),(45,'moodle/user:managesyspages','write',10,'moodle',0),(46,'moodle/user:manageblocks','write',30,'moodle',0),(47,'moodle/user:manageownblocks','write',10,'moodle',0),(48,'moodle/user:manageownfiles','write',10,'moodle',0),(49,'moodle/user:ignoreuserquota','write',10,'moodle',0),(50,'moodle/my:configsyspages','write',10,'moodle',0),(51,'moodle/role:assign','write',50,'moodle',28),(52,'moodle/role:review','read',50,'moodle',8),(53,'moodle/role:override','write',50,'moodle',28),(54,'moodle/role:safeoverride','write',50,'moodle',16),(55,'moodle/role:manage','write',10,'moodle',28),(56,'moodle/role:switchroles','read',50,'moodle',12),(57,'moodle/category:manage','write',40,'moodle',4),(58,'moodle/category:viewhiddencategories','read',40,'moodle',0),(59,'moodle/cohort:manage','write',40,'moodle',0),(60,'moodle/cohort:assign','write',40,'moodle',0),(61,'moodle/cohort:view','read',50,'moodle',0),(62,'moodle/course:create','write',40,'moodle',4),(63,'moodle/course:request','write',10,'moodle',0),(64,'moodle/course:delete','write',50,'moodle',32),(65,'moodle/course:update','write',50,'moodle',4),(66,'moodle/course:view','read',50,'moodle',0),(67,'moodle/course:enrolreview','read',50,'moodle',8),(68,'moodle/course:enrolconfig','write',50,'moodle',8),(69,'moodle/course:reviewotherusers','read',50,'moodle',0),(70,'moodle/course:bulkmessaging','write',50,'moodle',16),(71,'moodle/course:viewhiddenuserfields','read',50,'moodle',8),(72,'moodle/course:viewhiddencourses','read',50,'moodle',0),(73,'moodle/course:visibility','write',50,'moodle',0),(74,'moodle/course:managefiles','write',50,'moodle',4),(75,'moodle/course:ignoreavailabilityrestrictions','read',70,'moodle',0),(76,'moodle/course:ignorefilesizelimits','write',50,'moodle',0),(77,'moodle/course:manageactivities','write',70,'moodle',4),(78,'moodle/course:activityvisibility','write',70,'moodle',0),(79,'moodle/course:viewhiddenactivities','write',70,'moodle',0),(80,'moodle/course:viewparticipants','read',50,'moodle',0),(81,'moodle/course:changefullname','write',50,'moodle',4),(82,'moodle/course:changeshortname','write',50,'moodle',4),(83,'moodle/course:renameroles','write',50,'moodle',0),(84,'moodle/course:changeidnumber','write',50,'moodle',4),(85,'moodle/course:changecategory','write',50,'moodle',4),(86,'moodle/course:changesummary','write',50,'moodle',4),(87,'moodle/site:viewparticipants','read',10,'moodle',0),(88,'moodle/course:isincompletionreports','read',50,'moodle',0),(89,'moodle/course:viewscales','read',50,'moodle',0),(90,'moodle/course:managescales','write',50,'moodle',0),(91,'moodle/course:managegroups','write',50,'moodle',4),(92,'moodle/course:reset','write',50,'moodle',32),(93,'moodle/course:viewsuspendedusers','read',10,'moodle',0),(94,'moodle/course:tag','write',50,'moodle',16),(95,'moodle/blog:view','read',10,'moodle',0),(96,'moodle/blog:search','read',10,'moodle',0),(97,'moodle/blog:viewdrafts','read',10,'moodle',8),(98,'moodle/blog:create','write',10,'moodle',16),(99,'moodle/blog:manageentries','write',10,'moodle',16),(100,'moodle/blog:manageexternal','write',10,'moodle',16),(101,'moodle/calendar:manageownentries','write',50,'moodle',16),(102,'moodle/calendar:managegroupentries','write',50,'moodle',16),(103,'moodle/calendar:manageentries','write',50,'moodle',16),(104,'moodle/user:editprofile','write',30,'moodle',24),(105,'moodle/user:editownprofile','write',10,'moodle',16),(106,'moodle/user:changeownpassword','write',10,'moodle',0),(107,'moodle/user:readuserposts','read',30,'moodle',0),(108,'moodle/user:readuserblogs','read',30,'moodle',0),(109,'moodle/user:viewuseractivitiesreport','read',30,'moodle',8),(110,'moodle/user:editmessageprofile','write',30,'moodle',16),(111,'moodle/user:editownmessageprofile','write',10,'moodle',0),(112,'moodle/question:managecategory','write',50,'moodle',20),(113,'moodle/question:add','write',50,'moodle',20),(114,'moodle/question:editmine','write',50,'moodle',20),(115,'moodle/question:editall','write',50,'moodle',20),(116,'moodle/question:viewmine','read',50,'moodle',0),(117,'moodle/question:viewall','read',50,'moodle',0),(118,'moodle/question:usemine','read',50,'moodle',0),(119,'moodle/question:useall','read',50,'moodle',0),(120,'moodle/question:movemine','write',50,'moodle',0),(121,'moodle/question:moveall','write',50,'moodle',0),(122,'moodle/question:config','write',10,'moodle',2),(123,'moodle/question:flag','write',50,'moodle',0),(124,'moodle/site:doclinks','read',10,'moodle',0),(125,'moodle/course:sectionvisibility','write',50,'moodle',0),(126,'moodle/course:useremail','write',50,'moodle',0),(127,'moodle/course:viewhiddensections','write',50,'moodle',0),(128,'moodle/course:setcurrentsection','write',50,'moodle',0),(129,'moodle/course:movesections','write',50,'moodle',0),(130,'moodle/site:mnetlogintoremote','read',10,'moodle',0),(131,'moodle/grade:viewall','read',50,'moodle',8),(132,'moodle/grade:view','read',50,'moodle',0),(133,'moodle/grade:viewhidden','read',50,'moodle',8),(134,'moodle/grade:import','write',50,'moodle',12),(135,'moodle/grade:export','read',50,'moodle',8),(136,'moodle/grade:manage','write',50,'moodle',12),(137,'moodle/grade:edit','write',50,'moodle',12),(138,'moodle/grade:managegradingforms','write',50,'moodle',12),(139,'moodle/grade:sharegradingforms','write',10,'moodle',4),(140,'moodle/grade:managesharedforms','write',10,'moodle',4),(141,'moodle/grade:manageoutcomes','write',50,'moodle',0),(142,'moodle/grade:manageletters','write',50,'moodle',0),(143,'moodle/grade:hide','write',50,'moodle',0),(144,'moodle/grade:lock','write',50,'moodle',0),(145,'moodle/grade:unlock','write',50,'moodle',0),(146,'moodle/my:manageblocks','write',10,'moodle',0),(147,'moodle/notes:view','read',50,'moodle',0),(148,'moodle/notes:manage','write',50,'moodle',16),(149,'moodle/tag:manage','write',10,'moodle',16),(150,'moodle/tag:edit','write',10,'moodle',16),(151,'moodle/tag:flag','write',10,'moodle',16),(152,'moodle/tag:editblocks','write',10,'moodle',0),(153,'moodle/block:view','read',80,'moodle',0),(154,'moodle/block:edit','write',80,'moodle',20),(155,'moodle/portfolio:export','read',10,'moodle',0),(156,'moodle/comment:view','read',50,'moodle',0),(157,'moodle/comment:post','write',50,'moodle',24),(158,'moodle/comment:delete','write',50,'moodle',32),(159,'moodle/webservice:createtoken','write',10,'moodle',62),(160,'moodle/webservice:managealltokens','write',10,'moodle',42),(161,'moodle/webservice:createmobiletoken','write',10,'moodle',24),(162,'moodle/rating:view','read',50,'moodle',0),(163,'moodle/rating:viewany','read',50,'moodle',8),(164,'moodle/rating:viewall','read',50,'moodle',8),(165,'moodle/rating:rate','write',50,'moodle',0),(166,'moodle/course:publish','write',10,'moodle',24),(167,'moodle/course:markcomplete','write',50,'moodle',0),(168,'moodle/course:overridecompletion','write',50,'moodle',0),(169,'moodle/community:add','write',10,'moodle',0),(170,'moodle/community:download','write',10,'moodle',0),(171,'moodle/badges:manageglobalsettings','write',10,'moodle',34),(172,'moodle/badges:viewbadges','read',50,'moodle',0),(173,'moodle/badges:manageownbadges','write',30,'moodle',0),(174,'moodle/badges:viewotherbadges','read',30,'moodle',0),(175,'moodle/badges:earnbadge','write',50,'moodle',0),(176,'moodle/badges:createbadge','write',50,'moodle',16),(177,'moodle/badges:deletebadge','write',50,'moodle',32),(178,'moodle/badges:configuredetails','write',50,'moodle',16),(179,'moodle/badges:configurecriteria','write',50,'moodle',4),(180,'moodle/badges:configuremessages','write',50,'moodle',16),(181,'moodle/badges:awardbadge','write',50,'moodle',16),(182,'moodle/badges:revokebadge','write',50,'moodle',16),(183,'moodle/badges:viewawarded','read',50,'moodle',8),(184,'moodle/site:forcelanguage','read',10,'moodle',0),(185,'moodle/search:query','read',10,'moodle',0),(186,'moodle/competency:competencymanage','write',40,'moodle',0),(187,'moodle/competency:competencyview','read',40,'moodle',0),(188,'moodle/competency:competencygrade','write',50,'moodle',0),(189,'moodle/competency:coursecompetencymanage','write',50,'moodle',0),(190,'moodle/competency:coursecompetencyconfigure','write',70,'moodle',0),(191,'moodle/competency:coursecompetencygradable','read',50,'moodle',0),(192,'moodle/competency:coursecompetencyview','read',50,'moodle',0),(193,'moodle/competency:evidencedelete','write',30,'moodle',0),(194,'moodle/competency:planmanage','write',30,'moodle',0),(195,'moodle/competency:planmanagedraft','write',30,'moodle',0),(196,'moodle/competency:planmanageown','write',30,'moodle',0),(197,'moodle/competency:planmanageowndraft','write',30,'moodle',0),(198,'moodle/competency:planview','read',30,'moodle',0),(199,'moodle/competency:planviewdraft','read',30,'moodle',0),(200,'moodle/competency:planviewown','read',30,'moodle',0),(201,'moodle/competency:planviewowndraft','read',30,'moodle',0),(202,'moodle/competency:planrequestreview','write',30,'moodle',0),(203,'moodle/competency:planrequestreviewown','write',30,'moodle',0),(204,'moodle/competency:planreview','write',30,'moodle',0),(205,'moodle/competency:plancomment','write',30,'moodle',0),(206,'moodle/competency:plancommentown','write',30,'moodle',0),(207,'moodle/competency:usercompetencyview','read',30,'moodle',0),(208,'moodle/competency:usercompetencyrequestreview','write',30,'moodle',0),(209,'moodle/competency:usercompetencyrequestreviewown','write',30,'moodle',0),(210,'moodle/competency:usercompetencyreview','write',30,'moodle',0),(211,'moodle/competency:usercompetencycomment','write',30,'moodle',0),(212,'moodle/competency:usercompetencycommentown','write',30,'moodle',0),(213,'moodle/competency:templatemanage','write',40,'moodle',0),(214,'moodle/analytics:listinsights','read',50,'moodle',8),(215,'moodle/analytics:managemodels','write',10,'moodle',2),(216,'moodle/competency:templateview','read',40,'moodle',0),(217,'moodle/competency:userevidencemanage','write',30,'moodle',0),(218,'moodle/competency:userevidencemanageown','write',30,'moodle',0),(219,'moodle/competency:userevidenceview','read',30,'moodle',0),(220,'moodle/site:maintenanceaccess','write',10,'moodle',0),(221,'mod/assign:view','read',70,'mod_assign',0),(222,'mod/assign:submit','write',70,'mod_assign',0),(223,'mod/assign:grade','write',70,'mod_assign',4),(224,'mod/assign:exportownsubmission','read',70,'mod_assign',0),(225,'mod/assign:addinstance','write',50,'mod_assign',4),(226,'mod/assign:editothersubmission','write',70,'mod_assign',41),(227,'mod/assign:grantextension','write',70,'mod_assign',0),(228,'mod/assign:revealidentities','write',70,'mod_assign',0),(229,'mod/assign:reviewgrades','write',70,'mod_assign',0),(230,'mod/assign:releasegrades','write',70,'mod_assign',0),(231,'mod/assign:managegrades','write',70,'mod_assign',0),(232,'mod/assign:manageallocations','write',70,'mod_assign',0),(233,'mod/assign:viewgrades','read',70,'mod_assign',0),(234,'mod/assign:viewblinddetails','write',70,'mod_assign',8),(235,'mod/assign:receivegradernotifications','read',70,'mod_assign',0),(236,'mod/assign:manageoverrides','write',70,'mod_assign',0),(237,'mod/assignment:view','read',70,'mod_assignment',0),(238,'mod/assignment:addinstance','write',50,'mod_assignment',4),(239,'mod/assignment:submit','write',70,'mod_assignment',0),(240,'mod/assignment:grade','write',70,'mod_assignment',4),(241,'mod/assignment:exportownsubmission','read',70,'mod_assignment',0),(242,'mod/book:addinstance','write',50,'mod_book',4),(243,'mod/book:read','read',70,'mod_book',0),(244,'mod/book:viewhiddenchapters','read',70,'mod_book',0),(245,'mod/book:edit','write',70,'mod_book',4),(246,'mod/chat:addinstance','write',50,'mod_chat',4),(247,'mod/chat:chat','write',70,'mod_chat',16),(248,'mod/chat:readlog','read',70,'mod_chat',0),(249,'mod/chat:deletelog','write',70,'mod_chat',0),(250,'mod/chat:exportparticipatedsession','read',70,'mod_chat',8),(251,'mod/chat:exportsession','read',70,'mod_chat',8),(252,'mod/chat:view','read',70,'mod_chat',0),(253,'mod/choice:addinstance','write',50,'mod_choice',4),(254,'mod/choice:choose','write',70,'mod_choice',0),(255,'mod/choice:readresponses','read',70,'mod_choice',0),(256,'mod/choice:deleteresponses','write',70,'mod_choice',0),(257,'mod/choice:downloadresponses','read',70,'mod_choice',0),(258,'mod/choice:view','read',70,'mod_choice',0),(259,'mod/data:addinstance','write',50,'mod_data',4),(260,'mod/data:viewentry','read',70,'mod_data',0),(261,'mod/data:writeentry','write',70,'mod_data',16),(262,'mod/data:comment','write',70,'mod_data',16),(263,'mod/data:rate','write',70,'mod_data',0),(264,'mod/data:viewrating','read',70,'mod_data',0),(265,'mod/data:viewanyrating','read',70,'mod_data',8),(266,'mod/data:viewallratings','read',70,'mod_data',8),(267,'mod/data:approve','write',70,'mod_data',16),(268,'mod/data:manageentries','write',70,'mod_data',16),(269,'mod/data:managecomments','write',70,'mod_data',16),(270,'mod/data:managetemplates','write',70,'mod_data',20),(271,'mod/data:viewalluserpresets','read',70,'mod_data',0),(272,'mod/data:manageuserpresets','write',70,'mod_data',20),(273,'mod/data:exportentry','read',70,'mod_data',8),(274,'mod/data:exportownentry','read',70,'mod_data',0),(275,'mod/data:exportallentries','read',70,'mod_data',8),(276,'mod/data:exportuserinfo','read',70,'mod_data',8),(277,'mod/data:view','read',70,'mod_data',0),(278,'mod/feedback:addinstance','write',50,'mod_feedback',4),(279,'mod/feedback:view','read',70,'mod_feedback',0),(280,'mod/feedback:complete','write',70,'mod_feedback',16),(281,'mod/feedback:viewanalysepage','read',70,'mod_feedback',8),(282,'mod/feedback:deletesubmissions','write',70,'mod_feedback',0),(283,'mod/feedback:mapcourse','write',70,'mod_feedback',0),(284,'mod/feedback:edititems','write',70,'mod_feedback',20),(285,'mod/feedback:createprivatetemplate','write',70,'mod_feedback',16),(286,'mod/feedback:createpublictemplate','write',70,'mod_feedback',16),(287,'mod/feedback:deletetemplate','write',70,'mod_feedback',0),(288,'mod/feedback:viewreports','read',70,'mod_feedback',8),(289,'mod/feedback:receivemail','read',70,'mod_feedback',8),(290,'mod/folder:addinstance','write',50,'mod_folder',4),(291,'mod/folder:view','read',70,'mod_folder',0),(292,'mod/folder:managefiles','write',70,'mod_folder',16),(293,'mod/forum:addinstance','write',50,'mod_forum',4),(294,'mod/forum:viewdiscussion','read',70,'mod_forum',0),(295,'mod/forum:viewhiddentimedposts','read',70,'mod_forum',0),(296,'mod/forum:startdiscussion','write',70,'mod_forum',16),(297,'mod/forum:replypost','write',70,'mod_forum',16),(298,'mod/forum:addnews','write',70,'mod_forum',16),(299,'mod/forum:replynews','write',70,'mod_forum',16),(300,'mod/forum:viewrating','read',70,'mod_forum',0),(301,'mod/forum:viewanyrating','read',70,'mod_forum',8),(302,'mod/forum:viewallratings','read',70,'mod_forum',8),(303,'mod/forum:rate','write',70,'mod_forum',0),(304,'mod/forum:createattachment','write',70,'mod_forum',16),(305,'mod/forum:deleteownpost','read',70,'mod_forum',0),(306,'mod/forum:deleteanypost','read',70,'mod_forum',0),(307,'mod/forum:splitdiscussions','read',70,'mod_forum',0),(308,'mod/forum:movediscussions','read',70,'mod_forum',0),(309,'mod/forum:pindiscussions','write',70,'mod_forum',0),(310,'mod/forum:editanypost','write',70,'mod_forum',16),(311,'mod/forum:viewqandawithoutposting','read',70,'mod_forum',0),(312,'mod/forum:viewsubscribers','read',70,'mod_forum',0),(313,'mod/forum:managesubscriptions','read',70,'mod_forum',16),(314,'mod/forum:postwithoutthrottling','write',70,'mod_forum',16),(315,'mod/forum:exportdiscussion','read',70,'mod_forum',8),(316,'mod/forum:exportpost','read',70,'mod_forum',8),(317,'mod/forum:exportownpost','read',70,'mod_forum',8),(318,'mod/forum:addquestion','write',70,'mod_forum',16),(319,'mod/forum:allowforcesubscribe','read',70,'mod_forum',0),(320,'mod/forum:canposttomygroups','write',70,'mod_forum',0),(321,'mod/forum:canoverridediscussionlock','write',70,'mod_forum',0),(322,'mod/glossary:addinstance','write',50,'mod_glossary',4),(323,'mod/glossary:view','read',70,'mod_glossary',0),(324,'mod/glossary:write','write',70,'mod_glossary',16),(325,'mod/glossary:manageentries','write',70,'mod_glossary',16),(326,'mod/glossary:managecategories','write',70,'mod_glossary',16),(327,'mod/glossary:comment','write',70,'mod_glossary',16),(328,'mod/glossary:managecomments','write',70,'mod_glossary',16),(329,'mod/glossary:import','write',70,'mod_glossary',16),(330,'mod/glossary:export','read',70,'mod_glossary',0),(331,'mod/glossary:approve','write',70,'mod_glossary',16),(332,'mod/glossary:rate','write',70,'mod_glossary',0),(333,'mod/glossary:viewrating','read',70,'mod_glossary',0),(334,'mod/glossary:viewanyrating','read',70,'mod_glossary',8),(335,'mod/glossary:viewallratings','read',70,'mod_glossary',8),(336,'mod/glossary:exportentry','read',70,'mod_glossary',8),(337,'mod/glossary:exportownentry','read',70,'mod_glossary',0),(338,'mod/imscp:view','read',70,'mod_imscp',0),(339,'mod/imscp:addinstance','write',50,'mod_imscp',4),(340,'mod/label:addinstance','write',50,'mod_label',4),(341,'mod/label:view','read',70,'mod_label',0),(342,'mod/lesson:addinstance','write',50,'mod_lesson',4),(343,'mod/lesson:edit','write',70,'mod_lesson',4),(344,'mod/lesson:grade','write',70,'mod_lesson',20),(345,'mod/lesson:viewreports','read',70,'mod_lesson',8),(346,'mod/lesson:manage','write',70,'mod_lesson',0),(347,'mod/lesson:manageoverrides','write',70,'mod_lesson',0),(348,'mod/lesson:view','read',70,'mod_lesson',0),(349,'mod/lti:view','read',70,'mod_lti',0),(350,'mod/lti:addinstance','write',50,'mod_lti',4),(351,'mod/lti:manage','write',70,'mod_lti',8),(352,'mod/lti:admin','write',70,'mod_lti',8),(353,'mod/lti:addcoursetool','write',50,'mod_lti',0),(354,'mod/lti:requesttooladd','write',50,'mod_lti',0),(355,'mod/page:view','read',70,'mod_page',0),(356,'mod/page:addinstance','write',50,'mod_page',4),(357,'mod/quiz:view','read',70,'mod_quiz',0),(358,'mod/quiz:addinstance','write',50,'mod_quiz',4),(359,'mod/quiz:attempt','write',70,'mod_quiz',16),(360,'mod/quiz:reviewmyattempts','read',70,'mod_quiz',0),(361,'mod/quiz:manage','write',70,'mod_quiz',16),(362,'mod/quiz:manageoverrides','write',70,'mod_quiz',0),(363,'mod/quiz:preview','write',70,'mod_quiz',0),(364,'mod/quiz:grade','write',70,'mod_quiz',20),(365,'mod/quiz:regrade','write',70,'mod_quiz',16),(366,'mod/quiz:viewreports','read',70,'mod_quiz',8),(367,'mod/quiz:deleteattempts','write',70,'mod_quiz',32),(368,'mod/quiz:ignoretimelimits','read',70,'mod_quiz',0),(369,'mod/quiz:emailconfirmsubmission','read',70,'mod_quiz',0),(370,'mod/quiz:emailnotifysubmission','read',70,'mod_quiz',0),(371,'mod/quiz:emailwarnoverdue','read',70,'mod_quiz',0),(372,'mod/resource:view','read',70,'mod_resource',0),(373,'mod/resource:addinstance','write',50,'mod_resource',4),(374,'mod/scorm:addinstance','write',50,'mod_scorm',4),(375,'mod/scorm:viewreport','read',70,'mod_scorm',0),(376,'mod/scorm:skipview','read',70,'mod_scorm',0),(377,'mod/scorm:savetrack','write',70,'mod_scorm',0),(378,'mod/scorm:viewscores','read',70,'mod_scorm',0),(379,'mod/scorm:deleteresponses','write',70,'mod_scorm',0),(380,'mod/scorm:deleteownresponses','write',70,'mod_scorm',0),(381,'mod/survey:addinstance','write',50,'mod_survey',4),(382,'mod/survey:participate','read',70,'mod_survey',0),(383,'mod/survey:readresponses','read',70,'mod_survey',0),(384,'mod/survey:download','read',70,'mod_survey',0),(385,'mod/url:view','read',70,'mod_url',0),(386,'mod/url:addinstance','write',50,'mod_url',4),(387,'mod/wiki:addinstance','write',50,'mod_wiki',4),(388,'mod/wiki:viewpage','read',70,'mod_wiki',0),(389,'mod/wiki:editpage','write',70,'mod_wiki',16),(390,'mod/wiki:createpage','write',70,'mod_wiki',16),(391,'mod/wiki:viewcomment','read',70,'mod_wiki',0),(392,'mod/wiki:editcomment','write',70,'mod_wiki',16),(393,'mod/wiki:managecomment','write',70,'mod_wiki',0),(394,'mod/wiki:managefiles','write',70,'mod_wiki',0),(395,'mod/wiki:overridelock','write',70,'mod_wiki',0),(396,'mod/wiki:managewiki','write',70,'mod_wiki',0),(397,'mod/workshop:view','read',70,'mod_workshop',0),(398,'mod/workshop:addinstance','write',50,'mod_workshop',4),(399,'mod/workshop:switchphase','write',70,'mod_workshop',0),(400,'mod/workshop:editdimensions','write',70,'mod_workshop',4),(401,'mod/workshop:submit','write',70,'mod_workshop',0),(402,'mod/workshop:peerassess','write',70,'mod_workshop',0),(403,'mod/workshop:manageexamples','write',70,'mod_workshop',0),(404,'mod/workshop:allocate','write',70,'mod_workshop',0),(405,'mod/workshop:publishsubmissions','write',70,'mod_workshop',0),(406,'mod/workshop:viewauthornames','read',70,'mod_workshop',0),(407,'mod/workshop:viewreviewernames','read',70,'mod_workshop',0),(408,'mod/workshop:viewallsubmissions','read',70,'mod_workshop',0),(409,'mod/workshop:viewpublishedsubmissions','read',70,'mod_workshop',0),(410,'mod/workshop:viewauthorpublished','read',70,'mod_workshop',0),(411,'mod/workshop:viewallassessments','read',70,'mod_workshop',0),(412,'mod/workshop:overridegrades','write',70,'mod_workshop',0),(413,'mod/workshop:ignoredeadlines','write',70,'mod_workshop',0),(414,'mod/workshop:deletesubmissions','write',70,'mod_workshop',0),(415,'mod/workshop:exportsubmissions','read',70,'mod_workshop',0),(416,'auth/oauth2:managelinkedlogins','write',30,'auth_oauth2',0),(417,'enrol/category:synchronised','write',10,'enrol_category',0),(418,'enrol/category:config','write',50,'enrol_category',0),(419,'enrol/cohort:config','write',50,'enrol_cohort',0),(420,'enrol/cohort:unenrol','write',50,'enrol_cohort',0),(421,'enrol/database:unenrol','write',50,'enrol_database',0),(422,'enrol/database:config','write',50,'enrol_database',0),(423,'enrol/flatfile:manage','write',50,'enrol_flatfile',0),(424,'enrol/flatfile:unenrol','write',50,'enrol_flatfile',0),(425,'enrol/guest:config','write',50,'enrol_guest',0),(426,'enrol/imsenterprise:config','write',50,'enrol_imsenterprise',0),(427,'enrol/ldap:manage','write',50,'enrol_ldap',0),(428,'enrol/lti:config','write',50,'enrol_lti',0),(429,'enrol/lti:unenrol','write',50,'enrol_lti',0),(430,'enrol/manual:config','write',50,'enrol_manual',0),(431,'enrol/manual:enrol','write',50,'enrol_manual',0),(432,'enrol/manual:manage','write',50,'enrol_manual',0),(433,'enrol/manual:unenrol','write',50,'enrol_manual',0),(434,'enrol/manual:unenrolself','write',50,'enrol_manual',0),(435,'enrol/meta:config','write',50,'enrol_meta',0),(436,'enrol/meta:selectaslinked','read',50,'enrol_meta',0),(437,'enrol/meta:unenrol','write',50,'enrol_meta',0),(438,'enrol/mnet:config','write',50,'enrol_mnet',0),(439,'enrol/paypal:config','write',50,'enrol_paypal',0),(440,'enrol/paypal:manage','write',50,'enrol_paypal',0),(441,'enrol/paypal:unenrol','write',50,'enrol_paypal',0),(442,'enrol/paypal:unenrolself','write',50,'enrol_paypal',0),(443,'enrol/self:config','write',50,'enrol_self',0),(444,'enrol/self:manage','write',50,'enrol_self',0),(445,'enrol/self:holdkey','write',50,'enrol_self',0),(446,'enrol/self:unenrolself','write',50,'enrol_self',0),(447,'enrol/self:unenrol','write',50,'enrol_self',0),(448,'message/airnotifier:managedevice','write',10,'message_airnotifier',0),(449,'block/activity_modules:addinstance','write',80,'block_activity_modules',20),(450,'block/activity_results:addinstance','write',80,'block_activity_results',20),(451,'block/admin_bookmarks:myaddinstance','write',10,'block_admin_bookmarks',0),(452,'block/admin_bookmarks:addinstance','write',80,'block_admin_bookmarks',20),(453,'block/badges:addinstance','read',80,'block_badges',0),(454,'block/badges:myaddinstance','read',10,'block_badges',8),(455,'block/blog_menu:addinstance','write',80,'block_blog_menu',20),(456,'block/blog_recent:addinstance','write',80,'block_blog_recent',20),(457,'block/blog_tags:addinstance','write',80,'block_blog_tags',20),(458,'block/calendar_month:myaddinstance','write',10,'block_calendar_month',0),(459,'block/calendar_month:addinstance','write',80,'block_calendar_month',20),(460,'block/calendar_upcoming:myaddinstance','write',10,'block_calendar_upcoming',0),(461,'block/calendar_upcoming:addinstance','write',80,'block_calendar_upcoming',20),(462,'block/comments:myaddinstance','write',10,'block_comments',0),(463,'block/comments:addinstance','write',80,'block_comments',20),(464,'block/community:myaddinstance','write',10,'block_community',0),(465,'block/community:addinstance','write',80,'block_community',20),(466,'block/completionstatus:addinstance','write',80,'block_completionstatus',20),(467,'block/course_list:myaddinstance','write',10,'block_course_list',0),(468,'block/course_list:addinstance','write',80,'block_course_list',20),(469,'block/course_summary:addinstance','write',80,'block_course_summary',20),(470,'block/feedback:addinstance','write',80,'block_feedback',20),(471,'block/globalsearch:myaddinstance','write',10,'block_globalsearch',0),(472,'block/globalsearch:addinstance','write',80,'block_globalsearch',0),(473,'block/glossary_random:myaddinstance','write',10,'block_glossary_random',0),(474,'block/glossary_random:addinstance','write',80,'block_glossary_random',20),(475,'block/html:myaddinstance','write',10,'block_html',0),(476,'block/html:addinstance','write',80,'block_html',20),(477,'block/login:addinstance','write',80,'block_login',20),(478,'block/lp:addinstance','write',10,'block_lp',0),(479,'block/lp:myaddinstance','write',10,'block_lp',0),(480,'block/lp:view','read',10,'block_lp',0),(481,'block/mentees:myaddinstance','write',10,'block_mentees',0),(482,'block/mentees:addinstance','write',80,'block_mentees',20),(483,'block/mnet_hosts:myaddinstance','write',10,'block_mnet_hosts',0),(484,'block/mnet_hosts:addinstance','write',80,'block_mnet_hosts',20),(485,'block/myoverview:myaddinstance','write',10,'block_myoverview',0),(486,'block/myoverview:addinstance','write',80,'block_myoverview',20),(487,'block/myprofile:myaddinstance','write',10,'block_myprofile',0),(488,'block/myprofile:addinstance','write',80,'block_myprofile',20),(489,'block/navigation:myaddinstance','write',10,'block_navigation',0),(490,'block/navigation:addinstance','write',80,'block_navigation',20),(491,'block/news_items:myaddinstance','write',10,'block_news_items',0),(492,'block/news_items:addinstance','write',80,'block_news_items',20),(493,'block/online_users:myaddinstance','write',10,'block_online_users',0),(494,'block/online_users:addinstance','write',80,'block_online_users',20),(495,'block/online_users:viewlist','read',80,'block_online_users',0),(496,'block/participants:addinstance','write',80,'block_participants',20),(497,'block/private_files:myaddinstance','write',10,'block_private_files',0),(498,'block/private_files:addinstance','write',80,'block_private_files',20),(499,'block/quiz_results:addinstance','write',80,'block_quiz_results',20),(500,'block/recent_activity:addinstance','write',80,'block_recent_activity',20),(501,'block/recent_activity:viewaddupdatemodule','read',50,'block_recent_activity',0),(502,'block/recent_activity:viewdeletemodule','read',50,'block_recent_activity',0),(503,'block/rss_client:myaddinstance','write',10,'block_rss_client',0),(504,'block/rss_client:addinstance','write',80,'block_rss_client',20),(505,'block/rss_client:manageownfeeds','write',80,'block_rss_client',0),(506,'block/rss_client:manageanyfeeds','write',80,'block_rss_client',16),(507,'block/search_forums:addinstance','write',80,'block_search_forums',20),(508,'block/section_links:addinstance','write',80,'block_section_links',20),(509,'block/selfcompletion:addinstance','write',80,'block_selfcompletion',20),(510,'block/settings:myaddinstance','write',10,'block_settings',0),(511,'block/settings:addinstance','write',80,'block_settings',20),(512,'block/site_main_menu:addinstance','write',80,'block_site_main_menu',20),(513,'block/social_activities:addinstance','write',80,'block_social_activities',20),(514,'block/tag_flickr:addinstance','write',80,'block_tag_flickr',20),(515,'block/tag_youtube:addinstance','write',80,'block_tag_youtube',20),(516,'block/tags:myaddinstance','write',10,'block_tags',0),(517,'block/tags:addinstance','write',80,'block_tags',20),(518,'report/completion:view','read',50,'report_completion',8),(519,'report/courseoverview:view','read',10,'report_courseoverview',8),(520,'report/log:view','read',50,'report_log',8),(521,'report/log:viewtoday','read',50,'report_log',8),(522,'report/loglive:view','read',50,'report_loglive',8),(523,'report/outline:view','read',50,'report_outline',8),(524,'report/participation:view','read',50,'report_participation',8),(525,'report/performance:view','read',10,'report_performance',2),(526,'report/progress:view','read',50,'report_progress',8),(527,'report/questioninstances:view','read',10,'report_questioninstances',0),(528,'report/security:view','read',10,'report_security',2),(529,'report/stats:view','read',50,'report_stats',8),(530,'report/usersessions:manageownsessions','write',30,'report_usersessions',0),(531,'gradeexport/ods:view','read',50,'gradeexport_ods',8),(532,'gradeexport/ods:publish','read',50,'gradeexport_ods',8),(533,'gradeexport/txt:view','read',50,'gradeexport_txt',8),(534,'gradeexport/txt:publish','read',50,'gradeexport_txt',8),(535,'gradeexport/xls:view','read',50,'gradeexport_xls',8),(536,'gradeexport/xls:publish','read',50,'gradeexport_xls',8),(537,'gradeexport/xml:view','read',50,'gradeexport_xml',8),(538,'gradeexport/xml:publish','read',50,'gradeexport_xml',8),(539,'gradeimport/csv:view','write',50,'gradeimport_csv',0),(540,'gradeimport/direct:view','write',50,'gradeimport_direct',0),(541,'gradeimport/xml:view','write',50,'gradeimport_xml',0),(542,'gradeimport/xml:publish','write',50,'gradeimport_xml',0),(543,'gradereport/grader:view','read',50,'gradereport_grader',8),(544,'gradereport/history:view','read',50,'gradereport_history',8),(545,'gradereport/outcomes:view','read',50,'gradereport_outcomes',8),(546,'gradereport/overview:view','read',50,'gradereport_overview',8),(547,'gradereport/singleview:view','read',50,'gradereport_singleview',8),(548,'gradereport/user:view','read',50,'gradereport_user',8),(549,'webservice/rest:use','read',50,'webservice_rest',0),(550,'webservice/soap:use','read',50,'webservice_soap',0),(551,'webservice/xmlrpc:use','read',50,'webservice_xmlrpc',0),(552,'repository/areafiles:view','read',70,'repository_areafiles',0),(553,'repository/boxnet:view','read',70,'repository_boxnet',0),(554,'repository/coursefiles:view','read',70,'repository_coursefiles',0),(555,'repository/dropbox:view','read',70,'repository_dropbox',0),(556,'repository/equella:view','read',70,'repository_equella',0),(557,'repository/filesystem:view','read',70,'repository_filesystem',0),(558,'repository/flickr:view','read',70,'repository_flickr',0),(559,'repository/flickr_public:view','read',70,'repository_flickr_public',0),(560,'repository/googledocs:view','read',70,'repository_googledocs',0),(561,'repository/local:view','read',70,'repository_local',0),(562,'repository/merlot:view','read',70,'repository_merlot',0),(563,'repository/onedrive:view','read',70,'repository_onedrive',0),(564,'repository/picasa:view','read',70,'repository_picasa',0),(565,'repository/recent:view','read',70,'repository_recent',0),(566,'repository/s3:view','read',70,'repository_s3',0),(567,'repository/skydrive:view','read',70,'repository_skydrive',0),(568,'repository/upload:view','read',70,'repository_upload',0),(569,'repository/url:view','read',70,'repository_url',0),(570,'repository/user:view','read',70,'repository_user',0),(571,'repository/webdav:view','read',70,'repository_webdav',0),(572,'repository/wikimedia:view','read',70,'repository_wikimedia',0),(573,'repository/youtube:view','read',70,'repository_youtube',0),(574,'tool/customlang:view','read',10,'tool_customlang',2),(575,'tool/customlang:edit','write',10,'tool_customlang',6),(576,'tool/dataprivacy:managedatarequests','write',10,'tool_dataprivacy',60),(577,'tool/dataprivacy:managedataregistry','write',10,'tool_dataprivacy',60),(578,'tool/dataprivacy:makedatarequestsforchildren','write',30,'tool_dataprivacy',24),(579,'tool/dataprivacy:downloadownrequest','read',30,'tool_dataprivacy',0),(580,'tool/dataprivacy:downloadallrequests','read',30,'tool_dataprivacy',8),(581,'tool/lpmigrate:frameworksmigrate','write',10,'tool_lpmigrate',0),(582,'tool/monitor:subscribe','read',50,'tool_monitor',8),(583,'tool/monitor:managerules','write',50,'tool_monitor',4),(584,'tool/monitor:managetool','write',10,'tool_monitor',4),(585,'tool/policy:accept','write',10,'tool_policy',0),(586,'tool/policy:acceptbehalf','write',30,'tool_policy',8),(587,'tool/policy:managedocs','write',10,'tool_policy',0),(588,'tool/policy:viewacceptances','read',10,'tool_policy',0),(589,'tool/recyclebin:deleteitems','write',50,'tool_recyclebin',32),(590,'tool/recyclebin:restoreitems','write',50,'tool_recyclebin',0),(591,'tool/recyclebin:viewitems','read',50,'tool_recyclebin',0),(592,'tool/uploaduser:uploaduserpictures','write',10,'tool_uploaduser',16),(593,'tool/usertours:managetours','write',10,'tool_usertours',4),(594,'booktool/exportimscp:export','read',70,'booktool_exportimscp',0),(595,'booktool/importhtml:import','write',70,'booktool_importhtml',4),(596,'booktool/print:print','read',70,'booktool_print',0),(597,'quiz/grading:viewstudentnames','read',70,'quiz_grading',0),(598,'quiz/grading:viewidnumber','read',70,'quiz_grading',0),(599,'quiz/statistics:view','read',70,'quiz_statistics',0),(600,'mod/vpl:view','read',70,'mod_vpl',0),(601,'mod/vpl:submit','write',70,'mod_vpl',0),(602,'mod/vpl:grade','write',70,'mod_vpl',8),(603,'mod/vpl:similarity','read',70,'mod_vpl',8),(604,'mod/vpl:addinstance','write',70,'mod_vpl',20),(605,'mod/vpl:manage','write',70,'mod_vpl',28),(606,'mod/vpl:setjails','write',70,'mod_vpl',8);
/*!40000 ALTER TABLE `mdl_capabilities` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:23