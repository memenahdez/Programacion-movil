package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnLoginFacebook;
    private Button btnLoginNetflix;
    private Button btnRecyclerCampus;
    private Button btnListCampus;
    private Button btnParcial01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoginFacebook = findViewById(R.id.btn_login_facebook);
        btnLoginNetflix = findViewById(R.id.btn_login_netflix);
        btnRecyclerCampus = findViewById(R.id.btn_recyclerview);
        btnListCampus = findViewById(R.id.btn_list_Campus);
        btnParcial01= findViewById(R.id.btn_primer_parcial);

        btnLoginFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Botón pulsado",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
    });

        btnLoginNetflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Botón pulsado",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,LoginNetflixActivity.class);
                startActivity(intent);
            }
        });

        btnRecyclerCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Botón pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                startActivity(intent);
            }
        });

        btnListCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Botón pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ListCampusActivity.class);
                startActivity(intent);
            }
        });

        btnParcial01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Botón pulsado", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ParcialActivity.class);
                startActivity(intent);
            }
        });
}
}
