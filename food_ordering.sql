-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Aug 01, 2022 at 04:55 PM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `food_ordering`
--

-- --------------------------------------------------------

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
CREATE TABLE IF NOT EXISTS `bill` (
  `ID` int(200) NOT NULL,
  `name` varchar(100) NOT NULL,
  `mobile_no` varchar(11) NOT NULL,
  `email` varchar(100) NOT NULL,
  `date` varchar(20) NOT NULL,
  `total` int(200) NOT NULL,
  `created_by` varchar(200) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bill`
--

INSERT INTO `bill` (`ID`, `name`, `mobile_no`, `email`, `date`, `total`, `created_by`) VALUES
(1, 'gagan', '1231231233', 'gagan@gmail.com', '26-01-2022', 25, 'gagan@gmail.com'),
(2, 'tanmai', '1231231232', 'tanmai', '26-01-2022', 25, 'tanmai@gmail.com'),
(3, 'tanmai', '9972345623', 'tanmai@gmail.com', '01-08-2022', 10, 'admin@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Drinks'),
(2, 'Snacks'),
(3, 'Breakfast'),
(4, 'Lunch'),
(5, 'Dinner'),
(6, 'Sweets'),
(7, 'Beverage');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) NOT NULL,
  `category` varchar(200) NOT NULL,
  `price` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `category`, `price`) VALUES
(6, 'pepsi', 'Drinks', '25'),
(4, 'beer', 'Drinks', '1000'),
(5, 'Lays', 'Snacks', '20 '),
(7, 'Kurkure', 'Snacks', '10'),
(8, 'Bingo', 'Snacks', '20'),
(9, 'Puttu and Stew', 'Breakfast', '60'),
(10, 'Upma', 'Breakfast', '65'),
(11, 'Idly', 'Breakfast', '45'),
(12, 'South Indian Meals', 'Breakfast', '60'),
(13, 'Chicken Biryani', 'Lunch', '180'),
(14, 'Ghee rice', 'Dinner', '80'),
(15, 'Chicken Biryani', 'Dinner', '180'),
(16, 'Mutton Biryani', 'Dinner', '200'),
(19, 'Jamoon', 'Sweets', '20'),
(18, 'Coffee', 'Beverage', '10');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `name` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `mobileNumber` varchar(200) NOT NULL,
  `address` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `securityQuestion` varchar(200) NOT NULL,
  `answer` varchar(200) NOT NULL,
  `status` varchar(200) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`name`, `email`, `mobileNumber`, `address`, `password`, `securityQuestion`, `answer`, `status`, `id`) VALUES
('admin', 'admin@gmail.com', '9380392248', 'Bangalore', 'admin', 'Whats your name?', 'Gagan', 'true', 1),
('gagan', 'gagan@gmail.com', '9999999990', 'gagan', '123', 'who are you?', 'null', 'true', 4),
('tanmai', 'tanmai@gmail.com', '9999999999', 'tanmai', '123', 'who am i?', 'null', 'true', 7);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
