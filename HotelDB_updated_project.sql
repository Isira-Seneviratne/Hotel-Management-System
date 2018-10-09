-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 09, 2018 at 02:32 AM
-- Server version: 8.0.12
-- PHP Version: 7.2.10

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
-- Table structure for table `Cleaning_Items`
--

CREATE TABLE `Cleaning_Items` (
  `Item ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Item Name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Vendor ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Purchase Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Food_Items`
--

CREATE TABLE `Food_Items` (
  `Food ID` varchar(10) NOT NULL,
  `Food Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` float NOT NULL,
  `Vendor ID` varchar(10) NOT NULL,
  `Purchase Date` date NOT NULL,
  `Expiry Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Table structure for table `Kitchen_Items`
--

CREATE TABLE `Kitchen_Items` (
  `Item ID` varchar(10) NOT NULL,
  `Item Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

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
('E000000001', 'isira123', 'abcd1234', 'Yes');

-- --------------------------------------------------------

--
-- Table structure for table `Payments`
--

CREATE TABLE `Payments` (
  `Payment ID` varchar(10) NOT NULL,
  `Vendor ID` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Item ID` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Payment Date` date NOT NULL,
  `Price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Pending_Orders`
--

CREATE TABLE `Pending_Orders` (
  `Order ID` varchar(10) NOT NULL,
  `Item ID` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Unit` varchar(5) NOT NULL,
  `Vendor ID` varchar(10) NOT NULL,
  `Date of order` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Room_Items`
--

CREATE TABLE `Room_Items` (
  `Item ID` varchar(10) NOT NULL,
  `Item Name` varchar(100) NOT NULL,
  `Room Number` varchar(10) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `Vendor_Details`
--

CREATE TABLE `Vendor_Details` (
  `Vendor ID` varchar(10) NOT NULL,
  `Vendor Name` varchar(100) NOT NULL,
  `Address` varchar(150) NOT NULL,
  `Telephone Number` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Cleaning_Items`
--
ALTER TABLE `Cleaning_Items`
  ADD PRIMARY KEY (`Item ID`);

--
-- Indexes for table `Food_Items`
--
ALTER TABLE `Food_Items`
  ADD PRIMARY KEY (`Food ID`);

--
-- Indexes for table `Kitchen_Items`
--
ALTER TABLE `Kitchen_Items`
  ADD PRIMARY KEY (`Item ID`);

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`eID`);

--
-- Indexes for table `Payments`
--
ALTER TABLE `Payments`
  ADD PRIMARY KEY (`Payment ID`);

--
-- Indexes for table `Pending_Orders`
--
ALTER TABLE `Pending_Orders`
  ADD PRIMARY KEY (`Order ID`);

--
-- Indexes for table `Room_Items`
--
ALTER TABLE `Room_Items`
  ADD PRIMARY KEY (`Item ID`);

--
-- Indexes for table `Vendor_Details`
--
ALTER TABLE `Vendor_Details`
  ADD PRIMARY KEY (`Vendor ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
