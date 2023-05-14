package Tema9.TareaC9_2.Ejercicio1.Objetos;

public class Gato {
  //Atributos
  // private static String comer;
  private String nombre;
  private String raza;
  private String color;
  private String años;
  private int sardinas;



  // Constructor
  public Gato(String n, String r, String c, String a, int s){
    this.nombre= n;
    this.raza= r;
    this.color= c;
    this.años=a;
    this.sardinas= s;
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
  public String getAños(){
    return años;
  }

/*   public void setRaza (String r){
    this.raza= r;
  } */

  //Metodo De comer sardinas
  public int come(int s) {
    if (sardinas < s) {
        int sardinasComidas = sardinas;
        sardinas = 0;
        System.out.print(nombre + ": ");
        for (int i = 0; i < sardinasComidas; i++) {
            System.out.print("Ñam... ");
        }
        return sardinasComidas;
    } else {
        sardinas -= s;
        System.out.print(nombre + ": ");
        for (int i = 0; i < s; i++) {
            System.out.print("Ñam... ");
        }
        return s;
    }
}
}
