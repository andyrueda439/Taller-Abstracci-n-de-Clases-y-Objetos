package com.nicanadadores.models;

import java.time.LocalDate;

public class Competencia {
    private LocalDate fecha;
    private int id; //id para identificar la competencia como unica
    private String lugar;
    private String nombre; //Las competencias tienen nombres, ejemplo: Categoria, Abierta, Velocidad, Relevos, etc.

    //Constructor vacio
    public Competencia() {
    }

    //Constructor completo
    public Competencia(LocalDate fecha, int id, String lugar, String nombre) {
        this.fecha = fecha;
        this.id = id;
        this.lugar = lugar;
        this.nombre = nombre;
    }

    //Getter and Setter
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ToString
    @Override
    public String toString() {
        return "Competencia{" +
                "fecha=" + fecha +
                ", id=" + id +
                ", lugar='" + lugar + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
