/*
    Programa que Capture celulares, los registra, y captura los datos en distintos arreglos con los siguientes datos:
    * Marca
    * Compañia
    * Precio
    * Tamaño
    
    Despues, se imprimen los datos en forma de tabla.
    
    Examen primer corte.

    Soto Tirado Jesús Eduardo
    5 - 3
    05 de Febrero de 2020.
 */
package corte1;

import java.util.Scanner;

public class Examen {
    
    public static void main(String[] args) {
 
        int num = 0;
        int cel = 0;
        Scanner bufer = new Scanner(System.in);
        System.out.print("Captura el numero de celulares que quieras registrar: ");
        num = bufer.nextInt();
        bufer.nextLine();
        String [] label = new String[num];
        String [] company = new String[num];
        float [] price = new float[num];
        float [] size = new float[num];
        boolean tt = false;
        
        for(int i = 0; i < num; i++) {
            cel++;
            System.out.print("\nCelular " + cel);
            System.out.print("\nMarca: ");
            label[i] = bufer.nextLine();
            System.out.print("Compañia: ");
            company[i] = bufer.nextLine();
            System.out.print("Precio: ");
            price[i] = bufer.nextFloat();
            bufer.nextLine();
            System.out.print("Tamaño: ");
            size[i] = bufer.nextFloat();
            bufer.nextLine();
        }
        
        System.out.print("\n");
        System.out.print("________________________________________\n");
        System.out.print("|Marca||Compañia||Precio||Tamaño|");
        for(int i = 0; i < num; i++) {
            System.out.println("");
            System.out.print("|" + label[i] + "|");
            System.out.print("|" + company[i] + "|");
            System.out.print("|" + price[i] + "|");
            System.out.print("|" + size[i] + "|");
        }        
        System.out.print("\n________________________________________\n");
        
        for(int i = 0; i < num; i++) {
            if(company[i].equals("Telcel")) {
                System.out.println("");
                if(!tt) {
                    System.out.print("\n");
                    System.out.print("________________________________________\n");
                    System.out.print("|Marca||Compañia||Precio||Tamaño|");
                    tt = false;
                }
                System.out.print("\n|" + label[i] + "|");
                System.out.print("|" + company[i] + "|");
                System.out.print("|" + price[i] + "|");
                System.out.print("|" + size[i] + "|");
                System.out.print("\n________________________________________\n");
            }
        }
    }
    
}