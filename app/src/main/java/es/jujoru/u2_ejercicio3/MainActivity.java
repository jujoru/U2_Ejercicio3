package es.jujoru.u2_ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv_coches;
    ArrayList<Coche> lista_coches = new ArrayList<Coche>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();

        lv_coches = (ListView)findViewById(R.id.lv_coches);
        AdaptadorCoches adaptadorCoches=new AdaptadorCoches(this,
                lista_coches);

        lv_coches.setAdapter(adaptadorCoches);
        lv_coches.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Coche c =((Coche)parent.getItemAtPosition(position));
                int precio = c.getPrecio();
            }
        });

    }

    private void cargarDatos(){
         lista_coches.add(new Coche("Seat","Alhambra","alhambra",13000));
        lista_coches.add(new Coche("Seat","Altea","altea",17500));
        lista_coches.add(new Coche("Seat","Arona","arona",12300));
        lista_coches.add(new Coche("Seat","Ateca","ateca",21500));
        lista_coches.add(new Coche("Seat","Bocanegra","bocanegra",19000));
        lista_coches.add(new Coche("Seat","Cupra","cupra",18500));
        lista_coches.add(new Coche("Seat","Leon","leon",14900));
        lista_coches.add(new Coche("Seat","Ibiza","ibiza",9000));
    }
}
