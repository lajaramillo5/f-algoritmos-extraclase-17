/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author lenovo
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;
  public void establecer_nombre(String n){
        nombre= n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
     public void establecer_creditos(int n){
        creditos= n;
    }
    
    public int obtener_creditos(){
        return creditos;
    }
     public void establecer_carrera(Carrera n){
        carrera= n;
    }
    
    public Carrera obtener_carrera(){
        return carrera;
    }
     public void establecer_docente(Docente n){
        docente= n;
    }
    
    public Docente obtener_docente(){
        return docente;
    }
    @Override
    public String toString(){
        String cadena = String.format("%s(%d creditos)de la carrera %s ", 
                obtener_nombre(), obtener_creditos(),obtener_carrera());
        return cadena;
    }
    
}
