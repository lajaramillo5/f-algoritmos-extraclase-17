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
public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;
    
    public void establecer_nombres(String n){
        nombre= n;
    }
    
    public String obtener_nombres(){
        return nombre;
    }
        public void establecer_siglas(String n){
        siglas= n;
    }
    
    public String obtener_siglas(){
        return siglas;
    }
   public void establecer_pais(Pais n){
        pais= n;
    }
    
    public Pais obtener_pais(){
        return pais;
    }
       @Override
    public String toString(){
        String cadena = String.format("Universidad: %s (%s)-%s", obtener_nombres(),
                obtener_siglas(),obtener_pais());
        return cadena;
    }
}
