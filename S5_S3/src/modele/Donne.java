package modele;
import java.util.ArrayList;
import java.util.List;

import function.FonctionTest;

public class Donne {
    int idCategorie;
    int taille;
    int idStyle;
    int idMatiere;
    Double valeurs;
    public Donne(String idCategorie, String taille, String idStyle, String idMatiere, String valeurs) {
        setIdCategorie(idCategorie);
        setTaille(taille);
        setIdStyle(idStyle);
        setIdMatiere(idMatiere);
        setValeurs(valeurs);
    }
    public Donne() {
    }
    public int getIdCategorie() {
        return idCategorie;
    }
    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }
    public void setIdCategorie(String idCategorie) {
        this.idCategorie = Integer.valueOf(idCategorie);
    }
    public int getTaille() {
        return taille;
    }
    public void setTaille(int taille) {
        this.taille = taille;
    }
    public void setTaille(String taille) {
        this.taille = Integer.valueOf(taille);
    }
    public int getIdStyle() {
        return idStyle;
    }
    public void setIdStyle(int idStyle) {
        this.idStyle = idStyle;
    }
    public void setIdStyle(String idStyle) {
        this.idStyle = Integer.valueOf(idStyle);
    }
    public int getIdMatiere() {
        return idMatiere;
    }
    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }
    public void setIdMatiere(String idMatiere) {
        this.idMatiere = Integer.valueOf(idMatiere);
    }
    public Double getValeurs() {
        return valeurs;
    }
    public void setValeurs(Double valeurs) {
        this.valeurs = valeurs;
    } 
    public void setValeurs(String valeurs) {
        this.valeurs = Double.valueOf(valeurs);
    } 

    public Donne[] getAlldonne() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        Donne[] donnee = new Donne[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            donnee[i]=(Donne)valiny[i];
        }
        return donnee;
    }
    public List<Donne> getAlldonneMat(int idmatiere)throws Exception{
        List <Donne> listlat = new ArrayList<>();
        try {
            Donne[] mm = new Donne().getAlldonne();   
            for (int i = 0; i < mm.length; i++) {
                if (mm[i].getIdMatiere() == idmatiere) {
                    listlat.add(mm[i]);
                }else{
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listlat;
    }
}