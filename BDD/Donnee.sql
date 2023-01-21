INSERT INTO public.clients
( nomclients, prenomclients, mdpclients, emailclients, budget, demande)
VALUES( 'Andrianantenaina', 'Sonia', '1234', 'soso@gmail.com', 1200000.0, 0);
INSERT INTO public.clients
( nomclients, prenomclients, mdpclients, emailclients, budget, demande)
VALUES( 'Randriantsito', 'Aina', '1234', 'aina@gmail.com', 2000000.0, 0);
INSERT INTO public.clients
( nomclients, prenomclients, mdpclients, emailclients, budget, demande)
VALUES( 'Dimby', 'Harimanitra', '1234', 'manitr@gmail.com', 500000.0, 0);
INSERT INTO public.clients
( nomclients, prenomclients, mdpclients, emailclients, budget, demande)
VALUES( 'Andonirina', 'Fanomezana', '1234', 'fanimezana@gmail.com', 5000000.0, 0);
INSERT INTO public.clients
( nomclients, prenomclients, mdpclients, emailclients, budget, demande)
VALUES( 'Rasoherina', 'Bazil', '1234', 'anje@gmail.com', 6000000.0, 0);

INSERT INTO public."admin"
( id,nom, email, mdp)
VALUES( 2,'Jeanne', 'jeanne@gmail.com', '1234567');

INSERT INTO public.categories
(id, nomcategor, dureenchere, pourcentage)
VALUES(1, 'Informatique', 12 , 15);
INSERT INTO public.categories
(id, nomcategor, dureenchere, pourcentage)
VALUES(2, 'Automobile',13 , 14);
INSERT INTO public.categories
(id, nomcategor, dureenchere, pourcentage)
VALUES(3, 'Machinerie', 24, 10);
INSERT INTO public.categories
(id, nomcategor, dureenchere, pourcentage)
VALUES(4, 'Batiment',48 , 15);

INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Ordinateur Portable', 1);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Sourie sans fil', 1);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Voiture de luxe', 2);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Camion', 2);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Tracteur', 3);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Machine a laver', 3);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Villa Basse', 4);
INSERT INTO public.typeproduit
( nomtypep, idcategories)
VALUES( 'Appartement', 4);

INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 1, 'Marque hp , core i5 11eme  , Ram 8 g ,hdd 128 gb ,windows 11', '//', 2000000.0, 0,1);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 2, 'bluetooth , avec dongle , peut se connecter avec un telephone', '//', 100000.0, 0,1);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 3, 'Rolls Royce Phantom 2019  , bonne occasion , 250 chv, moteur electrique ', '//', 90000000000, 0,2);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 4, 'Volvo , Camion de transport , Max 50 tonnes , 200 chv', '//', 20000000000, 0,3);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 5, 'JCB,120chv,Tacteur agricole', '//', 5000000000, 0,4);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 6, 'CLC , 120 V ,2000 Wh, Tres bonne qualite', '//', 1000000.0, 0,4);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 7, 'Villa Basse , Premiere plan , Avec piscine , 1sallon ,5 chambre , 1 cuisine', '//', 50000000, 0,5);
INSERT INTO public.produit
( idtypeproduit, descriptions, image, prixminimum, statut, idProprietaire)
VALUES( 8, 'Appartement dans un batiment, 4 chambres ,1salle de bain,1cuisine,1 toilette', '//', 20000000, 0,5);

INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(4, 8, 30000000, '2023-01-17', 1);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(2, 8, 22000000, '2023-01-17', 0);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(4, 8, 21000000, '2023-01-16', 0);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(5, 8, 20000000, '2023-01-16', 0);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(3, 1, 4000000.0, '2023-01-17', 1);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(1, 1, 2500000.0, '2023-01-17', 0);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(3, 1, 2000100.0, '2023-01-17', 0);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(1, 1, 2000000.0, '2023-01-17', 0);
INSERT INTO public.enchereproduit
(idclient, idproduit, offre, datet, statut)
VALUES(2, 2, 150000.0, '2023-01-17', 1);
