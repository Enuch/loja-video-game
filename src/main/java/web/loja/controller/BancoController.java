package web.loja.controller;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import web.loja.dao.VideoGameDAO;
import web.loja.models.VideoGame;

@Controller
@RequestMapping("/config")
public class BancoController {
    
    @GetMapping
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException {
       
        var banco = new VideoGameDAO();
        var console = new VideoGame();
        

        try {
            banco.criar();

            console.setCodigo(3);
            console.setSerie(11);
            console.setNome("Playstation 5");
            console.setModelo("Slim");
            console.setEdicao("2020 war");
            console.setCor("Preto");

            banco.incluir(console);

            response.getWriter().append("Deu tudo certo!");
        } catch (Exception e) {
            response.getWriter().append("Deu tudo errado!");

        }



    }
}
