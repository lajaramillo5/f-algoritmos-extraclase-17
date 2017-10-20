/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;

/**
 *
 * @author lenovo
 */
public class Principal {

    public static void main(String[] args) {
        Pais estudiante1 = new Pais();
        estudiante1.establecer_nombres("Ecuador");
        Pais profesor1 = new Pais();
        profesor1.establecer_nombres("Colombia");
        Pais profesor2 = new Pais();
        profesor2.establecer_nombres("Perú");
        Universidad es1 = new Universidad();
        es1.establecer_nombres("Universidad Técnica Particular de Loja");
        es1.establecer_siglas("UTPL");
        es1.establecer_pais(estudiante1);
        Carrera e1 = new Carrera();
        e1.establecer_nombre("Sistemas");
        e1.establecer_modalidad("presencial");
        Docente d1 = new Docente();
        d1.establecer_nombres("Mario");
        d1.establecer_apellidos("Alcivar");
        d1.establecer_pais(profesor1);
        Docente d2 = new Docente();
        d2.establecer_nombres("Maria");
        d2.establecer_apellidos("Ruiz");
        d2.establecer_pais(profesor2);
        Asignatura uno = new Asignatura();
        uno.establecer_nombre("Matemáticas");
        uno.establecer_creditos(10);
        uno.establecer_carrera(e1);
        Asignatura dos = new Asignatura();
        dos.establecer_nombre("Física");
        dos.establecer_creditos(8);
        dos.establecer_carrera(e1);
        Estudiante un = new Estudiante();
        un.establecer_nombres("Luis V");
        un.establecer_apellidos("Perez J.");
        System.out.printf("Caso1\n%s\n%s\nTiene las siguientes asignaturas:\nAsignatura1:%s\n %s\nAsignatura2:%s\n %s", un, es1, uno, d1, dos, d2);
        System.out.println("\n");
        Pais estudiante12 = new Pais();
        estudiante12.establecer_nombres("Ecuador");
        Pais profesor12 = new Pais();
        profesor12.establecer_nombres("Venezuela");
        Pais profesor22 = new Pais();
        profesor2.establecer_nombres("Perú");
        Universidad es12 = new Universidad();
        es12.establecer_nombres("Universidad Técnica Equinoccial");
        es12.establecer_siglas("UTE");
        es12.establecer_pais(estudiante1);
        Carrera e12 = new Carrera();
        e12.establecer_nombre("Ingeniería Química");
        e12.establecer_modalidad("presencial");
                Carrera e122 = new Carrera();
        e122.establecer_nombre("Ingeniería Química");
        e122.establecer_modalidad("distancia");
        Docente d12 = new Docente();
        d12.establecer_nombres("Luis ");
        d12.establecer_apellidos("Armijos");
        d12.establecer_pais(profesor1);
        Docente d22 = new Docente();
        d22.establecer_nombres("Maria");
        d22.establecer_apellidos("Ruiz");
        d22.establecer_pais(profesor2);
        Asignatura uno2 = new Asignatura();
        uno2.establecer_nombre("Biología");
        uno2.establecer_creditos(9);
        uno2.establecer_carrera(e1);
        Asignatura dos2 = new Asignatura();
        dos2.establecer_nombre("Física");
        dos2.establecer_creditos(7);
        dos2.establecer_carrera(e1);
        Estudiante un2 = new Estudiante();
        un2.establecer_nombres("Ana.");
        un2.establecer_apellidos("Lima J.");
        System.out.printf("Caso2\n%s\n%s\nTiene las siguientes asignaturas:\nAsignatura1:%s\n %s\nAsignatura2:%s\n %s", un2, es12, uno2, d12, dos2, d22);

    }
}
