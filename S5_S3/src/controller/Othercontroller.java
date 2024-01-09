package controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.MatiersPremieres;
import modele.Styles;
public class Othercontroller extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            Styles[] ss = new Styles().getAllStyles();
            MatiersPremieres[] mm = new MatiersPremieres().getAllMatiersPremieres();
            req.setAttribute("getStyle", ss);
            req.setAttribute("getMatierePremiere", mm);
        } catch (Exception e) {
        }
        RequestDispatcher dispat = req.getRequestDispatcher("Insertion.jsp");
        dispat.forward(req,resp);
    }
}
