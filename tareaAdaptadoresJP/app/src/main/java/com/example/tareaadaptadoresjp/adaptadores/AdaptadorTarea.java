package com.example.tareaadaptadoresjp.adaptadores;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareaadaptadoresjp.R;
import com.example.tareaadaptadoresjp.TareasDetalle;
import com.example.tareaadaptadoresjp.clases.Tarea;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorTarea extends RecyclerView.Adapter<AdaptadorTarea.ViewHolder> {

    private List<Tarea> tareaList;

    public AdaptadorTarea(List<Tarea> tareaList) {
        this.tareaList = tareaList;
    }

    @NonNull
    @Override
    public AdaptadorTarea.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tareas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorTarea.ViewHolder holder, int position) {
        Tarea tarea = tareaList.get(position);
        holder.bind(tarea);
    }

    @Override
    public int getItemCount() {
        return tareaList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt_nombreT, txt_categoriaT, txt_estadoT;
        ImageView img_tarea;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_nombreT = itemView.findViewById(R.id.txt_nombreT);
            txt_categoriaT = itemView.findViewById(R.id.txt_categoriaT);
            txt_estadoT = itemView.findViewById(R.id.txt_estadoT);
            img_tarea = itemView.findViewById(R.id.img_tarea);
        }

        public void bind(Tarea tarea) {
            txt_nombreT.setText(tarea.getNombre());
            txt_categoriaT.setText(tarea.getCategoria());
            txt_estadoT.setText(tarea.getEstado());
            Picasso.get().load(tarea.getImagen()).into(img_tarea);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(view.getContext(), TareasDetalle.class);
                    i.putExtra("nombreT",tarea.getNombre());
                    i.putExtra("categoriaT",tarea.getCategoria());
                    i.putExtra("estadoT",tarea.getEstado());
                    i.putExtra("imagen",tarea.getImagen());
                    view.getContext().startActivity(i);
                }
            });

        }

    }
}
