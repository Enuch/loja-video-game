package web.loja.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adm")
public class AdmController {
    
    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Area administrativa");

        response.getWriter().println("<h1>olá</h1>");
    }

    @PostMapping
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.getWriter().println("Area administrativa");

        //RequestDispatcher dispatcher = request.getRequestDispatcher("/adm");
        //dispatcher.forward(request, response);

        response.sendRedirect("/cadastro.html");

    }
}
