package com.example.agendaapp.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Aluno {
    private final String telefone;
    private final String nome;
    private final String email;

    public Aluno(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = email;
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return nome;
    }
}
