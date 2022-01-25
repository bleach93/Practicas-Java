/*
    Clase hija de Deportista: Futbolista
    31 de Marzo del 2020
 */
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jes�s Eduardo
 */
public class Futbolista extends Deportista { //Implementaci�n de herencia
    private String posicion;	// En mi diagrama esta como entero, fue un error.
    private int juegos;
    
    //Sobrecarga de constructores
    
    //Constructor vac�o
    public Futbolista() {
        super();
        this.posicion = "";
	this.juegos = 0;
	
    }
    
    //Constructor de par�metros
    public Futbolista(String posicion, int juegos, String nombre, float estatura, float peso, int edad) {
        super(nombre, estatura,  peso, edad);
        this.posicion = posicion;
        this.juegos = juegos;
    }

    //Constructor de copia
    public Futbolista(Futbolista futbolista) {
        super(futbolista);
        this.posicion = futbolista.posicion;
	this.juegos = futbolista.juegos;
    }
    
    //Encapsulamiento de datos

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public int getJuegos() {
        return juegos;
    }

    public void setJuegos(int juegos) {
        this.juegos = juegos;
    }

    //Sobre-escritura del m�todo para la captura de datos
    @Override
    public void capturar(){
        Scanner b = new Scanner(System.in);
        super.capturar(); //Llamada al m�todo de la clase padre
        System.out.print("Posicion: ");
        this.setPosicion(b.nextLine());
	System.out.print("Juegos jugados: ");
        this.setJuegos(b.nextInt()); b.nextLine();
    }
    
    //Sobre-escritura del m�todo para imprimir los datos
    @Override
    public void imprimir(){
        super.imprimir(); //Llamada al m�todo de la clase Deportista
        System.out.println("Posicion: " + this.getPosicion());
        System.out.println("Juegos Jugados: " + this.getJuegos());
    }
}