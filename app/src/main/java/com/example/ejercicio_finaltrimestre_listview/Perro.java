package com.example.ejercicio_finaltrimestre_listview;

/**
 * Created by DIDACT on 09/02/2018.
 */

public class Perro {

    String nombre;
    String peso;
    String altura;
    String color;
    String foto;


    public Perro(String color, String peso, String altura, String nombre, String foto) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
        this.color = color;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
