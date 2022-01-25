/*
   Imprimir y capturar Datos de computadora con su encapsulación.

   Soto Tirado Jesús Eduardo

   03 de Marzo de 2020
 */
package Corte2;

import java.util.Scanner;

/**
 *
 * @author Soto
 */

public class Computadora {
    //Atributos
    private String marca;
    private int discoDuro;
    private float memoriaRam;
    private String sistemaOperativo;
    //Vacio
    public Computadora(){
        this.marca = " ";
        this.discoDuro = 0;
        this.memoriaRam = 0.0f;
        this.sistemaOperativo = " ";
    }

    public Computadora(String marca, int discoDuro, float memoriaRam, String sistemaOperativo) {
        this.marca = marca;
        this.discoDuro = discoDuro;
        this.memoriaRam = memoriaRam;
        this.sistemaOperativo = sistemaOperativo;
    }
    

    public Computadora(Computadora computadoras){
        this.marca = computadoras.marca;
        this.discoDuro = computadoras.discoDuro;
        this.memoriaRam = computadoras.memoriaRam;
        this.sistemaOperativo = computadoras.sistemaOperativo;
    }

    public void capturarDatos(String cad){
    System.out.println(cad);
    Scanner b = new Scanner(System.in);
    System.out.println("Marca: ");
    this.setMarca(b.nextLine());
    System.out.println("Disco Duro: ");
    this.setDiscoDuro(b.nextInt()); b.nextLine();
    System.out.println("Memoria ram: ");
    this.setMemoriaRam(b.nextFloat()); b.nextLine();
    System.out.println("Sistema operativo: ");
    this.setSistemaOperativo(b.nextLine());
    }
    
    public void imprimirDatos(){
    System.out.println("Marca: " + this.getMarca());
    System.out.println("Disco duro: " + this.getDiscoDuro());
    System.out.println("Memoria ram: " + this.getMemoriaRam());
    System.out.println("Sistema operativo: " + this.getSistemaOperativo());
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }

    public float getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(float memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
}
