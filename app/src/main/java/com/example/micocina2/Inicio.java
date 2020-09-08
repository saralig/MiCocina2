package com.example.micocina2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button btningresar, btnregistrar, btninvitado;
        btningresar = (Button) findViewById(R.id.btnIngresar);
        btninvitado= (Button) findViewById(R.id.btnInvitado);
        btnregistrar=(Button)findViewById(R.id.btnRegistrar);

        btningresar.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Inicio.this , Login.class);
                startActivity(intent);
            }

        });

        btninvitado.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent= new Intent(Inicio.this , Menu.class);
                startActivity(intent);
            }
        });

        btnregistrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Inicio.this, Registrar.class);
                startActivity(intent);
            }
        });

    }
}