-- MySQL dump 10.13  Distrib 5.6.17, for osx10.7 (i386)
--
-- Host: localhost    Database: babycare
-- ------------------------------------------------------
-- Server version	5.6.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ayurbaby_ayurved`
--

DROP TABLE IF EXISTS `ayurbaby_ayurved`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_ayurved` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ayurvedic_med` varchar(64) NOT NULL DEFAULT '',
  `prepmethod` varchar(512) NOT NULL DEFAULT '',
  `nutritional_value` varchar(512) NOT NULL DEFAULT '',
  `foetus_dev` varchar(512) NOT NULL DEFAULT '',
  `last_edit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_compound`
--

DROP TABLE IF EXISTS `ayurbaby_compound`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_compound` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `organic_compound` varchar(64) NOT NULL DEFAULT '',
  `last_edit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_funfacts`
--

DROP TABLE IF EXISTS `ayurbaby_funfacts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_funfacts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `compound_id` int(11) NOT NULL,
  `question` varchar(512) NOT NULL DEFAULT '',
  `answer` text NOT NULL,
  `last_edit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `compound_id` (`compound_id`),
  CONSTRAINT `ayurbaby_funfacts_ibfk_1` FOREIGN KEY (`compound_id`) REFERENCES `ayurbaby_compound` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_nutritionalfood`
--

DROP TABLE IF EXISTS `ayurbaby_nutritionalfood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_nutritionalfood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food` varchar(512) NOT NULL DEFAULT '',
  `fruits` varchar(512) NOT NULL DEFAULT '',
  `prepmethod` varchar(512) NOT NULL DEFAULT '',
  `nutritional_value` varchar(512) NOT NULL DEFAULT '',
  `warnings` varchar(512) NOT NULL DEFAULT '',
  `foetus_dev` varchar(512) NOT NULL DEFAULT '',
  `last_edit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_stage_ayurved`
--

DROP TABLE IF EXISTS `ayurbaby_stage_ayurved`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_stage_ayurved` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stage_id` int(11) NOT NULL,
  `ayurved_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `stage_id` (`stage_id`),
  KEY `ayurved_id` (`ayurved_id`),
  CONSTRAINT `ayurbaby_stage_ayurved_ibfk_1` FOREIGN KEY (`stage_id`) REFERENCES `ayurbaby_stages` (`id`),
  CONSTRAINT `ayurbaby_stage_ayurved_ibfk_2` FOREIGN KEY (`ayurved_id`) REFERENCES `ayurbaby_ayurved` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_stage_nutritionalfood`
--

DROP TABLE IF EXISTS `ayurbaby_stage_nutritionalfood`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_stage_nutritionalfood` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stage_id` int(11) NOT NULL,
  `nutritionalfood_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `stage_id` (`stage_id`),
  KEY `nutritionalfood_id` (`nutritionalfood_id`),
  CONSTRAINT `ayurbaby_stage_nutritionalfood_ibfk_1` FOREIGN KEY (`stage_id`) REFERENCES `ayurbaby_stages` (`id`),
  CONSTRAINT `ayurbaby_stage_nutritionalfood_ibfk_2` FOREIGN KEY (`nutritionalfood_id`) REFERENCES `ayurbaby_nutritionalfood` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_stages`
--

DROP TABLE IF EXISTS `ayurbaby_stages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_stages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `month` varchar(10) NOT NULL,
  `week` varchar(5) NOT NULL DEFAULT '',
  `last_edit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ayurbaby_stages_month_idx` (`month`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `ayurbaby_users`
--

DROP TABLE IF EXISTS `ayurbaby_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ayurbaby_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(64) NOT NULL DEFAULT '',
  `pword` varchar(80) NOT NULL DEFAULT '',
  `fullname` varchar(64) NOT NULL DEFAULT '',
  `address` varchar(256) NOT NULL DEFAULT '',
  `phone` varchar(64) NOT NULL DEFAULT '',
  `stage_id` int(11) DEFAULT NULL,
  `last_edit` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ayurbaby_users_username_idx` (`username`),
  KEY `stage_id` (`stage_id`),
  CONSTRAINT `ayurbaby_users_ibfk_1` FOREIGN KEY (`stage_id`) REFERENCES `ayurbaby_stages` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-08-07 18:12:41
