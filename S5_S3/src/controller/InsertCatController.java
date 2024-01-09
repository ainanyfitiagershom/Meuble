package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import function.FonctionTest;
import modele.Produit;
public class InsertCatController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            String NomCat = req.getParameter("categorie");
            Produit nnn= new Produit(NomCat);
            FonctionTest ff = new FonctionTest();
            ff.insertObjet(nnn);
            resp.sendRedirect("myinsertion_produit");
        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("myinsertion_produit");
        }
    }
}
