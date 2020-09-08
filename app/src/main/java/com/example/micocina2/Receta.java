package com.example.micocina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Receta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta);

        Button btnpostre, btncarne, btnensalada, btntradicional, btncomida, btnatras ;
        btnpostre = (Button) findViewById(R.id.btnPostres);
        btncarne= (Button) findViewById(R.id.btnCarnes);
        btnensalada=(Button)findViewById(R.id.btnEnsalada);
        btntradicional=(Button)findViewById(R.id.btnTradicional);
        btncomida=(Button)findViewById(R.id.btnComidaRapida);
        btnatras=(Button)findViewById(R.id.btnAtras);

        btnpostre.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Receta.this , ListaRecetas.class);
                startActivity(intent);
            }
        });

        btncarne.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Receta.this , ListaRecetas.class);
                startActivity(intent);
            }
        });

        btnensalada.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Receta.this , ListaRecetas.class);
                startActivity(intent);
            }
        });

        btntradicional.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Receta.this , ListaRecetas.class);
                startActivity(intent);
            }
        });

        btncomida.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Receta.this , ListaRecetas.class);
                startActivity(intent);
            }
        });

        btnatras.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Receta.this , Menu.class);
                startActivity(intent);
            }
        });
    }
}
