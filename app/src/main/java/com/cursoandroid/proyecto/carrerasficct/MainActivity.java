package com.cursoandroid.proyecto.carrerasficct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import auxiliares.Noticia;

public class MainActivity extends AppCompatActivity {
    ListView Lista_noticia;
    String[] Noticias =  {"Ingeniería Informática", "Ingeniería en Sistemas", "Redes y Telecomunicaciones"};
    int[] Imagenes = {R.drawable.informatica,R.drawable.sistemas,R.drawable.redes };
    String[] contenidos =
            {
            "La carrera de Ingeniería Informática perteneciente a la Facultad de Ingeniería en Ciencias de la Computación y Telecomunicaciones de la Universidad Autónoma “Gabriel René Moreno”, es una carrera que forma profesionales en el área de Ciencias de la Computación.",
            "El 15 de Abril de 2003, mediante resolución V.R. 67/2003 se convalida las resoluciones facultativas y de carrera y crea Ingeniería en Sistemas como una mención de la carrera de Informática (Plan 187-2) bajo un régimen semestralizado.",
            "El año 2005 un equipo de docentes especialistas de Informática concluyen el nuevo diseño curricular de las carreras de ciencias de la computación dando origen al programa de titulación Ingeniería en Redes & Telecomunicaciones plan 187-5."
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lista_noticia =  (ListView) findViewById(R.id.Lista_Noticia);
        ListViewAdapter adapter = new ListViewAdapter(
                this, Noticias, Imagenes,Noticias);
        Lista_noticia.setAdapter(adapter);
        Lista_noticia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int portada = Imagenes[position];
                String titulo = Noticias[position];
                String contenido = contenidos[position];
                Noticia n = new Noticia(portada, titulo, contenido);

                Intent next_pantalla = new Intent(MainActivity.this, PantallaSecundaria.class);
                next_pantalla.putExtra("La noticia", n);
                startActivity(next_pantalla);
            }
        });


    }
}
