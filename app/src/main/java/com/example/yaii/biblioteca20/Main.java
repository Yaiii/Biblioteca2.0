package com.example.yaii.biblioteca20;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

public class Main extends AppCompatActivity {

    // ??? private com.example.yaii.biblioteca.DataBaseManager manager;
    private EditText etBuscar;
   // ??? private SimpleCursorAdapter adapter;
    private Cursor c;
    private ListView listView;
    private ImageButton ibBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        // ??? getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
     /*   int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        // ??? **********************************************
        /*int id2 = item.getItemId();
        if (id2 == R.id.btn_abrirInsertar) {
            lanzarAbrirInsertar(null);
            return true;
        } */

        int id3 = item.getItemId();
        if (id3 == R.id.btn_ver) {
            lanzarVer(null);
            return true;
        }

        // ??? *************************************************
      /*  int id4 = item.getItemId();
        if (id4 == R.id.btn_buscar) {
            lanzarBuscar(null);
            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }


    /*  public void lanzarAbrirInsertar(View view){
        Intent i = new Intent(this, com.example.yaii.biblioteca20.Insertar.class);
         startActivity(i);
     } */

    public void lanzarVer(View view){
        Intent i = new Intent(this, com.example.yaii.biblioteca20.Actividad1.class);
        startActivity(i);
    }

    /* public void lanzarBuscar(View view){
         Intent i = new Intent(this, com.example.yaii.biblioteca.Buscar_libro.class);
         startActivity(i);
     } */


 /*   @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageButton1) {
        	//new BuscarTask().execute();
         Cursor c = manager.buscarLibro(etBuscar.getText().toString());
          adapter.changeCursor(c);
        }
    }	*/


}