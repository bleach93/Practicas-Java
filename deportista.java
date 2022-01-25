/*
    Clase padre: Deportista
    31 de Marzo del 2020
*/
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jesús Eduardo
 */
public class Deportista {
    protected String nombre;
    protected float estatura;
    protected float peso;
    protected int edad;

    //Sobrecarga de constructores
    //Constructor vacío 
    public Deportista() {
        this.nombre = "";
        this.estatura = 0.0;
        this.peso = 0.0; 
	this.edad = 0;
    }
    
    //Constructor de parámetros
    public Deportista(String nombre, float estatura, float peso, int edad) {
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso; 
	this.edad = edad;
    }
    
    //Constructor de copia
    public Deportista(Deportista deportista){
        this.nombre = deportista.nombre;
        this.estatura = deportista.estatura;
        this.peso = deportista.peso; 
	this.edad = deportista.edad;
    }

    //Encapsulamiento de datos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estutura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Método para la captura de datos
    public void capturar(){
        Scanner b = new Scanner(System.in);
        System.out.print("Nombre: ");
        this.setNombre(b.nextLine());
        System.out.print("Estatura: ");
        this.setEstutura(b.nextFloat()); b.nextLine();
        System.out.print("Peso: ");
        this.setPeso(b.nextFloat()); b.nextLine();
	System.out.print("Edad: ");
	this.setEdad(b.nextInt()); b.nextLine();
    }
 
    //Método para imprimir los datos
    public void imprimir(){
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Estura: " + this.getEstatura());
        System.out.println("Peso: " + this.getPeso());   
	System.out.println("Edad: " + this.getEdad());     
    }
}