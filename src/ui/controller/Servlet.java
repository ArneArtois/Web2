
package ui.controller;

import model.domain.Eten;
import model.db.EtenDB;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    EtenDB db = new EtenDB();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String naam = request.getParameter("naam");
        String aantalStringregex= request.getParameter("aantal");
        String calorieStringregex= request.getParameter("calorie");
        String aantalString = aantalStringregex.replaceAll("[^0-9]","");
        String calorieString = calorieStringregex.replaceAll("[^0-9]","");

        if(!aantalString.trim().isEmpty() && !calorieString.trim().isEmpty()){
            int aantal = Integer.parseInt(aantalString);
            int calorie = Integer.parseInt(calorieString);
            if(!naam.trim().isEmpty() && aantal>=1 && calorie>=0) {

                Eten eten = new Eten(naam, aantal, calorie);
                db.addEten(eten);
                request.setAttribute("db", db.getEtenArrayList());
                request.setAttribute("berekening", db.berekening());
                RequestDispatcher view = request.getRequestDispatcher("overview.jsp");
                view.forward(request, response);
            }
        }
        else{
            RequestDispatcher view = request.getRequestDispatcher("add.jsp");
            view.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("db", db.getEtenArrayList());
        request.setAttribute("berekening",db.berekening());
        RequestDispatcher view = request.getRequestDispatcher("overview.jsp");
        view.forward(request, response);
    }
}
