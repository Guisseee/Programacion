package Tema9.TareaC9_2.Ejercicio2;
import  Tema9.TareaC9_2.Ejercicio2.Objetos.Gato;

public class PruebaGato {
  public static void main(String[] args) {
    Gato[] gato = new Gato[4];
    int i;
    //Se le dan los valores a los gatos en el mismo programa.
    gato[0] = new Gato("Garfield", "naranja", "mestizo", "11");
    gato[1] = new Gato("Pepe", "gris", "angora", "5");
    gato[2] = new Gato("Mauri", "blanco", "manx", "7");
    gato[3] = new Gato("Pedro", "verde", "persa", "3");
    System.out.println("\nDatos de los gatos.");

    for (i = 0; i < 4; i++) {
      // Se imprimen los datos de los gatos.
      System.out.println("\nGato nº" + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
      System.out.println("Años: " + gato[i].getAños());
    }
  }
}
