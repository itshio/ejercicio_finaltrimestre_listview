package com.example.ejercicio_finaltrimestre_listview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DIDACT on 09/02/2018.
 */

public class Adaptadorperros extends ArrayAdapter<Perro> {

        ArrayList<Perro> perros;
        Context c;

public Adaptadorperros(Context c,ArrayList<Perro> perros){

        super(c, R.layout.item_lista_perros, perros);
        this.c =c;
        this.perros = perros;



        }

@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater= LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_lista_perros,null);


        TextView tv_peso=(TextView)item.findViewById(R.id.item_peso);
        tv_peso.setText(perros.get(position).getPeso());


        TextView tv_color=(TextView)item.findViewById(R.id.item_color);
        tv_color.setText(perros.get(position).getColor());

        TextView tv_altura=(TextView)item.findViewById(R.id.item_altura);
        tv_altura.setText(perros.get(position).getAltura());


        String foto = perros.get(position).getFoto();

        int idfoto = c.getResources().getIdentifier(foto,"drawable",c.getPackageName());

        ImageView iv_imagen = (ImageView)item.findViewById(R.id.item_imagen);

        iv_imagen.setImageResource(idfoto);


        return item;
        }
        }

