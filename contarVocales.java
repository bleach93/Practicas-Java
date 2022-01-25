/*  
    Capturar N cadenas, mostrar cuantas 'a', 
    cuantas 'e', cuantas 'i', cuantas 'o' y cuantas 'u' 
    tiene cada cadena.

    Soto Tirado Jesús Eduardo

    5 - 3 

    31 de Enero de 2020
 */

package corte1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class contarVocales {
    public static void main(String[] args){
    Scanner bufer = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    String s = "";
    int contador = 1, pos;
    int totalVocales = 0;
    int cad = 0;
    int num = 0;
    System.out.print("Captura el numero de cadenas que deseas: ");
    cad = bufer.nextInt(); 
    bufer.nextLine();
    for(int j = 0; j < cad; j++){
      num++;
      System.out.print("Cadena " + num + ": ");
      s = sc.nextLine();
      StringTokenizer st = new StringTokenizer(s);
      for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
      || (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')){
          totalVocales++;
      }
    }
    }
    System.out.println("El numero total de vocales es: " + totalVocales);
}
}