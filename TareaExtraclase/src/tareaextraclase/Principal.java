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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Docente e = new Docente();
        e.agregar_nombre("  Luis V.");
        e.agregar_apellidos("Perez J.");
        Asignatura a = new Asignatura();
        a.agregar_asignatura1("Matemáticas");
        a.agregar_numero_creditos1(8);
        Asignatura a2 = new Asignatura();
        a2.agregar_asignatura2("Física");
        a2.agregar_numero_creditos2(6);
        e.agregar_asignatura_1(a);
        e.agregar_asignatura_2(a2);
        Titulo b2 = new Titulo();
        b2.agregar_titulo("Licenciado en Físico Matemáticas");
        b2.agregar_universidad1("Universidad Politécnica");
        e.agregar_titulo_cuarto_nivel(b2);
        Titulo c2 = new Titulo();
        c2.agregar_titulo2("Magister en Docencia Matemática");
        c2.agregar_universidad1("Universidad Valenciana");
        e.agregar_titulo_tercer_nivel(c2);
        System.out.println(e);
        Docente e2 = new Docente();
        e2.agregar_nombre(" Ana M.");
        e2.agregar_apellidos("Velez P.");
        Asignatura el2 = new Asignatura();
        el2.agregar_asignatura1("Sociales");
        el2.agregar_numero_creditos1(9);
        Asignatura ell2 = new Asignatura();
        ell2.agregar_asignatura2("Literatura");
        ell2.agregar_numero_creditos2(10);
        e2.agregar_asignatura_1(el2);
        e2.agregar_asignatura_2(ell2);
        Titulo es2 = new Titulo();
        es2.agregar_titulo("Licenciado en Ciencias Sociales");
        es2.agregar_universidad1("Universidad Salesiana");
        e2.agregar_titulo_cuarto_nivel(es2);
        Titulo es22 = new Titulo();
        es22.agregar_titulo2("Magister en Docencia Social");
        es22.agregar_universidad1("Universidad Cataluña");
        e2.agregar_titulo_tercer_nivel(es22);
        System.out.println(e2);

      
   

// TODO code application logic here
    }

}
