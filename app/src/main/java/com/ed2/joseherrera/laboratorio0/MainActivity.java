package com.ed2.joseherrera.laboratorio0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Dictionary;

public class MainActivity extends AppCompatActivity {
    Dictionary<String, Cancion> diccionarioCanciones;
    Cancion cancion1 = new Cancion("Brindemos", 120);
    Cancion cancion2 = new Cancion("Rain Over ME", 155);
    Cancion cancion3 = new Cancion("Astronomia", 132);
    Cancion cancion4 = new Cancion("Where them Girls At", 110);
    Cancion cancion5 = new Cancion("Let the bass kick in Miami Bitch", 120);
    Cancion cancion6 = new Cancion("Summerlove", 125);
    Cancion cancion7 = new Cancion("SAD!", 123);
    Cancion cancion8 = new Cancion("Taste", 132);
    Cancion cancion9 = new Cancion("Lucid Dreams", 150);
    Cancion cancion10 = new Cancion("Supuestamente", 144);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        diccionarioCanciones.put(cancion1.getNombre(),cancion1);
        diccionarioCanciones.put(cancion2.getNombre(),cancion2);
        diccionarioCanciones.put(cancion3.getNombre(),cancion3);
        diccionarioCanciones.put(cancion4.getNombre(),cancion4);
        diccionarioCanciones.put(cancion5.getNombre(),cancion5);
        diccionarioCanciones.put(cancion6.getNombre(),cancion6);
        diccionarioCanciones.put(cancion7.getNombre(),cancion7);
        diccionarioCanciones.put(cancion8.getNombre(),cancion8);
        diccionarioCanciones.put(cancion9.getNombre(),cancion9);
        diccionarioCanciones.put(cancion10.getNombre(),cancion10);
    }
}
