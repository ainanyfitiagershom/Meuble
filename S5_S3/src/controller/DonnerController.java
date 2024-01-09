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
public class DonnerController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String style = req.getParameter("style") ;
            int idStyle = Integer.valueOf(style) ;
            Styles styles = new Styles().getStyle(idStyle) ;
            System.out.println(styles.getNomStyle());
            List<MatiersPremieres> matiersPremieres = styles.getMatierpPremieres() ;
            System.out.println("matiere taille : " + matiersPremieres.size());
            req.setAttribute("listematiere", matiersPremieres);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Liste.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
