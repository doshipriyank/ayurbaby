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
-- Dumping data for table `ayurbaby_compound`
--

LOCK TABLES `ayurbaby_compound` WRITE;
/*!40000 ALTER TABLE `ayurbaby_compound` DISABLE KEYS */;
INSERT INTO `ayurbaby_compound` VALUES (1,'zinc','2014-07-02 23:32:21'),(2,'fats','2014-07-02 23:32:21'),(3,'carbohydrates','2014-07-02 23:32:21'),(4,'proteins','2014-07-02 23:32:21'),(5,'vitamin c','2014-07-02 23:32:21'),(6,'vitamin d','2014-07-02 23:32:21'),(7,'vitamin b6','2014-07-02 23:32:21'),(8,'managnese','2014-07-02 23:32:21'),(9,'iron','2014-07-02 23:32:21'),(10,'magnesium','2014-07-02 23:32:21'),(11,'folic acid','2014-07-02 23:32:21'),(12,'calcium','2014-07-02 23:32:21');
/*!40000 ALTER TABLE `ayurbaby_compound` ENABLE KEYS */;
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
