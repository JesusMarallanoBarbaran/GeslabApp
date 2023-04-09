package com.android.trabajofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InformacionServicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_servicio);
    }

    public void Retornar(View view) {

        Intent intent = new Intent(this,  ResumenAsignaciones.class);
        startActivity(intent);

    }


    public void Avanzar(View view) {

        Intent intent = new Intent(this,  InformacionCliente.class);
        startActivity(intent);
    }
}
