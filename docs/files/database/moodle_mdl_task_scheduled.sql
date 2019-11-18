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
-- Table structure for table `mdl_task_scheduled`
--

DROP TABLE IF EXISTS `mdl_task_scheduled`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mdl_task_scheduled` (
  `id` bigint(10) NOT NULL AUTO_INCREMENT,
  `component` varchar(255) NOT NULL DEFAULT '',
  `classname` varchar(255) NOT NULL DEFAULT '',
  `lastruntime` bigint(10) DEFAULT NULL,
  `nextruntime` bigint(10) DEFAULT NULL,
  `blocking` tinyint(2) NOT NULL DEFAULT '0',
  `minute` varchar(25) NOT NULL DEFAULT '',
  `hour` varchar(25) NOT NULL DEFAULT '',
  `day` varchar(25) NOT NULL DEFAULT '',
  `month` varchar(25) NOT NULL DEFAULT '',
  `dayofweek` varchar(25) NOT NULL DEFAULT '',
  `faildelay` bigint(10) DEFAULT NULL,
  `customised` tinyint(2) NOT NULL DEFAULT '0',
  `disabled` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `mdl_tasksche_cla_uix` (`classname`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPRESSED COMMENT='List of scheduled tasks to be run by cron.';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mdl_task_scheduled`
--

LOCK TABLES `mdl_task_scheduled` WRITE;
/*!40000 ALTER TABLE `mdl_task_scheduled` DISABLE KEYS */;
INSERT INTO `mdl_task_scheduled` VALUES (1,'moodle','\\core\\task\\session_cleanup_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(2,'moodle','\\core\\task\\delete_unconfirmed_users_task',0,1562896800,0,'0','*','*','*','*',0,0,0),(3,'moodle','\\core\\task\\delete_incomplete_users_task',0,1562897100,0,'5','*','*','*','*',0,0,0),(4,'moodle','\\core\\task\\backup_cleanup_task',0,1562897400,0,'10','*','*','*','*',0,0,0),(5,'moodle','\\core\\task\\tag_cron_task',0,1562900880,0,'8','3','*','*','*',0,0,0),(6,'moodle','\\core\\task\\context_cleanup_task',0,1562898300,0,'25','*','*','*','*',0,0,0),(7,'moodle','\\core\\task\\cache_cleanup_task',0,1562898600,0,'30','*','*','*','*',0,0,0),(8,'moodle','\\core\\task\\messaging_cleanup_task',0,1562898900,0,'35','*','*','*','*',0,0,0),(9,'moodle','\\core\\task\\send_new_user_passwords_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(10,'moodle','\\core\\task\\send_failed_login_notifications_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(11,'moodle','\\core\\task\\create_contexts_task',0,1562976000,1,'0','0','*','*','*',0,0,0),(12,'moodle','\\core\\task\\legacy_plugin_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(13,'moodle','\\core\\task\\grade_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(14,'moodle','\\core\\task\\events_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(15,'moodle','\\core\\task\\completion_regular_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(16,'moodle','\\core\\task\\completion_daily_task',0,1562922420,0,'7','9','*','*','*',0,0,0),(17,'moodle','\\core\\task\\portfolio_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(18,'moodle','\\core\\task\\plagiarism_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(19,'moodle','\\core\\task\\calendar_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(20,'moodle','\\core\\task\\blog_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(21,'moodle','\\core\\task\\question_cron_task',0,1562895720,0,'*','*','*','*','*',0,0,0),(22,'moodle','\\core\\task\\registration_cron_task',0,1563224820,0,'7','21','*','*','1',0,0,0),(23,'moodle','\\core\\task\\check_for_updates_task',0,1562896800,0,'0','*/2','*','*','*',0,0,0),(24,'moodle','\\core\\task\\cache_cron_task',0,1562896200,0,'50','*','*','*','*',0,0,0),(25,'moodle','\\core\\task\\automated_backup_task',0,1562896200,0,'50','*','*','*','*',0,0,0),(26,'moodle','\\core\\task\\badges_cron_task',0,1562895900,0,'*/5','*','*','*','*',0,0,0),(27,'moodle','\\core\\task\\file_temp_cleanup_task',0,1562914500,0,'55','*/6','*','*','*',0,0,0),(28,'moodle','\\core\\task\\file_trash_cleanup_task',0,1562914500,0,'55','*/6','*','*','*',0,0,0),(29,'moodle','\\core\\task\\search_index_task',0,1562896800,0,'*/30','*','*','*','*',0,0,0),(30,'moodle','\\core\\task\\search_optimize_task',0,1562933700,0,'15','*/12','*','*','*',0,0,0),(31,'moodle','\\core\\task\\stats_cron_task',0,1562976000,0,'0','0','*','*','*',0,0,0),(32,'moodle','\\core\\task\\password_reset_cleanup_task',0,1562911200,0,'0','*/6','*','*','*',0,0,0),(33,'moodle','\\core\\task\\complete_plans_task',0,1562898060,0,'21','*','*','*','*',0,0,0),(34,'moodle','\\core\\task\\sync_plans_from_template_cohorts_task',0,1562897220,0,'7','*','*','*','*',0,0,0),(35,'moodle','\\core_files\\task\\conversion_cleanup_task',0,1562897820,0,'17','2','*','*','*',0,0,0),(36,'moodle','\\core\\oauth2\\refresh_system_tokens_task',0,1562898600,0,'30','*','*','*','*',0,0,0),(37,'moodle','\\core\\task\\analytics_cleanup_task',0,1562895720,0,'42','*','*','*','*',0,0,0),(38,'qtype_random','\\qtype_random\\task\\remove_unused_questions',0,1562896980,0,'3','*','*','*','*',0,0,0),(39,'mod_forum','\\mod_forum\\task\\cron_task',0,1562895780,0,'*','*','*','*','*',0,0,0),(40,'mod_scorm','\\mod_scorm\\task\\cron_task',0,1562895900,0,'*/5','*','*','*','*',0,0,0),(41,'auth_cas','\\auth_cas\\task\\sync_task',0,1562972400,0,'0','0','*','*','*',0,0,1),(42,'auth_db','\\auth_db\\task\\sync_users',0,1562915100,0,'5','8','*','*','*',0,0,1),(43,'auth_ldap','\\auth_ldap\\task\\sync_roles',0,1562972400,0,'0','0','*','*','*',0,0,1),(44,'auth_ldap','\\auth_ldap\\task\\sync_task',0,1562972400,0,'0','0','*','*','*',0,0,1),(45,'enrol_flatfile','\\enrol_flatfile\\task\\flatfile_sync_task',0,1562897700,0,'15','*','*','*','*',0,0,0),(46,'enrol_imsenterprise','\\enrol_imsenterprise\\task\\cron_task',0,1562897400,0,'10','*','*','*','*',0,0,0),(47,'enrol_ldap','\\enrol_ldap\\task\\sync_enrolments',0,1562954580,0,'3','19','*','*','*',0,0,1),(48,'enrol_lti','\\enrol_lti\\task\\sync_grades',0,1562896800,0,'*/30','*','*','*','*',0,0,0),(49,'enrol_lti','\\enrol_lti\\task\\sync_members',0,1562896800,0,'*/30','*','*','*','*',0,0,0),(50,'editor_atto','\\editor_atto\\task\\autosave_cleanup_task',0,1563275640,0,'14','12','*','*','2',0,0,0),(51,'repository_onedrive','\\repository_onedrive\\remove_temp_access_task',0,1563171660,0,'21','7','*','*','1',0,0,0),(52,'tool_analytics','\\tool_analytics\\task\\train_models',0,1562925600,0,'0','11','*','*','*',0,0,0),(53,'tool_analytics','\\tool_analytics\\task\\predict_models',0,1562918400,0,'0','9','*','*','*',0,0,0),(54,'tool_cohortroles','\\tool_cohortroles\\task\\cohort_role_sync',0,1562896980,0,'3','*','*','*','*',0,0,0),(55,'tool_dataprivacy','\\tool_dataprivacy\\task\\expired_retention_period',0,1562918400,0,'0','9','*','*','*',0,0,0),(56,'tool_dataprivacy','\\tool_dataprivacy\\task\\delete_expired_contexts',0,1562979600,0,'0','2','*','*','*',0,0,0),(57,'tool_dataprivacy','\\tool_dataprivacy\\task\\delete_expired_requests',0,1562940360,0,'6','15','*','*','*',0,0,0),(58,'tool_dataprivacy','\\tool_dataprivacy\\task\\delete_existing_deleted_users',0,1562908980,0,'23','6','*','*','*',0,0,1),(59,'tool_langimport','\\tool_langimport\\task\\update_langpacks_task',0,1562900580,0,'3','4','*','*','*',0,0,0),(60,'tool_messageinbound','\\tool_messageinbound\\task\\pickup_task',0,1562895840,0,'*','*','*','*','*',0,0,0),(61,'tool_messageinbound','\\tool_messageinbound\\task\\cleanup_task',0,1562979300,0,'55','1','*','*','*',0,0,0),(62,'tool_monitor','\\tool_monitor\\task\\clean_events',0,1562895840,0,'*','*','*','*','*',0,0,0),(63,'tool_monitor','\\tool_monitor\\task\\check_subscriptions',0,1562925960,0,'6','11','*','*','*',0,0,0),(64,'tool_recyclebin','\\tool_recyclebin\\task\\cleanup_course_bin',0,1562896800,0,'*/30','*','*','*','*',0,0,0),(65,'tool_recyclebin','\\tool_recyclebin\\task\\cleanup_category_bin',0,1562896800,0,'*/30','*','*','*','*',0,0,0),(66,'assignfeedback_editpdf','\\assignfeedback_editpdf\\task\\convert_submissions',0,1562895900,0,'*/15','*','*','*','*',0,0,0),(67,'logstore_legacy','\\logstore_legacy\\task\\cleanup_task',0,1562904660,0,'11','5','*','*','*',0,0,0),(68,'logstore_standard','\\logstore_standard\\task\\cleanup_task',0,1562900520,0,'2','4','*','*','*',0,0,0);
/*!40000 ALTER TABLE `mdl_task_scheduled` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-17 20:32:42
