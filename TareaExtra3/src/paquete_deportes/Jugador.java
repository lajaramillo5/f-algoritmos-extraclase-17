/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author lenovo
 */
public class Jugador {

    private String nombre;
    private String posicion;
    private int edad;

    public Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    public void agregar_nombre(String n) {
        this.nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_posicion(String pos) {
        this.posicion = pos;
    }

    public String obtener_posicion() {
        return posicion;
    }

    public void agregar_edad(int ed) {
        this.edad = ed;
    }

    public int obtener_edad() {
        return edad;
    }

}
