/*
    Realizar un programa en lenguaje Java que capture dos números enteros e imprima si el primer número es múltiplo del segundo.

    Soto Tirado Jesús Eduardo
    5-3
    17 de Enero de 2020
 */
package corte1;
import java.util.Scanner;
public class Multiplo {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        System.out.println("Captura el primer número: ");
        num1 = input.nextInt();
        System.out.println("Captura el segundo número: ");
        num2 = input.nextInt();
        int resto1 = num1%num2;
        int resto2 = num2%num1;
            if(resto1 == 0){
                System.out.println("El número " + num1 + " es multiplo de " + num2);
            }
            else if(resto2 == 0){
                System.out.println("El número " + num2 + " es multiplo de " + num1);
            }
            else if(resto1 != 0){
                System.out.println("El número " + num1 + " no es multiplo de " + num2);
            }
            
            else {
                System.out.println("El número " + num2 + " no es multiplo de " + num1);
            }
                   };
}

   
