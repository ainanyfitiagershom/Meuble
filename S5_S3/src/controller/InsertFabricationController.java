package controller;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import function.FonctionTest;
import modele.Fabrication;
import modele.Formule;
import modele.Styles;
import modele.MatiersPremieres;


public class InsertFabricationController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            String idcategorie = req.getParameter("categorie");
            String idstyle = req.getParameter("style");
            String idtaille = req.getParameter("taille");
            Styles stylee = new Styles().getStyle(Integer.valueOf(idstyle));
            List <MatiersPremieres> allMatStyle = stylee.getMatierpPremieres();
            Fabrication fab= new Fabrication(idcategorie, idstyle, idtaille);
            FonctionTest ff = new FonctionTest();
            ff.insertObjet(fab);
            Fabrication[] allFab = fab.getAllFabrication();
            for (int i = 0; i < allMatStyle.size(); i++) { 
                System.out.println("matiere"+i);
                String idmatiere = req.getParameter("matiere"+i);
                String valeur = req.getParameter("valeur"+i);
                System.out.println(valeur);
                String dernierfab = String.valueOf(allFab[allFab.length-1].getIdFabrication());
                Formule form = new Formule(dernierfab, idmatiere, valeur);
                ff.insertObjet(form);
            }
            resp.sendRedirect("choixfab");
        } catch (Exception e) {
            resp.sendRedirect("choixfab");
            e.printStackTrace();
        }
    }
}
