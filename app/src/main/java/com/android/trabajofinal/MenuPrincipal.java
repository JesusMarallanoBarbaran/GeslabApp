package com.android.trabajofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
    }

    public void EventoOpcion1(View view) {

        Intent intent = new Intent(this, ResumenAsignaciones.class);
        startActivity(intent);

    }

    public void EventoOpcion2(View view) {

        Intent intent = new Intent(this,  EntregaEquipo.class);
        startActivity(intent);
    }

    public void EventoOpcion3(View view) {

        Intent intent = new Intent(this,  ConsultaServicio.class);
        startActivity(intent);
    }

    public void Salir(View view) {
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity(intent);
    }
}
