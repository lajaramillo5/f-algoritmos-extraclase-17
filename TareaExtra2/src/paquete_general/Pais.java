/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author lenovo
 */
public class Pais {
  private   String  nombre;
    public void establecer_nombres(String n){
        nombre= n;
    }
    
    public String obtener_nombres(){
        return nombre;
    }
         @Override
    public String toString(){
        String cadena = String.format("%s ", obtener_nombres()
                );
        return cadena;
    }


    
}
