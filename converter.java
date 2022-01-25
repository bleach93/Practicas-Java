/*
	Realizar un programa en lenguaje Java que muestre un men� de dos opciones para que el usuario seleccione si desea convertir de grados Cent�grados a Fahrenheit o de Fahrenheit a Cent�grados. Dependiendo de la opci�n elegida, el programa debe solicitar el dato correspondiente para calcular la conversi�n y mostrar el resultado acorde a la opci�n seleccionada.
	Formulas:
	centigrados = (fahrenheit � 32) / 1.8
	fahrenheit = (cent�grados * 1.8) + 32
	
	Soto Tirado Jes�s Eduardo

	21 de Enero de 2020
 */
package corte1;
import java.util.Scanner;

public class converter {
    
    static Scanner lector = new Scanner (System.in);
    
    public static void main(String[] args) {
         
       int opcion; //Guardaremos la opci�n del Usuario
       
           System.out.println("Convertidor de grados Centigrados a Fahrenheit y viceversa.");
           System.out.println("Bienvenido, Selecciona una opci�n.");
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