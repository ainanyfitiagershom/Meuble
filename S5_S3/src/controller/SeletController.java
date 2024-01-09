package controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Styles;
public class SeletController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        try {
            Styles[] ss = new Styles().getAllStyles();
            req.setAttribute("getStyle", ss);
        } catch (Exception e) {
        }
        RequestDispatcher dispat = req.getRequestDispatcher("selectStyle.jsp");
        dispat.forward(req,resp);
    }
}
