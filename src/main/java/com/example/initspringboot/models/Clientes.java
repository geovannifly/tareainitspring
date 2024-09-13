package com.example.initspringboot.models;

public class Clientes {

    private String nombre;
    private String direccion;
    private int telefono;
    private String nit;
    private String email;

    public Clientes(){}


    public Clientes(String nombre, String direccion, int telefono, String nit, String email){
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.email = email;
    }

    public Clientes(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String insertarCliente() {
        return "Cliente insertado exitosamente";
    }
}
