package com.nicanadadores.models;

public class Entrenador {
    private int id;
    private int experiencia; //en años
    private String nombre;  //Se ve que al igual que la clase Nadador, se van a crear los constructores para el Entrenador

    //Constructor vacio
    public Entrenador() {
    }

    //Constructor completo
    public Entrenador(int id, int experiencia, String nombre) {
        this.id = id;
        this.experiencia = experiencia;
        this.nombre = nombre;
    }

    //Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
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
        return "Entrenador{" +
                "id=" + id +
                ", experiencia=" + experiencia +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
