package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.MatiersPremieres;

public class RechercherController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            MatiersPremieres [] matiersPremieres = new MatiersPremieres().getAllMatiersPremieres();
            req.setAttribute("matiere", matiersPremieres);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Recherche.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
