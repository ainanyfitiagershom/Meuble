package modele;

import function.FonctionTest;

public class MatiereStyle {
    int idMatiereStyle;
    int idMatiere;
    int idStyle;
    
    public MatiereStyle(){
    }
    
    public MatiereStyle(String idMatiereStyle,String idMatiere, String idStyle) {
        setIdMatiere(idMatiere);
        setIdStyle(idStyle);
        setIdMatiereStyle(idMatiereStyle);
    }

    public MatiereStyle(String idMatiere, String idStyle) throws Exception {
        if(!isExist(idStyle, idMatiere)){
            setIdMatiere(idMatiere);
            setIdStyle(idStyle);
        }else{
            throw new Exception("this Style have already  this matiere");
        }
    }
    public int getIdMatiereStyle() {
        return idMatiereStyle;
    }
    public void setIdMatiereStyle(String idMatiereStyle) {
        this.idMatiereStyle = Integer.valueOf(idMatiereStyle);
    }
    public int getIdMatiere() {
        return idMatiere;
    }
    public void setIdMatiere(String idMatiere) {
        this.idMatiere = Integer.valueOf(idMatiere);
    }
    public int getIdStyle() {
        return idStyle;
    }
    public void setIdStyle(String idStyle) {
        this.idStyle = Integer.valueOf(idStyle);
    }

    public MatiereStyle[] getAllMatiereStyle() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        MatiereStyle[] Stylee = new MatiereStyle[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            Stylee[i]=(MatiereStyle)valiny[i];
        }
        return Stylee;
    }
    public boolean isExist(String idstyle , String idmatiere)throws Exception{
        MatiereStyle [] allmatieres = getAllMatiereStyle() ;
        for (int i = 0; i < allmatieres.length; i++) {
            if((allmatieres[i].getIdStyle() == Integer.valueOf(idstyle)) && (allmatieres[i].getIdMatiere() == Integer.valueOf(idmatiere))){
                return true;
            }
        } 
        return false;
    }
}