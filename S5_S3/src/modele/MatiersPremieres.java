package modele;

import function.FonctionTest;

public class MatiersPremieres {
    int idMatiers;
    String nomMatiere;
    int unite ;
    public MatiersPremieres(String nomMatiere, String unite) throws Exception {
        if(!isExist(nomMatiere)){
            this.nomMatiere = nomMatiere;
            setUnite(unite);
        }else{
            throw new Exception("Matiere premiere is already Exist");
        }
    }
    public MatiersPremieres(){}
    public MatiersPremieres(String idMatiers, String nomMatiere,String unite) {
        setIdMatiers(idMatiers);
        this.nomMatiere = nomMatiere;
        setUnite(unite);
    }
    public MatiersPremieres(String nomMatiere){
        this.nomMatiere = nomMatiere;
    }
    public int getIdMatiers() {
        return idMatiers;
    }
    public void setIdMatiers(String idMatiers) {
        this.idMatiers = Integer.valueOf(idMatiers);
    }
    public String getNomMatiere() {
        return nomMatiere;
    }
    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }
    public int getUnite() {
        return unite;
    }
    public void setUnite(String unite) {
        this.unite = Integer.valueOf(unite);
    }
    public MatiersPremieres[] getAllMatiersPremieres() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        MatiersPremieres[] Stylee = new MatiersPremieres[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            Stylee[i]=(MatiersPremieres)valiny[i];
        }
        return Stylee;
    }
    public MatiersPremieres getNombyId (int id) throws Exception{
        MatiersPremieres[] allMat = getAllMatiersPremieres();
        for (int i = 0; i < allMat.length; i++) {
            if (allMat[i].getIdMatiers()==id) {
                return allMat[i];
            }
        }
        return null;
    }
    public String getNameUnite()throws Exception{
        String name = new Unite().nameUnite(this.unite) ;
        return name;
    }
    public boolean isExist(String nameMatiere)throws Exception{
        MatiersPremieres [] allmatieres = getAllMatiersPremieres() ;
        for (int i = 0; i < allmatieres.length; i++) {
            if(allmatieres[i].getNomMatiere().compareToIgnoreCase(nameMatiere) == 0){
                return true ;
            }
        }
        return false ;
    }
}