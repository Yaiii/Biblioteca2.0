package com.example.yaii.biblioteca20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.yaii.biblioteca20.POJO.Alumno;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad2);

        Alumno a = (Alumno)getIntent().getSerializableExtra("alumno");

        Fragment2 detalle =
                (Fragment2)getSupportFragmentManager().findFragmentById(R.id.FrgDetalle);

        detalle.mostrarAlumno(a);
    }
}
