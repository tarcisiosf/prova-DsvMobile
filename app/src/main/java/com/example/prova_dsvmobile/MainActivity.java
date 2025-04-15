package com.example.prova_dsvmobile;

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

public class MainActivity extends AppCompatActivity {
    private EditText email1;
    private EditText senha1;
    private Button login_btn;
    private Button recuperarsenha;
    private Button cadastrar_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        email1 = findViewById(R.id.email1);
        senha1 = findViewById(R.id.senha1);
        login_btn = findViewById(R.id.login_btn);
        recuperarsenha = findViewById(R.id.recuperarsenha);
        cadastrar_usuario = findViewById(R.id.cadastrar_usuario);
    }


    public void login_btn (View view) throws ClassNotFoundException {
        Intent intent = new Intent(view.getContext(), tela4.class);
        view.getContext().startActivity(intent);
    }

    public void recuperarsenha (View view) {
        Intent intent = new Intent(view.getContext(), tela2.class);
        view.getContext().startActivity(intent);
    }
    public void cadastrar_usuario (View view) {
        Intent intent = new Intent(view.getContext(), tela3.class);
        view.getContext().startActivity(intent);
    }
}