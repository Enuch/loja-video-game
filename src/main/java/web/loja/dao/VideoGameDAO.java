package web.loja.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;

import web.loja.models.VideoGame;

public class VideoGameDAO {
    private Connection connect;
    private final String CREATE = "CREATE TABLE videogame (codigo INTEGER PRIMARY KEY, serie VARCHAR(20) NOT NULL, nome VARCHAR(20) NOT NULL, modelo VARCHAR(20) NOT NULL, edicao VARCHAR(20) NOT NULL, cor VARCHAR(10));";
    private final String INCLUIR = "INSERT INTO \"videogame\" (\"codigo\", \"serie\", \"nome\", \"modelo\", \"edicao\", \"cor\") values (?,?,?,?,?,?)";
    private final String LISTAR = "SELECT * FROM videogame";

    public void criar() {
        try {
            connect = ConectaBanco.getConnection();
            PreparedStatement instrucao = connect.prepareStatement(CREATE);
            instrucao.execute();
            connect.close();
        } catch (SQLException e) {
            System.out.println(("Erro de criação de tabela"));
        }
    }

    public void incluir(VideoGame v) {
        try {
            connect = ConectaBanco.getConnection();
            PreparedStatement instrucao = connect.prepareStatement(INCLUIR);
            instrucao.setInt(1, v.getCodigo());
            instrucao.setInt(2, v.getSerie());
            instrucao.setString(3, v.getNome());
            instrucao.setString(4, v.getModelo());
            instrucao.setString(5, v.getEdicao());
            instrucao.setString(6, v.getCor());
            instrucao.execute();
            connect.close();
        } catch (SQLException e){
            System.out.println("Erro na inserção de dados!");
        }
    }

    public ArrayList<VideoGame> listar() {
        ArrayList<VideoGame> videoGames = new ArrayList<VideoGame>();
        try {
            connect = ConectaBanco.getConnection();
            Statement instrucao = connect.createStatement();
            ResultSet rs = instrucao.executeQuery(LISTAR);
            
            while(rs.next()) {
                VideoGame v = new VideoGame();

                v.setCodigo(3);
                v.setSerie(11);
                v.setNome("Playstation 5");
                v.setModelo("Slim");
                v.setEdicao("2020 war");
                v.setCor("Preto");

                videoGames.add(v);
            }
            connect.close();
        } catch (SQLException e) {
            System.out.println("Erro ao listar itens");
        }

        return videoGames;
    }
}
