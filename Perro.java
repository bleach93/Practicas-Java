/*
	Clase Hija Perro
	Soto Tirado
	3/20/2020
	5 - 3
 */
package corte3;

public class Perro extends Animal {
    //Atributos 
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
   
    //Contrustor vacio
    public Perro(){
        
    }
    //Constructor por parametros
    public Perro(String nombre, String especie, String color, int edad,String raza){
        super( nombre, especie, color, edad);
        this.raza=raza;
        
    }

    //Constructor copia
    public Perro(Perro perro){
        this.nombre = perro.nombre;
        this.especie = perro.especie;
        this.color = perro.color;
        this.edad = perro.edad;
        this.raza= perro.raza;
    }

    //Método imprimir
    public void imprimir(){
        super.imprimir();
        System.out.print("raza: "+this.raza);
    }
}
