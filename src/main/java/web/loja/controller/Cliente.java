package web.loja.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class Cliente {
    
    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        response.getWriter().println("Você está sendo redirecionado para admin");

        request.setAttribute("cliente", "autorizado");
        
        //response.sendRedirect("/admin");

        RequestDispatcher dispatcher = request.getRequestDispatcher("/admin");
        dispatcher.forward(request, response);

    }

    @PostMapping
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        var login = request.getParameter("login");
        var password = request.getParameter("password");

        request.setAttribute("cliente", "autorizado");

        if (login.equals("enuch") && password.equals("12345")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/admin");
            dispatcher.forward(request, response);
        } else {
            response.sendRedirect("/");
        }

    }
}
