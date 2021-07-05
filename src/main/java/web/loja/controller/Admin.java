package web.loja.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class Admin {

    @Autowired
    ServletContext servletContext;
    
    @PostMapping
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Bem vindo ao painel administrativo!");

        String cliente = (String) request.getAttribute("cliente");
        response.getWriter().println(cliente);
    }
}
