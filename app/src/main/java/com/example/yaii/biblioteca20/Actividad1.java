package com.example.yaii.biblioteca20;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.yaii.biblioteca20.POJO.Alumno;

public class Actividad1 extends AppCompatActivity
        implements IAlumnoListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad1);

        com.example.yaii.biblioteca20.Fragment1 frgListado = (com.example.yaii.biblioteca20.Fragment1) getSupportFragmentManager().findFragmentById(R.id.FrgListado);

        frgListado.setAlumnosListener(this);
    }

    @Override
    public void onAlumnoSeleccionado(Alumno a) {
        boolean hayDetalle =
                (getSupportFragmentManager().findFragmentById(R.id.FrgDetalle) != null);

        if(hayDetalle) {
            ((com.example.yaii.biblioteca20.Fragment2)getSupportFragmentManager()
                    .findFragmentById(R.id.FrgDetalle)).mostrarAlumno(a);
        }
        else {
            Intent i = new Intent(this, com.example.yaii.biblioteca20.Actividad2.class);
            i.putExtra("alumno", a);
            startActivity(i);
        }
    }
}
