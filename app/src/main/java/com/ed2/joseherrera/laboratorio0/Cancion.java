package com.ed2.joseherrera.laboratorio0;

public class Cancion {
    public Cancion(String nombre, int duracion) {
        Duracion = duracion;
        Nombre = nombre;
    }

    private String Nombre;
    private int Duracion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }
}
