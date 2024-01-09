package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.MatiersPremieres;
import modele.Unite;

public class MatiereCon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            MatiersPremieres [] matieres = new MatiersPremieres().getAllMatiersPremieres();
            Unite [] allUnites = new Unite().getAllUnite();
            req.setAttribute("unite", allUnites);
            req.setAttribute("premiere", matieres);
            RequestDispatcher dispatcher = req.getRequestDispatcher("ListeMatiere.jsp") ;
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
