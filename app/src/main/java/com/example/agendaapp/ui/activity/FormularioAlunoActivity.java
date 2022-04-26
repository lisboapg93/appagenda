package com.example.agendaapp.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agendaapp.DAO.AlunoDAO;
import com.example.agendaapp.R;
import com.example.agendaapp.model.Aluno;

public class FormularioAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_aluno);

        setTitle("Novo Aluno");

        AlunoDAO dao = new AlunoDAO();

        final EditText campoNome =  findViewById(R.id.activity_formulario_aluno_nome);
        final EditText campoTelefone =  findViewById(R.id.activity_formulario_aluno_telefone);
        final EditText campoEmail =  findViewById(R.id.activity_formulario_aluno_email);



        Button botaoSalvar = findViewById(R.id.activity_formulario_aluno_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome = campoNome.getText().toString();
                String telefone = campoTelefone.getText().toString();
                String email = campoEmail.getText().toString();

                Aluno  alunoCriado= new Aluno(nome, telefone, email);
                dao.salva(alunoCriado);

                startActivity(new Intent(FormularioAlunoActivity.this,
                        ListaAlunosActivity.class));
                finish();
            }
        });
    }
}