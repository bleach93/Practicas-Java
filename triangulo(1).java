/*
    Realiza un programa en lenguaje Java que capture un carácter y el 
    tamaño del triangulo formado con dicho carácter
    Ejemplo: Suponga que el carácter dado es: ‘+’ y el tamaño=5, el resultado debe 
    ser:
    +
    + +
    + + +
    + + + +
    + + + + +

    Soto Tirado Jesús Eduardo

    5 - 3

    24 De enero de 2020
 */
package corte1;
import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
       Scanner bufer = new Scanner(System.in);
        int t;
        System.out.println("Capture la longitud del triangulo: ");
        t = bufer.nextInt(); bufer.nextLine();
        char car;
        System.out.println("Digite un caracter para formar la figura: ");
        car = bufer.nextLine().charAt(0);
        int i,j;
        i=0; // iterador
        j=0; // iterador
        System.out.println("---Figura---\n");
        
        do{
            j=0;
            do{
                System.out.print(" " + car);
                j++;
            }while(j<=i);
            System.out.println("");
            i++;
        }while(i<t);
        
        
    }
}