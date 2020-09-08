package com.example.micocina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnver, btnreceta, btntips, btnpreguntas ;
        btnver = (Button) findViewById(R.id.btnAceptar);
        btnreceta= (Button) findViewById(R.id.btnCancelar);
        //btntips=(Button)findViewById(R.id.btnTips);
        //btnpreguntas=(Button)findViewById(R.id.btnPreguntas);
        btnver.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Menu.this , MisRecetas.class);
                startActivity(intent);
            }
        });

        btnreceta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Receta.class);
                startActivity(intent);
            }
        });

    }
}
