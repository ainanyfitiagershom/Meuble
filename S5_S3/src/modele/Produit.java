package modele;

import function.FonctionTest;

public class Produit {
    int idProduit;
    String nomProduit;
    
    public Produit(){}
    public Produit(String idProduit, String nomProduit) {
        setIdProduit(idProduit);
        this.nomProduit = nomProduit;
    }
    public Produit(String nomProduit) throws Exception{
        if(!isExist(nomProduit)){
            this.nomProduit = nomProduit;
        }else{
            throw new Exception("categorie is exist") ;
        }
    }
    public int getIdProduit() {
        return idProduit;
    }
    public void setIdProduit(String idProduit) {
        this.idProduit =  Integer.valueOf(idProduit) ;
    } 
    public String getNomProduit() {
        return nomProduit;
    }
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    public Produit [] getAllProduit()throws Exception{
        FonctionTest fonction = new FonctionTest();
        Object[] valiny = fonction.getdonnees(this);
        Produit [] produits = new Produit[valiny.length];
        for (int i = 0; i < produits.length; i++) {
            produits[i] = (Produit)(Produit) valiny[i] ;
        }
        return produits ;
    }
    public boolean isExist(String nameCategorie)throws Exception{
        Produit [] allproduit = getAllProduit() ;
        for (int i = 0; i < allproduit.length; i++) {
            if(allproduit[i].getNomProduit().compareToIgnoreCase(nameCategorie) == 0){
                return true ;
            }
        }
        return false ;
    }
}