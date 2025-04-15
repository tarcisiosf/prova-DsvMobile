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

public class tela3 extends AppCompatActivity {
    private EditText nome_cadas;
    private EditText email_cadas;
    private EditText senha_cadas1;
    private EditText senha_cadas2;
    private Button btn_cadasUsuario;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tela3), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nome_cadas = findViewById(R.id.nome_cadas);
        email_cadas = findViewById(R.id.email_cadas);
        senha_cadas1 = findViewById(R.id.senha_cadas1);
        senha_cadas2 = findViewById(R.id.senha_cadas2);
        btn_cadasUsuario = findViewById(R.id.btn_cadasUsuario);
    }

    public void btn_cadasUsuario (View view) throws ClassNotFoundException {
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        view.getContext().startActivity(intent);
    }
}

