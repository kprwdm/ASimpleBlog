DROP TABLE IF EXISTS `configuration`;

CREATE TABLE `configuration` (
  `id` int NOT NULL,
  `blog_name` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `id` int NOT NULL,
  `display_name` varchar(45) DEFAULT NULL,
  `href` varchar(250) DEFAULT NULL,
  `is_parent` tinyint DEFAULT NULL,
  `parent_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `id` int NOT NULL AUTO_INCREMENT,
  `author` varchar(45) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `title` varchar(250) DEFAULT NULL,
  `content` longtext,
  `category` int DEFAULT NULL,
  PRIMARY KEY (`id`)
);