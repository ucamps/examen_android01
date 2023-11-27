package com.example.examen_android01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btInfo;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btInfo = findViewById(R.id.informe);
        btInfo.setOnClickListener(this);

        //Inicialitzar text:
        text = (EditText) findViewById(R.id.nomAvi);
    }
    @Override
    public void onClick(View v) {
        //Enviar contingut a un altre activity:
        if (v.getId() == R.id.contact2) {
            String contingutText = text.getText().toString();
            Intent intent = new Intent(this, contacteJa.class);
            intent.putExtra("idText1", contingutText);
            startActivity(intent);
        }
        if (v.getId() == R.id.informe) {
            String contingutText = text.getText().toString();
            Intent intent = new Intent(this, informeJa.class);
            intent.putExtra("idText1", contingutText);
            startActivity(intent);
        }
    }

}