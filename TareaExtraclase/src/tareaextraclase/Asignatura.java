/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextraclase;

/**
 *
 * @author lenovo
 */
public class Asignatura {

    private String nombre;
    private int creditos;

    public void agregar_asignatura1(String n) {
        nombre = n;
    }

    public String obtener_asignatura1() {
        return nombre;
    }

    public void agregar_asignatura2(String n) {
        nombre = n;
    }

    public String obtener_asignatura2() {
        return nombre;
    }

    public void agregar_numero_creditos1(int n) {
        creditos = n;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void agregar_numero_creditos2(int n) {
        creditos = n;
    }

    public int obtener_creditos2() {
        return creditos;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s con número de créditos %d",obtener_asignatura1(),obtener_creditos());
        
        return cadena;

    }
}
