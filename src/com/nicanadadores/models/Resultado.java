package com.nicanadadores.models;

public class Resultado {
    private int id; //identificacion del resultado de la prueba unica
    private String posicion; //Posicion ya sea primer, segundo, tercer, etc
    private int tiempo; //Tiempo de duracion registrado de la prueba

    //Constructor vacio
    public Resultado() {
    }

    //Constructor completo
    public Resultado(int id, String posicion, int tiempo) {
        this.id = id;
        this.posicion = posicion;
        this.tiempo = tiempo;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    //ToString

    @Override
    public String toString() {
        return "Resultados{" +
                "id=" + id +
                ", posicion='" + posicion + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
