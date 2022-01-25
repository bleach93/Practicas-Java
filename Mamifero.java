/*
 Clase Padre Mamifero
Atributos: nombre, numPatas
 */

package Corte2;

/**
 Autores: Christian Alexis Garcia Delgado
 *        Jesus Eduardo Soto Tirado
 */
public class Mamifero {
    protected String nombre;
    protected int numPatas;
    
    //Constructor vacío
    public Mamifero(){
        this.nombre = "";
        this.numPatas = 0;
    }
    
    // Constructor de parámetros.
    public Mamifero(String nombre, int numPatas){
        this.nombre = nombre;
        this.numPatas = numPatas;
    }
    
    // Constructor de copia.
    public Mamifero(Mamifero mamifero){
        this.nombre = mamifero.nombre;
        this.numPatas = mamifero.numPatas;
    }

    //Encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
}
