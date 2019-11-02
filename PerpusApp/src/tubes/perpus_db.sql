-- ****************** SqlDBM: MySQL ******************;
-- ***************************************************;


-- ************************************** `user`

CREATE TABLE `user`
(
 `id`       int unsigned NOT NULL AUTO_INCREMENT ,
 `username` varchar(45) NOT NULL ,
 `password` varchar(128) NOT NULL ,
 `name` varchar(45) NOT NULL ,
PRIMARY KEY (`id`)
);






-- ************************************** `student`

CREATE TABLE `student`
(
 `id`    int unsigned NOT NULL AUTO_INCREMENT ,
 `name`  varchar(128) NOT NULL ,
 `nip`   int NOT NULL ,
 `class` varchar(45) NOT NULL ,
PRIMARY KEY (`id`)
);






-- ************************************** `status`

CREATE TABLE `status`
(
 `id`     int unsigned NOT NULL AUTO_INCREMENT ,
 `status` varchar(45) NOT NULL ,
PRIMARY KEY (`id`)
);






-- ************************************** `category`

CREATE TABLE `category`
(
 `id`       int unsigned NOT NULL AUTO_INCREMENT ,
 `category` varchar(64) NOT NULL ,
 `shelf`    varchar(45) NOT NULL ,
PRIMARY KEY (`id`)
);






-- ************************************** `book`

CREATE TABLE `book`
(
 `id`          int unsigned NOT NULL AUTO_INCREMENT ,
 `title`       varchar(256) NOT NULL ,
 `author`      varchar(128) NOT NULL ,
 `publisher`   varchar(128) NOT NULL ,
 `year`        int NOT NULL ,
 `category_id` int unsigned NOT NULL ,
 `status_id`   int unsigned NOT NULL ,
PRIMARY KEY (`id`),
KEY `fkIdx_34` (`category_id`),
CONSTRAINT `book_category_id_foreign` FOREIGN KEY `fkIdx_34` (`category_id`) REFERENCES `category` (`id`),
KEY `fkIdx_40` (`status_id`),
CONSTRAINT `book_status_id_foreign` FOREIGN KEY `fkIdx_40` (`status_id`) REFERENCES `status` (`id`)
);






-- ************************************** `circular`

CREATE TABLE `circular`
(
 `id`          int unsigned NOT NULL AUTO_INCREMENT ,
 `borrow_date` date NOT NULL ,
 `return_date` date NOT NULL ,
 `book_id`     int unsigned NOT NULL ,
 `student_id`  int unsigned NOT NULL ,
PRIMARY KEY (`id`),
KEY `fkIdx_37` (`book_id`),
CONSTRAINT `circular_book_id_foreign` FOREIGN KEY `fkIdx_37` (`book_id`) REFERENCES `book` (`id`),
KEY `fkIdx_43` (`student_id`),
CONSTRAINT `circular_student_id_foreign` FOREIGN KEY `fkIdx_43` (`student_id`) REFERENCES `student` (`id`)
);


-- insert to status & category

INSERT INTO `status` (`status`) VALUES ('Tersedia'), ('Dipinjam'), ('Hilang');

ALTER TABLE `user` ADD `name` VARCHAR(64) NOT NULL AFTER `id`;

INSERT INTO `user` (`id`, `name`, `username`, `password`) VALUES ('1', 'Administrator', 'admin', 'admin');
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  raray
 * Created: Nov 24, 2018
 */
INSERT INTO `category`(`id`, `category`, `shelf`) VALUES (1,"Umum","A"), (2,"IPS","B"), (3,"IPA","C"), (4,"Agama","D"), (5,"Teknologi","E"), (6,"Bahasa","F"), (7,"Matematika","G"), (8,"Seni","H"), (9,"Fiksi","i")
INSERT INTO `book`(`id`, `title`, `author`, `publisher`, `year`, `category_id`, `status_id`) 
VALUES 
("1","Agama Kelas 1","Khaludi Huslan","Tiga Serangkai","2010","4","1"),
("2","Mahir Berbahasa Indonesia Kelas 1b","Tukan","Erlangga","2013","6","1"),
("3","Kompetensi Berbahasa Indonesia XII","Tim Edukatif","Erlangga","2015","6","1"),
("4","Geografi Kelas X","Yani Ahmad","Grafindo","2016","2","1"),
("5","Geografi Kelas XI","Yani Ahmad","Grafindo","2016","2","1"),
("6","Geografi Kelas XII","Yulin Yulmadi","Erlangga","2013","2","1"),
("7","Matematika Kelas X","Sunardi","Tiga Serangkai","1999","7","1"),
("8","Matematika Kelas X","Sartono","Erlangga","2007","7","1"),
("9","Matematika Kelas 3A","Kurtanti","Esis","2015","7","1"),
("10","Kewarganegaraan Kelas X","Budiyanto","Erlangga","2016","1","1"),
("11","Kewarganegaraan Kelas X","Suardi Abu Bakar","Yudistira","2017","1","1"),
("12","Berkomputer Kelas X","Lia Kuswayatno","Grafindo","2013","5","1"),
("13","Sosiologi Kelas X","Idianto","Erlangga","2006","2","1"),
("14","Sosiologi Kelas XI","TIM","Yudistira","2013","2","1"),
("15","Sosiologi Kelas X","TIM","Yudistira","2013","2","1"),
("16","Biologi Kelas 1a Semester 1","Istamar Syamsuri","Erlangga","2006","3","1"),
("17","Biologi Kelas 1a Semester 1","Slamet Prawiro","Bumi Aksara","2004","3","1"),
("18","Biologi 1","Tati Suryati","Quadra","2007","3","1"),
("19","Fisika SMA 1A Semester 1","Kanginan, Marten","Erlangga","2013","3","1"),
("20","Fisika SMA 1B Semester 2","Kanginan, Marten","Erlangga","2013","3","1")

INSERT INTO `student`(`id`, `name`, `nip`, `class`) 
VALUES 
("1","Abdullah Habsyi","24997","XI MIPA-A"),
("2","Alif Rafli","25034","XI MIPA-A"),
("3","Almer Prabaswara Swardana","24998","XII MIPA-A"),
("4","Andreas Parasian","25178","X MIPA-A"),
("5","Antania Hanjani","25001","XII MIPA-A"),
("6","Beatrice Syafira","24969","XII MIPA-B"),
("7","Beryl Putra Sanjaya","24970","XII MIPA-B"),
("8","Keysha Selia Mughni","24943","X MIPA-B"),
("9","Klarissa Salma Puteri","25016","XI MIPA-B"),
("10","Muhamad Iqbal Sulthan Akbar","24946","XI MIPA-B"),
("11","Muhammad Daffa Rizki El-Islami","24980","XII MIPA-C"),
("12","Muhammad Faqih","25053","X MIPA-C"),
("13","Muhammad Faskal Ramadhan","25019","X MIPA-C"),
("14","Nazhif Sukma Aulia","24985","XI MIPA-C"),
("15","Olivyolanda Liani Sianturi","24986","XI MIPA-C"),
("16","Raisha Moira Shaqinna","25059","XI MIPA-D"),
("17","Rayhan Sentosa Setiawan","25061","XII MIPA-D"),
("18","Rizki Fauzi Suskhan","25027","X MIPA-D"),
("19","Samuel Mulatua Jeremy","25063","XI MIPA-D"),
("20","Shafira Aurelia","25066","XII MIPA-D"),
("21","Siti Hafsah Abdurachman","24991","X MIPA-D")




