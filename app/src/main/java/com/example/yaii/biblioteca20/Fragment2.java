package com.example.yaii.biblioteca20;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yaii.biblioteca20.POJO.Alumno;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        Log.v(Fragment2.class.getSimpleName(), "onCreateView");
        return inflater.inflate(R.layout.fragment_detalle, container, false);
    }

    public void mostrarAlumno(Alumno a){
        TextView lblid = (TextView) getView().findViewById(R.id.lblid);
        lblid.setText(String.valueOf(a.getId()));

        TextView lblnombre = (TextView) getView().findViewById(R.id.lblnombre);
        TextView lblapellidos = (TextView) getView().findViewById(R.id.lblapellidos);
        TextView lbldireccion = (TextView) getView().findViewById(R.id.lbldireccion);
        TextView lbltelefono = (TextView) getView().findViewById(R.id.lbltelefono);

        lblnombre.setText(a.getNombre());
        lblapellidos.setText(a.getApellidos());
        lbldireccion.setText(a.getDireccion());
        lbltelefono.setText(a.getTelefono());
    }
}
