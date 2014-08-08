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
-- Dumping data for table `ayurbaby_nutritionalfood`
--

LOCK TABLES `ayurbaby_nutritionalfood` WRITE;
/*!40000 ALTER TABLE `ayurbaby_nutritionalfood` DISABLE KEYS */;
INSERT INTO `ayurbaby_nutritionalfood` VALUES (1,'Milk with Honey','Pomogrante(IMP), Sweet Lime, Oranges, Grapes','','','No alopathic medicine is advisale till 4 months','','2014-07-23 17:24:51'),(2,'Dudhi Kheer','Amla and lime water 3-4 times with salt and lil pepper','','Folic Acid','No alopathic medicine is advisale till 4 months','Brain development Cell Division','2014-07-23 17:24:51'),(3,'Milk with cow ghee','','','','No alopathic medicine is advisale till 4 months','Heart Development, Intestine and waist','2014-07-23 17:24:51'),(4,'Almonds','','3-4 soaked Almonds','','','For Strong heart','2014-07-23 17:24:51'),(5,'Almonds Atho','','take 150 gramn mamro almonds. Make powder of it. Add powdered sugar,ghee and lil elachi powder.Mix it well and make small balls of it and consume one everyday in morning with milk.','Magensium','','','2014-07-23 17:24:51'),(6,'Amla 1 or 2','','','Calcium','','','2014-07-23 17:24:51'),(7,'Grapes aur kishmis 4 or 5','','','Iron','','','2014-07-23 17:24:51'),(8,'Lentils','','','Protein','','','2014-07-23 17:24:51'),(9,'Makhan and Sugar','','Mix makhanand sugar and have it or apply makhan on roti','','','','2014-07-23 17:24:51'),(10,'Chwanprash','','1 spoon in morn  with hot milk','Calcium','','bones spinal cord','2014-07-23 17:24:51'),(11,'Palak,tomato,beet,gajar soup','','','Iron','','','2014-07-23 17:24:51'),(12,'Dates','','1-2 soaked','Folic acid','','','2014-07-23 17:24:51'),(13,'ANJEER','','2','Protein','','','2014-07-23 17:24:51'),(14,'Milk with Poha','','','High calcium and iron','','','2014-07-23 17:24:51'),(15,'moong pani','','boil moong crush it . Vaghar ghee and jeera powder and  add dhana jeera in good quantity salt to taste','high protein and good digestion. Dhanajeera is calcium rich,','','','2014-07-23 17:24:51'),(16,'paneer','','','protein','','','2014-07-23 17:24:51'),(17,'Use more ghee','','add extra on rotu,paratha,khicin','','','bones','2014-07-23 17:24:51'),(18,'moong pani','','','','','nails','2014-07-23 17:24:51'),(19,'sprouts','','','','','hair','2014-07-23 17:24:51'),(20,'mong dal','','','','','brain','2014-07-23 17:24:51'),(21,'roasted chana','','','protein','','skin colour','2014-07-23 17:24:51'),(22,'paneer','','','protien','','','2014-07-23 17:24:51'),(23,'milk with 2-3 strands of kesar can give fair colour to baby','','','','','','2014-07-23 17:24:51'),(24,'low fat kheer wuth ghee sugar','','','','','','2014-07-23 17:24:51'),(25,'atho jeera','','grind jeera mix sugar and ghee, take 1 spoon daily','iron','no sour food coz swelling','appetizer, reduces acidity, good vision for baby','2014-07-23 17:24:51'),(26,'Methi ladu','','75 to 100 gm methi atta+sugar +suth+gnathola+alonds consumed once','iron','less salt','','2014-07-23 17:24:51'),(27,'akrot','','1 Daily','','','digestion','2014-07-23 17:24:51'),(28,'ganthola milk','','roast ghanto in ghe and add sugar and milk','','','controls blood pressure','2014-07-23 17:24:51');
/*!40000 ALTER TABLE `ayurbaby_nutritionalfood` ENABLE KEYS */;
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
