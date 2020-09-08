package com.example.micocina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        Button btnaceptar, btncancelar;
        btnaceptar = (Button) findViewById(R.id.btnAceptar);
        btncancelar= (Button) findViewById(R.id.btnCancelar);
        btnaceptar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Registrar.this , Menu.class);
                startActivity(intent);
            }
        });

        btncancelar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Registrar.this, Inicio.class);
                startActivity(intent);
            }
        });
    }
}
