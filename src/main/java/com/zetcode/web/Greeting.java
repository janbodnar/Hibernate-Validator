package com.zetcode.web;

import com.zetcode.bean.User;
import com.zetcode.util.DoValidate;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Greeting", urlPatterns = {"/Greet"})
public class Greeting extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");

        String page = "/hello.jsp";
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");

        User user = new User();
        user.setName(username);
        user.setEmail(email);

        List<String> errors = DoValidate.validate(user);

        if (!errors.isEmpty()) {

            request.setAttribute("errMsg", errors);

            page = "/valError.jsp";

        } else {

            request.setAttribute("user", user);
        }

        RequestDispatcher disp = getServletContext().getRequestDispatcher(page);
        disp.forward(request, response);
    }
}
