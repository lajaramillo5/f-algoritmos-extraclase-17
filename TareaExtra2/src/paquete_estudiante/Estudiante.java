/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Universidad;

/**
 *
 * @author lenovo
 */
public class Estudiante {
    private String  nombres;
    private String apellidos;
    private String asignatura_1;
    private String asignatura_2;
    private Universidad universidad;
    
     public void establecer_nombres(String n){
        nombres= n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    public void establecer_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    public void establecer_asignatura_1(String n){
        asignatura_1 = n;
    }
    
    public String obtener_asignatura_1(){
        return asignatura_1;
    }
    
    public void establecer_asignatura_2(String n){
        asignatura_2 = n;
    }
    
    public String obtener_asignatura_2(){
        return asignatura_2;
    }
    public void establecer_universidad(Universidad n){
        universidad = n;
    }
    
    public Universidad obtener_universidad(){
        return universidad;
    }
        @Override
    public String toString(){
        String cadena = String.format("Nombre: %s\nApellidos: %s ", 
                obtener_nombres(), obtener_apellidos());
        return cadena;
    }
    
    
    
}
