/*
    Clase hija de Deportista: Nadador
    31 de Marzo del 2020
 */
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jes�s Eduardo
 */
public class Nadador extends Deportista { //Implementaci�n de herencia
    private int hrsEntrenamiento;	
    private String entrenador; // En mi diagrama esta como entero, en realidad es String, error.
    
    //Sobrecarga de constructores
    
    //Constructor vac�o
    public Nadador() {
        super();
        this.hrsEntrenamiento = 0;
	this.entrenador = "";
	
    }
    
    //Constructor de par�metros
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

    //Sobre-escritura del m�todo para la captura de datos
    @Override
    public void capturar(){
        Scanner b = new Scanner(System.in);
        super.capturar(); //Llamada al m�todo de la clase padre
        System.out.print("Horas de Entrenamiento: ");
         this.setHrsEntrenamiento(b.nextInt()); b.nextLine();
	System.out.print("Entrenador: ");
        this.setEntrenador(b.nextLine());
    }
    
    //Sobre-escritura del m�todo para imprimir los datos
    @Override
    public void imprimir(){
        super.imprimir(); //Llamada al m�todo de la clase Deportista
        System.out.println("Horas de Entrenamiento: " + this.getHrsEntrenamiento());
        System.out.println("Entrenador: " + this.getEntrenador());
    }
}