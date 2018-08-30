package com.ed2.joseherrera.laboratorio0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Playlist extends AppCompatActivity {
 ListView playlistv;
   static  Map<String, Cancion> playlist=new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        playlistv=(ListView) findViewById(R.id.playl);

        ArrayList<String> playlistmostrado;
        playlistmostrado = new ArrayList<>(playlist.keySet());
        ArrayAdapter adaptador=new ArrayAdapter(this,android.R.layout.simple_list_item_1,  playlistmostrado);
        playlistv.setAdapter(adaptador);
        playlistv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(),"Cancion eliminada: "+adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
                Cancion eliminada= playlist.get(adapterView.getItemAtPosition(i).toString());
                Playlist.playlist.remove(eliminada.getNombre());
                Intent intento =new Intent(Playlist.this,Playlist.class);
                startActivity(intento);
            }
        });
    }


}
