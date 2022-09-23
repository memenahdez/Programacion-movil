package com.anahuac.anahuac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class ParcialActivity extends AppCompatActivity {
    private Button btnParcialone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primer_parcial_2);

        btnParcialone = findViewById(R.id.btn_parcial);

        btnParcialone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ParcialActivity.this, "Botón pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ParcialActivity.this, ParcialoneActivity.class);
                startActivity(intent);
            }
        });}}