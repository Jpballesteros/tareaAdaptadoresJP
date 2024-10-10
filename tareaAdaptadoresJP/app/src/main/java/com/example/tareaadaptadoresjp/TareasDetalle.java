package com.example.tareaadaptadoresjp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class TareasDetalle extends AppCompatActivity {

    TextView txt_nombreT2,txt_categoriaT2,txt_estadoT2;
    Button btn_regresar;
    ImageView img_tarea2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tareas_detalle);

        txt_nombreT2 = findViewById(R.id.txt_nombreT2);
        txt_categoriaT2 = findViewById(R.id.txt_categoriaT2);
        txt_estadoT2 =findViewById(R.id.txt_estadoT2);
        btn_regresar =findViewById(R.id.btn_regresar);
        img_tarea2 = findViewById(R.id.img_tarea2);

        String nombreT = getIntent().getStringExtra("nombreT");
        String categoriaT = getIntent().getStringExtra("categoriaT");
        String estadoT = getIntent().getStringExtra("estadoT");
        String imagen = getIntent().getStringExtra("imagen");

        txt_nombreT2.setText(nombreT);
        txt_categoriaT2.setText(categoriaT);
        txt_estadoT2.setText(estadoT);
        Picasso.get().load(imagen).into(img_tarea2);

        cambiarColorEstado(txt_estadoT2,estadoT);

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TareasDetalle.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void cambiarColorEstado(TextView textViewEstado, String estado) {
        View itemView = txt_estadoT2.getRootView();
        int color = Color.GRAY; // Color por defecto si no coincide con ningún estado

        switch (estado.toLowerCase()) {
            case "completado":
                color = Color.GREEN;
                break;
            case "pendiente":
                color = Color.RED;
                break;
            case "incompleto":
                color = Color.YELLOW;
                break;
        }
        txt_estadoT2.setTextColor(color);
    }
}