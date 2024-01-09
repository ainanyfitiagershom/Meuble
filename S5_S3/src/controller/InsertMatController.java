package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import function.FonctionTest;
import modele.MatiersPremieres;

public class InsertMatController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            String NomMat = req.getParameter("matiere");
            String unite = req.getParameter("unite");
            MatiersPremieres matiere= new MatiersPremieres(NomMat , unite);
            FonctionTest ff = new FonctionTest();
            ff.insertObjet(matiere);
            resp.sendRedirect("mat_p");
        } catch (Exception e) {
            resp.sendRedirect("mat_p");
            e.printStackTrace();
        }
    }
}