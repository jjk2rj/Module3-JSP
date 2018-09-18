package servlet;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;

public class SeminarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String url = "/index.html";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.jsp";    // the "join" page
        } 
        else if (action.equals("compute")) {
            // get parameters from the request
            String firstName = request.getParameter("name");

            // store data in User object
            User user = new User(firstName);

            // validate the parameters
            String message;
            if (firstName == null 
//            		|| lastName == null || email == null ||
//                firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                ) {
                message = "Please fill out all three text boxes.";
                url = "/index.jsp";
            } 
            else {
                message = null;
                url = "/result.jsp";
//                UserDB.insert(user);
            }
            request.setAttribute("user", user);
//            request.setAttribute("message", message);
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
}