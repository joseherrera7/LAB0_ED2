package com.ed2.joseherrera.laboratorio0;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;


import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener, View.OnClickListener {
    ArrayList<String> mostradas;
 ListView cancionesagregar;
    public final Map<String, Cancion> diccionarioCanciones=new HashMap<>();
    private SearchView mSearchView;
    private ListView mListView;
    private Button btn;

    private final String[] mStrings = { "Google", "Apple", "Samsung", "Sony", "LG", "HTC" };

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);

        setContentView(R.layout.activity_main);



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

        cancionesagregar=(ListView) findViewById(R.id.canciones);


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
        mostradas = new ArrayList<>(diccionarioCanciones.keySet());
        ArrayAdapter adaptador=new ArrayAdapter(this,android.R.layout.simple_list_item_1,  mostradas);
        cancionesagregar.setAdapter(adaptador);
        cancionesagregar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(adapterView.getContext(),"Cancion agregada: "+adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
                Cancion agregada= diccionarioCanciones.get(adapterView.getItemAtPosition(i).toString());
                Playlist.playlist.put(agregada.getNombre(),agregada);
            }
        });
        mSearchView = (SearchView) findViewById(R.id.search_view);
        mListView = (ListView) findViewById(R.id.canciones);
        btn = (Button)  findViewById(R.id.ascendenteBtn);
        mListView.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                mostradas));
        mListView.setTextFilterEnabled(true);
        setupSearchView();
        btn.setOnClickListener(this);


    }
    private void setupSearchView() {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
        mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search Here");
    }

    public boolean onQueryTextChange(String newText) {
        if (TextUtils.isEmpty(newText)) {
            mListView.clearTextFilter();
        } else {
            mListView.setFilterText(newText.toString());
        }
        return true;
    }

    public boolean onQueryTextSubmit(String query) {
        return false;
    }
    Boolean bandera = false;
    @Override
    public void onClick(View v) {

        if (bandera == true){
            Collections.sort(mostradas, Collections.reverseOrder());
            mListView.refreshDrawableState();
            bandera = false;
        }
        else {
            Collections.sort(mostradas);
            mListView.refreshDrawableState();
            bandera = true;
        }

    }
}


