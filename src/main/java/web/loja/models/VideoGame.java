package web.loja.models;


public class VideoGame {
    private Integer codigo;
    private Integer serie;
    private String nome;
    private String modelo;
    private String edicao;
    private String cor;

    public VideoGame() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getSerie() {
        return serie;
    }

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getCor() {
        return cor;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setCor(String cor) {
        this.cor =  cor;
    }
}   
