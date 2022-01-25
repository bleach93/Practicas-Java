/*
	El dueño de una tienda de ropa desea obtener el listado de sus N clientes que han
	comprado en su tienda para otorgarles un descuento en base a la cantidad comprada.
	- De $100 a menos de $500 el 10%
	- De $500 a menos de $1000 el 20%
	- De $1000 a mas el 30%
	De cada cliente se tiene la siguiente información:
	- Nombre
	- Domicilio
	- Email
	- Cantidad o total de sus compras
	- Descuento obtenido
 */
package Corte2;

import java.util.Scanner;

/**
 *
 * @author Soto
 */
public class Tienda {
//Atributos
private String nombre = " ";
private String domicilio = " ";
private String email = " ";
private float totalCompra;


public Tienda(){
this.nombre = " ";
this.domicilio = " ";
this.email = " ";
this.totalCompra = 0;
}

public Tienda(String nombre,String domicilio,String email,float totalCompra){
this.nombre = nombre;
this.domicilio = domicilio;
this.email = email;
this.totalCompra = totalCompra;
}


public Tienda(Tienda tienda){
this.nombre = tienda.nombre;
this.domicilio = tienda.domicilio;
this.email = tienda.email;
this.totalCompra = tienda.totalCompra;
}


public void captura(String dat){
    System.out.println(dat);
    Scanner b = new Scanner(System.in);
    System.out.println("Nombre: ");
    this.setNombre(b.nextLine());
    System.out.println("Domicilio: ");
    this.setDomicilio(b.nextLine());
    System.out.println("E-mail: ");
    this.setEmail(b.nextLine());
    calculo();
}

public void calculo(){
    Scanner b = new Scanner(System.in);
    System.out.println("Total de compras: ");
    this.settotalCompra(b.nextFloat()); b.nextLine();
    if( this.gettotalCompra()>=100&&this.gettotalCompra()<500){
        System.out.println("Obtiene el 10% de descuento");
    }else if(this.gettotalCompra()>=500&&this.gettotalCompra()<1000){
        System.out.println("Obtiene el 20% de descuento");
    }else if(this.gettotalCompra()>=1000){
        System.out.println("Obtiene el 30% de descuento");
    }
}

public void impresion(){
    System.out.println("Nombre: " + this.getNombre());
    System.out.println("Domicilio: " + this.getDomicilio());
    System.out.println("E-mail: " + this.getEmail());
 }

    //Encapsulacion
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float gettotalCompra() {
        return totalCompra;
    }

    public void settotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }
}
