-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Oct 12, 2018 at 05:40 AM
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
-- Table structure for table `CleaningFoodItems_Vendors`
--

CREATE TABLE `CleaningFoodItems_Vendors` (
  `Item ID` varchar(10) NOT NULL,
  `Vendor ID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `CleaningFoodItems_Vendors`
--

INSERT INTO `CleaningFoodItems_Vendors` (`Item ID`, `Vendor ID`) VALUES
('C000000001', 'V000000001');

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

--
-- Dumping data for table `Cleaning_Items`
--

INSERT INTO `Cleaning_Items` (`Item ID`, `Item Name`, `Quantity`, `Price`, `Vendor ID`, `Purchase Date`) VALUES
('C000000001', 'Mop', 10, 500, 'V000000001', '2018-10-01'),
('C000000002', 'Broom', 100, 100, 'V000000001', '2018-10-01'),
('C000000003', 'Bucket', 55, 105.5, 'V000000001', '2018-10-01');

-- --------------------------------------------------------

--
-- Table structure for table `Food_Items`
--

CREATE TABLE `Food_Items` (
  `Food ID` varchar(10) NOT NULL,
  `Food Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Unit` varchar(2) NOT NULL,
  `Price` float NOT NULL,
  `Vendor ID` varchar(10) NOT NULL,
  `Purchase Date` date NOT NULL,
  `Expiry Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `Food_Items`
--

INSERT INTO `Food_Items` (`Food ID`, `Food Name`, `Quantity`, `Unit`, `Price`, `Vendor ID`, `Purchase Date`, `Expiry Date`) VALUES
('F000000001', 'Donut with Strawberry Icing', 100, 'kg', 50, 'V000000002', '2018-10-01', '2018-12-01');

-- --------------------------------------------------------

--
-- Table structure for table `Kitchen_Items`
--

CREATE TABLE `Kitchen_Items` (
  `Item ID` varchar(10) NOT NULL,
  `Item Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Kitchen_Items`
--

INSERT INTO `Kitchen_Items` (`Item ID`, `Item Name`, `Quantity`) VALUES
('K000000001', 'Non-stick frying pan', 10);

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

--
-- Dumping data for table `Payments`
--

INSERT INTO `Payments` (`Payment ID`, `Vendor ID`, `Item ID`, `Quantity`, `Payment Date`, `Price`) VALUES
('P000000001', 'V000000001', 'C000000001', 10, '2018-10-03', 5000);

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

--
-- Dumping data for table `Pending_Orders`
--

INSERT INTO `Pending_Orders` (`Order ID`, `Item ID`, `Quantity`, `Unit`, `Vendor ID`, `Date of order`) VALUES
('O000000001', 'C000000001', 10, 'None', 'V000000001', '2018-10-04');

-- --------------------------------------------------------

--
-- Table structure for table `Room_Items`
--

CREATE TABLE `Room_Items` (
  `Item ID` varchar(10) NOT NULL,
  `Item Name` varchar(100) NOT NULL,
  `Room Number` int(4) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Room_Items`
--

INSERT INTO `Room_Items` (`Item ID`, `Item Name`, `Room Number`, `Quantity`) VALUES
('R000000001', 'High-Definition Television (HDTV)', 123, 1);

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
-- Dumping data for table `Vendor_Details`
--

INSERT INTO `Vendor_Details` (`Vendor ID`, `Vendor Name`, `Address`, `Telephone Number`, `Email`) VALUES
('V000000001', 'Jonathan\'s Cleaning Supplies', '95/C, Baseline Road, Colombo', '0117234289', 'cleaningsupplies@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `CleaningFoodItems_Vendors`
--
ALTER TABLE `CleaningFoodItems_Vendors`
  ADD PRIMARY KEY (`Item ID`,`Vendor ID`);

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
