package com.example.agendaapp.model;

public class Aluno {
    private final String telefone;
    private String nome;
    private String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = email;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
