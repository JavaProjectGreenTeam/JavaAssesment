-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jun 15, 2015 at 12:05 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `findmycareer`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentTable` int(11) DEFAULT NULL,
  `parent` int(11) NOT NULL,
  `text` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `parentTable`, `parent`, `text`) VALUES
(1, 0, 1, 'businessCategory1'),
(2, 0, 1, 'businessCategory2'),
(3, 0, 2, 'creativeCategory1'),
(4, 0, 2, 'creativeCategory2'),
(5, 0, 3, 'healthCategory1'),
(6, 0, 3, 'healthCategory2'),
(7, 0, 4, 'communityCategory1'),
(8, 0, 4, 'communityCategory2'),
(9, 0, 1, 'Accounting'),
(10, 0, 1, 'Business'),
(11, 0, 1, 'Human Resources'),
(12, 0, 1, 'Information Technology'),
(13, 0, 1, 'Management'),
(14, 0, 1, 'Tourism & Hospitality');

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE IF NOT EXISTS `courses` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentTable` int(11) DEFAULT NULL,
  `parent` int(11) NOT NULL,
  `text` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`id`, `parentTable`, `parent`, `text`) VALUES
(1, 1, 1, 'businessCourse1'),
(2, 1, 2, 'businessCourse2'),
(3, 1, 3, 'creativeCourse1'),
(4, 1, 4, 'creativeCourse2'),
(5, 1, 5, 'healthCourse1'),
(6, 1, 6, 'healthCourse2'),
(7, 1, 7, 'communityCourse1'),
(8, 1, 8, 'communityCourse2'),
(9, 1, 12, 'Cert IV in IT'),
(10, 1, 12, 'Diploma of Software Development'),
(11, 1, 12, 'Diploma of Networking'),
(12, 2, 10, 'Articulation Pathway to Bachelor in IT');

-- --------------------------------------------------------

--
-- Table structure for table `industry`
--

CREATE TABLE IF NOT EXISTS `industry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentTable` int(11) DEFAULT NULL,
  `parent` int(11) DEFAULT NULL,
  `text` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `industry`
--

INSERT INTO `industry` (`id`, `parentTable`, `parent`, `text`) VALUES
(1, NULL, NULL, 'Business'),
(2, NULL, NULL, 'Creative Industries'),
(3, NULL, NULL, 'Health'),
(4, NULL, NULL, 'Community Services');

-- --------------------------------------------------------

--
-- Table structure for table `jobs`
--

CREATE TABLE IF NOT EXISTS `jobs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentTable` int(11) DEFAULT NULL,
  `parent` int(11) NOT NULL,
  `text` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=26 ;

--
-- Dumping data for table `jobs`
--

INSERT INTO `jobs` (`id`, `parentTable`, `parent`, `text`) VALUES
(1, 2, 1, 'Accountant'),
(2, 2, 1, 'Internal Auditor'),
(3, 2, 2, 'Systems Analyst'),
(4, 2, 2, 'Software Engineer'),
(5, 2, 3, 'Construction Project Manager'),
(6, 2, 3, 'Project Builder'),
(7, 2, 4, 'Chemical Engineer'),
(8, 2, 4, 'Geotechnical Engineering'),
(9, 2, 5, 'Medical Administrator'),
(10, 2, 5, 'Health Organisation Manager'),
(11, 2, 6, 'Medical Radiation Therapist'),
(12, 2, 6, 'Nuclear Medicine Technologist'),
(13, 2, 7, 'Child Care Centre Manager'),
(14, 2, 7, 'Welfare Centre Manager'),
(15, 2, 8, 'Primary School Teacher'),
(16, 2, 8, 'Special Needs Teacher'),
(17, 2, 9, 'Level 1 Help Desk Assisstant'),
(18, 2, 9, 'Network Support Technician'),
(19, 2, 9, 'Programming Support Role'),
(20, 2, 10, 'Trainee Application Programmer'),
(21, 2, 10, 'Trainee Business/System''s Analyst'),
(22, 2, 10, 'Web Developer'),
(23, 2, 10, 'Trainee Database Programmer'),
(24, 2, 10, 'Trainee Programming Tester'),
(25, 2, 10, 'Trainee Maintenance Programmer');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id` int(5) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `accountType` int(11) NOT NULL,
  `sex` int(11) NOT NULL,
  `state` int(11) NOT NULL,
  `town` varchar(40) NOT NULL,
  `dob` date NOT NULL,
  `lastLogin` date NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `userhistory`
--

CREATE TABLE IF NOT EXISTS `userhistory` (
  `userId` int(11) NOT NULL,
  `accessDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `accessPath` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userhistory`
--

INSERT INTO `userhistory` (`userId`, `accessDate`, `accessPath`) VALUES
(1, '2015-06-02 04:20:38', '1, 2, 3, 4, 5, 6'),
(2, '2015-06-02 04:20:38', '12, 13, 14, 15, 16');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
