package com.example.konradszmidt.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] elementy_listy = { "Pierwszy", "Drugi", "Trzeci", "Czwarty" };
        ListView prosta_lista = (ListView) findViewById(R.id.lista_mainList);

        ArrayAdapter adapter_listy = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, elementy_listy);
        prosta_lista.setAdapter(adapter_listy);
    }
}
