package com.android.trabajofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EntregaEquipo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrega_equipo);
    }

    public void Retornar(View view) {
        Intent intent = new Intent(this,  MenuPrincipal.class);
        startActivity(intent);
    }
}


