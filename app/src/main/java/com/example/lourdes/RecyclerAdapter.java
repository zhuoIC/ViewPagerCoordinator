package com.example.lourdes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lourdes.tablayoutviewpagecoordinator.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    ArrayList lista;
    Context context;

    public RecyclerAdapter(ArrayList lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Lenguaje l = (Lenguaje) lista.get(position);

        holder.nombre.setText(l.getName());
        Picasso.get().load(l.getUrl()).error(R.drawable.drawable_error).placeholder(R.drawable.drawable_ok).into(holder.logo);
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nombre;
        ImageView logo;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.txvName);
            logo = itemView.findViewById(R.id.imgUrl);
        }
    }
}