package br.usjt.deswebmob.filmeapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FilmeArrayAdapter extends ArrayAdapter<Filme> {

    public FilmeArrayAdapter(Context context, List<Filme> filmes) {
        super(context, -1, filmes);
    }


    private static class ViewHolder {
        ImageView conditionImageView;
        TextView txtTitulo;
        TextView txtId;
        TextView txtDirecao;
        TextView txtData;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        Filme filme = getItem(position);
        View raiz = null;
        ViewHolder viewHolder = null;
        Context context = getContext();
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            raiz = inflater.inflate(R.layout.item_filme, parent, false);
            viewHolder = new ViewHolder();
            raiz.setTag(viewHolder);
            viewHolder.conditionImageView = raiz.findViewById(R.id.conditionImageView);
            viewHolder.txtTitulo = raiz.findViewById(R.id.txtTitulo);
            viewHolder.txtId = raiz.findViewById(R.id.txtId);
            viewHolder.txtDirecao = raiz.findViewById(R.id.txtDirecao);
            viewHolder.txtData = raiz.findViewById(R.id.txtData);
        } else {
            raiz = convertView;
            viewHolder = (ViewHolder) raiz.getTag();
        }
        viewHolder.txtTitulo.setText(filme.getTitulo());
        viewHolder.txtId.setText(String.valueOf(filme.getId()));
        viewHolder.txtDirecao.setText(filme.getDirecao());
        viewHolder.txtData.setText(filme.getData());
        String name = filme.getIconName();
        //viewHolder.conditionImageView.setImageDrawable(R.drawable.name);

        /*if (bitmaps.containsKey(filme.getIconName())) {
            viewHolder.conditionImageView.setImageDrawable(R.drawable.name);
        } else {
        }*/
        return raiz;

    }

}
