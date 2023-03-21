package Tema9.TareaC9_2.Ejercicio1.Objetos;

public class Gato {
  //Atributos
  // private static String comer;
  private String nombre;
  private String raza;
  private String color;


  // Constructor
  public Gato(String n, String r, String c){
    this.nombre= n;
    this.raza= r;
    this.color= c;
  }

// Metodos
  public String getNombre (){
    return this.nombre;
  }

/*   public void setNombre (String n){
    this.nombre= n;
  } */

  public String getColor(){
    return color;
  }

/*   public void setColor (String c){
    this.color= c;
    //El void marca lo que devuelve, si lo cambio a string me devuelve el string v.
    //String v= "Texto"
  } */

  public String getRaza(){
    return raza;
  }

/*   public void setRaza (String r){
    this.raza= r;
  } */
}
