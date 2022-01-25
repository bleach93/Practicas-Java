/*
 Clase Hija Gato
Atributos: nombre, numPatas, raza, colorOjos
13/03/2020
*/
package Corte2;

/**
 Autores: Christian Alexis Garcia Delgado
 *        Jesus Eduardo Soto Tirado
 */
public class Gato extends Mamifero{
    private String raza;
    private String colorOjo;
    
    //Constructor Vacío
    public Gato(){
        super();
        this.raza = "";
        this.colorOjo = "";
    }
    
    // Constructor de parámetros.
    public Gato(String nombre, int numPatas, String raza, String colorOjo){
        super(nombre, numPatas);
        this.raza = raza;
        this.colorOjo = colorOjo;
    }
    
    // Constructor de copia
    public Gato(Gato gato){
        super(gato.nombre, gato.numPatas);
        this.raza = gato.raza;
        this.colorOjo = gato.colorOjo;
    }

    // Encapsulamiento
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjo() {
        return colorOjo;
    }

    public void setColorOjo(String colorOjo) {
        this.colorOjo = colorOjo;
    }
}
