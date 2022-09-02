package com.anahuac.anahuac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.anahuac.anahuac.adapters.ListCampusAdapter;
import com.anahuac.anahuac.models.Campus;

import java.util.ArrayList;

public class ListCampusActivity extends AppCompatActivity {
    private RecyclerView rvCampus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_campus);

        rvCampus = findViewById(R.id.rv_campus);
        ArrayList<Campus> list = new ArrayList<>();
        Campus c1 = new Campus(
                "Universidad Anáhuac - Campus Cancún",
                R.drawable.ic_campus_cancun
        );
        Campus c2 = new Campus(
                "Universidad Anáhuac - Campus Mayab",
                R.drawable.ic_campus_mayab
        );
        Campus c3 = new Campus(
                "Universidad Anáhuac - Campus Juan Pablo",
                R.drawable.ic_campus_juanpablo
        );
        Campus c4 = new Campus(
                "Universidad Anáhuac - Campus México Norte",
                R.drawable.ic_campus_mx_norte
        );
        Campus c5 = new Campus(
                "Universidad Anáhuac - Campus México Sur",
                R.drawable.ic_campus_mx_sur
        );
        Campus c6 = new Campus(
                "Universidad Anáhuac - Campus Oaxaca",
                R.drawable.ic_campus_oaxaca
        );
        Campus c7 = new Campus(
                "Universidad Anáhuac - Campus Puebla",
                R.drawable.ic_campus_puebla
        );
        Campus c8 = new Campus(
                "Universidad Anáhuac - Campus Online",
                R.drawable.ic_campus_online
        );
        Campus c9 = new Campus(
                "Universidad Anáhuac - Campus Querétaro",
                R.drawable.ic_campus_queretaro
        );
        Campus c10 = new Campus(
                "Universidad Anáhuac - Campus Tamaulipas ",
                R.drawable.ic_campus_tamaulipas
        );
        Campus c11 = new Campus(
                "Universidad Anáhuac - Campus Veracruz",
                R.drawable.ic_campus_veracruz
        );
        Campus c12 = new Campus(
                "Universidad Anáhuac - Campus Xalapa",
                R.drawable.ic_campus_xalapa
        );


        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);
        list.add(c11);
        list.add(c12);

        rvCampus.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ListCampusAdapter adapter = new ListCampusAdapter(list);
        rvCampus.setAdapter(adapter);

    }
}