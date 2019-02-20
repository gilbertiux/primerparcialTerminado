package com.ggilbertiux.primerparcialterminado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView Titulo1,Titulo2,Titulo3,Descripcion1,Descripcion2,Descripcion3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Titulo1=findViewById(R.id.Titulo_1);
        Titulo2=findViewById(R.id.Titulo_2);
        Titulo3=findViewById(R.id.Titulo_3);
        Descripcion1=findViewById(R.id.Descripcion_1);
        Descripcion2=findViewById(R.id.Descripcion_2);
        Descripcion3=findViewById(R.id.Descripcion_3);
        Titulo1.setText("Como Entrenar a tu dragon");
        Descripcion1.setText("En esta pelicula termina la aventura de ipo y chimuelo");
        Titulo2.setText("Lego 2");
        Descripcion2.setText("La segunda aventura de lego llena de mas aventuras y mas cringe");
        Titulo3.setText("Alita Battle Angel");
        Descripcion3.setText("Robot de ojos grandes salva el mundo de el avance tecnologico");

    }
}
