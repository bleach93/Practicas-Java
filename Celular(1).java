/*
   Imprimir y capturar Datos de Celular.

   Soto Tirado Jesús Eduardo
 */
package Corte2;

import java.util.Scanner;

/**
 *
 * @author Soto
 */
public class Celular {
 private String marca = " ";
 private String compañia = " ";
 private float precio;
 private float tamaño;

 public Celular(){
     this.marca = "";
     this.compañia = "";
     this.precio = 0;
     this.tamaño = 0;
    }


 public Celular(String marca,String compañia,float precio,float tamaño){
     this.marca = marca;
     this.compañia = compañia;
     this.precio = precio;
     this.tamaño = tamaño;
 }


 public Celular(Celular celular){
     this.marca = celular.marca;
     this.compañia = celular.compañia;
     this.precio = celular.precio;
     this.tamaño = celular.tamaño;
 }


 public void captura(String dat){
    System.out.println(dat);
    Scanner b = new Scanner(System.in);
    System.out.println("Marca: ");
    this.setMarca(b.nextLine());
    System.out.println("Compañia: ");
    this.setCompañia(b.nextLine());
    System.out.println("Precio: ");
    this.setPrecio(b.nextFloat()); b.nextLine();
    System.out.println("Tamaño: ");
    this.setTamaño(b.nextFloat()); b.nextLine();
 }

 public void impresion(){
    System.out.println("Marca: " + this.getMarca());
    System.out.println("Compañia: " + this.getCompañia());
    System.out.println("Precio: " + this.getPrecio());
    System.out.println("Tamaño: " + this.getTamaño());
 }

 public float impDesc(){
     float descuento;
     float a;
     Scanner b = new Scanner(System.in);
     System.out.println("Agregue el descuento: ");
     float desc = b.nextFloat(); b.nextLine();
     a = (desc/100);
     descuento = (getPrecio()-(aux*getPrecio()));
     return descuento;
 }

}
