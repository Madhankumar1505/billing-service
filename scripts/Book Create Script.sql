Book create Script Author : Madhan Kumar

CREATE TABLE `book` (
   `id` int(11) GENERATED ALWAYS AS (1) VIRTUAL,
   `title` varchar(100) DEFAULT NULL,
   `author` varchar(100) DEFAULT 'Null',
   `coverPhotoURL` varchar(100) DEFAULT NULL,
   `isbnNumber` bigint(100) DEFAULT NULL,
   `price` decimal(5,0) DEFAULT NULL,
   `language` varchar(100) DEFAULT NULL,
   `genre` varchar(100) DEFAULT NULL,
   `moddt` datetime DEFAULT NULL
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='This table should have the Book information.';