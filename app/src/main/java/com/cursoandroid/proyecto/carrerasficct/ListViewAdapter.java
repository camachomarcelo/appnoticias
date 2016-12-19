package com.cursoandroid.proyecto.carrerasficct;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Isaac on 11/11/2016.
 */

public class ListViewAdapter extends BaseAdapter{
    Context context;
    String[] titulos;
    int[] imagenes;
    String[] contenido;
    LayoutInflater inflater;
    public ListViewAdapter(Context context, String[] titulos, int[] imagenes, String[] contenido){
        this.context = context;
        this.titulos = titulos;
        this.imagenes = imagenes;
        this.contenido = contenido;
    }
    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //Variables de la pantalla adaptador
        TextView tvTitulo;
        ImageView ivPortada;
        TextView tvContenido;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View itemView = inflater.inflate(R.layout.lista_images, viewGroup, false);
        tvTitulo = (TextView) itemView.findViewById(R.id.ListTitulo);
        ivPortada = (ImageView) itemView.findViewById(R.id.vaga);
        tvContenido = (TextView) itemView.findViewById(R.id.Contenido);

        tvTitulo.setText(titulos[i]);
        ivPortada.setImageResource(imagenes[i]);
        tvContenido.setText(contenido[i]);
        return itemView;
    }
}
