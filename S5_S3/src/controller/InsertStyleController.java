package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import function.FonctionTest;
import modele.Styles;

public class InsertStyleController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            String NomStyle = req.getParameter("style");
            Styles nnn= new Styles(NomStyle);
            FonctionTest ff = new FonctionTest();
            ff.insertObjet(nnn);
            resp.sendRedirect("show_style");
        } catch (Exception e) {
            resp.sendRedirect("show_style");
            e.printStackTrace();
        }
    }
}
