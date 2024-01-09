\c memble1 ;
CREATE TABLE Produit (
    idProduit SERIAL PRIMARY KEY,
    nomProduit VARCHAR(50) NOT NULL
);
CREATE TABLE Styles (
    idStyles SERIAL PRIMARY KEY,
    nomStyle VARCHAR(50) NOT NULL
);
CREATE TABLE unite(
    idunite SERIAL PRIMARY KEY, 
    unite VARCHAR(55) NOT NULL 
);
CREATE TABLE MatiersPremieres (
    idMatiers SERIAL PRIMARY KEY,
    nomMatiere VARCHAR(50) NOT NULL
);
CREATE TABLE MatiereStyle (
    idMatiereStyle SERIAL PRIMARY KEY,
    idMatiere INT,
    idStyle INT,
    FOREIGN KEY (idMatiere) REFERENCES MatiersPremieres(idMatiers),
    FOREIGN KEY (idStyle) REFERENCES Styles(idStyles)
);
CREATE TABLE Taille(
    idtaille SERIAL PRIMARY KEY ,
    nameTaille VARCHAR(55) not NULL
);
CREATE TABLE Fabrication (
    idFabrication SERIAL PRIMARY KEY,
    idCategorie INT,
    idStyle INT,
    Taille INT,
    FOREIGN KEY (Taille) REFERENCES Taille(idTaille),
    FOREIGN KEY (idCategorie) REFERENCES Produit(idProduit),
    FOREIGN KEY (idStyle) REFERENCES Styles(idStyles)
);

CREATE TABLE Formule (
    idFormule SERIAL PRIMARY KEY,
    idFabrication INT,
    idMatiere INT,
    Valeurs FLOAT,
    FOREIGN KEY (idMatiere) REFERENCES MatiersPremieres(idMatiers),
    FOREIGN KEY (idFabrication) REFERENCES Fabrication(idFabrication)
);

INSERT INTO Produit (nomProduit)
VALUES
    ('Chaise'),
    ('Etagere');

INSERT INTO Styles (nomStyle)
VALUES
    ('Royal'),
    ('Normal');

INSERT INTO MatiersPremieres (nomMatiere)
VALUES
    ('Bois de rose'),
    ('bombou');
-- 
INSERT INTO unite (unite) values ('KG') ,('M');
alter table MatiersPremieres add column unite int REFERENCES unite (idunite);
Update MatiersPremieres set unite = 1;

CREATE OR REPLACE VIEW donne  AS 
SELECT fabrication.idcategorie,
    fabrication.taille,
    fabrication.idstyle,
    formule.idmatiere,
    formule.valeurs
   FROM fabrication
     JOIN formule ON fabrication.idfabrication = formule.idfabrication;


CREATE OR REPLACE VIEW v_all_donnees  AS 
SELECT 
    produit.nomProduit , taille.nameTaille , styles.nomStyle , matierspremieres.nomMatiere ,  matierspremieres.idmatiers ,unite.unite , donne.valeurs FROM donne 
    JOIN produit  
        ON ( donne.idcategorie = produit.idproduit)
    JOIN taille 
        ON ( donne.taille = taille.idtaille) 
    JOIN styles 
        ON ( donne.idstyle = styles.idstyles) 
    JOIN matierspremieres 
        ON (donne.idmatiere = matierspremieres.idmatiers)
    JOIN unite 
        ON (matierspremieres.unite = unite.idunite);