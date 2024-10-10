package com.example.tareaadaptadoresjp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tareaadaptadoresjp.adaptadores.AdaptadorTarea;
import com.example.tareaadaptadoresjp.clases.Tarea;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv_tareas;
    List<Tarea> listaT = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_tareas =findViewById(R.id.rcv_tareas);

        Tarea tarea1 = new Tarea("Multiplicaciones","https://static.vecteezy.com/system/resources/previews/022/876/766/original/education-math-3d-illustration-png.png","Matematicas","completado");
        Tarea tarea2 = new Tarea("Diapositivas","https://static.vecteezy.com/system/resources/thumbnails/012/025/326/small_2x/united-kingdom-flag-in-grunge-style-png.png","Ingles","incompleto");
        Tarea tarea3 = new Tarea("Diviciones","https://static.vecteezy.com/system/resources/previews/022/876/766/original/education-math-3d-illustration-png.png","Matematicas","pendiente");
        Tarea tarea4 = new Tarea("Sumar Python","https://static.vecteezy.com/system/resources/thumbnails/015/151/474/small/processor-icon-design-for-artificial-intelligence-technology-theme-png.png","Informatica","completado");
        Tarea tarea5 = new Tarea("Formacion de equipo","https://static.vecteezy.com/system/resources/thumbnails/023/477/419/small_2x/ai-generative-collection-of-sports-equipment-commonly-sold-at-a-supermarket-circle-label-for-a-sports-goods-free-png.png","Deporte","sin estado");
        Tarea tarea6 = new Tarea("Partes del cuepo","https://cdn-icons-png.flaticon.com/512/2941/2941552.png","Biologia","completado");
        Tarea tarea7 = new Tarea("Sumar Python","https://static.vecteezy.com/system/resources/thumbnails/015/151/474/small/processor-icon-design-for-artificial-intelligence-technology-theme-png.png","Informatica","pendiente");


        listaT.add(tarea1);
        listaT.add(tarea2);
        listaT.add(tarea3);
        listaT.add(tarea4);
        listaT.add(tarea5);
        listaT.add(tarea6);
        listaT.add(tarea7);


        rcv_tareas.setLayoutManager(new LinearLayoutManager(this));
        rcv_tareas.setAdapter(new AdaptadorTarea(listaT));

    }
}