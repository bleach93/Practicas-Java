
import java.util.Scanner;

/*
   Imprimir y capturar Datos de computadora.

   Soto Tirado Jesús Eduardo

   03 de Marzo de 2020
 */

public class Computadora {
    private String marca ="";
    private int discoDuro;
    private float memoriaRAM;
    private String SistemaOperativo  ="";
    
    public Computadora(){
        this.marca = "";
        this.discoDuro = 0;
        this.memoriaRAM = 0;
        this.SistemaOperativo = "";
    }

    public Computadora(String marca, int discoDuro, int memoriaRAM, String SistemaOperativo){
        this.marca = marca;
        this.discoDuro = discoDuro;
        this.memoriaRAM = memoriaRAM;
        this.SistemaOperativo = SistemaOperativo;
    }
    
    public Computadora(Computadora computadora){
        this.marca = computadora.marca;
        this.discoDuro = computadora.discoDuro;
        this.memoriaRAM = computadora.memoriaRAM;
        this.SistemaOperativo = computadora.SistemaOperativo;
    }
    
    public void Capturar(){
        Scanner bufer = new Scanner(System.in);
        System.out.print("Marca: ");
        this.marca = bufer.nextLine();
        
        System.out.print("Disco Duro: ");
        this.discoDuro = bufer.nextInt(); bufer.nextLine();
        
        System.out.print("Memoria RAM: ");
        this.memoriaRAM = bufer.nextFloat(); bufer.nextLine();
        
        System.out.print("Sistema Operativo: ");
        this.SistemaOperativo = bufer.nextLine();
    }
    
        public void Imprimir(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Disco Duro: "+ this.discoDuro);
        System.out.println("Memoria RAM: "+ this.memoriaRAM);
        System.out.println("Sistema Operativo: "+ this.SistemaOperativo);
    }
}
