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
-- Dumping data for table `ayurbaby_stages`
--

LOCK TABLES `ayurbaby_stages` WRITE;
/*!40000 ALTER TABLE `ayurbaby_stages` DISABLE KEYS */;
INSERT INTO `ayurbaby_stages` VALUES (1,'one','1-4','2014-06-16 22:57:12'),(2,'two','5-8','2014-06-16 22:58:10'),(3,'three','9-13','2014-06-16 22:58:23'),(4,'four','14-17','2014-06-16 22:58:40'),(5,'five','18-21','2014-06-16 22:58:54'),(6,'six','22-26','2014-06-16 22:59:11'),(7,'seven','27-30','2014-06-16 22:59:28'),(8,'eight','31-35','2014-06-16 22:59:50'),(9,'nine','36-40','2014-06-16 23:00:03');
/*!40000 ALTER TABLE `ayurbaby_stages` ENABLE KEYS */;
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
