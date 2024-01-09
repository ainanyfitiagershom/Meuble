package modele;
import java.util.ArrayList;
import java.util.List;
import function.FonctionTest;
public class V_all_donnees{
    String nomproduit ;
    public String getNomproduit() {
        return this.nomproduit ;
    }
    public void setNomproduit(String nomproduit) {
        this.nomproduit = nomproduit ;
    }
    String nametaille ;
    public String getNametaille() {
        return this.nametaille ;
    }
    public void setNametaille(String nametaille) {
        this.nametaille = nametaille ;
    }
    String nomstyle ;
    public String getNomstyle() {
        return this.nomstyle ;
    }
    public void setNomstyle(String nomstyle) {
        this.nomstyle = nomstyle ;
    }
    String nommatiere ;
    public String getNommatiere() {
        return this.nommatiere ;
    }
    public void setNommatiere(String nommatiere) {
        this.nommatiere = nommatiere ;
    }
    int idmatiers ;
    public int getIdmatiers() {
        return this.idmatiers ;
    }
    public void setIdmatiers(String idmatiers) {
        this.idmatiers =  Integer.valueOf(idmatiers);
    }
    String unite ;
    public String getUnite() {
        return this.unite ;
    }
    public void setUnite(String unite) {
        this.unite = unite ;
    }
    double valeurs ;
    public double getValeurs() {
        return this.valeurs ;
    }
    public void setValeurs(String valeurs) {
        this.valeurs =  Double.valueOf(valeurs)  ;
    }
    public V_all_donnees(){}
    public V_all_donnees(String nomproduit, String nametaille, String nomstyle, String nommatiere, String idmatiers,
            String unite, String valeurs) {
        this.nomproduit = nomproduit;
        this.nametaille = nametaille;
        this.nomstyle = nomstyle;
        this.nommatiere = nommatiere;
        setIdmatiers(idmatiers);
        this.unite = unite;
        setValeurs(valeurs);
    }
    public V_all_donnees[] getAlldonne() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        V_all_donnees[] donnee = new V_all_donnees[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            donnee[i]=(V_all_donnees)valiny[i];
        }
        return donnee;
    }
    public List<V_all_donnees> getAlldonneMatiere(int idmatiere)throws Exception{
        List <V_all_donnees> listlat = new ArrayList<>();
        try {
            V_all_donnees[] mm = new V_all_donnees().getAlldonne();   
            for (int i = 0; i < mm.length; i++) {
                if (mm[i].getIdmatiers() == idmatiere) {
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