package com.example.yaii.biblioteca20;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.yaii.biblioteca20.POJO.Alumno;

import java.util.ArrayList;

/**
 * Created by loren on 29/10/15.
 */
public class AdaptadorAlumno extends ArrayAdapter<Alumno> {
    
    Activity context;
    ArrayList<Alumno> datos;

    public AdaptadorAlumno(Fragment context,ArrayList<Alumno> datos) {
        super(context.getActivity(), R.layout.layout_elemento_lista, datos);
        this.context = context.getActivity();
        this.datos = datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View item = inflater.inflate(R.layout.layout_elemento_lista, null);

        TextView lblApellidos = (TextView) item.findViewById(R.id.LblApellidos);
        lblApellidos.setText(datos.get(position).getApellidos());

        TextView lblNombre = (TextView) item.findViewById(R.id.LblNombre);
        lblNombre.setText(datos.get(position).getNombre());

        return (item);
    }
}
