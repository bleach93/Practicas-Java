/*
    Realizar un programa en lenguaje Java que muestre un menú de opciones para 
    que el usuario seleccione si desea introducir los lados o los ángulos de un triangulo. 
    Donde dependiendo de la opción seleccionada el programa deberá solicitar tres números enteros 
    que correspondan a los lados de un triangulo para la opción 1, e indicar si se trata de un triangulo equilátero, isósceles o escaleno.
    Y para la opción 2, solicitar los tres ángulos y decir si se trata de un acutángulo, rectángulo u obtusángulo. 
    Validar para esta segunda opción que la suma de los tres ángulos interiores debe ser 180 grados, de lo contrario indicar que no es un triángulo.

    Soto Tirado Jesús Eduardo
    5-3
    17 de Enero de 2020
 */
package corte1;
import java.util.Scanner;
public class Triangulo {;

    public static void main(String[] args) {
         
       Scanner sn = new Scanner(System.in);
       boolean salir = false;
       int opcion; //Guardaremos la opción del Usuario
        
       while(!salir){
           System.out.println("Bienvenido, Selecciona una opción");
           System.out.println("1. Introducir los lados del triangulo.");
           System.out.println("2. Introducir los ángulos del triangulo.");
           System.out.println("3. Salir");
           System.out.println("");
           System.out.println("");
           System.out.println("Escribe una de las opciones:");
           opcion = sn.nextInt();
           if(opcion == 1){
                Scanner lector = new Scanner(System.in);
                double l1,l2,l3;
                System.out.print("Introduzca el Valor del 1 Lado:");
                l1 = lector.nextDouble();
                System.out.print("Introduzca el Valor del 2 Lado:");
                l2 = lector.nextDouble();
                System.out.print("Introduzca el Valor del 3 Lado:");
                l3 = lector.nextDouble();
                if (l1==l2 && l2==l3)
                System.out.println("Triangulo es Equilatero");
                else
               {
                   if (l1==l2 || l1==l3 || l2==l3)
                       System.out.println("El Triangulo es Isoceles");
                    else
                   {
                       if (l1!=l2 || l1!=l3 || l3!=l2)
                           System.out.println("El Triangulo es Escaleno");
                   }
               }
    }
           else{
               int ang1, ang2, ang3, resultado ; 
               System.out.println ( "Ingrese El Valor Del Angulo 1:" ) ; 
               Scanner entrada= new Scanner (System.in) ; 
               ang1 = entrada.nextInt() ; 
               System.out.println ( "Ingrese El Valor Del Angulo 2:" ) ; 
               ang2 = entrada.nextInt() ;
               System.out.println ( "Ingrese El Valor Del Angulo 3:" ) ; 
               ang3 = entrada.nextInt() ; 
               resultado = ( ang1+ang2+ang3 ) ; 
               if (resultado == 180 ) { 
                   System.out.println ("Angulos Validos" ) ; 
                   if (ang1 == 90||ang2 == 90||ang3 == 90 ) { 
                       System.out.println ( "Es Un Triangulo Rectangulo" ) ; 
                   } 
                   if (ang1 > 90||ang2 > 90||ang3 > 90 ) { 
                       System.out.println ( "Es Un Triangulo Obtusangulo" ) ; 
                   } 
                   if (ang1 < 90||ang2 < 90||ang3 < 90 ) { 
                       System.out.println ( "Es Un Triangulo Acutangulo" ) ; 
                   } 
               } 
               else { 
                   System.out.println ( "Con esos angulos NO se puede formar un triangulo" ) ; 
} 
} 
}
       }
        
    }
     
