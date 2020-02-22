
package com.johnsjohnny.turistikus.Activity.Adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.johnsjohnny.turistikus.Activity.Model.Item;
import com.johnsjohnny.turistikus.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter <Adapter.MyViewHolder>{
    private List<Item> listaitem;
    public Adapter(List<Item>lista){
        this.listaitem = lista;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemlista = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.adapter_lista, viewGroup, false);

        return new MyViewHolder(itemlista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Item item = listaitem.get(i);
        myViewHolder.Nome.setText(item.getNome());
        myViewHolder.imagem.setImageResource(item.getImagem());
        myViewHolder.Descricao.setText(item.getDescricao());

    }

    @Override
    public int getItemCount() {
        return listaitem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
            TextView Nome;
            ImageView imagem;
            TextView Descricao;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imagem = itemView.findViewById(R.id.IVImg);
                Nome = itemView.findViewById(R.id.TVNome);
                Descricao = itemView.findViewById(R.id.TVDesc);
            }


            }
        }

