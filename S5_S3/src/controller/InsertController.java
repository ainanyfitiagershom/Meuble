package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import function.FonctionTest;
import modele.MatiereStyle;
import modele.MatiersPremieres;
public class InsertController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            FonctionTest ff = new FonctionTest();
            String idstyle = req.getParameter("styles");
            MatiersPremieres [] matieres = new MatiersPremieres().getAllMatiersPremieres();
            for (int i = 0; i < matieres.length; i++) {
                if(req.getParameter("check"+i)!=null){
                    MatiereStyle nnn= new MatiereStyle(""+matieres[i].getIdMatiers(), idstyle);
                }
            }
            for (int i = 0; i < matieres.length; i++) {
                if(req.getParameter("check"+i)!=null){
                    MatiereStyle nnn= new MatiereStyle(""+matieres[i].getIdMatiers(), idstyle);
                    ff.insertObjet(nnn);
                }
            }
            resp.sendRedirect("Formulaire");
        } catch (Exception e) {
            resp.sendRedirect("Formulaire");
            e.printStackTrace();
        }
    }
}
