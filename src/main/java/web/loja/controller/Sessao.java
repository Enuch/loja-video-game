package web.loja.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Sessao")
public class Sessao {
    
    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        HttpSession session = request.getSession();
        var out = response.getWriter();
        var dataCriacao = new Date(session.getCreationTime());
        var formatData = new SimpleDateFormat("dd/MM/yyyy");

        out.println("ID: " + session.getId() + " Data:" + formatData.format(dataCriacao));
    }
}
