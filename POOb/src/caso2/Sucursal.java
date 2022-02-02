/*
 * Proyecto POO - Archivo Sucursal.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package caso2;

/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 * @version 1.0
 * @date 27 ene. 2022 18:40:36
 */
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
import java.util.Arrays;
import java.util.Scanner;

public class Sucursal {

    private Cuenta[] vc;

    int cuantos;

    public Sucursal() {
        vc = new Cuenta[100];
        cuantos = 0;
    }

    //UNA PERSONA NO PUEDE TENER MAS DE UNA CUENTA
    public void agregarCuenta(Cuenta c) {
        if (cuantos < 100) {
            vc[cuantos] = c;
            cuantos++;
        } else {
            System.out.println("ERROR: No se puede agregar cuentas. Lista llena.");
        }
    }

    public void eliminarCuenta(int pos) {
        if (pos >= 0 && pos < cuantos) {
            for (int i = pos; i < cuantos - 1; i++) {
                vc[i] = vc[i + 1];
            }
            cuantos--;
        } else {
            System.err.println("ERROR: No se puede eliminar cuantas. Posición fuera de rango.");
        }
    }

    public void buscarCuenta(String n) {
        Sucursal sucursal = new Sucursal();
        if (cuantos != 0) {
            for (int i = 0; i < cuantos; i++) {
                if (vc[i].getN().toUpperCase().contains(n.toUpperCase())) {
                    sucursal.agregarCuenta(vc[i]);
                }
            }
        }
    }
    
    public void verCuantas(){
        if(cuantos==0){
            System.err.println("NO HAY NA ILLO");
        }
        else{
            for (int i = 0; i < cuantos; i++) {
                vc[i].imprimirCuenta();
            }
        }
}

}
