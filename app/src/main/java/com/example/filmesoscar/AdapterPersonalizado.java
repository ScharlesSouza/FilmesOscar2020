package com.example.filmesoscar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterPersonalizado extends BaseAdapter {
    private Context context;
    private ArrayList<ItemFilme> dados;

    public AdapterPersonalizado(Context context, ArrayList<ItemFilme> dados) {
        this.context = context;
        this.dados = dados;
    }

    @Override
    public int getCount() {
        return dados.size();
    }

    @Override
    public ItemFilme getItem(int i) {
        return dados.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        //define qual sera o layout de cada item da lista, nesse caso usou o layout item_lanche
        View minhaView = layoutInflater.inflate(R.layout.item_filmes, viewGroup, false);


        //Preenchimento do Adapter (cada item da lista é um layou item_lanche).
        ItemFilme itemLanche = dados.get(i);
        TextView textViewDescricao = minhaView.findViewById(R.id.textViewFilme);
        textViewDescricao.setText(itemLanche.getNomeFilme());

        ImageView imageViewLanche = minhaView.findViewById(R.id.imageViewFilme);
        imageViewLanche.setImageResource(itemLanche.getFilme());

        return minhaView;
    }
}
