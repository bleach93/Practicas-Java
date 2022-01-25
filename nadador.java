/*
    Clase hija de Deportista: Nadador
    31 de Marzo del 2020
 */
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jesús Eduardo
 */
public class Nadador extends Deportista { //Implementación de herencia
    private int hrsEntrenamiento;	
    private String entrenador; // En mi diagrama esta como entero, en realidad es String, error.
    
    //Sobrecarga de constructores
    
    //Constructor vacío
    public Nadador() {
        super();
        this.hrsEntrenamiento = 0;
	this.entrenador = "";
	
    }
    
    //Constructor de parámetros
    public Nadador(int hrsEntrenamiento, String entrenador, String nombre, float estatura, float peso, int edad) {
        super(nombre, estatura,  peso, edad);
        this.hrsEntrenamiento = hrsEntrenamiento;
        this.entrenador = entrenador;
    }

    //Constructor de copia
    public Nadador(Nadador nadador) {
        super(nadador);
        this.hrsEntrenamiento = Nadador.hrsEntrenamiento;
	this.entrenador = Nadador.entrenador;
    }
    
    //Encapsulamiento de datos

    public int getHrsEntrenamiento() {
        return hrsEntrenamiento;
    }

    public void setHrsEntrenamiento(String hrsEntrenamiento) {
        this.hrsEntrenamiento = hrsEntrenamiento;
    }
    
    public int getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(int entrenador) {
        this.entrenador = entrenador;
    }

    //Sobre-escritura del método para la captura de datos
    @Override
    public void capturar(){
        Scanner b = new Scanner(System.in);
        super.capturar(); //Llamada al método de la clase padre
        System.out.print("Horas de Entrenamiento: ");
         this.setHrsEntrenamiento(b.nextInt()); b.nextLine();
	System.out.print("Entrenador: ");
        this.setEntrenador(b.nextLine());
    }
    
    //Sobre-escritura del método para imprimir los datos
    @Override
    public void imprimir(){
        super.imprimir(); //Llamada al método de la clase Deportista
        System.out.println("Horas de Entrenamiento: " + this.getHrsEntrenamiento());
        System.out.println("Entrenador: " + this.getEntrenador());
    }
}