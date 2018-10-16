package br.usjt.deswebmob.filmeapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/*
    @Author Wellington Shiniti Kawashima
            RA: 81622278

 */

public class ListaFilmesActivity extends AppCompatActivity {

    public static final String FILME = "br.usjt.deswebmob.filmeapp.filme";
    Filme filme;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_filmes);
        activity = this;
        filme = new Filme();
        Intent intent = getIntent();
        String genero = intent.getStringExtra(MainActivity.CHAVE);
        ListView listView = findViewById(R.id.lista_filme);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, filme.getListaNomes(genero));
        //Acima é onde o Adapter pega as informações para jogar na tela, e abaixo, é onde ele já está colocando na view
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(activity, DetalheFilmeActivity.class);
                intent.putExtra(FILME, filme.getList().get(position).getTitulo());
                startActivity(intent);
            }
        });
    }
}
