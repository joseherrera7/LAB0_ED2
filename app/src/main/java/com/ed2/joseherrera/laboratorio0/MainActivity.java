package com.ed2.joseherrera.laboratorio0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Dictionary;

public class MainActivity extends AppCompatActivity {
    Dictionary<String, Cancion> nuevoDiccionario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
