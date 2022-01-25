
import java.util.Scanner;

/*
    Captura de un celular con todos sus datos.
    
    Soto Tirado Jesús Eduardo

    03 de Marzo de 2020.
    
 */

public class Celular {

    private String marca ="";
    private int espacio;
    private float memoriaRAM;
    private String SistemaOperativo;
    private float Precio;
    private float Descuento;
    
    public Celular(){
        this.marca = "";
        this.espacio = 0;
        this.memoriaRAM = 0;
        this.SistemaOperativo = "";
        this.Precio = 0;
        this.Descuento = 0;
    }

    public Celular(String marca, int espacio, float memoriaRAM, String SistemaOperativo, float Precio, float Descuento){
        this.marca = marca;
        this.espacio = espacio;
        this.memoriaRAM = memoriaRAM;
        this.SistemaOperativo = SistemaOperativo;
        this.Precio = Precio;
        this.Descuento = Descuento;
    }
    
    public Celular(Celular celular){
        this.marca = celular.marca;
        this.espacio = celular.espacio;
        this.memoriaRAM = celular.memoriaRAM;
        this.SistemaOperativo = celular.SistemaOperativo;
        this.Precio = celular.Precio;
        this.Descuento = celular.Descuento;

    }
    
    public void Capturar(){
        Scanner bufer = new Scanner(System.in);
        System.out.print("Marca: \n");
        this.marca = bufer.nextLine();

        System.out.print("Espacio: \n");
        this.espacio = bufer.nextInt(); bufer.nextLine();
      
        System.out.print("RAM: \n");
        this.memoriaRAM = bufer.nextFloat(); bufer.nextLine();
        
        System.out.print("Sistema Operativo: \n");
        this.SistemaOperativo = bufer.nextLine();
        
        System.out.print("Precio en Pesos Mexicanos: \n");
        this.Precio = bufer.nextFloat(); bufer.nextLine();
        
        System.out.print("Descuento: \n");
        this.Descuento = bufer.nextFloat(); bufer.nextLine();
    }
    
      public void Imprimir(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Espacio: "+ this.espacio);
        System.out.println("RAM: "+ this.memoriaRAM);
        System.out.println("Sistema Operativo:$ "+ this.SistemaOperativo);
        System.out.println("Precio: "+ this. Precio);
        System.out.println("Descuento: "+ this.Descuento);
    }
}
