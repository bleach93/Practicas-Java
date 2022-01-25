/* 
        Realizar un programa en lenguaje Java que solicite un número entero, calcule y muestre factorial de dicho número.
	Soto Tirado Jesús Eduardo

	21 de Enero de 2020
*/
package corte1;
import java.util.Scanner;


public class factorial {

    public static void main(String[] args) {
        long factorial = 1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}