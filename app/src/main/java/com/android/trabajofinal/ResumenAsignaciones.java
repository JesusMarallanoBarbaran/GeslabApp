package com.android.trabajofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ResumenAsignaciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen_asignaciones);
    }

    public void EventoVer1(View view) {
        Intent intent = new Intent(this,  InformacionServicio.class);
        startActivity(intent);
    }

    public void EventoVer2(View view) {
        Intent intent = new Intent(this,  InformacionServicio.class);
        startActivity(intent);
    }
}
