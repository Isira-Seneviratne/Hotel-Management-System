-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 15, 2018 at 09:41 AM
-- Server version: 8.0.12
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendence`
--

CREATE TABLE `attendence` (
  `attID` int(11) NOT NULL,
  `empid` char(5) NOT NULL,
  `eName` varchar(75) NOT NULL,
  `Date` date NOT NULL,
  `attend` varchar(10) DEFAULT 'no',
  `att_time` varchar(10) DEFAULT NULL,
  `leave_Time` varchar(10) DEFAULT NULL,
  `att_type` varchar(15) DEFAULT NULL,
  `workingHours` varchar(10) DEFAULT '0',
  `otHours` varchar(10) DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendence`
--

INSERT INTO `attendence` (`attID`, `empid`, `eName`, `Date`, `attend`, `att_time`, `leave_Time`, `att_type`, `workingHours`, `otHours`) VALUES
(316, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'Present', '8.00', '16.00', 'Full Day', '8', '0'),
(363, 'e0001', 'Prabas Gayadeeptha', '2017-09-01', 'Present', '8.30', '16.30', 'Full Day', '8', '0'),
(364, 'e0001', 'Prabas Gayadeeptha', '2017-09-02', 'Present', '7.30', '19.30', 'Full Day', '12', '4'),
(365, 'e0001', 'Prabas Gayadeeptha', '2017-09-03', 'Present', '8.30', '17.30', 'Full Day', '9', '1'),
(366, 'e0001', 'Prabas Gayadeeptha', '2017-09-04', 'Present', '8.30', '16.30', 'Full Day', '8', '0'),
(367, 'e0001', 'Prabas Gayadeeptha', '2017-09-05', 'Absent', '-', '-', '-', '0', '0'),
(368, 'e0001', 'Prabas Gayadeeptha', '2017-09-06', 'Present', '10.20', '18.45', 'Full Day', '8', '0'),
(369, 'e0001', 'Prabas Gayadeeptha', '2017-09-07', 'Present', '8.20', '18.45', 'Full Day', '10', '2'),
(370, 'e0001', 'Prabas Gayadeeptha', '2017-09-09', 'Present', '8.20', '13.45', 'Half Day', '5', '0'),
(315, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(314, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(312, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(410, 'e0001', 'Prabas Gayadeeptha', '2017-09-25', 'Present', '4.56', '12.45', 'Short Leave', '7', '0'),
(310, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(309, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(308, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(307, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(306, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(305, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(304, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(303, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(302, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(301, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(300, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(299, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(298, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(297, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(296, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(295, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(294, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(293, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(292, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(291, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(290, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(289, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(288, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(287, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(286, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(285, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(284, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(283, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(282, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(281, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(280, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(279, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(278, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(277, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(276, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(275, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(274, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(273, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(272, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(271, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(270, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(269, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(268, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(267, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(266, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(265, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(264, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(263, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(262, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(261, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(260, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(259, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(258, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(257, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(256, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(255, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(254, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(253, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(252, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(251, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(250, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(249, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(248, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(247, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(246, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(245, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(244, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(243, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(242, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(241, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(240, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(239, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(238, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(237, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(236, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(235, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(234, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(233, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(232, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(231, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(230, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(229, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(228, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(227, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(226, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(225, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(224, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(223, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(222, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(221, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(220, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(219, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(218, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(217, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(216, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(215, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(214, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(213, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(212, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(211, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(210, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(209, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(208, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(207, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(206, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(205, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(204, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(203, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(202, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(201, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(200, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(199, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(198, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(197, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(196, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(195, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(194, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(193, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(192, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(191, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(190, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(189, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(188, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(187, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(186, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(185, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(184, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(183, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(182, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(181, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(180, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(179, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(178, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(177, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(176, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(175, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(174, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(173, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(172, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(171, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(170, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(169, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(168, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(167, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(166, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(165, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(164, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(163, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(162, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(161, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(160, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(159, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(158, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(157, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(156, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(155, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(154, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(153, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(152, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(151, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(150, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(149, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(148, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(147, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(146, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(145, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(144, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(143, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(142, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(141, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(140, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(139, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(138, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(137, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(136, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(135, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(134, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(133, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(132, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(131, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(130, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(129, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(128, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(127, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(126, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(125, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(124, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(123, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(122, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(121, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(120, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(119, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(118, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(117, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(116, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(115, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(114, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(113, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(112, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(111, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(110, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(109, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(108, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(107, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(106, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(105, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(104, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(103, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(102, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(101, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(100, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(99, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(98, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(97, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(96, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(95, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(94, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(93, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(92, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(91, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(90, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(89, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(88, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(87, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(86, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(85, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(84, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(83, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(82, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(81, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(80, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(79, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(78, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(77, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(76, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(75, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(74, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(73, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(72, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(71, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(70, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(69, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(68, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(67, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(66, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(65, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(64, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(63, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(62, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(61, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(60, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(59, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(58, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(57, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(56, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(55, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(54, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(53, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(52, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(51, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(50, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(49, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(48, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(47, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(46, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(45, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(44, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(43, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(42, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(41, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(40, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(39, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(38, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(37, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(36, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(35, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(34, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(33, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(32, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(31, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(30, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(29, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(28, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(27, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(26, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(25, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(24, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(23, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(22, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(21, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(20, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(19, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(18, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(17, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(16, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(15, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(14, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(13, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(12, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(11, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(10, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(9, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(8, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(7, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(6, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(5, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(4, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(3, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(2, 'e0001', 'Prabas Gayadeeptha', '2017-09-21', 'absent', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(408, 'e0002', 'Tishakya Kulasinghe', '2017-09-22', 'Present', '8.00', '16.00', 'Full Day', '8', '0'),
(407, 'e0002', 'Tishakya Kulasinghe', '2017-09-21', 'Present', '8.00', '16.00', 'Full Day', '8', '0'),
(406, 'e0002', 'Tishakya Kulasinghe', '2017-09-20', 'Present', '8.00', '17.00', 'Full Day', '9', '1'),
(405, 'e0002', 'Tishakya Kulasinghe', '2017-09-19', 'Absent', '-', '-', '-', '0', '0'),
(404, 'e0002', 'Tishakya Kulasinghe', '2017-09-18', 'Absent', '-', '-', '-', '0', '0'),
(403, 'e0002', 'Tishakya Kulasinghe', '2017-09-17', 'Present', '8.30', '16.20', 'Short Leave', '7', '0'),
(402, 'e0002', 'Tishakya Kulasinghe', '2017-09-16', 'Present', '8.30', '20.20', 'Full Day', '11', '3'),
(401, 'e0002', 'Tishakya Kulasinghe', '2017-09-15', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(400, 'e0002', 'Tishakya Kulasinghe', '2017-09-14', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(399, 'e0002', 'Tishakya Kulasinghe', '2017-09-13', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(398, 'e0002', 'Tishakya Kulasinghe', '2017-09-12', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(397, 'e0002', 'Tishakya Kulasinghe', '2017-09-11', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(396, 'e0002', 'Tishakya Kulasinghe', '2017-09-10', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(395, 'e0002', 'Tishakya Kulasinghe', '2017-09-09', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(394, 'e0002', 'Tishakya Kulasinghe', '2017-09-08', 'Present', '8.30', '17.20', 'Full Day', '8', '0'),
(393, 'e0002', 'Tishakya Kulasinghe', '2017-09-07', 'Present', '8.30', '14.20', 'Half Day', '5', '0'),
(392, 'e0002', 'Tishakya Kulasinghe', '2017-09-06', 'Absent', '-', '-', '-', '0', '0'),
(391, 'e0002', 'Tishakya Kulasinghe', '2017-09-05', 'Present', '8.30', '17.30', 'Full Day', '8', '0'),
(390, 'e0002', 'Tishakya Kulasinghe', '2017-09-04', 'Present', '7.45', '18.25', 'Full Day', '10', '2'),
(389, 'e0002', 'Tishakya Kulasinghe', '2017-09-03', 'Present', '8.30', '16.30', 'Full Day', '8', '0'),
(388, 'e0002', 'Tishakya Kulasinghe', '2017-09-02', 'Present', '8.30', '16.30', 'Full Day', '8', '0'),
(387, 'e0002', 'Tishakya Kulasinghe', '2017-09-01', 'Present', '8.30', '16.30', 'Full Day', '8', '0'),
(386, 'e0001', 'Prabas Gayadeeptha', '2017-09-22', 'Present', '8.30', '20.30', 'Full Day', '12', '4'),
(385, 'e0001', 'Prabas Gayadeeptha', '2017-09-21', 'Present', '8.30', '19.30', 'Full Day', '11', '3'),
(383, 'e0001', 'Prabas Gayadeeptha', '2017-09-19', 'Present', '8.30', '17.30', 'Full Day', '9', '1'),
(384, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'Present', '8.30', '17.30', 'Full Day', '9', '1'),
(381, 'e0001', 'Prabas Gayadeeptha', '2017-09-18', 'Present', '8.45', '16.30', 'Short Leave', '7', '0'),
(380, 'e0001', 'Prabas Gayadeeptha', '2017-09-17', 'Absent', '-', '-', '-', '0', '0'),
(379, 'e0001', 'Prabas Gayadeeptha', '2017-09-16', 'Absent', '-', '-', '-', '0', '0'),
(378, 'e0001', 'Prabas Gayadeeptha', '2017-09-15', 'Present', '8.00', '17.00', 'Full Day', '9', '1'),
(377, 'e0001', 'Prabas Gayadeeptha', '2017-09-14', 'Present', '8.00', '15.00', 'Full Day', '8', '0'),
(376, 'e0001', 'Prabas Gayadeeptha', '2017-09-13', 'Present', '7.00', '15.00', 'Full Day', '8', '0'),
(374, 'e0001', 'Prabas Gayadeeptha', '2017-09-10', 'Present', '7.20', '14.45', 'Full Day', '8', '0'),
(373, 'e0001', 'Prabas Gayadeeptha', '2017-09-11', 'Present', '7.20', '14.45', 'Full Day', '8', '0'),
(372, 'e0001', 'Prabas Gayadeeptha', '2017-09-08', 'Present', '8.20', '13.45', 'Half Day', '5', '0'),
(375, 'e0001', 'Prabas Gayadeeptha', '2017-09-12', 'Absent', '-', '-', '-', '0', '0'),
(409, 'e0001', 'Prabas Gayadeeptha', '2017-09-24', 'Present', '8.00', '20.45', 'Full Day', '12', '4'),
(317, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(318, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(319, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(320, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(321, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(322, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(323, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(324, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(325, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(326, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(327, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(328, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(329, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(330, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(331, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(332, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(333, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(334, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(335, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(336, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(337, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(338, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(339, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(340, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(341, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(342, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(343, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(344, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(345, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(346, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(347, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(348, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(349, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(350, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(351, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(352, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(353, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(354, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(355, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(356, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(357, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(358, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(359, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0'),
(360, 'e0001', 'Prabas Gayadeeptha', '2017-09-20', 'present', '8.00 AM', '4.00 PM', 'Full Day', '8', '0');

-- --------------------------------------------------------

--
-- Table structure for table `candidate`
--

CREATE TABLE `candidate` (
  `candidateID` char(5) NOT NULL,
  `full_name` varchar(75) NOT NULL,
  `name_with_Initial` varchar(60) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `NIC` char(10) NOT NULL,
  `birthday` date NOT NULL,
  `address` varchar(100) NOT NULL,
  `homenumber` char(10) NOT NULL,
  `mobile` char(10) NOT NULL,
  `email` varchar(45) NOT NULL,
  `Department` varchar(40) NOT NULL,
  `designation` varchar(40) NOT NULL,
  `qualifications` varchar(200) DEFAULT 'none',
  `degree` varchar(40) DEFAULT 'none',
  `experience` varchar(20) DEFAULT 'no experience'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `candidate`
--

INSERT INTO `candidate` (`candidateID`, `full_name`, `name_with_Initial`, `gender`, `NIC`, `birthday`, `address`, `homenumber`, `mobile`, `email`, `Department`, `designation`, `qualifications`, `degree`, `experience`) VALUES
('C1001', 'Kasun Tharaka', 'A.B.K. Tharaka', 'Male', '921340234V', '1992-05-13', 'godagama', '0411899033', '0778923456', 'kasun.t@gmail.com', 'HR Department', 'Officer', 'none', 'none', '12 months'),
('C1000', 'Samantha Karunanayaka', 'G.S. Karunanayaka', 'Male', '920130188V', '1992-01-13', 'galle', '0411898900', '0771111111', 'karu.g@gmail.com', 'HR Department', 'HR Manager', 'none', 'none', 'no experience');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `name` varchar(50) NOT NULL,
  `address` varchar(60) NOT NULL,
  `phone` int(10) NOT NULL,
  `email` varchar(20) NOT NULL,
  `nic` varchar(10) NOT NULL,
  `nationality` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `Regular` varchar(10) NOT NULL,
  `Backlisted` varchar(10) NOT NULL,
  `comment` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`name`, `address`, `phone`, `email`, `nic`, `nationality`, `gender`, `Regular`, `Backlisted`, `comment`) VALUES
('Oshitha', 'panadura', 719999999, 'Oshith@gmail.com', '942365187v', 'Australian', 'male', '', '', 'dddddd'),
('upeksha', 'colombo', 12365478, 'upeksha@gmail.com', '940253671v', 'Australian', 'female', '', '', 'www');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `Did` varchar(10) NOT NULL,
  `Dname` varchar(40) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`Did`, `Dname`) VALUES
('hr', 'HR Department'),
('fd', 'Finance Department'),
('sd', 'Stock Department'),
('rd', 'Restaurant Department'),
('bd', 'Beverage Department'),
('fo', 'Front Office Department'),
('td', 'Transport Department'),
('ed', 'Event Department');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `Emp_ID` char(5) NOT NULL,
  `full_name` varchar(75) NOT NULL,
  `name_with_Initial` varchar(60) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `NIC` char(10) NOT NULL,
  `birthday` date NOT NULL,
  `address` varchar(100) NOT NULL,
  `homenumber` char(10) NOT NULL,
  `mobile` char(10) NOT NULL,
  `email` varchar(45) NOT NULL,
  `Department` varchar(40) NOT NULL,
  `designation` varchar(40) NOT NULL,
  `startdate` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`Emp_ID`, `full_name`, `name_with_Initial`, `gender`, `NIC`, `birthday`, `address`, `homenumber`, `mobile`, `email`, `Department`, `designation`, `startdate`) VALUES
('e0000', 'Samintha Thuduhena', 'A.B.S.Thuduhena', 'Male', '921230915V', '1992-06-18', 'chuti putha, \r\nPalle Gedara,\r\nRanala Para,\r\nHabarakada', '0113443567', '0715672319', 'sami.thuduhena@gmail.com', 'HR Department', 'Admin', '2010-04-19'),
('e0001', 'Prabas Gayadeeptha', 'R.P.P. Gayadeeptha', 'Male', '950240199V', '1995-01-24', 'No 23, \r\n2nd lane,\nAkuressa,\r\nMatara', '0415643307', '0775345123', 'pg.gayan@gmail.com', 'HR Department', 'HR Manager', '2010-04-20'),
('e0002', 'Tishakya Kulasinghe', 'Y.T. Kulasinghe', 'Male', '942160156V', '1994-07-17', 'Kurunegala', '0110115674', '0770230199', 'ysiru.thisak@gmail.com', 'Stock Department', 'Stock Manager', '2010-07-29'),
('e0003', 'Janith Erandha', 'H.P.J. Erandha', 'Male', '941450199V', '1994-04-16', 'Homagama', '0115432890', '0772341780', 'erandha2015@gmail.com', 'Finance Department', 'Finance Manager', '2010-07-29'),
('e0004', 'Isuru Pathum', 'N.L.I. Pathum', 'Male', '930280256V', '1993-01-28', 'Athurugiriya', '0110345890', '0712345678', 'isuru.pa@gmail.com', 'Transport Department', 'Transport Manager', '2010-07-29'),
('e0005', 'Chathura Jayawardhana', 'J.K.P.L.C. Jayawardhana', 'Male', '923650456V', '1992-12-12', 'Piliyandala', '0112345671', '0771812917', 'chathu.jaye@gmail.com', 'Beverage Department', 'Bar Manager', '2010-07-29'),
('e0007', 'Ositha Ranasinghe', 'B.A.D.O.S. Ranasinghe', 'Male', '931750456V', '1993-05-24', 'Panadura', '0118902340', '0752358129', 'osi.rana@gmail.com', 'Front Office Department', 'Front Office Manager', '2010-07-29'),
('e0008', 'Jamila Kahandi', 'A.S.J. Kahandi', 'Female', '901900168V', '1990-08-12', 'Malabe', '0110543900', '0712345567', 'j,kaha@gmail.com', 'Finance Department', 'Accounting Clerk', '2010-07-29'),
('e0009', 'Kolitha Perera', 'A.B.K. Perera', 'Male', '880190178V', '1988-01-19', 'Koggala', '0418924109', '0772965104', 'koli.per@gmail.com', 'Stock Department', 'Supervisor', '2010-07-29'),
('e0010', 'Sanath Jayasuriya', 'D.S.S. Jayasuriya', 'Male', '920560234V', '1992-02-25', 'Matara', '0419231092', '0751429563', 'sana.jaya@gmail.com', 'Restaurant Department', 'Cashier', '2010-07-29'),
('e0011', 'Saduni Jayaneththi', 'K.L.S. Jayaneththi', 'Female', '900130188V', '1990-01-13', 'Kaluthara', '0112678910', '0772189340', 'saduni.jaya@gmail.com', 'Beverage Department', 'Bartender', '2017-01-13'),
('e0045', 'Kamal Subasinghe', 'D.L.K. Subasinghe', 'Female', '901238972V', '1990-05-22', 'Kaduwela', '0115476128', '0772348129', 'k.suba@g.com', 'Stock Department', 'Stock Manager', '2017-09-24');

-- --------------------------------------------------------

--
-- Table structure for table `fms_cash_flow`
--

CREATE TABLE `fms_cash_flow` (
  `Date` date NOT NULL,
  `Period` varchar(25) NOT NULL,
  `RecType` varchar(50) NOT NULL,
  `Record` varchar(100) NOT NULL,
  `Value` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_cash_flow`
--

INSERT INTO `fms_cash_flow` (`Date`, `Period`, `RecType`, `Record`, `Value`) VALUES
('2017-09-24', 'Year', 'Operating Activities', 'Cash Received from Customers', 51300),
('2017-09-24', 'Year', 'Investing Activities', 'Purchase of Property', -120000),
('2017-09-24', 'Year', 'Financing Activities', 'Payments on Line of Credit', 12000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid for Merchandise', -15000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid to Employees', 10500),
('2018-09-20', 'Year', 'Operating Activities', 'vfhj', 123),
('2018-09-20', 'Year', 'Financing Activities', 'a', 2345),
('2017-09-24', 'Day', 'Investing Activities', 'qwe', 12345),
('2017-09-24', 'Day', 'Operating Activities', 'Cash receives from customers', 12345),
('2018-10-04', 'Day', 'Investing Activities', 'sdfg', 2345),
('2018-10-10', 'Day', 'Operating Activities', 'Cash paid to employees', 123000),
('2018-10-10', 'Day', 'Financing Activities', 'Payments on line of credit', 50000),
('2018-10-31', 'Year', 'Financing Activities', 'Purchance of property', 120000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Received from Customers', 51300),
('2017-09-24', 'Year', 'Investing Activities', 'Purchase of Property', -120000),
('2017-09-24', 'Year', 'Financing Activities', 'Payments on Line of Credit', 12000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid for Merchandise', -15000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid to Employees', 10500),
('2018-09-20', 'Year', 'Operating Activities', 'vfhj', 123),
('2018-09-20', 'Year', 'Financing Activities', 'a', 2345),
('2017-09-24', 'Day', 'Investing Activities', 'qwe', 12345),
('2017-09-24', 'Day', 'Operating Activities', 'Cash receives from customers', 12345),
('2018-10-04', 'Day', 'Investing Activities', 'sdfg', 2345),
('2018-10-10', 'Day', 'Operating Activities', 'Cash paid to employees', 123000),
('2018-10-10', 'Day', 'Financing Activities', 'Payments on line of credit', 50000),
('2018-10-31', 'Year', 'Financing Activities', 'Purchance of property', 120000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Received from Customers', 51300),
('2017-09-24', 'Year', 'Investing Activities', 'Purchase of Property', -120000),
('2017-09-24', 'Year', 'Financing Activities', 'Payments on Line of Credit', 12000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid for Merchandise', -15000),
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid to Employees', 10500),
('2018-09-20', 'Year', 'Operating Activities', 'vfhj', 123),
('2018-09-20', 'Year', 'Financing Activities', 'a', 2345),
('2017-09-24', 'Day', 'Investing Activities', 'qwe', 12345),
('2017-09-24', 'Day', 'Operating Activities', 'Cash receives from customers', 12345),
('2018-10-04', 'Day', 'Investing Activities', 'sdfg', 2345),
('2018-10-10', 'Day', 'Operating Activities', 'Cash paid to employees', 123000),
('2018-10-10', 'Day', 'Financing Activities', 'Payments on line of credit', 50000),
('2018-10-31', 'Year', 'Financing Activities', 'Purchance of property', 120000);

-- --------------------------------------------------------

--
-- Table structure for table `fms_expense`
--

CREATE TABLE `fms_expense` (
  `Date` date NOT NULL,
  `RepNo` varchar(25) NOT NULL,
  `Payment` varchar(50) NOT NULL,
  `Subtotal` double NOT NULL,
  `PayTax` double NOT NULL,
  `Discount` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_expense`
--

INSERT INTO `fms_expense` (`Date`, `RepNo`, `Payment`, `Subtotal`, `PayTax`, `Discount`, `Total`) VALUES
('2018-09-20', '13', 'cvb', 10, 0.1, 3, 7.1),
('2018-09-20', '14', 'cvb', 10, 0.1, 3, 7.1),
('2017-09-24', 'FMD-1', 'Dilog 4G Bill-September', 5900, 0, 0, 5900),
('2017-09-24', 'FMD-2', 'Dilog TV Bill-September', 10900, 0, 0, 10900),
('2017-09-24', 'FMD-3', 'Electricity Bill-September', 25500, 1275, 0, 26775),
('2017-09-24', 'FMD-4', 'Water Bill-September', 15099, 754.95, 0, 15853.95);

-- --------------------------------------------------------

--
-- Table structure for table `fms_income`
--

CREATE TABLE `fms_income` (
  `Date` date NOT NULL,
  `RepNo` varchar(25) NOT NULL,
  `Sale` varchar(50) NOT NULL,
  `Subtotal` double NOT NULL,
  `SalesTax` double NOT NULL,
  `Discount` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_income`
--

INSERT INTO `fms_income` (`Date`, `RepNo`, `Sale`, `Subtotal`, `SalesTax`, `Discount`, `Total`) VALUES
('2018-09-20', '13', '', 10, 0.1, 3, 7.1),
('2017-09-24', 'BMD-1', 'Soft Drinks-September', 55000, 5000, 0, 50000),
('2017-09-24', 'BMD-2', 'Liquor Drinks-September', 98750, 18750, 0, 80000),
('2017-09-01', 'FMD001', '', 25000, 0, 0, 25000),
('2017-09-24', 'RMD-1', 'Food Items-September', 125800, 25800, 0, 100000),
('2017-09-24', 'RMD-2', 'Decert Items-September', 36900, 0, 0, 36900);

-- --------------------------------------------------------

--
-- Table structure for table `fms_payments`
--

CREATE TABLE `fms_payments` (
  `Date` date NOT NULL,
  `RepNo` varchar(25) NOT NULL,
  `PayTo` varchar(100) NOT NULL,
  `PayFor` varchar(100) NOT NULL,
  `PayFrom` varchar(25) NOT NULL,
  `Rs` varchar(100) NOT NULL,
  `PayBy` varchar(10) NOT NULL,
  `Subtotal` double NOT NULL,
  `Discount` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_payments`
--

INSERT INTO `fms_payments` (`Date`, `RepNo`, `PayTo`, `PayFor`, `PayFrom`, `Rs`, `PayBy`, `Subtotal`, `Discount`, `Total`) VALUES
('2018-10-12', '123', 'asdf', 'sdfg', 'Finance Department', 'asdfg', 'Cash', 2345, 234, 2345),
('2018-09-20', '13', 'asd', 'cvb', 'Finance Department', 'ten', 'Cash', 10, 3, 7.1),
('2018-09-20', '14', 'asd', 'cvb', 'Finance Department', 'ten', 'Cash', 10, 3, 7.1),
('2018-10-12', '2345', 'sdf', 'sdfg', 'Finance Department', 'sdfgh', 'Cash', 1234, 1234, 234),
('2018-10-03', '76', 'sdfg', 'xcvgh', 'Finance Department', 'qwer', 'Cash', 12, 1, 11),
('2017-09-24', 'FMD-1', 'Dialog Axiata PLC', 'Dilog 4G Bill-September', 'Finance Department', 'Five thousand nine hundred', 'Cash', 5900, 0, 5900),
('2018-10-02', 'FMD-10', 'qwe', 'qwe', 'Finance Department', '123', 'Cash', 123, 1, 122),
('2018-10-05', 'FMD-101', 'sdfg', 'sdfg', 'Finance Department', 'wer', 'Cash', 2345, 567, 3456),
('2018-10-10', 'FMD-109', 'sdfg', 'sdfg', 'Finance Department', 'ert', 'Cash', 234, 1234, -1000),
('2018-10-01', 'FMD-11', 'asdf', 'xcvb', 'Finance Department', '1222', 'Cash', 1222, 12, 1210),
('2018-10-04', 'FMD-12', 'asdfg', 'sdfg', 'Finance Management', 'asdf', 'Cash', 456, 23456, 3456),
('2018-10-04', 'FMD-134', 'dfg', 'sdfg', 'Finance Department', 'dfg', 'Cash', 1234, 2345, 2345),
('2018-10-10', 'FMD-14', 'fgh', 'xcv', 'Finance Department', 'sdfgh', 'Cash', 1234, 234, 5678),
('2018-10-18', 'FMD-141', 'asdfg', 'asdfg', 'Finance Department', 'dfg', 'Cash', 2345, 234, 345),
('2018-10-18', 'FMD-145', 'asdfg', 'asdfg', 'Finance Department', 'dfg', 'Cash', 2345, 234, 345),
('2017-09-24', 'FMD-2', 'Dialog Axiata PLC', 'Dilog TV Bill-September', 'Finance Department', 'Ten thousand nine hundred', 'Cash', 10900, 0, 10900),
('2017-09-24', 'FMD-3', 'Electricity Board', 'Electricity Bill-September', 'Finance Department', 'Twenty five thousand five hundred', 'Cash', 25500, 0, 26775),
('2017-09-24', 'FMD-4', 'Water Board', 'Water Bill-September', 'Finance Department', 'Fifteen thousand ninty nine', 'Cash', 15099, 0, 15853.95),
('2017-09-20', 'FMD-6', 'Dialog Axiata PLC', 'Dialog 4G Bill-September	', 'Finance Department', 'Ten thousand nine hundred only', 'Check', 10000, 100, 10900),
('2017-09-20', 'FMD-7', 'Sri Lanka Telecom', 'Telephone Bill-September', 'Finance Department', 'Five thousand five hundred ninty nine', 'Cash', 5599, 0, 5599),
('2017-09-24', 'FMD-8', 'Dialog Axiata PLC', 'Dilog 4G Bill-Octomber', 'Finance Department', 'Five thousand nine hundred', 'Cash', 5900, 1000, 5490),
('2017-09-27', 'FMD-9', 'fsdfsdf', 'assfsf', 'Finance Department', 'safasff', 'Cash', 5666, 45, 6187.6);

-- --------------------------------------------------------

--
-- Table structure for table `fms_receipts`
--

CREATE TABLE `fms_receipts` (
  `Date` date NOT NULL,
  `RepNo` varchar(25) NOT NULL,
  `RepType` varchar(25) NOT NULL,
  `Department` varchar(25) NOT NULL,
  `Sale` varchar(50) NOT NULL,
  `Payment` varchar(50) NOT NULL,
  `PayMethod` varchar(25) NOT NULL,
  `Subtotal` double NOT NULL,
  `Discount` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_receipts`
--

INSERT INTO `fms_receipts` (`Date`, `RepNo`, `RepType`, `Department`, `Sale`, `Payment`, `PayMethod`, `Subtotal`, `Discount`, `Total`) VALUES
('2018-10-12', '123', 'Payment', 'Finance Management', '', 'sdfg', 'Cash', 2345, 234, 2345),
('2018-09-20', '13', 'Payment', 'Finance Management', '', 'cvb', 'Cash', 10, 3, 7.1),
('2018-09-20', '14', 'Payment', 'Finance Management', '', 'cvb', 'Cash', 10, 3, 7.1),
('2018-10-12', '2345', 'Payment', 'Finance Management', '', 'sdfg', 'Cash', 1234, 1234, 234),
('2017-09-24', 'BMD-1', 'Sale', 'Beverage Management', 'Soft Drinks-September', '', 'Cash', 55000, 0, 50000),
('2017-09-24', 'BMD-2', 'Sale', 'Beverage Management', 'Liquor Drinks-September', '', 'Cash', 98750, 0, 80000),
('2017-09-24', 'FMD-1', 'Payment', 'Finance Management', '', 'Dilog 4G Bill-September', 'Cash', 5900, 0, 5900),
('2018-10-05', 'FMD-101', 'Payment', 'Finance Management', '', 'sdfg', 'Cash', 2345, 567, 3456),
('2018-10-10', 'FMD-109', 'Payment', 'Finance Management', '', 'sdfg', 'Cash', 234, 1234, -1000),
('2018-10-04', 'FMD-12', 'Payment', 'Finance Management', '', 'sdfg', 'Cash', 456, 23456, 3456),
('2018-10-04', 'FMD-134', 'Payment', 'Finance Management', '', 'sdfg', 'Cash', 1234, 2345, 2345),
('2018-10-10', 'FMD-14', 'Payment', 'Finance Management', '', 'xcv', 'Cash', 1234, 234, 5678),
('2018-10-18', 'FMD-141', 'Payment', 'Finance Management', '', 'asdfg', 'Cash', 2345, 234, 345),
('2018-10-18', 'FMD-145', 'Payment', 'Finance Management', '', 'asdfg', 'Cash', 2345, 234, 345),
('2017-09-24', 'FMD-2', 'Payment', 'Finance Management', '', 'Dilog TV Bill-September', 'Cash', 10900, 0, 10900),
('2017-09-24', 'FMD-3', 'Payment', 'Finance Management', '', 'Electricity Bill-September', 'Cash', 25500, 0, 26775),
('2017-09-24', 'FMD-4', 'Payment', 'Finance Management', '', 'Water Bill-September', 'Cash', 15099, 0, 15853.95),
('2017-09-24', 'FMD-8', 'Payment', 'Finance Management', '', 'Dilog 4G Bill-Octomber', 'Cash', 5900, 1000, 5490),
('2017-09-27', 'FMD-9', 'Payment', 'Finance Management', '', 'assfsf', 'Cash', 5666, 45, 6187.6),
('2017-09-24', 'RMD-1', 'Sale', 'Restuarant Management', 'Food Items-September', '', 'Cash', 125800, 0, 100000),
('2017-09-24', 'RMD-2', 'Sale', 'Restuarant Management', 'Decert Items-September', '', 'Cash', 36900, 0, 36900);

-- --------------------------------------------------------

--
-- Table structure for table `hall`
--

CREATE TABLE `hall` (
  `Booking_ID` varchar(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `Reserve_date` date NOT NULL,
  `Hall_name` varchar(10) NOT NULL,
  `description` varchar(100) NOT NULL,
  `Total Amount` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hall`
--

INSERT INTO `hall` (`Booking_ID`, `name`, `Reserve_date`, `Hall_name`, `description`, `Total Amount`) VALUES
('H001', 'Upeksha', '2017-11-08', 'Pearl', 'welcome drinks included', 50000),
('H002', 'Saman', '2017-11-02', 'Ruby', 'welcome drinks included', 80000);

-- --------------------------------------------------------

--
-- Table structure for table `hall&room_avalability`
--

CREATE TABLE `hall&room_avalability` (
  `Type` varchar(20) NOT NULL,
  `Avalability` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hall&room_avalability`
--

INSERT INTO `hall&room_avalability` (`Type`, `Avalability`) VALUES
('DoubleRoom', 15),
('SingleRoom ', 10);

-- --------------------------------------------------------

--
-- Table structure for table `interview_details`
--

CREATE TABLE `interview_details` (
  `intwID` char(5) NOT NULL,
  `cid` char(5) NOT NULL,
  `cName` varchar(75) NOT NULL,
  `department` varchar(40) NOT NULL,
  `role` varchar(40) NOT NULL,
  `interviewBy` varchar(75) NOT NULL,
  `Status` varchar(20) NOT NULL DEFAULT 'not selected'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `interview_details`
--

INSERT INTO `interview_details` (`intwID`, `cid`, `cName`, `department`, `role`, `interviewBy`, `Status`) VALUES
('i3457', 'c3457', 'Kamal Subasinghe', 'Beverage Department', 'Bartender', 'Prabas Gayadeeptha', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `interview_schedule`
--

CREATE TABLE `interview_schedule` (
  `interID` char(5) NOT NULL,
  `can_id` char(5) NOT NULL,
  `job_id` varchar(10) NOT NULL,
  `type` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `time` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `interview_schedule`
--

INSERT INTO `interview_schedule` (`interID`, `can_id`, `job_id`, `type`, `date`, `time`) VALUES
('i3457', 'c3457', 'bd002', 'Panel Interview', '2017-09-20', '13:10:00');

-- --------------------------------------------------------

--
-- Table structure for table `job`
--

CREATE TABLE `job` (
  `jobid` varchar(10) NOT NULL,
  `depID` varchar(10) NOT NULL,
  `jName` varchar(40) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `job`
--

INSERT INTO `job` (`jobid`, `depID`, `jName`) VALUES
('hr000', 'hr', 'Admin'),
('hr001', 'hr', 'HR Manager'),
('hr002', 'hr', 'Assistant Manager'),
('hr003', 'hr', 'Chief Executive Officer(CEO)'),
('hr004', 'hr', 'Secretary'),
('hr005', 'hr', 'Employment Supervisor'),
('hr006', 'hr', 'Officer'),
('hr007', 'hr', 'Training Manager'),
('bd006', 'bd', 'Beverage Buyer'),
('fo000', 'fo', 'Front Office Manager'),
('fo001', 'fo', 'Guest Services Manager'),
('fo002', 'fo', 'Front Desk Clerk'),
('fo003', 'fo', 'Front Desk Supervisor'),
('fo004', 'fo', 'Housekeeping Supervisor'),
('fo005', 'fo', 'Housekeeper'),
('fo006', 'fo', 'Front Office Attendant'),
('hr008', 'hr', 'Recruiting Manager'),
('fo007', 'fo', 'Porter'),
('td000', 'td', 'Transport Manager'),
('td001', 'td', 'Transportation Planner'),
('td002', 'td', 'Driver'),
('td003', 'td', 'Delivery Helper'),
('td004', 'td', 'Delivery Driver'),
('hr009', 'hr', 'Recruiting Interviewer'),
('fd000', 'fd', 'Finance Manager'),
('fd001', 'fd', 'Accountant'),
('fd002', 'fd', 'Accounting Clerk'),
('fd003', 'fd', 'Auditor'),
('fd004', 'fd', 'Chief Financial Officer(CFO)'),
('fd005', 'fd', 'Budget Manager'),
('fd006', 'fd', 'Budget Analyst'),
('sd000', 'sd', 'Stock Manager'),
('sd001', 'sd', 'Meat Manager'),
('sd002', 'sd', 'Supervisor'),
('sd003', 'sd', 'Stock Clerk'),
('sd004', 'sd', 'Stocker/Placer'),
('sd005', 'sd', 'Buyer'),
('sd006', 'sd', 'Assistant Buyer'),
('sd007', 'sd', 'food controller'),
('rd000', 'rd', 'Restaurant Manager'),
('rd001', 'rd', 'Baker'),
('rd002', 'rd', 'Kitchen Manager'),
('rd003', 'rd', 'Kitchen Worker'),
('rd004', 'rd', 'Chef Manager'),
('rd005', 'rd', 'Waiter'),
('rd006', 'rd', 'Cook'),
('rd007', 'rd', 'Assistant Chef'),
('rd008', 'rd', 'Cashier'),
('bd000', 'bd', 'Bar Manager'),
('bd001', 'bd', 'Bar Staff'),
('bd002', 'bd', 'Bartender'),
('bd003', 'bd', 'Bar Stock Manager'),
('bd004', 'bd', 'Bar Attendant'),
('bd005', 'bd', 'Beverage Control Clerk'),
('ed000', 'ed', 'Event Manager'),
('ed001', 'ed', 'Catering Manager'),
('ed002', 'ed', 'Event Planner'),
('ed003', 'ed', 'Sponsorship Coordinator'),
('ed004', 'ed', 'Services Manager');

-- --------------------------------------------------------

--
-- Table structure for table `Login`
--

CREATE TABLE `Login` (
  `eID` varchar(10) NOT NULL,
  `Username` varchar(100) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Logged in?` varchar(3) DEFAULT 'No'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Login`
--

INSERT INTO `Login` (`eID`, `Username`, `Password`, `Logged in?`) VALUES
('E000000001', 'isira123', 'abcd1234', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `bookingID` varchar(20) NOT NULL,
  `customerName` varchar(100) NOT NULL,
  `remarks` varchar(500) NOT NULL,
  `singleBed` int(11) NOT NULL,
  `doubleBed` int(11) NOT NULL,
  `extraBed` int(11) NOT NULL,
  `totalAmonut` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`bookingID`, `customerName`, `remarks`, `singleBed`, `doubleBed`, `extraBed`, `totalAmonut`) VALUES
('R001', 'Dilshan', 'fffffffffffffff', 2, 1, 0, 500000),
('R002', 'Upeksha', 'fffffff', 2, 0, 0, 200000);

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Cleaning_Items`
--

CREATE TABLE `Stock_Cleaning_Items` (
  `Item ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Item Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Vendor ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Purchase Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Cleaning_Items`
--

INSERT INTO `Stock_Cleaning_Items` (`Item ID`, `Item Name`, `Quantity`, `Price`, `Vendor ID`, `Purchase Date`) VALUES
('C000000001', 'Mops', 10, 500, 'V000000001', '2018-10-01'),
('C000000002', 'Broom', 100, 100, 'V000000001', '2018-10-01'),
('C000000003', 'Bucket', 55, 105.5, 'V000000001', '2018-10-01');

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Food_Items`
--

CREATE TABLE `Stock_Food_Items` (
  `Food ID` varchar(10) NOT NULL,
  `Food Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Unit` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Price` float NOT NULL,
  `Vendor ID` varchar(10) NOT NULL,
  `Purchase Date` date NOT NULL,
  `Expiry Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Food_Items`
--

INSERT INTO `Stock_Food_Items` (`Food ID`, `Food Name`, `Quantity`, `Unit`, `Price`, `Vendor ID`, `Purchase Date`, `Expiry Date`) VALUES
('F000000001', 'Donuts with Strawberry Icing and Sprinkles', 15, 'None', 50, 'V000000002', '2018-10-01', '2018-11-01');

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Kitchen_Items`
--

CREATE TABLE `Stock_Kitchen_Items` (
  `Item ID` varchar(10) NOT NULL,
  `Item Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Kitchen_Items`
--

INSERT INTO `Stock_Kitchen_Items` (`Item ID`, `Item Name`, `Quantity`) VALUES
('K000000001', 'Microwave ovens', 5);

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Payments`
--

CREATE TABLE `Stock_Payments` (
  `Payment ID` varchar(10) NOT NULL,
  `Vendor ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Item ID` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Payment Date` date NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Payments`
--

INSERT INTO `Stock_Payments` (`Payment ID`, `Vendor ID`, `Item ID`, `Quantity`, `Payment Date`, `Price`) VALUES
('P000000001', 'V000000001', 'C000000001', 11, '2018-10-03', 5500),
('P000000002', 'V000000002', 'C000000003', 15, '2018-10-03', 1582.5);

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Pending_Orders`
--

CREATE TABLE `Stock_Pending_Orders` (
  `Order ID` varchar(10) NOT NULL,
  `Item ID` varchar(10) NOT NULL,
  `Vendor ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Unit` varchar(5) NOT NULL,
  `Date of order` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Pending_Orders`
--

INSERT INTO `Stock_Pending_Orders` (`Order ID`, `Item ID`, `Vendor ID`, `Quantity`, `Unit`, `Date of order`) VALUES
('O000000001', 'F000000001', 'V000000002', 10, 'None', '2018-10-09');

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Room_Items`
--

CREATE TABLE `Stock_Room_Items` (
  `Item ID` varchar(10) NOT NULL,
  `Item Name` varchar(100) NOT NULL,
  `Room Number` int(4) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Room_Items`
--

INSERT INTO `Stock_Room_Items` (`Item ID`, `Item Name`, `Room Number`, `Quantity`) VALUES
('R000000001', 'High-Definition Television (HDTV)', 123, 1);

-- --------------------------------------------------------

--
-- Table structure for table `Stock_Vendor_Details`
--

CREATE TABLE `Stock_Vendor_Details` (
  `Vendor ID` varchar(10) NOT NULL,
  `Vendor Name` varchar(100) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `Telephone Number` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Stock_Vendor_Details`
--

INSERT INTO `Stock_Vendor_Details` (`Vendor ID`, `Vendor Name`, `Address`, `Telephone Number`, `Email`) VALUES
('V000000001', 'Jonathan\'s Cleaning Supplies', '95/A, Baseline Road, Colombo', '0118234453', 'cleaning_supplies@gmail.com'),
('V000000002', 'Bluebell Bakers', '11/C, New Line Road, Colombo', '0118234453', 'bluebell@telecom.lk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `attendence`
--
ALTER TABLE `attendence`
  ADD PRIMARY KEY (`attID`),
  ADD KEY `fk_eid_attnd` (`empid`);

--
-- Indexes for table `candidate`
--
ALTER TABLE `candidate`
  ADD PRIMARY KEY (`candidateID`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`name`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`Did`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Emp_ID`);

--
-- Indexes for table `fms_expense`
--
ALTER TABLE `fms_expense`
  ADD PRIMARY KEY (`RepNo`);

--
-- Indexes for table `fms_income`
--
ALTER TABLE `fms_income`
  ADD PRIMARY KEY (`RepNo`);

--
-- Indexes for table `fms_payments`
--
ALTER TABLE `fms_payments`
  ADD PRIMARY KEY (`RepNo`);

--
-- Indexes for table `fms_receipts`
--
ALTER TABLE `fms_receipts`
  ADD PRIMARY KEY (`RepNo`);

--
-- Indexes for table `hall`
--
ALTER TABLE `hall`
  ADD PRIMARY KEY (`Booking_ID`),
  ADD UNIQUE KEY `Booking_ID` (`Booking_ID`);

--
-- Indexes for table `hall&room_avalability`
--
ALTER TABLE `hall&room_avalability`
  ADD PRIMARY KEY (`Type`);

--
-- Indexes for table `interview_details`
--
ALTER TABLE `interview_details`
  ADD PRIMARY KEY (`intwID`,`cid`),
  ADD KEY `fk_cid_intdetails` (`cid`);

--
-- Indexes for table `interview_schedule`
--
ALTER TABLE `interview_schedule`
  ADD PRIMARY KEY (`interID`),
  ADD KEY `fk_cid_intsche` (`can_id`),
  ADD KEY `fk_jid_intsche` (`job_id`);

--
-- Indexes for table `job`
--
ALTER TABLE `job`
  ADD PRIMARY KEY (`jobid`),
  ADD KEY `fk_did_job` (`depID`);

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`eID`);

--
-- Indexes for table `room`
--
ALTER TABLE `room`
  ADD PRIMARY KEY (`bookingID`);

--
-- Indexes for table `Stock_Cleaning_Items`
--
ALTER TABLE `Stock_Cleaning_Items`
  ADD PRIMARY KEY (`Item ID`);

--
-- Indexes for table `Stock_Food_Items`
--
ALTER TABLE `Stock_Food_Items`
  ADD PRIMARY KEY (`Food ID`);

--
-- Indexes for table `Stock_Kitchen_Items`
--
ALTER TABLE `Stock_Kitchen_Items`
  ADD PRIMARY KEY (`Item ID`);

--
-- Indexes for table `Stock_Payments`
--
ALTER TABLE `Stock_Payments`
  ADD PRIMARY KEY (`Payment ID`);

--
-- Indexes for table `Stock_Pending_Orders`
--
ALTER TABLE `Stock_Pending_Orders`
  ADD PRIMARY KEY (`Order ID`);

--
-- Indexes for table `Stock_Room_Items`
--
ALTER TABLE `Stock_Room_Items`
  ADD PRIMARY KEY (`Item ID`);

--
-- Indexes for table `Stock_Vendor_Details`
--
ALTER TABLE `Stock_Vendor_Details`
  ADD PRIMARY KEY (`Vendor ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `attendence`
--
ALTER TABLE `attendence`
  MODIFY `attID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=411;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
