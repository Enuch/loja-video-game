package web.loja.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProdutoController {
    
    @RequestMapping(value = "/cadastrarProduto", method = RequestMethod.POST)
    public void doCadastrar(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @RequestMapping(value = "/editarProduto", method = RequestMethod.POST)
    public void doEditar(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @RequestMapping(value = "/listarProduto", method = RequestMethod.GET)
    public void doListar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }

    @RequestMapping(value = "/deletarProduto", method = RequestMethod.POST)
    public void doDeletar(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
    }
}
