/*
 * Proyecto POO - Archivo punto.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package punto;

/**
*
*@author Mario Tomas Zanon <newmariotomas@gmail.com>
*@version 1.0
*@date 10 ene. 2022 19:55:39
*/
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Punto {
    
    private static int x;
    private static int y;
    
    
    public Punto(int x, int y){
        setX(x);
        setY(y);
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    public void imprimir(){
        System.out.println("(" + x + ", " + y + ")");
        
    }
    
    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }
    
    public void desplaza(int dx, int dy){
        setX(x+dx);
        setY(y+dy);
    }
    
    public static Punto creaPuntoAleatorio(){
        int rdx = (int)( Math.random() * (100-100+1) + (-100)); 
        int rdy = (int)( Math.random() * (100-100+1) + (-100)); 
        
        Punto prd = new Punto(rdx, rdy);
        return prd;
            }
    
    
}
