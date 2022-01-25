/* 
    Realiza un programa en lenguaje Java que solicite un número entero (1 al 12) e imprima a que mes del año corresponde. Ejemplo: 7 = Julio.
    Validar en caso de que el usuario capture otro número que no corresponda a ninguno de los meses del año

    Soto Tirado Jesús Eduardo

    21 de Enero de 2020
    
*/
package corte1;
import java.util.Scanner; 

/**
 *
 * @author software_23
 */
public class mes {
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int mes = 0;
        System.out.println("Programa para capturar el numero del mes y mostrar el nombre del mes.");
        System.out.print("Capture un número: ");
        mes = input.nextInt();
         switch (mes) {
            case 1:
                System.out.print("El mes es Enero.");
                break;
            case 2:
                System.out.print("El mes es Febrero.");
                break;
            case 3:
                System.out.print("El mes es Marzo.");
                break;
            case 4:
                System.out.print("El mes es Abril.");
                break;
            case 5:
                System.out.print("El mes es Mayo.");
                break;
            case 6:
                System.out.print("El mes es Junio.");
                break;
            case 7:
                System.out.print("El mes es Julio.");
                break;
            case 8:
                System.out.print("El mes es Agosto.");
                break;
            case 9:
                System.out.print("El mes es Septiembre.");
                break;
            case 10:
                System.out.print("El mes es Octubre.");
                break;
            case 11:
                System.out.print("El mes es Noviembre.");
                break;
            case 12:
                System.out.print("El mes es Diciembre.");
                break;
            default: 
                System.out.print("¡El año solo tiene 12 meses!");
                break;
        
     }
   }
}
