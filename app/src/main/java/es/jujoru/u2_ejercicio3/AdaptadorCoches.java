package es.jujoru.u2_ejercicio3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Nino Ruano on 16/01/2018.
 */

public class AdaptadorCoches extends ArrayAdapter<Coche> {

    ArrayList<Coche> coches;
    Context c;

    public AdaptadorCoches(Context c, ArrayList<Coche> coches) {
        super(c, R.layout.item_coche, coches);
        this.coches = coches;
        this.c = c;
    }

    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_coche, null);

        TextView tv_marca = (TextView) item.findViewById(R.id.item_marca);
        tv_marca.setText(coches.get(position).getMarca());

        TextView tv_modelo = (TextView) item.findViewById(R.id.item_modelo);
        tv_modelo.setText(coches.get(position).getModelo());

        String logo = coches.get(position).getImagen();

        int idImagen = c.getResources().getIdentifier(logo, "drawable", c.getPackageName());
        ImageView iv_logo = (ImageView) item.findViewById(R.id.item_logo);
        iv_logo.setImageResource(idImagen);

        return item;
    }

}