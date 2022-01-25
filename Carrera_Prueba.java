/*
	Prueba Carrera.
	Soto
 */
package corte2;
import java.util.Scanner;

public class Carrera_Prueba {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner buffer = new Scanner (System.in);
        System.out.print("Clase Carrera");
        Carrera carrera = new Carrera();
        carrera.imprimir();
        System.out.print("Ingrese el nombre de la carrera: ");
        String nombre = buffer.nextLine();
        System.out.print("Ingrese la abreviatura de la carrera: ");
        String abreviatura = buffer.nextLine();
        System.out.print("Ingrese el numero de alumnos: ");
        int numAlumnos = buffer.nextInt(); buffer.nextLine();
    }
    
}
