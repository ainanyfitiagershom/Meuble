package modele;

import function.FonctionTest;

public class Fabrication {
    int idFabrication;
    int idCategorie;
    int idStyle;
    int Taille;
    
    public Fabrication(String idFabrication, String idCategorie, String idStyle, String taille) {
        setIdFabrication(idFabrication);
        setIdCategorie(idCategorie);
        setIdStyle(idStyle);
        setTaille(taille);
    }

    public Fabrication(String idCategorie, String idStyle, String taille) {
        setIdCategorie(idCategorie);
        setIdStyle(idStyle);
        setTaille(taille);
    }

    public Fabrication(){
    }

    public int getIdFabrication() {
        return idFabrication;
    }

    public void setIdFabrication(int idFabrication) {
        this.idFabrication = idFabrication;
    }

    public void setIdFabrication(String idFabrication) {
        this.idFabrication = Integer.parseInt(idFabrication);
    }


    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }
    
    public void setIdCategorie(String idCategorie) {
        this.idCategorie = Integer.parseInt(idCategorie);
    }

    public int getIdStyle() {
        return idStyle;
    }

    public void setIdStyle(int idStyle) {
        this.idStyle = idStyle;
    }

    public void setIdStyle(String idStyle) {
        this.idStyle = Integer.parseInt(idStyle);
    }


    public int getTaille() {
        return Taille;
    }

    public void setTaille(int taille) {
        Taille = taille;
    }

    public void setTaille(String taille) {
        Taille = Integer.parseInt(taille);
    }

    public Fabrication[] getAllFabrication() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        Fabrication[] Fab = new Fabrication[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            Fab[i]=(Fabrication)valiny[i];
        }
        return Fab;
    }
}