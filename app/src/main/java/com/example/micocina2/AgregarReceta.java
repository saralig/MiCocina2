package com.example.micocina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgregarReceta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_receta);

        Button btnguardar, btnatras;
        btnguardar = (Button) findViewById(R.id.btnGuardar);
        btnatras= (Button) findViewById(R.id.btnAtras);
        btnguardar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(AgregarReceta.this , MisRecetas.class);
                startActivity(intent);
            }
        });

        btnatras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(AgregarReceta.this, MisRecetas.class);
                startActivity(intent);
            }
        });
    }
}
