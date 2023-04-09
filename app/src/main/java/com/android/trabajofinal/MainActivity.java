package com.android.trabajofinal;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ProgressBar pgbEjecutanto;
    private Button btnIngresar;
    private TextView txtUsername, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pgbEjecutanto = findViewById(R.id.pgbEjecutanto);
        btnIngresar = findViewById(R.id.btnIngresar);
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
    }

    public void EventoIngresar(View view) {
        String user = txtUsername.getText().toString();
        String pass =  txtPassword .getText().toString();

        Log.i("Usuario:", user);
        Log.i("Password:", pass);


        if(user.equals("admin") && pass.equals("admin")) {

            Intent intent = new Intent(this, MenuPrincipal.class);
            startActivity(intent);
        }

        else {

            Toast.makeText(getApplicationContext(), "Las credenciales son incorrectas!", Toast.LENGTH_LONG).show();
        }

    }

    public void EventoCerrar(View view) {
        finish();
    }
}