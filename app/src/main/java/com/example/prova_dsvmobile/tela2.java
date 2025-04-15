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

public class tela2 extends AppCompatActivity {
    private EditText email_recu;
    private EditText senha_recu1;
    private EditText senha_recu2;
    private Button btn_recuperar;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.tela2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        email_recu = findViewById(R.id.email_recu);
        senha_recu1 = findViewById(R.id.senha_recu1);
        senha_recu2 = findViewById(R.id.senha_recu2);
        btn_recuperar = findViewById(R.id.btn_recuperar);
    }

    public void btn_recuperar (View view) throws ClassNotFoundException {
        Intent intent = new Intent(view.getContext(), MainActivity.class);
        view.getContext().startActivity(intent);
    }
}
