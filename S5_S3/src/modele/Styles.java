package modele;
import java.util.ArrayList;
import java.util.List;
import function.FonctionTest;
public class Styles {
    int idStyles;
    String nomStyle;
    public Styles(){
    }
    public Styles(String idStyles, String nomStyle) {
        setIdStyles(idStyles);
        setNomStyle(nomStyle);
    }
    public Styles(String nomStyle) throws Exception {
        if(!isExist(nomStyle)){
            this.nomStyle = nomStyle;
        }
        throw new Exception("Style is already exist");
    }
    public int getIdStyles() {
        return idStyles;
    }
    public void setIdStyles(String idStyles) {
        this.idStyles = Integer.valueOf(idStyles);
    }
    public String getNomStyle() {
        return nomStyle;
    }
    public void setNomStyle(String nomStyle) {
        this.nomStyle = nomStyle;
    }
    public boolean isExist(String nameStyle)throws Exception{
        Styles [] allstyles = getAllStyles();
        for (int i = 0; i < allstyles.length; i++) {
            if(allstyles[i].getNomStyle().compareToIgnoreCase(nameStyle) == 0){
                return true ;
            }
        }
        return false ;
    }   
    public Styles[] getAllStyles() throws Exception{
        FonctionTest function= new FonctionTest();
        Object[] valiny = function.getdonnees(this);
        Styles[] Stylee = new Styles[valiny.length];
        for (int i = 0; i < valiny.length; i++) {
            Stylee[i]=(Styles)valiny[i];
        }
        return Stylee;
    }
    public Styles getStyle(int idstyle) throws Exception{
        Styles [] styles = getAllStyles() ;
        for (int i = 0; i < styles.length; i++) {
            if(styles[i].getIdStyles() == idstyle){
                return styles[i];
            }
        }
        return null;
    }
    public List<MatiersPremieres> getMatierpPremieres(){
        List<MatiersPremieres> listlat = new ArrayList<>();
        try {
            MatiereStyle[] mm = new MatiereStyle().getAllMatiereStyle();   
            for (int i = 0; i < mm.length; i++) {
                if (mm[i].getIdStyle() == this.getIdStyles()) {
                    System.out.println("ato ooo");
                    MatiersPremieres mat = new MatiersPremieres().getNombyId(mm[i].getIdMatiere());
                    listlat.add(mat);
                }else{
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listlat;
    }
} 