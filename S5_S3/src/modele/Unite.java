package modele;
import function.FonctionTest;
public class Unite {
    int idunite ;
    String unite ;
    public int getIdunite() {
        return idunite;
    }
    public void setIdunite(String idunite) {
        this.idunite = Integer.valueOf(idunite);
    }
    public String getUnite() {
        return unite;
    }
    public void setUnite(String unite) {
        this.unite = unite;
    }
    public Unite(){}
    public Unite(String idunite, String unite) {
        setIdunite(idunite);
        this.unite = unite;
    }
    public Unite[] getAllUnite() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        Unite[] Stylee = new Unite[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            Stylee[i]=(Unite)valiny[i];
        }
        return Stylee;
    }
    public String nameUnite(int id)throws Exception{
        Unite [] all = getAllUnite() ;
        for (int i = 0; i < all.length; i++) {
            if(all[i].idunite == id){
                return all[i].unite ;
            }
        }
        return "not found" ;
    }
}
