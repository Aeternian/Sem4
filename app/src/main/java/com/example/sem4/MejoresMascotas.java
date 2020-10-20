package com.example.sem4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MejoresMascotas extends AppCompatActivity {

    RecyclerView recyclerViewMascota;
    RecyclerViewAdapter adapterMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingAddButton);
        fab.hide();

        Toolbar myToolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);

        //boton para ir a activity anterior
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewMascota = findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adapterMascota = new RecyclerViewAdapter(obtenerMascota());
        recyclerViewMascota.setAdapter(adapterMascota);
    }

    public List<ModeloMascota> obtenerMascota() {
        List<ModeloMascota> mascota = new ArrayList<>();
        mascota.add(new ModeloMascota("Tina", R.drawable.tina));
        mascota.add(new ModeloMascota("Hera", R.drawable.hera));
        mascota.add(new ModeloMascota("Luna", R.drawable.luna));
        mascota.add(new ModeloMascota("Pochi", R.drawable.pochi));
        mascota.add(new ModeloMascota("Carlos", R.drawable.carlos));
        return mascota;
    }
}
