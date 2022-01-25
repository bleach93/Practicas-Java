/*
	Clase Hija Pez
	Soto Tirado
	3/20/2020
	5 - 3
 */
package corte3;

public class Pez extends Animal {
      //Atributos
	private String tipoAlimento;
    
      //Constructor vacio
	public Pez(){   
      }

      //Constructor por parametros
     	 public Pez(String nombre, String especie, String color, int edad,String tipoAlimento){
         super(nombre, especie, color, edad);
         this.tipoAlimento=tipoAlimento;
      }

      //Constructor copia 
	public Pez(Pez pez)
      {
        this.nombre = pez.nombre;
        this.especie = pez.especie;
        this.color = pez.color;
        this.edad = pez.edad;
        this.tipoAlimento= pez.tipoAlimento;
      }
    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
   
    //Método imprimir
    public void imprimir(){
        super.imprimir();
        System.out.print("Tipo de alimento: "+this.tipoAlimento);
    }
    
}
