/*
    Realizar un programa en lenguaje Java que capture un número entero e imprima si corresponde a un número par o impar.
    
    Soto Tirado Jesús Eduardo
    5-3
    17 de Enero de 2020
 */
package corte1;
import java.util.Scanner;
public class ParImpar{
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int numero = 0;
        System.out.println("Capture un número: ");
        numero = input.nextInt();
        if ((numero % 2) == 0){
            System.out.println(numero + " es par");
        }else{
            System.out.println(numero + " es impar");
        }
     }
}
