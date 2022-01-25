
import java.util.Scanner;

/*
    Codigo para probar las clases Computadora y Celular.
    
    Soto Tirado Jesús Eduardo
    
    03 de Marzo de 2020
 */

public class Prueba {

    public static void main(String[] args) {
        Scanner bufer = new Scanner(System.in);
        
        Celular a = new Celular ("TELCEL", 256 , 8192, "Android", 5000, 4500);
        a.Imprimir();
        
        Computadora d = new Computadora ("Dell", 256, 8192, "Windows 10");
        d.Imprimir();
        Computadora e= new Computadora(d);
        d.Imprimir();
        
    }   
}
