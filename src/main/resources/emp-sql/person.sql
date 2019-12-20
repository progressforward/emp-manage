USE emp_manage;

DROP TABLE IF EXISTS `emp_person`;
CREATE TABLE `emp_person` (
    `id` int NOT NULL AUTO_INCREMENT,
    `name` varchar(20),
    `birthday` date,
    `address` varchar(20),
    `phone` varchar(11),
    PRIMARY KEY(`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;