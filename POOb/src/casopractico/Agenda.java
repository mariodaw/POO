/*
 * Proyecto POO - Archivo agenda.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package casopractico;

/**
*
*@author Mario Tomas Zanon <newmariotomas@gmail.com>
*@version 1.0
*@date 24 ene. 2022 19:59:11
*/
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
    import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Agenda {
     private Contacto[] vc;
     
     int cuantos;
     

    public Agenda() {
        vc = new Contacto[100];
        cuantos=0;
        
    }
    public void agregarContacto(Contacto c) {
        if (cuantos < 101) {
            vc[cuantos] = c;
            cuantos++;
        } else {
            System.out.println("ERROR: No se puede agregar contacto. Lista llena.");
        }
    }
    public void eliminarContacto(int pos) {
        if (pos >= 0 && pos < cuantos) {
            for (int i = pos; i < cuantos-1; i++) {
                vc[i]=vc[i+1];
            }
            cuantos--;
        } else {
            System.err.println("ERROR: No se puede eliminar contacto. Posición fuera de rango.");
        }
    }
    public void buscarContacto(String n){
        Agenda agenda = new Agenda();
        if(cuantos!=0){
            for (int i = 0; i < cuantos; i++) {
                if(vc[i].getN().toUpperCase().contains(n.toUpperCase()))
                {
                    agenda.agregarContacto(vc[i]);
                }
            }
        }
    }
    public void verContactos() {
        if(cuantos==0){
            System.err.println("NO HAY NA ILLO");
        }
        else{
        for (int i = 0; i < cuantos; i++) {
            vc[i].imprimircontacto();
        }
        }
    }
}
    
     
     


