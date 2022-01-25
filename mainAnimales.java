/*
 	Prueba de las clases
	Soto Tirado
	3/20/2020
	5 - 3
 */
package corte3;

import java.util.Scanner;

public class mainAnimales {
    public static void main(String[] args) {
        Scanner b = new  Scanner (System.in);
        Animal animal=new Animal();
        Perro perro=new Perro();
        //Capturar de la clase padre.
        System.out.println("Animal: ");
        System.out.println("Nombre: "); String nombre=b.nextLine();
        animal.setNombre(nombre);
        System.out.println("Especie: "); String especie=b.nextLine();
        animal.setEspecie(especie);
        System.out.println("Color: "); String color=b.nextLine();
        animal.setColor(color);
        System.out.println("Edad: "); int edad=b.nextInt(); b.nextLine();
        animal.setEdad(edad);
        animal.imprimir();
          
        //Captura de la clase hija.
        System.out.println("Perro:");
        System.out.println("Nombre: "); String nombre1=b.nextLine();
        perro.setNombre(nombre1);
        System.out.println("Especie: "); String especie1=b.nextLine();
        perro.setEspecie(especie1);
        System.out.println("Color: "); String color1=b.nextLine();
        perro.setColor(color1);
        System.out.println("Edad: "); int edad1=b.nextInt(); b.nextLine();
        perro.setEdad(edad1);
        System.out.println("Raza: "); String raza=b.nextLine();
        perro.imprimir();
        Pez pez=new Pez();
        System.out.println("Pez:");
        System.out.println("nombre: "); String nombre2=b.nextLine();
        pez.setNombre(nombre2);
        System.out.println("ESPECIE: "); String especie2=b.nextLine();
        pez.setEspecie(especie2);
        System.out.println("color: "); String color2=b.nextLine();
        pez.setColor(color2);
        System.out.println("edad: "); int edad2=b.nextInt(); b.nextLine();
        pez.setEdad(edad2);
        System.out.println("tipo de alimento"); String tipoAlimento=b.nextLine();
        pez.setTipoAlimento(tipoAlimento);
        pez.imprimir();
    }
}
