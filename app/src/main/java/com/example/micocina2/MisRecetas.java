package com.example.micocina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MisRecetas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_recetas);

        Button btnagregar, btnatras ;
        btnagregar = (Button) findViewById(R.id.btnAgregar);
        btnatras= (Button) findViewById(R.id.btnAtras);

        btnagregar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(MisRecetas.this , AgregarReceta.class);
                startActivity(intent);
            }
        });

        btnatras.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MisRecetas.this, Menu.class);
                startActivity(intent);
            }
        });

    }

}
