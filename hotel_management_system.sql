-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2017 at 01:59 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_request_guest`
--

CREATE TABLE `add_request_guest` (
  `Reqg_ID` int(11) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `RoomNumber` int(3) DEFAULT NULL,
  `Location` varchar(40) NOT NULL,
  `TravelBy` varchar(40) NOT NULL,
  `NoOfPasengers` int(3) DEFAULT NULL,
  `DropPickup` varchar(40) NOT NULL,
  `Req_From` varchar(40) NOT NULL,
  `Req_To` varchar(40) NOT NULL,
  `Depature` varchar(70) DEFAULT NULL,
  `Time` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_request_guest`
--

INSERT INTO `add_request_guest` (`Reqg_ID`, `Name`, `RoomNumber`, `Location`, `TravelBy`, `NoOfPasengers`, `DropPickup`, `Req_From`, `Req_To`, `Depature`, `Time`) VALUES
(18, 'pasindu', 3, 'HeadOffice', 'Car', 4, 'Both', 'Hotel', 'anuradhapura', 'Sat Sep 23 02:50:38 IST 2017', '2017-09-21 21:20:41'),
(14, 'Samintha', 1, 'HeadOffice', 'Motorbike', 2, 'Both', 'hotel', 'rathnapura', 'Sun Oct 01 00:00:00 IST 2017', '2017-09-21 19:23:22'),
(10, 'nilaka', 89, 'HeadOffice', 'Van', 5, 'Pickup', 'test', 'test', 'Fri Sep 22 17:47:17 IST 2017', '2017-09-20 12:17:20'),
(9, 'viraj', 6, 'HeadOffice', 'Motorbike', 2, 'Both', 'Kandy', 'Nugagoda', 'Sat Sep 23 17:28:31 IST 2017', '2017-09-20 11:58:37'),
(12, 'isuru', 6, 'HeadOffice', 'Van', 3, 'Pickup', 'AIRPORT', 'hotel', 'Sat Sep 23 00:00:00 IST 2017', '2017-09-21 19:22:01'),
(20, 'kumuduni', 2, 'HeadOffice', 'Car', 2, 'Both', 'homaga', 'maharagma', 'Mon Sep 25 02:11:58 IST 2017', '2017-09-23 20:42:02'),
(21, 'test', 12, 'HeadOffice', 'Car', 3, 'Both', 'homagama', 'kaduwela', 'Mon Sep 25 09:22:48 IST 2017', '2017-09-24 03:52:53'),
(19, 'MR . saman', 12, 'HeadOffice', 'Motorbike', 2, 'Both', 'Hotel', 'Maharagama', 'Fri Sep 29 23:49:58 IST 2017', '2017-09-23 18:20:03');

-- --------------------------------------------------------

--
-- Table structure for table `add_request_staff`
--

CREATE TABLE `add_request_staff` (
  `Reqs_ID` int(11) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Employee_Number` int(11) NOT NULL,
  `Department` varchar(40) NOT NULL,
  `Mobile_Number` int(10) NOT NULL,
  `Reporting_Manager` varchar(40) NOT NULL,
  `Location` varchar(40) NOT NULL,
  `TravelBy` varchar(40) NOT NULL,
  `NoOfPasengers` int(11) NOT NULL,
  `DropPickup` varchar(40) NOT NULL,
  `Req_From` varchar(40) NOT NULL,
  `Req_To` varchar(40) NOT NULL,
  `Depature` varchar(70) NOT NULL,
  `Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Reason` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_request_staff`
--

INSERT INTO `add_request_staff` (`Reqs_ID`, `Name`, `Employee_Number`, `Department`, `Mobile_Number`, `Reporting_Manager`, `Location`, `TravelBy`, `NoOfPasengers`, `DropPickup`, `Req_From`, `Req_To`, `Depature`, `Time`, `Reason`) VALUES
(1, 'sunil', 92164, 'Front Office', 712893376, 'Item 1', 'colombo', 'Car', 2, 'Pickup', 'airport', '+tos+', 'Sat Sep 23 09:22:24 IST 2017', '2017-09-21 20:35:35', 'hotel habarakada'),
(2, 'sunil', 92164, 'Front Office', 712893376, 'Item 1', 'colombo', 'Car', 2, 'Pickup', 'airport', '+tos+', 'Sat Sep 23 09:22:24 IST 2017', '2017-09-21 20:40:06', 'hotel habarakada'),
(3, 'sunil', 92164, 'Front Office', 712893376, 'Item 1', 'colombo', 'Car', 2, 'Pickup', 'airport', '+tos+', 'Sat Sep 23 09:22:24 IST 2017', '2017-09-21 21:22:05', 'hotel habarakada'),
(4, 'ddddddddddddddd', 92164, 'Front Office', 712893376, 'Item 1', 'test', 'Car', 2, 'Pickup', 'air', '+tos+', 'Sat Sep 23 09:22:24 IST 2017', '2017-09-22 03:52:29', 'hotel habarakada'),
(5, 'kumara', 9845, 'Human Resources', 712719963, 'Item 3', 'Hotel', 'Van', 7, 'Both', 'Homagama', 'ahangama', 'Fri Sep 29 23:48:21 IST 2017', '2017-09-23 18:18:36', 'ahangama'),
(6, 'upul', 9216, 'Front Office', 712719976, 'Item 1', 'ho', 'Car', 3, 'Both', 'hotl', 'homagama', 'Thu Sep 14 09:18:53 IST 2017', '2017-09-24 03:49:06', 'homagama');

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
-- Table structure for table `bar_stock`
--

CREATE TABLE `bar_stock` (
  `Stock_id` int(10) NOT NULL,
  `Product_name` varchar(20) NOT NULL,
  `Brand` varchar(20) NOT NULL,
  `Volume` int(10) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Pay_by` varchar(20) NOT NULL,
  `Price` int(10) NOT NULL,
  `Amount` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bar_stock`
--

INSERT INTO `bar_stock` (`Stock_id`, `Product_name`, `Brand`, `Volume`, `Quantity`, `Pay_by`, `Price`, `Amount`) VALUES
(5, 'rokland', 'vat69', 45, 22, 'Credit Card', 1400, 33600),
(2, 'rokland', 'vat9', 4, 2, 'Cash', 1200, 200),
(1, 'rokland', 'vat9', 4, 2, 'Cash', 121400, 200),
(6, 'rokland', 'vat9', 40, 24, 'Credit Card', 1400, 33600),
(5, 'rokland', 'vat69', 45, 22, 'Credit Card', 1400, 33600),
(8, 'Ricard', 'pastis', 44, 7, 'Cash', 2400, 7200),
(10, 'Ricard', 'pastis & marsfil', 49, 2, 'Cheque', 2700, 5400),
(11, 'Ricard', 'pastis & marsfil', 49, 2, 'Cheque', 2700, 5400),
(12, 'Ricard', 'pastis & marsfil', 49, 2, 'Cheque', 2700, 5400),
(56, 'rfghg', 'uju', 55, 2, 'Credit Card', 2400, 4800),
(14, 'Ricard', 'pastis & marsfil', 49, 2, 'Cheque', 2700, 5400),
(356, 'Ricard', 'pastis', 44, 7, 'Cash', 2400, 7200);

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
-- Table structure for table `cleaning_items`
--

CREATE TABLE `cleaning_items` (
  `Item_Id` int(100) NOT NULL,
  `Item_Name` varchar(250) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Purchased_Date` date NOT NULL,
  `Vender` varchar(100) NOT NULL,
  `Price` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cleaning_items`
--

INSERT INTO `cleaning_items` (`Item_Id`, `Item_Name`, `Quantity`, `Purchased_Date`, `Vender`, `Price`) VALUES
(11, 'tile cleaners', 35, '2017-09-27', 'cleanol', 900),
(10, 'harpic', 45, '2017-09-03', 'lysol', 1000),
(9, 'vim', 50, '2017-09-03', 'cleanol', 1000),
(8, 'dish wash car', 50, '2017-09-07', 'lysol', 1050),
(12, 'mop', 5, '2017-09-07', 'lysol', 2000),
(13, 'bucket', 8, '2017-09-30', 'cleanol', 3000),
(14, 'bio clean', 9, '2017-09-12', 'lysol', 300),
(16, 'wonder light', 8, '2017-09-12', 'cleanol', 800),
(17, 'harpic', 5, '2017-09-01', 'cleanol', 450),
(18, 'dish wasg bar', 10, '2017-09-14', 'cleanol', 500);

-- --------------------------------------------------------

--
-- Table structure for table `cpayment`
--

CREATE TABLE `cpayment` (
  `Booking_ID` int(5) NOT NULL,
  `Customer_ID` int(5) NOT NULL,
  `Payment_ID` int(5) NOT NULL,
  `Total_Amount` int(7) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_ID` int(4) NOT NULL,
  `Booking_ID` int(11) NOT NULL,
  `Customer_name` varchar(20) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Contact_no` int(10) NOT NULL,
  `email` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_ID`, `Booking_ID`, `Customer_name`, `NIC`, `Contact_no`, `email`) VALUES
(2012, 2002, 'himali', '691216428V', 759778912, 'himali@gmail.com'),
(2010, 2001, 'keerthika', '987582658V', 777778912, 'keerthi@gmail.com'),
(1024, 1010, 'kamila', '778965429V', 116587596, 'kamila@gmail.com'),
(1022, 1009, 'cheshan', '942546859V', 759078912, 'cheshan@gmail.com'),
(1020, 1008, 'yasas', '568521025V', 114569852, 'yasas@gmail.com'),
(1018, 1007, 'chathura', '856240236V', 118654826, 'chathura@yahoo.com'),
(1012, 1006, 'lahiru', '658942583V', 115364852, 'lahiru@yahoo.com'),
(1006, 1005, 'isuru', '658754635V', 778965482, 'isuru@yahoo.com'),
(1007, 1004, 'Tharaka', '897525426V', 116856982, 'tharaka@yahoo.com'),
(1004, 1003, 'Prabash', '946523583V', 115698526, 'prabash@yahoo.com'),
(1003, 1002, 'Samintha', '956320106V', 112365879, 'Sami@gmail.com'),
(1002, 1001, 'Oshitha', '943510806V', 752037737, 'oshithar@gmail.com'),
(2016, 2003, 'mahendra', '964520108V', 755024244, 'mlr@gmail.com'),
(2018, 2004, 'sampath', '886585629V', 777778915, 'sam@gmail.com'),
(2022, 2005, 'nirosha', '886585629V', 382237735, 'niro@gmail.com'),
(2024, 2006, 'ajith', '786512950V', 382234432, 'ajith@gmail.com'),
(2026, 2006, 'upeksha', '956816280V', 118945365, 'upeksha@gmail.com'),
(2020, 2012, 'thilini', '756980156v', 115698753, 'thilini@gmail.com'),
(2025, 2016, 'upeksha', '756982549v', 772681358, 'upekshai@gmail.com'),
(2027, 2018, 'dinaya', '146982654v', 114658264, 'dina@gmail.com'),
(234, 123, 'Oshithaaa', '951236547V', 712387754, '951236547V'),
(5656, 8585, 'tharaka', '256589635V', 112654789, 'thara@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `cus_payment`
--

CREATE TABLE `cus_payment` (
  `Booking_ID` int(5) NOT NULL,
  `Customer_ID` int(5) NOT NULL,
  `Payment_ID` int(5) NOT NULL,
  `Total_Amount` int(7) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `Did` int(11) NOT NULL,
  `First_Name` varchar(40) NOT NULL,
  `Last_Name` varchar(40) NOT NULL,
  `Birthday` date NOT NULL,
  `Nic` char(10) NOT NULL,
  `Date_of_Join` date NOT NULL,
  `Date_of_leave` date NOT NULL,
  `Last_Modified_date` date NOT NULL,
  `Mobile_Number` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`Did`, `First_Name`, `Last_Name`, `Birthday`, `Nic`, `Date_of_Join`, `Date_of_leave`, `Last_Modified_date`, `Mobile_Number`) VALUES
(1, 'kamal', 'gamage', '1982-02-01', '826723547V', '2017-09-01', '2017-09-14', '2017-09-21', 0),
(7, 'test', 'test', '2017-09-12', '', '1993-12-07', '2017-09-24', '2017-09-24', 712719963),
(4, 'isuru', 'pathum', '1993-12-07', '933420329V', '2017-09-01', '2017-09-30', '2017-09-30', 712719963),
(6, 'sunil', 'perera', '2017-09-13', '933420328V', '2017-09-01', '2017-09-22', '2017-09-21', 823289983),
(9, 'test', 'test', '2017-09-12', '', '1993-12-07', '2017-09-24', '2017-09-24', 712719963),
(10, 'test', 'testtt', '1993-08-10', '877676767v', '2017-09-05', '2017-09-15', '2017-09-22', 712719986),
(11, 'tesst j', 'csdfsdf', '2017-09-07', '897638437V', '2017-09-20', '2017-09-14', '2017-09-21', 712719963),
(16, 'fwfw', 'cdf', '2017-09-13', '676539324V', '2017-09-14', '2017-09-21', '2017-09-13', 714567784),
(12, 'test pvdfvdfvfdv', 'test p', '1985-07-09', '', '2017-09-08', '2017-09-15', '2017-09-22', 713457768),
(13, 'fwfw', 'cdf', '2017-09-13', '676539324V', '2017-09-14', '2017-09-21', '2017-09-13', 714567784),
(14, 'test pvdfvdfvfdv', 'test p', '1985-07-09', '', '2017-09-08', '2017-09-15', '2017-09-22', 713457768),
(15, 'test pvdfvdfvfdv', 'test p', '1985-07-09', '', '2017-09-08', '2017-09-15', '2017-09-22', 713457768);

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
-- Table structure for table `event_bill`
--

CREATE TABLE `event_bill` (
  `Billno` varchar(5) NOT NULL,
  `eventId` varchar(5) NOT NULL,
  `date` date NOT NULL,
  `extracharge` double NOT NULL,
  `hotelcharge` double NOT NULL,
  `service_charge` double NOT NULL,
  `total` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event_bill`
--

INSERT INTO `event_bill` (`Billno`, `eventId`, `date`, `extracharge`, `hotelcharge`, `service_charge`, `total`) VALUES
('b012', 'e220', '2017-08-16', 25000, 30000, 3000, 58000),
('b088', 'e330', '2017-09-10', 4000, 10000, 1000, 15000),
('b084', 'e150', '2017-09-02', 8000, 15000, 1500, 24000),
('b0121', 'e147', '2017-09-14', 50000, 100000, 2000, 160000);

-- --------------------------------------------------------

--
-- Table structure for table `event_client`
--

CREATE TABLE `event_client` (
  `ClientID` int(11) NOT NULL,
  `ClientName` varchar(50) NOT NULL,
  `ClientNIC` varchar(10) NOT NULL,
  `Email` varchar(40) NOT NULL,
  `Phonenumber` int(11) NOT NULL,
  `Date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event_client`
--

INSERT INTO `event_client` (`ClientID`, `ClientName`, `ClientNIC`, `Email`, `Phonenumber`, `Date`) VALUES
(19, 'chathura ranasinghe', '941520687v', 'chathurz@gmail.com', 362258963, '2017-07-28'),
(17, 'sadun bandara', '801520597V', 'sadun80@gmail.com', 361158937, '2017-07-31'),
(20, 'damitha thennakon', '904560571v', 'damitha@gmail.com', 713084680, '2017-08-02'),
(21, 'Anjelo kenadi', '751520578V', 'Anroc88@gmail.com', 362269931, '2017-08-03'),
(22, 'Akila lakmal', '811520593V', 'Akila81@gmail.com', 773081371, '2017-08-05'),
(23, 'pawani malika', '872520567V', 'pawani87dd@gmail.com', 723084790, '2017-08-07'),
(24, 'Hiranthi heshala', '911520597V', 'hira7@gmail.com', 753081680, '2017-08-19'),
(25, 'samith somiwardane', '902520592V', 'samith22@gmail.com', 115891630, '2017-08-20'),
(27, 'lahiru prabash', '914520987V', 'lahiru885@gmail.com', 773078900, '2017-09-05'),
(28, 'surath', '931520598V', 'surath@gmail.com', 773071580, '2017-09-19');

-- --------------------------------------------------------

--
-- Table structure for table `event_event`
--

CREATE TABLE `event_event` (
  `event_Id` varchar(5) NOT NULL,
  `event_type` varchar(8) NOT NULL,
  `date` date NOT NULL,
  `pax` int(11) NOT NULL,
  `cost` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event_event`
--

INSERT INTO `event_event` (`event_Id`, `event_type`, `date`, `pax`, `cost`) VALUES
('e123', 'Indoor', '2017-08-25', 25, 8500),
('e207', 'Outdoor', '2017-08-10', 10, 3500),
('e221', 'Outdoor', '2017-08-12', 80, 25000),
('e345', 'Catering', '2017-08-23', 50, 18000),
('e177', 'Indoor', '2017-09-02', 10, 4000),
('e245', 'Outdoor', '2017-09-10', 10, 12000);

-- --------------------------------------------------------

--
-- Table structure for table `event_service`
--

CREATE TABLE `event_service` (
  `serviceId` varchar(5) NOT NULL,
  `eventId` varchar(5) NOT NULL,
  `tables` int(11) NOT NULL,
  `chairs` int(11) NOT NULL,
  `poruwa` varchar(10) NOT NULL,
  `music` varchar(20) NOT NULL,
  `cost_charg` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event_service`
--

INSERT INTO `event_service` (`serviceId`, `eventId`, `tables`, `chairs`, `poruwa`, `music`, `cost_charg`) VALUES
('s040', 'e253', 8, 80, 'Price', 'Type', 40000),
('s008', 'e221', 10, 100, 'Price', 'Type', 2500),
('s020', 'e112', 12, 120, '10 000', 'Full Band', 150000),
('s025', 'e202', 10, 80, 'Price', 'Type', 60000),
('s030', 'e124', 12, 120, '20 000', 'DJ', 200000),
('s055', 'e452', 15, 150, '15 000', 'Full Band', 220000);

-- --------------------------------------------------------

--
-- Table structure for table `fms_balance_sheet`
--

CREATE TABLE `fms_balance_sheet` (
  `Date` date NOT NULL,
  `RecType` varchar(25) NOT NULL,
  `Record` varchar(100) NOT NULL,
  `Value` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_balance_sheet`
--

INSERT INTO `fms_balance_sheet` (`Date`, `RecType`, `Record`, `Value`) VALUES
('2017-09-24', 'Current Assets', 'Cash', 32800),
('2017-09-24', 'Current Assets', 'Accounts Receivable', 300),
('2017-09-24', 'Current Assets', 'Prepaid Rent', 1000),
('2017-09-24', 'Long-Term Assets', 'Leasehold Improvements', 100000),
('2017-09-24', 'Current Liabilities', 'Accounts Payable', 49000),
('2017-09-24', 'Current Liabilities', 'Accrued Expenses', 450),
('2017-09-24', 'Owners Equity', 'Common Stock', 10000),
('2017-09-24', 'Current Assets', 'Inventory', 39800),
('2017-09-24', 'Long-Term Assets', 'Accumulated Depreciation', -2000),
('2017-09-24', 'Current Liabilities', 'Unearned Revenue', 1000),
('2017-09-24', 'Long-Term Liabilities', 'Longterm Liabilities', 99500),
('2017-09-24', 'Owners Equity', 'Retained Earnings', 11950),
('2017-09-24', 'Current Assets', 'Total Current Assets', 45000);

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
('2017-09-24', 'Year', 'Operating Activities', 'Cash Paid to Employees', 10500);

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
('2017-09-24', 'BMD-1', 'Soft Drinks-September', 55000, 5000, 0, 50000),
('2017-09-24', 'BMD-2', 'Liquor Drinks-September', 98750, 18750, 0, 80000),
('2017-09-24', 'FMD-8', '', 5900, 590, 1000, 5490),
('2017-09-01', 'FMD001', '', 25000, 0, 0, 25000),
('2017-09-24', 'RMD-1', 'Food Items-September', 125800, 25800, 0, 100000),
('2017-09-24', 'RMD-2', 'Decert Items-September', 36900, 0, 0, 36900);

-- --------------------------------------------------------

--
-- Table structure for table `fms_income_statement`
--

CREATE TABLE `fms_income_statement` (
  `Date` date NOT NULL,
  `Period` varchar(25) NOT NULL,
  `RecType` varchar(50) NOT NULL,
  `Record` varchar(100) NOT NULL,
  `Value` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_income_statement`
--

INSERT INTO `fms_income_statement` (`Date`, `Period`, `RecType`, `Record`, `Value`) VALUES
('2017-09-24', 'Month', 'Revenue', 'Gross Sales', 255000),
('2017-09-24', 'Year', 'Revenue', 'Gross Sales', 2576900),
('2017-09-24', 'Year', 'Revenue', 'Less:Sales Returns and Allowences', -76900),
('2017-09-24', 'Year', 'Cost Of Goods/Services Sold', 'Begining Inventory', 57000),
('2017-09-24', 'Year', 'Expenses', 'Advertising', 25990),
('2017-09-24', 'Year', 'Other Income', 'Interest Income', 103540),
('2017-09-24', 'Year', 'Cost Of Goods/Services Sold', 'Add: Purchases', 3000),
('2017-09-24', 'Year', 'Expenses', 'Bank Charges', 5000),
('2017-09-24', 'Year', 'Expenses', 'Commisions', 12550);

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
  `Paytax` double NOT NULL,
  `Discount` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_payments`
--

INSERT INTO `fms_payments` (`Date`, `RepNo`, `PayTo`, `PayFor`, `PayFrom`, `Rs`, `PayBy`, `Subtotal`, `Paytax`, `Discount`, `Total`) VALUES
('2017-09-24', 'FMD-1', 'Dialog Axiata PLC', 'Dilog 4G Bill-September', 'Finance Department', 'Five thousand nine hundred', 'Cash', 5900, 0, 0, 5900),
('2017-09-24', 'FMD-2', 'Dialog Axiata PLC', 'Dilog TV Bill-September', 'Finance Department', 'Ten thousand nine hundred', 'Cash', 10900, 0, 0, 10900),
('2017-09-24', 'FMD-3', 'Electricity Board', 'Electricity Bill-September', 'Finance Department', 'Twenty five thousand five hundred', 'Cash', 25500, 1275, 0, 26775),
('2017-09-24', 'FMD-4', 'Water Board', 'Water Bill-September', 'Finance Department', 'Fifteen thousand ninty nine', 'Cash', 15099, 754.95, 0, 15853.95),
('2017-09-20', 'FMD-6', 'Dialog Axiata PLC', 'Dialog 4G Bill-September	', 'Finance Department', 'Ten thousand nine hundred only', 'Check', 10000, 1000, 100, 10900),
('2017-09-20', 'FMD-7', 'Sri Lanka Telecom', 'Telephone Bill-September', 'Finance Department', 'Five thousand five hundred ninty nine', 'Cash', 5599, 0, 0, 5599),
('2017-09-24', 'FMD-8', 'Dialog Axiata PLC', 'Dilog 4G Bill-Octomber', 'Finance Department', 'Five thousand nine hundred', 'Cash', 5900, 590, 1000, 5490),
('2017-09-27', 'FMD-9', 'fsdfsdf', 'assfsf', 'Finance Department', 'safasff', 'Cash', 5666, 566.6, 45, 6187.6);

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
  `SalesTax` double NOT NULL,
  `Discount` double NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `fms_receipts`
--

INSERT INTO `fms_receipts` (`Date`, `RepNo`, `RepType`, `Department`, `Sale`, `Payment`, `PayMethod`, `Subtotal`, `SalesTax`, `Discount`, `Total`) VALUES
('2017-09-24', 'BMD-1', 'Sale', 'Beverage Management', 'Soft Drinks-September', '', 'Cash', 55000, 5000, 0, 50000),
('2017-09-24', 'BMD-2', 'Sale', 'Beverage Management', 'Liquor Drinks-September', '', 'Cash', 98750, 18750, 0, 80000),
('2017-09-24', 'FMD-1', 'Payment', 'Finance Management', '', 'Dilog 4G Bill-September', 'Cash', 5900, 0, 0, 5900),
('2017-09-24', 'FMD-2', 'Payment', 'Finance Management', '', 'Dilog TV Bill-September', 'Cash', 10900, 0, 0, 10900),
('2017-09-24', 'FMD-3', 'Payment', 'Finance Management', '', 'Electricity Bill-September', 'Cash', 25500, 1275, 0, 26775),
('2017-09-24', 'FMD-4', 'Payment', 'Finance Management', '', 'Water Bill-September', 'Cash', 15099, 754.95, 0, 15853.95),
('2017-09-24', 'FMD-8', 'Payment', 'Finance Management', '', 'Dilog 4G Bill-Octomber', 'Cash', 5900, 590, 1000, 5490),
('2017-09-27', 'FMD-9', 'Payment', 'Finance Management', '', 'assfsf', 'Cash', 5666, 566.6, 45, 6187.6),
('2017-09-24', 'RMD-1', 'Sale', 'Restuarant Management', 'Food Items-September', '', 'Cash', 125800, 25800, 0, 100000),
('2017-09-24', 'RMD-2', 'Sale', 'Restuarant Management', 'Decert Items-September', '', 'Cash', 36900, 0, 0, 36900);

-- --------------------------------------------------------

--
-- Table structure for table `food_items`
--

CREATE TABLE `food_items` (
  `Food_Item_Id` int(5) NOT NULL,
  `Food_Name` varchar(100) NOT NULL,
  `Quantity` int(255) NOT NULL,
  `Unit` varchar(10) NOT NULL,
  `Vender` varchar(100) NOT NULL,
  `Purchased_Date` date NOT NULL,
  `Expiary_Date` date NOT NULL,
  `Price` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `food_items`
--

INSERT INTO `food_items` (`Food_Item_Id`, `Food_Name`, `Quantity`, `Unit`, `Vender`, `Purchased_Date`, `Expiary_Date`, `Price`) VALUES
(4, 'Ruhunu turmeric powder', 20, 'Liter', 'Bairaha', '2017-09-06', '2017-09-14', 5000),
(5, 'chicken Sosages', 30, 'Kilogram', 'Bairaha', '2017-09-07', '2017-09-16', 700),
(6, 'rice', 20, 'Kilogram', 'Edinborougt', '2017-09-04', '2017-09-22', 8000),
(7, 'Ruhunu Meat Curry Mix', 50, 'Gram', 'Ruhunu Foods', '2017-09-01', '2017-09-30', 5000),
(8, 'Ruhunu Meat Curry Mix', 80, 'Kilogram', 'Ruhunu Foods', '2017-07-03', '2017-09-01', 900),
(9, 'chicken Sosages', 40, 'Kilogram', 'Bairaha', '2017-05-01', '2017-09-13', 8000),
(11, 'Ruhunu Coriander Seed', 500, 'Gram', 'Edinborougt', '2017-09-06', '2017-09-28', 500),
(12, 'Ruhunu Coriander Seed', 70, 'Kilogram', 'Bairaha', '2017-09-07', '2017-09-22', 800),
(13, 'rice', 50, 'Kilogram', 'Bairaha', '2017-09-01', '2017-09-08', 700),
(14, 'rice', 50, 'Kilogram', 'Ruhunu Foods', '2017-09-01', '2017-09-30', 5000),
(15, 'rice', 50, 'Kilogram', 'Ruhunu Foods', '2017-09-01', '2017-09-30', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `hall`
--

CREATE TABLE `hall` (
  `Booking_ID` int(5) NOT NULL,
  `Customer_ID` int(5) NOT NULL,
  `Reserve_date` date NOT NULL,
  `Hall_no` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hall`
--

INSERT INTO `hall` (`Booking_ID`, `Customer_ID`, `Reserve_date`, `Hall_no`) VALUES
(1009, 1022, '2017-09-26', 'Ruby'),
(1008, 1020, '2017-09-30', 'Pearl'),
(1007, 1018, '2017-09-26', 'Ruby'),
(1006, 1012, '2017-09-28', 'Pearl'),
(1005, 1006, '2017-09-25', 'Ruby'),
(1004, 1007, '2017-09-27', 'Pearl'),
(1003, 1004, '2017-09-29', 'Ruby'),
(1002, 1003, '2017-09-27', 'Pearl'),
(1001, 1002, '2017-09-26', 'Ruby'),
(1010, 1024, '2017-09-25', 'Pearl');

-- --------------------------------------------------------

--
-- Table structure for table `hired`
--

CREATE TABLE `hired` (
  `HID` int(11) NOT NULL,
  `Hired_Driver_Name` varchar(40) NOT NULL,
  `Hired_Vehicle_Number` int(11) NOT NULL,
  `Start_Milage` double NOT NULL,
  `End_Milage` double NOT NULL,
  `Distance` double NOT NULL,
  `Cost_Per_KM` double NOT NULL,
  `Totall_Cost` double NOT NULL,
  `Hired_From` varchar(100) NOT NULL,
  `Hired_To` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
-- Table structure for table `invoice01`
--

CREATE TABLE `invoice01` (
  `inId` int(11) NOT NULL,
  `Bname` date NOT NULL,
  `tibrand` varchar(20) NOT NULL,
  `qphone` char(10) NOT NULL,
  `bpay` varchar(20) NOT NULL,
  `brprice` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `invoice01`
--

INSERT INTO `invoice01` (`inId`, `Bname`, `tibrand`, `qphone`, `bpay`, `brprice`) VALUES
(6, '2017-09-14', '6', '3', 'vat 9', 1200),
(4, '2017-09-14', '7', '8', 'vat89', 300),
(7, '2017-09-12', '4', '4', 'vodka', 4511),
(10, '2017-09-07', '7', '4', 'creamsoda', 100),
(1, '2017-09-12', '4', '10', 'vodka', 4511),
(45, '2017-09-13', '5', '7', 'vat69', 1900),
(2, '2017-09-18', '4.50', '6', 'lakshani', 1200),
(50, '2017-09-08', '3.20', '8', 'bj', 560),
(78, '2017-09-21', '10.20', '5', 'ghj', 1200),
(98, '2017-09-07', '10.20', '5', 'fhg', 1200);

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
-- Table structure for table `job_vacancy`
--

CREATE TABLE `job_vacancy` (
  `vcID` int(11) NOT NULL,
  `did` varchar(10) NOT NULL,
  `jobid` varchar(10) NOT NULL,
  `role` varchar(40) NOT NULL,
  `description` varchar(100) DEFAULT NULL,
  `experience` varchar(15) DEFAULT NULL,
  `noOfVacancies` int(11) DEFAULT '0',
  `startdate` date DEFAULT NULL,
  `enddate` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `kitchen_items`
--

CREATE TABLE `kitchen_items` (
  `Item_Id` int(100) NOT NULL,
  `Item_Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kitchen_items`
--

INSERT INTO `kitchen_items` (`Item_Id`, `Item_Name`, `Quantity`) VALUES
(6, 'Chef’s knife', 5),
(7, 'Garlic press', 7),
(8, 'Grater', 7),
(9, 'Kitchen shears', 8),
(10, 'Lemon press', 3),
(11, 'Microplane grater', 4),
(12, 'Paring knife', 9),
(13, 'Potato masher', 4),
(14, 'Serrated bread knife', 9),
(15, 'Y-shaped vegetable peeler', 3),
(16, 'Can opener', 9),
(1, 'thh', 25),
(2, 'fkf', 58);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Admin_ID` varchar(20) NOT NULL,
  `UserName` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Admin_ID`, `UserName`, `Password`) VALUES
('Amin1', 'ad100', '123');

-- --------------------------------------------------------

--
-- Table structure for table `main1`
--

CREATE TABLE `main1` (
  `Stock_Id` int(10) NOT NULL,
  `Product_Name` varchar(20) NOT NULL,
  `Brand` varchar(20) NOT NULL,
  `Volume` int(10) NOT NULL,
  `Quantity` int(20) NOT NULL,
  `Total_Count` int(10) NOT NULL,
  `Total_Stock` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `order_table`
--

CREATE TABLE `order_table` (
  `company` varchar(20) NOT NULL,
  `brand` varchar(20) NOT NULL,
  `quantity` int(10) NOT NULL,
  `date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_table`
--

INSERT INTO `order_table` (`company`, `brand`, `quantity`, `date`) VALUES
('maliban', 'alco', 5, '2017-09-13'),
('munchee', 'meepen i', 4, '2017-09-06'),
('choco', 'apple', 8, '2017-09-13'),
('asd', 'assd', 6, '2017-09-14'),
('hf', 'juh', 6, '2017-09-14'),
('jgh', 'hj', 1, '2017-09-11'),
('dfg', 'eera', 66, '2017-09-19'),
('aa', 'aa', 5, '2017-09-21');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `Payment_Id` int(100) NOT NULL,
  `Company` varchar(100) NOT NULL,
  `Item_Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Unit` varchar(10) NOT NULL,
  `Payment_Date` date NOT NULL,
  `Price` float NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`Payment_Id`, `Company`, `Item_Name`, `Quantity`, `Unit`, `Payment_Date`, `Price`) VALUES
(5, 'Edingbarough', 'Edingbarough', 20, 'liter', '2017-09-05', 5000),
(4, 'Bairaha', 'chiken', 10, 'Kilograms', '2017-09-09', 4000),
(6, 'Ruhunu foods', 'Ruhunu Coriander Seed', 20, 'Grams', '2017-09-07', 5562),
(7, 'Ruhunu foods', 'Ruhunu Cardomum', 80, 'Grams', '2017-09-09', 890),
(8, 'Bairaha', 'chicken Sosages', 80, 'Grams', '2017-09-12', 4000),
(9, 'Araliya', 'rice', 80, 'Kilograms', '2017-09-22', 7000),
(10, 'Ruhunu foods', 'Ruhunu Black peper powder', 80, 'Grams', '2017-09-22', 2000),
(11, 'Ruhunu foods', 'Ruhunu Roasted chili powder', 80, 'Grams', '2017-09-22', 2000),
(12, 'Araliya', 'rice', 80, 'Kilograms', '2017-09-22', 7000),
(13, 'Ruhunu foods', 'Ruhunu Coriander Seed', 20, 'Grams', '2017-09-07', 5562),
(15, 'Ruhunu foods', 'Ruhunu turmeric powder', 60, 'Kilograms', '2017-09-07', 890),
(16, 'Ruhunu foods', 'Ruhunu chilie powder', 60, 'Kilograms', '2017-09-07', 890);

-- --------------------------------------------------------

--
-- Table structure for table `pending_orders`
--

CREATE TABLE `pending_orders` (
  `Order_Id` int(100) NOT NULL,
  `Item_Name` varchar(100) NOT NULL,
  `Quantity` int(100) NOT NULL,
  `Unit` varchar(10) NOT NULL,
  `Company` varchar(100) NOT NULL,
  `Order_Date` date NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pending_orders`
--

INSERT INTO `pending_orders` (`Order_Id`, `Item_Name`, `Quantity`, `Unit`, `Company`, `Order_Date`) VALUES
(15, 'Ruhunu Meat Curry Mix', 50, 'Kilograms', 'Ruhunu Foods', '2017-09-07'),
(14, 'rice', 50, 'Kilograms', 'Ruhunu Foods', '2017-09-13'),
(13, 'Ruhunu Cardomum', 45, 'Kilograms', 'Ruhunu Foods', '2017-09-05'),
(12, 'chiken', 20, 'Kilograms', 'Bairaha', '2017-09-06'),
(11, 'tomato source', 50, 'Liter', 'Edingbough', '2017-09-08'),
(16, 'Ruhunu Coriander Seed', 70, 'Kilograms', 'Ruhunu Foods', '2017-09-13'),
(17, 'Ruhunu Coriander Seed', 80, 'Kilograms', 'Ruhunu Foods', '2017-09-04'),
(18, 'Ruhunu turmeric powder', 40, 'Kilograms', 'Bairaha', '2017-09-07'),
(20, 'Ruhunu turmeric powder', 70, 'Kilograms', 'Bairaha', '2017-09-07');

-- --------------------------------------------------------

--
-- Table structure for table `repair`
--

CREATE TABLE `repair` (
  `RID` int(11) NOT NULL,
  `Request_User` varchar(40) NOT NULL,
  `Repair_Date` date NOT NULL,
  `Repair_Return_Date` date NOT NULL,
  `Repair_Cost` double NOT NULL,
  `Repair_Aditional_Cost` double NOT NULL,
  `Handover_User` varchar(40) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `repair`
--

INSERT INTO `repair` (`RID`, `Request_User`, `Repair_Date`, `Repair_Return_Date`, `Repair_Cost`, `Repair_Aditional_Cost`, `Handover_User`) VALUES
(1, 'isuru', '2017-09-08', '2017-09-15', 14567, 2345, 'nimal'),
(3, 'pathum', '2017-09-08', '2017-09-15', 123456, 123, 'pathum'),
(4, 'kamal', '2017-09-08', '2017-09-29', 34123, 0, 'kamal'),
(5, 'sudeera', '2017-09-01', '2017-09-26', 89000, 23000, 'kamal'),
(6, 'Nimantha', '2017-09-25', '2017-09-30', 23000, 2500, 'saman');

-- --------------------------------------------------------

--
-- Table structure for table `room`
--

CREATE TABLE `room` (
  `Booking_ID` int(5) NOT NULL,
  `Customer_ID` int(5) NOT NULL,
  `Check_In_Date` date NOT NULL,
  `Check_Out_Date` date NOT NULL,
  `Room_type` varchar(25) NOT NULL,
  `no_of_rooms` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room`
--

INSERT INTO `room` (`Booking_ID`, `Customer_ID`, `Check_In_Date`, `Check_Out_Date`, `Room_type`, `no_of_rooms`) VALUES
(2018, 2027, '2017-09-27', '2017-09-30', 'Family Room', 1),
(2016, 2025, '2017-09-25', '2017-09-28', 'Double Room', 2),
(2012, 2020, '2017-09-25', '2017-09-27', 'Triple Room', 2),
(2006, 2024, '2017-09-24', '2017-09-27', 'Family Room', 1),
(2005, 2022, '2017-09-28', '2017-09-29', 'Triple Room', 2),
(2004, 2018, '2017-09-27', '2017-09-30', 'Family Room', 1),
(2003, 2016, '2017-09-26', '2017-09-30', 'Triple Room', 1),
(2002, 2012, '2017-09-27', '2017-09-30', 'Double Room', 3),
(2001, 2010, '2017-09-26', '2017-09-28', 'Triple Room', 2);

-- --------------------------------------------------------

--
-- Table structure for table `room_items`
--

CREATE TABLE `room_items` (
  `Item_Id` int(100) NOT NULL,
  `Room_Number` int(100) NOT NULL,
  `Item_Name` varchar(100) NOT NULL,
  `Quantity` int(250) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `room_items`
--

INSERT INTO `room_items` (`Item_Id`, `Room_Number`, `Item_Name`, `Quantity`) VALUES
(8, 1, 'bed sheets', 2),
(7, 1, 'pillows', 3),
(9, 1, 'soap', 3),
(10, 2, 'soap', 3),
(11, 2, 'towel', 2),
(12, 2, 'tooth Brush', 2),
(13, 2, 'tooth paste', 3),
(14, 4, 'tooth brush', 2),
(15, 4, 'nets', 2),
(16, 4, 'beds', 2),
(17, 5, 'rugs', 2),
(18, 5, 'soap', 2),
(19, 5, 'slippers', 2),
(20, 7, 'soap', 5);

-- --------------------------------------------------------

--
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `salaryID` int(11) NOT NULL,
  `jobID` varchar(10) NOT NULL,
  `BasicSal_permonth` varchar(15) DEFAULT '0',
  `otRate_perhour` varchar(15) DEFAULT '0',
  `halfDay` varchar(15) DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`salaryID`, `jobID`, `BasicSal_permonth`, `otRate_perhour`, `halfDay`) VALUES
(1, 'hr000', '150000', '500', '1500'),
(2, 'hr001', '140000', '450', '1300'),
(3, 'hr002', '130000', '450', '1000'),
(4, 'hr003', '100000', '450', '1000'),
(5, 'hr004', '95000', '450', '900'),
(6, 'hr005', '80000', '450', '900'),
(7, 'hr006', '70000', '450', '800'),
(8, 'hr007', '60000', '450', '800'),
(10, 'hr008', '50000', '400', '800'),
(56, 'sd001', '69000', '250', '1100'),
(67, 'sd000', '75000', '400', '1300');

-- --------------------------------------------------------

--
-- Table structure for table `sal_payment`
--

CREATE TABLE `sal_payment` (
  `paymentID` int(11) NOT NULL,
  `empID` char(5) NOT NULL,
  `emp_name` varchar(75) NOT NULL,
  `jobid` varchar(10) NOT NULL,
  `TotalSal` varchar(20) DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sal_payment`
--

INSERT INTO `sal_payment` (`paymentID`, `empID`, `emp_name`, `jobid`, `TotalSal`) VALUES
(1, 'e0001', 'Prabas Gayadeeptha', 'hr001', '141291'),
(2, 'e0001', 'Prabas Gayadeeptha', 'hr001', '141315');

-- --------------------------------------------------------

--
-- Table structure for table `service`
--

CREATE TABLE `service` (
  `SID` int(11) NOT NULL,
  `Request_Date` date NOT NULL,
  `Request_User` varchar(40) NOT NULL,
  `Milage` double NOT NULL,
  `Service_Date` date NOT NULL,
  `Service_Cost` double NOT NULL,
  `Aditional_Cost` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `service`
--

INSERT INTO `service` (`SID`, `Request_Date`, `Request_User`, `Milage`, `Service_Date`, `Service_Cost`, `Aditional_Cost`) VALUES
(1, '2017-09-27', 'pathum', 23456, '2017-09-25', 23000, 200),
(2, '2017-09-26', 'kamal23456', 4567, '2017-09-29', 1500, 1500),
(3, '2017-09-26', 'dcsdsdfvsd', 4567, '2017-09-29', 1500, 1500),
(4, '2017-09-12', 'wishawa', 23, '2017-09-13', 1200, 4445),
(5, '2017-09-11', 'nimantha', 34567, '2017-09-20', 23456, 100);

-- --------------------------------------------------------

--
-- Table structure for table `trainer`
--

CREATE TABLE `trainer` (
  `trainerID` char(5) NOT NULL,
  `empID` char(5) NOT NULL,
  `programID` char(5) NOT NULL,
  `trainingProgram` varchar(50) NOT NULL,
  `startDate` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `training_program`
--

CREATE TABLE `training_program` (
  `prgID` char(5) NOT NULL,
  `prg_name` varchar(40) NOT NULL,
  `description` varchar(120) NOT NULL,
  `startdate` date DEFAULT NULL,
  `duration` varchar(15) DEFAULT NULL,
  `noOfTrainers` int(11) DEFAULT '0'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `userlog`
--

CREATE TABLE `userlog` (
  `userID` int(11) NOT NULL,
  `Emp_ID` char(5) NOT NULL,
  `emp_name` varchar(75) NOT NULL,
  `User_Name` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userlog`
--

INSERT INTO `userlog` (`userID`, `Emp_ID`, `emp_name`, `User_Name`, `Password`) VALUES
(1, 'e0001', 'Prabas Gayadeeptha', 'gayan', '1995'),
(5, 'e0003', 'Janith Erandha', '941450199V', '941450199V'),
(4, 'e0002', 'Tishakya Kulasinghe', 'tkule', '1994'),
(6, 'e0004', 'Isuru Pathum', '930280256V', '930280256V'),
(7, 'e0005', 'Chathura Jayawardhana', '923650456V', '923650456V'),
(8, 'e0006', 'Tharaka Wijesinghe', '920120111V', '920120111V');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `VID` int(11) NOT NULL,
  `Vehicle_Number` varchar(11) NOT NULL,
  `Model` varchar(40) NOT NULL,
  `Name` varchar(40) NOT NULL,
  `Number_ofseats` int(11) NOT NULL,
  `Joined_Date` date NOT NULL,
  `Milage_Now` double NOT NULL,
  `Milage_Then` double NOT NULL,
  `Milage_Balance` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`VID`, `Vehicle_Number`, `Model`, `Name`, `Number_ofseats`, `Joined_Date`, `Milage_Now`, `Milage_Then`, `Milage_Balance`) VALUES
(1, 'LH 4567', 'LORRY', 'TOYOTA', 3, '2017-09-01', 1200, 1260, 60),
(2, '2', '2', '2', 2, '2017-09-01', 2, 2, 2),
(3, 'NP 6789', 'CAR', 'HONDA', 5, '2015-06-10', 2789, 3124, 335),
(6, 'ABB 7689', 'MOTER BIKE', 'Bajaj', 2, '2017-09-24', 0, 0, 0),
(7, '7', '7', '7', 7, '2013-04-01', 7, 7, 7);

-- --------------------------------------------------------

--
-- Table structure for table `vender_details`
--

CREATE TABLE `vender_details` (
  `Vender_ID` int(100) NOT NULL,
  `Company` varchar(100) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `TPnumber` varchar(20) NOT NULL,
  `Email` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vender_details`
--

INSERT INTO `vender_details` (`Vender_ID`, `Company`, `Address`, `TPnumber`, `Email`) VALUES
(4, 'Araliya PVT LTD', '750/2,girithale,Anuradhapura', '0776283745', 'araliyapvt@gmail.com'),
(5, 'Ruhunu Foods PVT LTD', '750/2, Akuressa, Matara', '0770895632', 'ruhunufoods@gmail.com'),
(7, 'Edinbarough PVT LTD', '750/2, miriswatta, Colombo', '0372269789', 'bairaha@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_request_guest`
--
ALTER TABLE `add_request_guest`
  ADD PRIMARY KEY (`Reqg_ID`);

--
-- Indexes for table `add_request_staff`
--
ALTER TABLE `add_request_staff`
  ADD PRIMARY KEY (`Reqs_ID`);

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
-- Indexes for table `cleaning_items`
--
ALTER TABLE `cleaning_items`
  ADD PRIMARY KEY (`Item_Id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_ID`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`Did`);

--
-- Indexes for table `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`Did`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`Emp_ID`);

--
-- Indexes for table `event_bill`
--
ALTER TABLE `event_bill`
  ADD PRIMARY KEY (`Billno`);

--
-- Indexes for table `event_client`
--
ALTER TABLE `event_client`
  ADD PRIMARY KEY (`ClientID`);

--
-- Indexes for table `event_event`
--
ALTER TABLE `event_event`
  ADD PRIMARY KEY (`event_Id`);

--
-- Indexes for table `event_service`
--
ALTER TABLE `event_service`
  ADD PRIMARY KEY (`serviceId`);

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
-- Indexes for table `food_items`
--
ALTER TABLE `food_items`
  ADD PRIMARY KEY (`Food_Item_Id`);

--
-- Indexes for table `hall`
--
ALTER TABLE `hall`
  ADD PRIMARY KEY (`Booking_ID`);

--
-- Indexes for table `hired`
--
ALTER TABLE `hired`
  ADD PRIMARY KEY (`HID`);

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
-- Indexes for table `job_vacancy`
--
ALTER TABLE `job_vacancy`
  ADD PRIMARY KEY (`vcID`),
  ADD KEY `fk_did_vacancy` (`did`),
  ADD KEY `fk_jid_vacancy` (`jobid`);

--
-- Indexes for table `kitchen_items`
--
ALTER TABLE `kitchen_items`
  ADD PRIMARY KEY (`Item_Id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`Admin_ID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`Payment_Id`);

--
-- Indexes for table `pending_orders`
--
ALTER TABLE `pending_orders`
  ADD PRIMARY KEY (`Order_Id`);

--
-- Indexes for table `repair`
--
ALTER TABLE `repair`
  ADD PRIMARY KEY (`RID`);

--
-- Indexes for table `room_items`
--
ALTER TABLE `room_items`
  ADD PRIMARY KEY (`Item_Id`);

--
-- Indexes for table `salary`
--
ALTER TABLE `salary`
  ADD PRIMARY KEY (`salaryID`),
  ADD KEY `fk_jid_salary` (`jobID`);

--
-- Indexes for table `sal_payment`
--
ALTER TABLE `sal_payment`
  ADD PRIMARY KEY (`paymentID`),
  ADD KEY `fk_eid_salpay` (`empID`),
  ADD KEY `fk_jid_salpay` (`jobid`);

--
-- Indexes for table `service`
--
ALTER TABLE `service`
  ADD PRIMARY KEY (`SID`);

--
-- Indexes for table `trainer`
--
ALTER TABLE `trainer`
  ADD PRIMARY KEY (`trainerID`),
  ADD KEY `fk_eid_trainer` (`empID`),
  ADD KEY `fk_pid_trainer` (`programID`);

--
-- Indexes for table `training_program`
--
ALTER TABLE `training_program`
  ADD PRIMARY KEY (`prgID`);

--
-- Indexes for table `userlog`
--
ALTER TABLE `userlog`
  ADD PRIMARY KEY (`userID`),
  ADD KEY `fk_eid_userlog` (`Emp_ID`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`VID`);

--
-- Indexes for table `vender_details`
--
ALTER TABLE `vender_details`
  ADD PRIMARY KEY (`Vender_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_request_guest`
--
ALTER TABLE `add_request_guest`
  MODIFY `Reqg_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
--
-- AUTO_INCREMENT for table `add_request_staff`
--
ALTER TABLE `add_request_staff`
  MODIFY `Reqs_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `attendence`
--
ALTER TABLE `attendence`
  MODIFY `attID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=411;
--
-- AUTO_INCREMENT for table `cleaning_items`
--
ALTER TABLE `cleaning_items`
  MODIFY `Item_Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `driver`
--
ALTER TABLE `driver`
  MODIFY `Did` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `event_client`
--
ALTER TABLE `event_client`
  MODIFY `ClientID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
--
-- AUTO_INCREMENT for table `food_items`
--
ALTER TABLE `food_items`
  MODIFY `Food_Item_Id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
--
-- AUTO_INCREMENT for table `hired`
--
ALTER TABLE `hired`
  MODIFY `HID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `job_vacancy`
--
ALTER TABLE `job_vacancy`
  MODIFY `vcID` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `kitchen_items`
--
ALTER TABLE `kitchen_items`
  MODIFY `Item_Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `Payment_Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `pending_orders`
--
ALTER TABLE `pending_orders`
  MODIFY `Order_Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `repair`
--
ALTER TABLE `repair`
  MODIFY `RID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `room_items`
--
ALTER TABLE `room_items`
  MODIFY `Item_Id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;
--
-- AUTO_INCREMENT for table `salary`
--
ALTER TABLE `salary`
  MODIFY `salaryID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=68;
--
-- AUTO_INCREMENT for table `sal_payment`
--
ALTER TABLE `sal_payment`
  MODIFY `paymentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `service`
--
ALTER TABLE `service`
  MODIFY `SID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `userlog`
--
ALTER TABLE `userlog`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `VID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `vender_details`
--
ALTER TABLE `vender_details`
  MODIFY `Vender_ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
