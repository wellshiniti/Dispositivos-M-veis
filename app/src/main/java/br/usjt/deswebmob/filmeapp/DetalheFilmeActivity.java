package br.usjt.deswebmob.filmeapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetalheFilmeActivity extends AppCompatActivity {
    TextView id, titulo, descricao, direcao, popularidade, data, genero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);

        //filme
        id = findViewById(R.id.txtId);
        titulo = findViewById(R.id.txtTitulo);
        descricao = findViewById(R.id.txtDescricao);
        direcao = findViewById(R.id.txtDirecao);
        popularidade = findViewById(R.id.txtPopularidade);
        data = findViewById(R.id.txtData);
        genero = findViewById(R.id.txtGenero);

        Intent intent = getIntent();
        String nomeFilme = intent.getStringExtra(ListaFilmesActivity.FILME);
        Filme filme = new Filme();
        filme = filme.buscaFilme(nomeFilme);

        Log.i("filme", filme.toString());

        id.setText(String.valueOf(filme.getId()));
        titulo.setText(filme.getTitulo().toString());
        descricao.setText(filme.getDescricao().toString());
        direcao.setText(filme.getDirecao().toString());
        popularidade.setText(String.valueOf(filme.getPopularidade()));
        data.setText(filme.getData().toString());
        genero.setText(filme.getGenero().getNome());

    }
}
