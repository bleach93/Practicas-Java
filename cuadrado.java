/*  
    Realiza un programa en lenguaje Java que capture un carácter y el 
    tamaño de un rectángulo formado con dicho carácter
    Ejemplo: Suponga que el carácter dado es: ‘+’ y el tamaño=5,
    el resultado debe ser:
    + + + + +
    + + + + +
    + + + + +
    + + + + +
    + + + + +.

    Soto Tirado Jesús Eduardo

    5 - 3 

    24 de Enero de 2020
 */
package corte1;
import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {
    Scanner bufer = new Scanner(System.in);
        int t;
        System.out.println("Capture el area del cuadrado: ");
        t = bufer.nextInt(); bufer.nextLine();
        char car;
        System.out.println("Capture un caracter: ");
        car = bufer.nextLine().charAt(0);
        int i,j;
        i=0;
        j=0;
        
        while(i<t){ //Inicio de ciclo
            j=0;
            while(j<t){
                System.out.print(car +"  "); 
                j++;
            }
            System.out.println("\n");
            i++;
        } // Fin del Ciclo
    }
}