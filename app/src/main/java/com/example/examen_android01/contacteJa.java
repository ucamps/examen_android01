package com.example.examen_android01;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class contacteJa extends AppCompatActivity implements View.OnClickListener {
    TextView textRebut;
    Intent intent;
    ImageButton btContact1, btContact2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacte);

        textRebut = findViewById(R.id.avi);
        btContact1 = findViewById(R.id.contact1);
        btContact1 = findViewById(R.id.contact2);

        intent = getIntent();
        if (intent != null) {
            String contingutRebut = intent.getStringExtra("idText1");
            textRebut.setText(contingutRebut);
        }
    }
    public void onClick(View v) {
        if (v.getId() == R.id.contact1) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:647328384"));
            startActivity(intent);
        }
        if (v.getId() == R.id.contact2) {
            Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:678364124"));
            startActivity(intent);
        }
     }
}
