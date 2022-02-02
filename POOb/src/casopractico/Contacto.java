/*
 * Proyecto POO - Archivo programa.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package casopractico;

/**
*
*@author Mario Tomas Zanon <newmariotomas@gmail.com>
*@version 1.0
*@date 24 ene. 2022 20:32:49
*/
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Contacto {
    private  String n;
    private  String c;
    private  String t;

    public Contacto(String n, String c, String t) {
        this.n = n;
        this.c = c;
        this.t = t;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }
    public void imprimircontacto(){
        System.out.println("Nombre: " + n + ", Correo: " + c + ", Telefono: " + t + ".");
        //ezpz
    }
/*
    public String getAll(){
        return n;
        return c;
        return t;
    }
  */  
}
