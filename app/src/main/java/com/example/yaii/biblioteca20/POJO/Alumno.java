package com.example.yaii.biblioteca20.POJO;

import java.io.Serializable;

public class Alumno implements Serializable {
    private int id;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;

    public Alumno(int id, String nombre, String apellidos, String direccion, String telefono) {
        this.setId(id);
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
    }

    public Alumno(){

    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
