package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.MatiersPremieres;
import modele.Styles;

public class GetFabricationMatiere extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String categorie = req.getParameter("categorie");
            String style = req.getParameter("styles");
            String tailles = req.getParameter("tailles");
            req.setAttribute("idtailles", tailles);
            req.setAttribute("idcategorie", categorie);
            req.setAttribute("idstyles", style);
            Styles styles = new Styles().getStyle( Integer.valueOf(style)) ;
            List<MatiersPremieres> matiersPremieres = styles.getMatierpPremieres() ;
            req.setAttribute("matieres", matiersPremieres);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Formule.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
