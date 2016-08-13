package com.example.yaii.biblioteca20;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.yaii.biblioteca20.POJO.Alumno;

import java.util.ArrayList;

public class Fragment1 extends Fragment {

    private ArrayList<Alumno> datos = new ArrayList<Alumno>();
    private ListView lstListado;
    private IAlumnoListener listener;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {

        Log.v(Fragment1.class.getSimpleName(), "onCreateView");
        return inflater.inflate(R.layout.fragment_lista, container, false);
    }

    @Override
    public void onActivityCreated(Bundle state) {
        Log.v(Fragment1.class.getSimpleName(), "onActivityCreated");
        super.onActivityCreated(state);

        lstListado = (ListView) getView().findViewById(R.id.LstListado);

        datos.add(new Alumno(1,"Pepe1","Juan1","Sin direccion1","1111111"));
        datos.add(new Alumno(2,"Pepe2","Juan2","Sin direccion2","1111112"));
        datos.add(new Alumno(3,"Pepe3","Juan3","Sin direccion3","1111113"));
        datos.add(new Alumno(4,"Pepe4","Juan4","Sin direccion4","1111114"));
        datos.add(new Alumno(5, "Pepe5", "Juan5", "Sin direccion5", "1111115"));

        lstListado.setAdapter(new com.example.yaii.biblioteca20.AdaptadorAlumno(this, datos));


        lstListado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> list, View view, int pos, long id) {
                if (listener != null) {
                    listener.onAlumnoSeleccionado(
                            (Alumno) lstListado.getAdapter().getItem(pos));
                }
            }
        });
    }

    public void setAlumnosListener(IAlumnoListener listener) {
        this.listener=listener;
    }

    @Override
    public void onAttach (Activity activity) {
        Log.v(Fragment1.class.getSimpleName(), "onAttach");
        super.onAttach(activity);
    }

    @Override
    public void onViewStateRestored (Bundle savedInstanceState) {
        Log.v(Fragment1.class.getSimpleName(), "onViewStateRestored");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart () {
        Log.v(Fragment1.class.getSimpleName(), "onStart");
        super.onStart();
    }

    @Override
    public void onResume () {
        super.onResume();
        Log.v(Fragment1.class.getSimpleName(), "onResume");
    }

    @Override
    public void onPause () {
        Log.v(Fragment1.class.getSimpleName(), "onPause");
        super.onPause();
    }

    @Override
    public void onStop () {
        Log.v(Fragment1.class.getSimpleName(), "onStop");
        super.onStop();
    }

    @Override
    public void onDestroyView () {
        Log.v(Fragment1.class.getSimpleName(), "onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onDestroy () {
        Log.v(Fragment1.class.getSimpleName(), "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onDetach () {
        Log.v(Fragment1.class.getSimpleName(), "onDetach");
        super.onDetach();
    }
}
