package modele;

import function.FonctionTest;

public class Taille {
    int idtaille ;
    String nameTaille ;
    public Taille(){}
    public Taille(String idtaille, String nameTaille) {
        setIdtaille(idtaille);
        this.nameTaille = nameTaille;
    }
    public int getIdtaille() {
        return idtaille;
    }
    public void setIdtaille(String idtaille) {
        this.idtaille = Integer.valueOf(idtaille);
    }
    public String getNameTaille() {
        return nameTaille;
    }
    public void setNameTaille(String nameTaille) {
        this.nameTaille = nameTaille;
    }
    public Taille [] getAllTaille()throws Exception{
        FonctionTest function = new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        Taille[] Stylee = new Taille[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            Stylee[i]=(Taille)valiny[i];
        }
        return Stylee;
    }
}
