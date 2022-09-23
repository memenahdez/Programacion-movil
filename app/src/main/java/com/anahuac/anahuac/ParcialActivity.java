package com.anahuac.anahuac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.anahuac.anahuac.models.ParcialoneActivity;

public class ParcialActivity extends AppCompatActivity {
    private Button btnParcialone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primer_parcial);

        btnParcialone = findViewById(R.id.btn_parcial);

        btnParcialone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ParcialoneActivity.this, "Botón pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(ParcialoneActivity.this, ParcialoneActivity.class);
                startActivity(intent);
            }
        });}}