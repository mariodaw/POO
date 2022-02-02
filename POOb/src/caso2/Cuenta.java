/*
 * Proyecto POO - Archivo Cuenta.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package caso2;

/**
*
*@author Mario Tomas Zanon <newmariotomas@gmail.com>
*@version 1.0
*@date 27 ene. 2022 18:40:08
*/
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Cuenta {
    
    private String nombre;
    private double dinero;
    
    public Cuenta (String n, double d){
        this.nombre=n; //nombre
        this.dinero=d; //dinero
    }

    public String getN() {
        return nombre;
    }

    public void setN(String n) {
        this.nombre = n;
    }

    public double getDinero() {
        return dinero;
    }
    
    public boolean pesimista(){
        if(dinero<-100){
            return false;
        }
        else return true;
    }

    public void imprimirCuenta(){
        System.out.println("Nombre: " + nombre + ", Dinero: " + dinero + ".");
    }
    
    

}
