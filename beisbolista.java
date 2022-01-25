/*
    Clase hija de Deportista: Beisbolista
    31 de Marzo del 2020
 */
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jesús Eduardo
 */
public class Beisbolista extends Deportista { //Implementación de herencia
    private int defensa;	
    private float bateo;
    
    //Sobrecarga de constructores
    
    //Constructor vacío
    public Beisbolista() {
        super();
        this.defensa = 0;
	this.bateo = 0.0;
	
    }
    
    //Constructor de parámetros
    public Beisbolista(int defensa, float bateo, String nombre, float estatura, float peso, int edad) {
        super(nombre, estatura,  peso, edad);
        this.defensa = defensa;
        this.bateo = bateo;
    }

    //Constructor de copia
    public Beisbolista(Beisbolista beisbolista) {
        super(beisbolista);
        this.defensa = Beisbolista.defensa;
	this.bateo = Beisbolista.bateo;
    }
    
    //Encapsulamiento de datos

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(String defensa) {
        this.defensa = defensa;
    }
    
    public int getBateo() {
        return bateo;
    }

    public void setBateo(int bateo) {
        this.bateo = bateo;
    }

    //Sobre-escritura del método para la captura de datos
    @Override
    public void capturar(){
        Scanner b = new Scanner(System.in);
        super.capturar(); //Llamada al método de la clase padre
        System.out.print("Defensa: ");
         this.setDefensa(b.nextInt()); b.nextLine();
	System.out.print("Bateo: ");
        this.setBateo(b.nextFloat()); b.nextLine();
    }
    
    //Sobre-escritura del método para imprimir los datos
    @Override
    public void imprimir(){
        super.imprimir(); //Llamada al método de la clase Deportista
        System.out.println("Defensa: " + this.getDefensa());
        System.out.println("Bateo: " + this.getBateo());
    }
}