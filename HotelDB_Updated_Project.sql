-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 14, 2018 at 07:15 AM
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
-- Table structure for table `Customer`
--

CREATE TABLE `Customer` (
  `Customer_ID` int(4) NOT NULL,
  `Booking_ID` int(11) NOT NULL,
  `Customer_name` varchar(20) NOT NULL,
  `NIC` varchar(10) NOT NULL,
  `Contact_no` int(10) NOT NULL,
  `email` varchar(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `Customer`
--

INSERT INTO `Customer` (`Customer_ID`, `Booking_ID`, `Customer_name`, `NIC`, `Contact_no`, `email`) VALUES
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
  `Unit` varchar(2) NOT NULL,
  `Price` float NOT NULL,
  `Vendor ID` varchar(10) NOT NULL,
  `Purchase Date` date NOT NULL,
  `Expiry Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

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
('K000000001', 'Non-stick frying pan', 10),
('K000000002', 'Microwave oven', 5);

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
('O000000001', 'C000000001', 'V000000001', 10, 'None', '2018-10-04');

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
('V000000001', 'Jonathan\'s Cleaning Supplies', '95/C, New Line Road, Colombo', '0117234289', 'cleaningsupplies@gmail.com'),
('V000000002', 'Bluebell Bakers', '227/A, Baseline Road, Colombo', '0118234453', 'bluebell@telecom.lk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Login`
--
ALTER TABLE `Login`
  ADD PRIMARY KEY (`eID`);

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
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
