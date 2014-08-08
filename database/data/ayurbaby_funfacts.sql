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
-- Dumping data for table `ayurbaby_funfacts`
--

LOCK TABLES `ayurbaby_funfacts` WRITE;
/*!40000 ALTER TABLE `ayurbaby_funfacts` DISABLE KEYS */;
INSERT INTO `ayurbaby_funfacts` VALUES (1,11,'Which foods are a good source of Folic Acid?','Vitamin supplements that contain folic acid may be prescribed by a medical practitioner if a pregnancy is diagnosed.  Certain fortified breakfast cereals, breads, rice & pasta also have high levels of this substance.  Having said that, there are plenty of good sources of folates in a healthy balanced diet.  The following list shows some foods that are naturally rich in folic acid, with the better sources being from vegetables or pulses.Vegetables: Globe artichoke, asparagus, broccoli, brussel-sprouts, endives, okra, parsnips, peas, spinach, Spring onions, leeks, Avocado, fresh parsley, cress, chicory leaves.Pulses, cereals & nuts: Beans, chickpeas, black-eyed peas, red kidney beans, lentils, peanuts, soya flour, hazelnuts, corn flakes, wheat germ, yeast, yeast extract.Animal products: Crab meat, cooked liver, fois gras, beef, pork, chicken, egg yolks.Folic Acid is required by the body for the correct replication of DNA and the production and maintenance of new cells.  It is for this reason that it is important for a pregnant woman to consume sufficient quantities of folic acid both before and during a pregnancy (especially the early stages).  The growing foetus requires this substance, provided by the mother, to assist healthy cell replication.  Folic acid is also required for the production of red blood cells (thus preventing anaemia) as well as assisting in the rapid growth of the placenta.Fruits and juice: Grapefruit, Orange.','2014-07-02 23:20:15'),(2,12,'What is the role of calcium?','It is required for the formation of a baby\'s bones and teeth.  Vitamin D is used to absorb the calcium into the body, therefore this is required in conjunction with the calcium. A secondary yet essential role of calcium is to assist in the production of fluids within the lymphatic system.','2014-07-02 23:20:15'),(3,12,'What are the recommended daily intake levels?','In most countries, the RDA is between 0.8 and 1.3 grams per day.  During a pregnancy, this should rise to about 1.5 grams per day.  Doctor\'s advice should be sought before taking any nutritional supplements.','2014-07-02 23:20:15'),(4,12,'Which foods are a good source of calcium?','Calcium is found in dairy products primarily and some mineral water, however alternative sources are available for those with an intolerance to lactose or allergies to dairy products.Fruits and juice: Fortified orange juice.Vegetables: Broccoli, kale (seaweed), dandelion greens, okra, cabbage.Pulses, cereals & nuts: Almonds, beans, soya milk, sesame.Animal products: Milk, cheese, yoghurt.','2014-07-02 23:20:15'),(5,10,'What is the role of magnesium?','Magnesium is required for cell multiplication in a growing foetus and is an essential element of life chemistry in keeping a balanced neuromuscular system.','2014-07-02 23:20:15'),(6,10,'What are the recommended daily intake levels?','In general, the RDA is between 200 and 300 mg per day.  During a pregnancy, this should rise to about 50%.  Doctor\'s advice should be sought before taking any nutritional supplements.  An upper limit, depending on weight and height, is often quoted to avoid diarrhoea.','2014-07-02 23:20:15'),(7,10,'Which foods are a good source of magnesium?','Fruits and juice: Bananas.Vegetables: Chocolate, cocoa powder.Pulses, cereals & nuts: Breakfast cereals, rice (complete), flour (whole wheat), wheat germ, almonds, walnuts, hazelnuts, spinach & other green vegetables, peanut butter, brazil nuts, sesame seeds, table salt, pistachios.Animal products: Milk.','2014-07-02 23:20:15'),(8,9,'What is the role of manganese?','Manganese is used by the body to promote enzyme function in a multitude of ways.  During a pregnancy, manganese is also important for the development of the hearing system.','2014-07-02 23:20:15'),(9,9,'What are the recommended daily intake levels?','The RDA for manganese is not normally quoted, however between 2.5mg and 5mg is considered safe and adequate.','2014-07-02 23:20:15'),(10,1,'What is the role of zinc?','Zinc is another trace element that is essential for the growth and development of human life and has an active role in body functions from the brain to the pancreas. During a pregnancy, zinc is also used to assist the foetus to develop the brain and also to be an aid to the mother in the 1st and  2nd stages of labour (dilation and pushing).  Studies have shown that a deficiency of zinc during pregnancy can be an attributing factor of membrane ruptures during the birth process.','2014-07-02 23:20:15'),(11,1,'What are the recommended daily intake levels?','The RDA for zinc is around 10mg per day, with an increase of 50% during pregnancy.  Ingestion of excessively high levels of zinc can be toxic.','2014-07-02 23:20:15'),(12,7,'What is the role of Vitamin B6?','This vitamin aides in metabolising normal foodstuffs (protein, fat, carbohydrate) as well as being essential for the immune system and brain functioning.  During a pregnancy, vitamin B6 is also required to develop the brain and nervous system within the fetus.','2014-07-02 23:20:15'),(13,7,'What are the recommended daily intake levels?','The RDA for Vitamin B6 is generally between 1.5mg and 1.9mg.  During pregnancy, this rises to about 2mg per day.','2014-07-02 23:20:15'),(14,6,'What is the role of Vitamin D?','Vitamin D has a fundamental role in the absorption of calcium into the body, therefore it is required for the formation of bones and teeth in the baby.','2014-07-02 23:20:15'),(15,6,'What are the recommended daily intake levels?','The RDA for Vitamin D is generally between 200-300 IU (International Units).  During pregnancy, this rises to about 400 IU per day.  Vitamin D is produced within the body when the skin is exposed to sunlight.','2014-07-02 23:20:15'),(16,5,'What is the role of Vitamin C?','Vitamin C serves to fight tiredness and infections.  It is also used by the body in the process of absorbing iron.','2014-07-02 23:20:15'),(17,5,'What are the recommended daily intake levels?','The RDA for Vitamin C is generally around 80mg per day.  Upper limit is 1 gram.','2014-07-02 23:20:15'),(18,4,'What is the role of protein?','Proteins are required to construct and renew body tissue cells.  They are made up of 20 different essential amino acids.','2014-07-02 23:20:15'),(19,4,'What are the recommended daily intake levels?','During a pregnancy, about 80 grams of protein from various sources is often recommended.  About 10 grams are used during the whole 1st trimester, then 10g per week during the second and 10g per day during the third.','2014-07-02 23:20:15'),(20,3,'What is the role of carbohydrates?','Carbohydrates are basically sugars.  These provide fuel for the body to burn up.  They also play a role in other bodily functions such as blood clotting, cell communication, development and the immune system.','2014-07-02 23:20:15'),(21,3,'What are the recommended daily intake levels?','There is no standard, however it is often recommended that about 55% of energy requirements are provided by carbohydrates (as opposed to allowing the body to convert fats or proteins).','2014-07-02 23:20:15'),(22,2,'What is the role of fat?','Fat is another source of energy to the body and is required for the structure and functioning of living cells, as well as being required for the transport of vitamins A, D, E & K.  During pregnancy, they are also essential to the baby\'s nervous system development.','2014-07-02 23:20:15'),(23,2,'What are the recommended daily intake levels?','Fat consumption should not exceed 30% of daily food consumption.  Essential fatty acids fro oils or fish are preferred to animal sourced saturated fats.','2014-07-02 23:20:15');
/*!40000 ALTER TABLE `ayurbaby_funfacts` ENABLE KEYS */;
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
