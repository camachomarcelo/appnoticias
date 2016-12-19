package auxiliares;

import java.io.Serializable;

/**
 * Created by Marcelo Camacho on 25/11/2016.
 */

public class Noticia implements Serializable{
    int portada;
    String titulo;
    String contenido;

    public Noticia(int portada, String titulo, String contenido) {
        this.portada = portada;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
