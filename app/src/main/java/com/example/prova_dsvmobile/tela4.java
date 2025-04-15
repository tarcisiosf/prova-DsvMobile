package com.example.prova_dsvmobile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tela4 extends AppCompatActivity {
    private EditText nome_contato;
    private EditText telefonePrincipal;
    private EditText telefoneSecundario;
    private EditText datanascimento;
    private EditText email_contato;
    private EditText endereco;
    private EditText cpf;
    private Button btn_cadasContato;
    private Button btn_listaContato;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tela4), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nome_contato = findViewById(R.id.nome_contato);
        telefonePrincipal = findViewById(R.id.telefonePrincipal);
        telefoneSecundario = findViewById(R.id.telefoneSecundario);
        datanascimento = findViewById(R.id.dataNascimento);
        email_contato = findViewById(R.id.email_contato);
        endereco = findViewById(R.id.endereco);
        cpf = findViewById(R.id.cpf);
        btn_cadasContato = findViewById(R.id.btn_cadasContato);
        btn_listaContato = findViewById(R.id.btn_listaContato);
    }

    public void btn_listaContato (View view) throws ClassNotFoundException {
        Intent intent = new Intent(view.getContext(), tela5.class);
        view.getContext().startActivity(intent);
    }
}
