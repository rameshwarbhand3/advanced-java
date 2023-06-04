
drop database if exists durgadb;

create database durgadb;

use  durgadb;


--
-- Table structure for table `durgadb`
--

DROP TABLE IF EXISTS `durgadb`;

CREATE TABLE `student` (
  `Sid` varchar PRIMARY KEY,
  `Sname` varchar(100) DEFAULT NULL,
  `Addr` varchar(50) DEFAULT NULL,
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Dumping data for table `durgadb`
--


--INSERT INTO `durgadb` VALUES()
