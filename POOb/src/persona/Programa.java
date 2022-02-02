/*
 * Proyecto POO - Archivo Programa.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package persona;

import java.util.Scanner;

/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:22:11
 */
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Programa {

    public static Persona crearPersona() {
        Scanner user = new Scanner(System.in);
        
        String nombre = user.nextLine();
        String apellidos = user.nextLine();
        String dni = user.nextLine();
        int edad = user.nextInt();
        user.nextLine();
        Persona p = new Persona(dni, nombre, apellidos, edad);
        return p;
    }
 
    public static void main(String[] args) {

        Persona pers1 = crearPersona();

        Persona pers2 = crearPersona();

        System.out.print("La primera persona ");
        pers1.imprimeSiMayorEdad();
        System.out.print("La segunda persona ");
        pers2.imprimeSiMayorEdad();

        System.out.println("La primera persona llamada: " + pers1.getNombre() + " " + pers1.getApellidos() + " tiene " + pers1.getEdad() + " y su dni es: " + pers1.getDni());
        System.out.println("La primera persona llamada: " + pers2.getNombre() + " " + pers2.getApellidos() + " tiene " + pers2.getEdad() + " y su dni es: " + pers2.getDni());

        System.out.print("La primera persona ");
        pers1.esJubilado();
        System.out.print("La segunda persona ");
        pers2.esJubilado();

        int d =pers1.diferenciaEdad(pers2);
        
        System.out.println(d);
    }

}
