/*
	La asistente de un consultorio dental desea obtener la lista de N pacientes que
	asistieron a una cita en el día para calcular el dinero total que debe haber en caja.
	Los datos que se registraron de cada paciente son:
	- Nombre del paciente
	- Celular del paciente
	- Fecha de consulta
	- Tipo de consulta
	- Costo de consulta
 */
package Corte2;

import java.util.Scanner;

/**
 *
 * @author Soto 
 */
public class Paciente {
    private String nombre = " ";
    private int cel;
    private String fecha = " ";
    private String tipoC = " ";
    private float costo;

public Paciente(){
    this.nombre = " ";
    this.cel = 0;
    this.fecha = " ";
    this.tipoC = " ";
    this.costo = 0;
}

public Paciente(String nombre,int cel,String fecha,String tipoC,float cost){
  this.nombre = nombre;
  this.cel = cel;
  this.fecha = fecha;
  this.tipoC = tipoC;
  this.cost = cost;
}

public Paciente(Paciente pacientes){
    this.nombre = pacientes.nombre;
    this.cel = pacientes.cel;
    this.fecha = pacientes.fecha;
    this.tipoC = pacientes.tipoC;
    this.cost = pacientes.cost;
}

public void captura(){
    Scanner b = new Scanner(System.in);
    System.out.print("nombrebre: ");
    this.setnombre(b.nextLine());
    System.out.print("Celular: ");
    this.setCel(b.nextInt()); b.nextLine();
    System.out.print("fechaha: ");
    this.setfecha(b.nextLine());
    System.out.print("Tipo de consulta: ");
    this.settipoC(b.nextLine());
    System.out.print("Costo: ");
    this.setCost(b.nextFloat()); b.nextLine();
}

public void impresion(){
    System.out.println("nombrebre: " + this.getnombre());
    System.out.println("Domicilio: " + this.getCel());
    System.out.println("E-mail: " + this.getfecha());
    System.out.println("Tipo de consulta: " + this.gettipoC());
    System.out.println("Costo: " + this.getCost());
}

public float calculo(){
    return getCost();
}
    //Encapsulacion
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getfecha() {
        return fecha;
    }

    public void setfecha(String fecha) {
        this.fecha = fecha;
    }

    public String gettipoC() {
        return tipoC;
    }

    public void settipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
}
