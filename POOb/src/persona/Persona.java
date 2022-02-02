/*
 * Proyecto POO - Archivo persona.java - Compañia DAW
 * Licencia Creative Commons BY-NC-SA 4.0
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 */
package persona;

/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 * @version 1.0
 * @date 10 ene. 2022 19:56:53
 */
/**
 *
 * @author Mario Tomas Zanon <newmariotomas@gmail.com>
 */
public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        setNombre(nombre);
        setDni(dni);
        setApellidos(apellidos);
        setEdad(edad);
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean mayoria() {
        if (18 <= edad) {
            return true;
        } else {
            return false;
        }
    }

    public boolean muymayoria() {
        if (65 <= edad) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimeSiMayorEdad() {
        if (mayoria()) {
            System.out.println("SÍ es mayor de edad");
        } else {
            System.out.println("NO es mayor de edad");
        }
    }

    public void esJubilado() {
        if (muymayoria()) {
            System.out.println("SÍ esta jubilada");
        } else {
            System.out.println("NO esta jubilada");
        }
    }

    public int diferenciaEdad(Persona pers) {
        int diff = this.edad - pers.getEdad();
        return diff;
    }
}
