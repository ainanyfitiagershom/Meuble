package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Donne;
import modele.V_all_donnees;

public class DetailsCon extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String idmatiere = req.getParameter("MatPer");
            int idma =  Integer.valueOf(idmatiere);
            req.setAttribute("detail", new V_all_donnees().getAlldonneMatiere(idma));
            RequestDispatcher dispatcher = req.getRequestDispatcher("Detail.jsp");
            dispatcher.forward(req, resp);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
