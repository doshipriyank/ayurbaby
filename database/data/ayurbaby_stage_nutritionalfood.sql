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
-- Dumping data for table `ayurbaby_stage_nutritionalfood`
--

LOCK TABLES `ayurbaby_stage_nutritionalfood` WRITE;
/*!40000 ALTER TABLE `ayurbaby_stage_nutritionalfood` DISABLE KEYS */;
INSERT INTO `ayurbaby_stage_nutritionalfood` VALUES (1,1,1),(2,2,1),(3,3,1),(4,1,2),(5,2,2),(6,3,2),(7,1,3),(8,2,3),(9,3,3),(10,1,4),(11,2,4),(12,3,4),(13,1,5),(14,2,5),(15,3,5),(16,4,6),(17,4,7),(18,4,8),(19,4,9),(20,4,10),(21,4,11),(22,5,12),(23,5,13),(24,5,14),(25,5,15),(26,5,16),(27,5,17),(28,5,18),(29,5,19),(30,6,20),(31,6,21),(32,6,22),(33,6,23),(34,6,24),(35,6,25),(36,7,26),(37,8,27),(38,8,28);
/*!40000 ALTER TABLE `ayurbaby_stage_nutritionalfood` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-08-07 18:05:29
