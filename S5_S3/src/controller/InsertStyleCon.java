package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Styles;

public class InsertStyleCon extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try{
            Styles [] style = new Styles().getAllStyles() ;
            req.setAttribute("style", style);
            RequestDispatcher dispatcher = req.getRequestDispatcher("ListeStyleContent.jsp");
            dispatcher.forward(req, resp);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
