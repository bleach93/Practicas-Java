/*
    Clase hija de Deportista: Beisbolista
    31 de Marzo del 2020
 */
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jes�s Eduardo
 */
public class Beisbolista extends Deportista { //Implementaci�n de herencia
    private int defensa;	
    private float bateo;
    
    //Sobrecarga de constructores
    
    //Constructor vac�o
    public Beisbolista() {
        super();
        this.defensa = 0;
	this.bateo = 0.0;
	
    }
    
    //Constructor de par�metros
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

    //Sobre-escritura del m�todo para la captura de datos
    @Override
    public void capturar(){
        Scanner b = new Scanner(System.in);
        super.capturar(); //Llamada al m�todo de la clase padre
        System.out.print("Defensa: ");
         this.setDefensa(b.nextInt()); b.nextLine();
	System.out.print("Bateo: ");
        this.setBateo(b.nextFloat()); b.nextLine();
    }
    
    //Sobre-escritura del m�todo para imprimir los datos
    @Override
    public void imprimir(){
        super.imprimir(); //Llamada al m�todo de la clase Deportista
        System.out.println("Defensa: " + this.getDefensa());
        System.out.println("Bateo: " + this.getBateo());
    }
}