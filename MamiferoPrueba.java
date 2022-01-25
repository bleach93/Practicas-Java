/*
Codigo que prueba las clases Mamifero y Gato
13/03/2020
*/

package Corte2;

import java.util.Scanner;

/*
Autores: Christian Alexis Garcia Delgado
         Jesus Eduardo Soto Tirado
*/
public class MamiferoPrueba {

    public static void main(String[] args) {
        // Objeto de la clase Padre Mamifero
        Scanner b = new Scanner(System.in);
        Mamifero mam = new Mamifero();
        System.out.println("Nombre: ");
        mam.setNombre(b.nextLine());
        System.out.println("Numero de patas: ");
        mam.setNumPatas(b.nextInt());
        System.out.println("Nombre: " + mam.getNombre());
        System.out.println("Numero de Patas: " + mam.getNumPatas());
        
        //Objeto Clase Hijo Gato
        Gato cat = new Gato();
        System.out.println("Nombre: ");
        cat.setNombre(b.nextLine());
        System.out.println("Numero de patas: ");
        cat.setNumPatas(b.nextInt());
        System.out.println("Raza: ");
        cat.setRaza(b.nextLine());
        System.out.println("Color de ojos: ");
        cat.setColorOjo(b.nextLine());
        System.out.println("Nombre: " + cat.getNombre());
        System.out.println("Numero de Patas: " + cat.getNumPatas());
        System.out.println("Raza: " + cat.getRaza());
        System.out.println("Color de Ojos: " + cat.getColorOjo());
        
    }
    
}