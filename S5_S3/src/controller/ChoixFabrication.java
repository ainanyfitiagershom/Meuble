package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Produit;
import modele.Styles;
import modele.Taille;

public class ChoixFabrication  extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Produit [] produits = new Produit().getAllProduit() ;
            Styles [] styles = new Styles().getAllStyles();
            Taille [] tailles = new Taille().getAllTaille();
            req.setAttribute("produits", produits);
            req.setAttribute("styles", styles);
            req.setAttribute("tailles", tailles);
            RequestDispatcher dispatcher = req.getRequestDispatcher("Fabrication.jsp");
            dispatcher.forward(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
