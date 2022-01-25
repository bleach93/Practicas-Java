/*
    Soto Tirado Jesús Eduardo
    5 - 3
    07 de Febrero de 2020
    
    1. Capturar un numero de filas y columnas de una matriz de números flotantes.
    Ademas de capturar un valor entero. Mostrar la matriz original y la matriz resultante
    de Multiplicar la original por el número.
 */
package corte1;

import java.util.Scanner; 

public class matrix {
    public static void main(String[] args) {
       Scanner bufer = new Scanner(System.in);
       int f, c;
       System.out.print("Capture el numero de filas: ");
       f = bufer.nextInt();
       System.out.print("Capture el numero de columnas: ");
       c = bufer.nextInt();
       float[][] matriz = new float[f][c];
       System.out.print("Capture un Numero entero");
       int n;
       n = bufer.nextInt();
       System.out.print("Digite datos para llenar la matriz: ");
            for(int a = 0; a < f; a++){
                for(int b = 0; b < c; b++){
                System.out.print("[+a+][+b+]");
                matriz[a][b] = bufer.nextFloat();
                }       
            }
            System.out.print("Matriz Original");
                for (int a = 0; a < f; a++){
                    for (int b = 0; b < c; b++ ){
                        System.out.print(matriz[a][b]+"\t");
                    }
                    System.out.print("");
                }
            System.out.print("Matriz Resultante");
                 for (int a = 0; a < f; a++){
                     for (int b = 0; b < c; b++){
                         matriz[a][b] = matriz[a][b] * n;
                         System.out.print(matriz[a][b]+"\t");
                     }
                     System.out.print("");
                 }
    }
}    