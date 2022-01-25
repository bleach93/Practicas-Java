/*
    Soto Tirado Jesús Eduardo
    5 - 3
    07 de Febrero de 2020
    
    2. Capturar el tamaño de filas y columnas de una matriz cuadrada y los numeros
    de la misma. Imprimir los numeros que se encuentran en las posiciones que forman
    la diagonal, asi como la matriz cuadrada.
 */
package corte1;

import java.util.Scanner; 

public class mat {
    public static void main(String[] args) {
       Scanner bufer = new Scanner(System.in);
       int t;
       System.out.print("Capture el tamaño de la mtriz cuadrada: ");
       t = bufer.nextInt();
       int [][] matriz = new int[t][t];
       System.out.println("Capture datos para llenar la matriz: ");
            for(int a = 0; a < t; a++){
                for(int b = 0; b < t; b++){
                System.out.print("[+a+][+b+]");
                matriz[a][b] = bufer.nextInt();
                }       
            }
            System.out.print("Matriz Cuadrada");
                for (int a = 0; a < t; a++){
                    for (int b = 0; b < t; b++ ){
                        System.out.print(matriz[a][b]);
                    }
                    System.out.print("");
                }
            System.out.print("Numeros de la diagonal");
                 for (int a = 0; a < f; a++){
                     for (int b = 0; b < c; b++){
                         if(a==b){
                             System.out.print(matriz[a][b]);
                             System.out.print("");
                         }
                     }
                 }
    }
}    