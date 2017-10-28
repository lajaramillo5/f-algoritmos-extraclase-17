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
public class Equipo {

    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador equipo[];
    private Tecnico tecnicos[];

    public Equipo(String no, String sig, int anio, Jugador[] jugadores, Tecnico[] tecnicos) {
        this.nombre = no;
        this.siglas = sig;
        this.anio_fundacion = anio;
        this.equipo = jugadores;
        this.tecnicos = tecnicos;
    }

    public Equipo(String nombre, Jugador[] jugadores, Tecnico[] tecnicos) {
        this.nombre = nombre;
        this.equipo = jugadores;
        this.tecnicos = tecnicos;
    }

    public void agregar_nombre(String n) {
        this.nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_siglas(String s) {
        this.siglas = s;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_anio_fundacion(int a) {
        this.anio_fundacion = a;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void agregarr_jugadores(Jugador[] equipo) {
        this.equipo = equipo;
    }

    public Jugador[] obtener_jugadores() {
        return equipo;
    }

    public void establecer_tecnicos(Tecnico[] tec) {
        this.tecnicos = tec;
    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }

    public double obtener_promedio_edad_tecnicos() {
        double pro_tec = 0;
        for (Tecnico tecnico : this.tecnicos) {
            pro_tec = pro_tec + tecnico.obtener_edad();
        }
        pro_tec /= this.tecnicos.length;
        return pro_tec;
    }

    public double obtener_promedio_edad_jugadores() {
        double pro_ju = 0;
        for (Jugador jugador : this.equipo) {
            pro_ju = pro_ju + jugador.obtener_edad();
        }
        pro_ju /= this.equipo.length;
        return pro_ju;
    }

    @Override
    public String toString() {

        String cadenaJ = "Sus jugadores son:\n";
        
        //Se escribe una cadena con todos los jugadores
        for (Jugador jugador : equipo) {
            cadenaJ += String.format("  %s-%s-%d\n", jugador.obtener_nombre(), jugador.obtener_posicion(), jugador.obtener_edad());
        }
        String cadenaT = "Sus técnicos son: \n";
        //Se escribe una cadena con todos los tecnicos
        for (Tecnico tecnico : tecnicos) {
            cadenaT += String.format("  %s-%s-%d\n", tecnico.obtener_nombre(), tecnico.obtener_funcion(), tecnico.obtener_edad());
        }
        return String.format("Equipo %s\n"
                + "%s"
                + "%s"
                + "Promedio de edad de:\n"
                + "  Técnicos: %.1f años\n"
                + "  Jugadores: %.1f años\n", obtener_nombre(), cadenaT, cadenaJ, obtener_promedio_edad_tecnicos(),obtener_promedio_edad_jugadores());
    }

}
