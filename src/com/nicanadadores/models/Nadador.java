package com.nicanadadores.models;

public class Nadador {
    private int id;
    private String nombre;
    private int edad;
    private String estilo;  //Aqui se puede ver los constructores que van a haber dentro de la clase de Nadador describiendo los datos de el mismo.

    //Generado el constructor vacio
    public Nadador() {
    }

    //Constructor completo
    public Nadador(int id, String nombre, int edad, String estilo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.estilo = estilo;
    }

    //Getter and Setter
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    //ToString
    @Override
    public String toString() {
        return "Nadador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estilo='" + estilo + '\'' +
                '}';
    }
}
