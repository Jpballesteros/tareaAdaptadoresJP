package com.example.tareaadaptadoresjp.clases;

public class Tarea {
    String imagen;
    String nombre;
    String categoria;
    String estado;

    public Tarea(String nombre, String imagen, String categoria, String estado) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
