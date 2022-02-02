/*
 * Proyecto POO - Archivo programa.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package punto;

/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 20:03:22
 */
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Programa {

    public static void main(String[] args) {
        Punto p1 = new Punto(5, 0);
        Punto p2 = new Punto(10, 10);
        Punto p3 = new Punto(-3, 7);
        System.out.print("Punto 1: "); p1.imprimir();
        System.out.print("Punto 2: "); p2.imprimir();
        System.out.print("Punto 3: "); p3.imprimir();
        
        p1.setXY(4, 7);
        System.out.print("Punto 1: "); p1.imprimir();
        p1.desplaza(2, 2);
        System.out.print("Punto 1: "); p1.imprimir();
        Punto prd = Punto.creaPuntoAleatorio();
        System.out.println("Toma punto random: "); prd.imprimir();
    }

}
