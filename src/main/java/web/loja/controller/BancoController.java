package web.loja.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.loja.dao.ConectaBanco;

@Controller
@RequestMapping("/banco")
public class BancoController {
    
    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException {

        Connection connection = null;

        try {
            connection = ConectaBanco.getConnection();
        } catch (SQLException e) {
            response.getWriter().append("Conexão falhou, check seu console");
        }

        if (connection != null) {
            response.getWriter().append("A conexão com o banco foi realizada!");
        } else {
            response.getWriter().append("A conexão com o banco falhou!");
        }

        try {
            assert connection != null;
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
