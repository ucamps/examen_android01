package com.example.examen_android01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class informeJa extends AppCompatActivity implements View.OnClickListener {
    TextView textRebut;
    Intent intent;
    ImageButton btinicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informe);
        btinicio = findViewById(R.id.inicio);
        textRebut = findViewById(R.id.avi);


        intent = getIntent();
        if (intent != null) {
            String contingutRebut = intent.getStringExtra("idText1");
            textRebut.setText(contingutRebut);
        }
    }
    public void onClick(View v) {
        //Redireccionar a una altre Activity:
        if (v.getId() == R.id.inicio) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
