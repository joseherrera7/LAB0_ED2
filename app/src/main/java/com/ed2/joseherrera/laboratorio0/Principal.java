package com.ed2.joseherrera.laboratorio0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
    public void catalogo(View view){
        Intent intento =new Intent(Principal.this,MainActivity.class);
        startActivity(intento);
    }
    public void playlist(View view){
        Intent intento =new Intent(Principal.this,Playlist.class);
        startActivity(intento);
    }
}
