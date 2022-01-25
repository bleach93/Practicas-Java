/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corte1;
import java.util.Scanner;
/**
 *
 * @author software_23
 */
public class converter {
    
    static Scanner lector = new Scanner (System.in);
    
    public static void main(String[] args) {
         
       int opcion; //Guardaremos la opción del Usuario
       
           System.out.println("Convertidor de grados Centigrados a Fahrenheit y viceversa.");
           System.out.println("Bienvenido, Selecciona una opción.");
           System.out.println("1. Centigrados a Fahrenheit.");
           System.out.println("2. Fahrenheit a Centigrados.");
           System.out.println("3. Salir");
           System.out.println("");
           System.out.println("");
           System.out.println("Captura una de las opciones:");
           opcion = lector.nextInt();
           switch(opcion)
           {
               case 1:
                    System.out.println("Introduce los grados centigrados: ");
                    int c;
                    c = lector.nextInt();
                    // Se hacen los calculos
                    int f = (int) (c * 9 / 5) + (32);  
                    //Se muestra el resultado
                    System.out.println(c + "C equivale a " + f + " Fahrenheit");
                    break;
               case 2:
                   System.out.println("Introduce los grados farenheit: ");
                   f = lector.nextInt();
                   c = (int) ((f - 32) * 5 / 9);
                   System.out.println(f + "f equivale a " + c + " centigrados");
               default:
                   break;
       
        }
       }
}
