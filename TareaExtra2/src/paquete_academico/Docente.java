/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author lenovo
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private Pais pais;

    public void establecer_nombres(String n) {
        nombres = n;
    }

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_apellidos(String n) {
        apellidos = n;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_pais(Pais n) {
        pais = n;
    }

    public Pais obtener_pais() {
        return pais;
    }
        public String toString(){
        String cadena = String.format(
                "Docente: %s %s -%s",obtener_nombres(), obtener_apellidos(),obtener_pais());
        return cadena;
    }

}
