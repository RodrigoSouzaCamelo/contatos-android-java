package br.com.rodrigo.contatos.models;

public class Contato {
    private String nome;

    public Contato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}