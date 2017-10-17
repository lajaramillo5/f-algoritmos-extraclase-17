/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaextraclase;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Titulo {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private String nombre_universidad;

    public void agregar_titulo(String n) {
        nombre = n;
    }

    public String obtener_titulo1() {
        return nombre;
    }

    public void agregar_titulo2(String n) {
        nombre = n;
    }

    public String obtener_titulo2() {
        return nombre;
    }

    public void agregar_universidad1(String n) {
        nombre_universidad = n;
    }

    public String obtener_universidad1() {
        return nombre_universidad;
    }


    @Override
    public String toString() {
        String cadena = String.format(""
                + "%s-%s", obtener_titulo2(), obtener_universidad1(), obtener_titulo1(), obtener_universidad1());
        return cadena;
    }

}
