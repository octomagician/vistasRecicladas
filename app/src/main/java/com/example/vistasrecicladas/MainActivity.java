package com.example.vistasrecicladas;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.vistasrecicladas.adaptador.ItemAdapter;
import com.example.vistasrecicladas.models.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        // Inicializar la lista de items
        itemList = new ArrayList<>();
        itemList.add(new Item("IPhone 14", "Alta gama", ""));
        itemList.add(new Item("Samsung Galaxy S21", "Alta gama", ""));
        itemList.add(new Item("Google Pixel 6", "Alta gama", ""));

        // Inicializar el adaptador y asignarlo al RecyclerView
        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);

        ItemAdapter adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setHasFixedSize(true);
    }
}
