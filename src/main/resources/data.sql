DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
	movie_id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	title VARCHAR(100),
	image VARCHAR(300),
	year INT(4)
);

INSERT INTO movies VALUES (1, 'Piraci z Krzemowej Doliny', 'http://1.fwcdn.pl/po/30/02/33002/6988507.6.jpg',2001);
INSERT INTO movies VALUES (2, 'Ja, robot', 'http://1.fwcdn.pl/po/54/92/95492/6918828.2.jpg',2004);
INSERT INTO movies VALUES (3, 'Kod nieśmiertelności', 'http://1.fwcdn.pl/po/89/67/418967/7485520.2.jpg',2004);
INSERT INTO movies VALUES (4, 'Ex Machina', 'http://1.fwcdn.pl/po/64/19/686419/7703095.2.jpg',2004);
INSERT INTO movies VALUES (5, 'Hakerzy', 'http://1.fwcdn.pl/po/59/98/5998/7209965.6.jpg',2004);
INSERT INTO movies VALUES (6, 'Tron', 'http://1.fwcdn.pl/po/12/03/11203/7708420.6.jpg',2005);
INSERT INTO movies VALUES (7, 'Tron: Dziedzictwo', 'http://1.fwcdn.pl/po/74/78/487478/7335687.2.jpg',2011);
