/*
	Clase Padre Animal
	Soto Tirado
	3/20/2020
	5 - 3
 */
package corte3;

public class Animal {
    //Atributos
    protected String nombre,especie,color;
    protected int edad;

    public Animal() {
    }

        //Construtor por parametros
        public Animal(String nombre, String especie, String color, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.color = color;
        this.edad = edad;
    }

        //Constructor copia
        public Animal(Animal animal) {
        this.nombre = animal.nombre;
        this.especie = animal.especie;
        this.color = animal.color;
        this.edad = animal.edad;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Método imprimir
    public void imprimir(){
        System.out.print("Nombre: "+this.nombre);
        System.out.print("Especie: "+this.especie);
        System.out.print("Color: "+this.color);
        System.out.println("Edad:"+this.edad);
        
    }
    
}
