/*
    Probar las clases: Deportista, Futbolista, Beisbolista, Nadador
    31 de Marzo de 2020
 */
package corte3;

import java.util.Scanner;

/**
 *
 * @author Soto Tirado Jesús Eduardo
 */
public class PruebaDeportista {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        System.out.print("¿Cuantos deportistas desea capturar?: ");
        int num = b.nextInt();  b.nextLine(); //Obtener tamaño del arreglo
        
        Trabajador[] arreglo = new Deportista[num]; //Crear arreglo
        int i=0, op;
        do{
            System.out.println("Tipos de deportista ");
            System.out.println("1. Futbolista ");
            System.out.println("2. Beisbolista ");
            System.out.println("3. Nadador ");            
            System.out.print("Seleccione una opción: ");
            op = b.nextInt();  b.nextLine();
            switch(op){
                case 1: //Crear objeto Futbolista en posición i
                        arreglo[i] = new Futbolista(); // Polimorfismo          
                        break;
                case 2: //Crear objeto Beisbolista en posición i
                        arreglo[i] = new Beisbolista(); //Polimorfismo
                        break;
                default://Crear objeto Nadador en posición i
                        arreglo[i] = new Nadador(); 
            }
            arreglo[i].capturar();
            i++;
        }while(i<num);
        
        //Impresión de los datos de cada objeto
        System.out.println("");
        System.out.println(" LISTADO DE TRABAJADORES ");
        for(Trabajador t:arreglo){ //Uso de for extendido             
            t.imprimir();
        }
    }