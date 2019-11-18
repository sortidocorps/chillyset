
/**
CREATE TABLE `SIMPLE_OBJECT` (
  `Id` BIGINT NOT NULL,
  `Name` NVARCHAR(45) NOT NULL,
  `CasualName` NVARCHAR(45),
  `Location` NVARCHAR(20)
);

CREATE TABLE `HUGE_OBJECT` (
  `Id` BIGINT NOT NULL,
  `Name` NVARCHAR(45) NOT NULL,
  `Comment` NVARCHAR(500)
);

*/
INSERT INTO SIMPLE_OBJECT VALUES (1, 'Apis Mellifera Mellifera', 'abeille noire', 'Europe');
INSERT INTO SIMPLE_OBJECT VALUES (2, 'Apis Mellifera Ligustica', 'abeille italienne', 'Italie');
INSERT INTO SIMPLE_OBJECT VALUES (3, 'Apis mellifera caucasica', 'abeille caucasienne', 'Europe');
INSERT INTO SIMPLE_OBJECT VALUES (4, 'Apis mellifera carnica', 'abeille carnolienne', 'Autriche');
INSERT INTO SIMPLE_OBJECT VALUES (5, 'Buckfast', 'abeille Buckfast', 'Angleterre');

/*
INSERT INTO HUGE_OBJECT VALUES (1, 'Ruche en paille', 'elle a la forme d’une voute, sans socle ni rayons, avec un trou par lequel les abeilles entrent et sortent de la ruche');
INSERT INTO HUGE_OBJECT VALUES (2, 'Ruche kenyane', 'modele de forme trapezoidale, inspire de la ruche traditionnelle grecque economique et facile a construire');
INSERT INTO HUGE_OBJECT VALUES (3, 'Ruche Dadant', 'son volume offre plus de de reserves pour les periodes d’hivernage. Sur notre boutique, voici un modele de ruche dadant');
INSERT INTO HUGE_OBJECT VALUES (4, 'Ruche Langstroth', 'un autre modele standard, tres prise par les apiculteurs. Sa conception tient compte du confort des abeilles et l’emplacement des cadres est ideal');
INSERT INTO HUGE_OBJECT VALUES (5, 'Ruche Layens', 'delaissee en France, mais encore presente en Espagne. C’est une ruche avec des hausses uniquement sur la longueur');
*/
