package com.cursoandroid.proyecto.carrerasficct;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import auxiliares.Noticia;

/**
 * Created by Izzy on 25/11/2016.
 */

public class PantallaSecundaria extends AppCompatActivity {
    ImageView portada;
    TextView titulo;
    TextView contenido;

    Noticia n;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_secundaria);
        portada = (ImageView) findViewById(R.id.portada);
        titulo = (TextView) findViewById(R.id.titulo);
        contenido = (TextView) findViewById(R.id.contenido);

        n =(Noticia) getIntent().getExtras().getSerializable("La noticia");
        portada.setImageResource(n.getPortada());
        titulo.setText(n.getTitulo());
        contenido.setText(n.getContenido());

    }
}
