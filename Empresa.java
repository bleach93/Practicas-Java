/*
	En una empresa se desea obtener el listado del salario quincenal de N empleados,
	teniendo de cada uno de ellos la siguiente información:
	- Clave
	- Nombre
	- RFC
	- Puesto
	- Sueldo diario
	Calcular el sueldo quincenal en base al sueldo diario
 */
package Corte_2;

import java.util.Scanner;

/**
 *
 * 
 * @author Soto
 */
public class Empresa {
    private String clave;
    private String nombre;
    private String rfc;
    private String puesto;
    private float sdiario;
    
    //Vacio
    public Empresa(){
        this.clave = " ";
        this.nombre = " ";
        this.rfc = 0.0f;
        this.puesto = " ";
        this.sdiario = 0.0f;
    }
    //Parametro
    public Empresa(String clave, String nombre, float rfc, String puesto, float sdiario){
        this.clave = clave;
        this.nombre = nombre;
        this.rfc = rfc;
        this.puesto = puesto;
        this.sdiario = sdiario;
    }
    //Copia
    public Empresa(Empresa Empresa){
        this.clave = Empresa.clave;
        this.nombre = Empresa.nombre;
        this.rfc = Empresa.rfc;
        this.puesto = Empresa.puesto;
        this.sdiario = Empresa.sdiario;
    }

    public void captura(){
     Scanner b = new Scanner(System.in);
        System.out.println("Ingrese la Clave: ");
        this.setclave(b.nextLine());
        System.out.println("Ingrese el Nombre: ");
        this.setnombre(b.nextLine());
        System.out.println("Ingrese el RFC: ");
        this.setrfc(b.nextFloat()); b.nextLine();
        System.out.println("Ingrese el Puesto: ");
        this.setpuesto(b.nextLine());
        System.out.println("Ingrese el Sueldo Diario: ");
        this.setsdiario(b.nextFloat()); b.nextLine();
    }

    public void impresion(){
        System.out.println("Clave: " + this.getclave());
        System.out.println("Nombre: " + this.getnombre());
        System.out.println("RFC: " + this.getrfc());
        System.out.println("Puesto: " + this.getpuesto());
        System.out.println("Sueldo Diario: " + this.getsdiario());
    }

    public String getclave() {
        return clave;
    }

    public void setclave(String clave) {
        this.clave = clave;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public float getrfc() {
        return rfc;
    }

    public void setrfc(float rfc) {
        this.rfc = rfc;
    }

    public String getpuesto() {
        return puesto;
    }

    public void setpuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getsdiario() {
        return sdiario;
    }

    public void setsdiario(float sdiario) {
        this.sdiario = sdiario;
    }
    
}
