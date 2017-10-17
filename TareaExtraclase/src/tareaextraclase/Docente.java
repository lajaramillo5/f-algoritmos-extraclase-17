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
public class Docente {

    private String nombres;
    private String apellidos;
    private String titulo;
    private String asignatura;
    Titulo es = new Titulo();
    Titulo es1 = new Titulo();
    Asignatura ex=new Asignatura();
    Asignatura ex1=new Asignatura();
    
  
    public void agregar_nombre(String n) {
        nombres = n;
    }

    public String obtener_nombre() {
        return nombres;
    }

    public void agregar_apellidos(String n) {
        apellidos = n;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void agregar_titulo_tercer_nivel(Titulo n) {
        es = n;
    }

    public Titulo obtener_titulo_tercer_nivel() {
        return es;
    }

    public void agregar_titulo_cuarto_nivel(Titulo n) {
        es1= n;
    }

    public Titulo obtener_titulo_cuarto_nivel() {
        return es1;
    }

    public void agregar_asignatura_1(Asignatura n) {
        ex = n;
    }
    public Asignatura obtener_asignatura_1() {
        return ex;
    }
    public void agregar_asignatura_2(Asignatura n) {
        ex1 = n;
    }
    public Asignatura obtener_asignatura_2() {
        return ex1;
    }
    @Override
     public String toString(){
         return String.format(" Caso :\nDatos del Docente:\nNombres:%s\nApellidos:%s\n Asignatura1: %s\n Asignatura2: %s\nEl docente tiene los siguientes títulos académicos\nTítulo 3er nivel: %s \nTítulo 4er nivel:%s",obtener_nombre(),obtener_apellidos(),ex.toString(),ex1.toString(),es.toString(),es1.toString());
     }
   
    
    
    
    
}
