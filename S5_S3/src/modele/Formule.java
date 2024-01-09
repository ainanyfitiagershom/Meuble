package modele;

import function.FonctionTest;

public class Formule {
    int idFormule;
    int idFabrication;
    int idMatiere;
    int Valeurs;
    
    public Formule() {}
    public Formule(String idFabrication, String idMatiere, String valeurs) {
        setIdFabrication(idFabrication);
        setIdMatiere(idMatiere);
        setValeurs(valeurs);
    }
    public int getIdFormule() {
        return idFormule;
    }
    public void setIdFormule(int idFormule) {
        this.idFormule = idFormule;
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
    public int getIdMatiere() {
        return idMatiere;
    }
    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }
    public void setIdMatiere(String idMatiere) {
        this.idMatiere = Integer.parseInt(idMatiere);
    }
    public int getValeurs() {
        return Valeurs;
    }
    public void setValeurs(int valeurs) {
        Valeurs = valeurs;
    }
    public void setValeurs(String valeurs) {
        Valeurs = Integer.parseInt(valeurs);
    }
}