package entities;

public class Categoria {

    private int id;
    private String nome;

    public Categoria(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }





}
