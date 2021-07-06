package web.loja.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import web.loja.dao.VideoGameDAO;
import web.loja.models.VideoGame;

@Controller
public class ProdutoController {
    public Integer cod = 0;
    
    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.POST)
    public void doCadastrar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        var banco = new VideoGameDAO();
        var videogame = new VideoGame();
        var codigo = banco.listar();

        for (int i = 0; i < codigo.size(); i++) {
            this.cod = i;
        }
        this.cod += 1;
        var serie = Integer.parseInt(request.getParameter("serie"));
        var nome = (String)request.getParameter("nome");
        var modelo = (String)request.getParameter("modelo");
        var edicao = (String)request.getParameter("edicao");
        var cor = (String)request.getParameter("cor");

        response.getWriter().println(this.cod);

        try {
            videogame.setCodigo(this.cod);
            videogame.setSerie(serie);
            videogame.setNome(nome);
            videogame.setModelo(modelo);
            videogame.setEdicao(edicao);
            videogame.setCor(cor);

            banco.incluir(videogame);

            response.getWriter().println("Produto cadastrado com sucesso");
        } catch (Exception e) {
            response.getWriter().println("Erro ao cadaastrar itens!!");
        }
        
    }

    @RequestMapping(value = "/editarProduto", method = RequestMethod.POST)
    public void doEditar(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @RequestMapping(value = "/listarProduto", method = RequestMethod.GET)
    public void doListar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        var banco = new VideoGameDAO();
        var consoles = banco.listar();

        response.getWriter().println("<body> "+consoles.get(0).getNome()+" </body>");
        
        
    }

    @RequestMapping(value = "/deletarProduto", method = RequestMethod.POST)
    public void doDeletar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
}
