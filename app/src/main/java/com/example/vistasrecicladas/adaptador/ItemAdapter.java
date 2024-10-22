package com.example.vistasrecicladas.adaptador;

import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import com.example.vistasrecicladas.models.Item;

import androidx.annotation.NonNull;
import android.widget.ImageView;
import com.example.vistasrecicladas.R;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> itemList;

    // Constructor
    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    // Clase interna ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView nombreTextView;
        public TextView descripcionTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.titulo);
            descripcionTextView = itemView.findViewById(R.id.descripcion);
        }
    }

    // Inflar el diseño
    @NonNull
    @Override
    public ItemAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.ItemAdapter, parent, false);
        return new ItemViewHolder(view);
    }

    // Asignar datos al ViewHolder
    public void onBindViewHolder(@NonNull
         ItemAdapter.ItemViewHolder holder, int position) {
        holder.setData(itemList.get(position));
    }

    // Tamaño de la lista
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView txtnombre,txttipo,txtdescripcion;
        ImageView imgen;
        Item objetousuario;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.titulo);
            txtdescripcion = itemView.findViewById(R.id.descripcion);
            imgen = itemView.findViewById(R.id.productImage);
        }

}
