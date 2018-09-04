package com.ed2.joseherrera.laboratorio0;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
;

public class Adaptadorcanciones extends ArrayAdapter<Cancion> {
    private static final String TAG = "CancionListAdapter";

    private Context contexto;
    private int recurso;

    public Adaptadorcanciones( Context context, int resource, ArrayList<Cancion> objects) {
        super(context, resource, objects);
        contexto=context;
        recurso=resource;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        String nombre = getItem(position).getNombre();
        int duracion = getItem(position).getDuracion();

        Cancion canc = new Cancion(nombre, duracion);
        LayoutInflater inflater = LayoutInflater.from(contexto);
        convertView=inflater.inflate(recurso,parent,false);
        TextView nomb=(TextView) convertView.findViewById(R.id.textView3);
        TextView dur=(TextView) convertView.findViewById(R.id.textView4);
        nomb.setText(nombre);
        dur.setText(String.valueOf(duracion));
return  convertView;
    }



}
