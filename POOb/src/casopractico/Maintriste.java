/*
 * Proyecto POO - Archivo Maintriste.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package casopractico;

import java.util.Scanner;

/**
*
*@author Mario Tomas Zanon <newmariotomas@gmail.com>
*@version 1.0
*@date 26 ene. 2022 18:59:27
*/
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Maintriste {

    public static void main(String[] args) {
        Scanner user= new Scanner(System.in);
        int opcion;
        Agenda agenda= new Agenda();
        Contacto c;
        String n, contacto, t;
        
        System.out.println("1. Ver contactos");
        System.out.println("2. Agregar contacto.");
        System.out.println("3. Eliminar contacto.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Salir.");
        System.out.print("¿Opción? ");
        opcion= user.nextInt();
        
         /*switch (opcion) {
                case 1:
                    // Ver contactos
                    verContactosTodos();
                    break;
                case 2:
                    // Añadir contacto
                    System.out.print("¿Nombre? ");
                    n= user.nextLine();
                    System.out.print("¿Teléfono? ");
                    t = pedirString();
                    System.out.print("¿Correo? ");
                    c = pedirString();
                    agregarContacto(n, t, c);
                    break;
                case 3:
                    // Eliminar contacto
                    System.out.print("¿ID de contacto a eliminar? ");
                    pos = pedirIntEnRango(0, numC-1);
                    eliminarContacto(pos);
                    break;
                case 4:
                    // Buscar por nombre
                    System.out.print("¿Nombre? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vn, buscar);
                    verContactosVector(vpos);
                    break;
                case 5:
                    // Buscar por teléfono
                    System.out.print("¿Teléfono? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vt, buscar);
                    verContactosVector(vpos);
                    break;
                case 6:
                    // Buscar por correo
                    System.out.print("¿Correo? ");
                    buscar = pedirString();
                    vpos = buscarContactos(vc, buscar);
                    verContactosVector(vpos);
                    break;
                case 7:
                    // Búsqueda global
                    System.out.print("¿Término a buscar globalmente? ");
                    buscar = pedirString();
                    vpos = buscarGlobal(buscar);
                    verContactosVector(vpos);
                    break;
                case 8:
                    // Salir
                    System.out.println("¡Gracias! ¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
                    break;
            }*/
        
    }
    
}

    

           

      
