package Tema9.TareaC9_2.Ejercicio1;
import java.util.Scanner;
import  Tema9.TareaC9_2.Ejercicio1.Objetos.Gato;

public class PruebaGato {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    Gato[] gato = new Gato[4];

    System.out.println("Dame los datos de los 4 gatos");
    for (int i=0; i<4; i++){
      //lo de new gato y toa la paranolla esa.
      System.out.println("Gato numero "+(i+1));
      System.out.print("Nombre: ");
      gato[i].setNombre(s.next());
      System.out.print("Raza: ");
      gato[i].setRaza(s.next());
      System.out.print("Color: ");
      gato[i].setColor(s.next());
    }

    for(int i=0; i<4; i++){
    System.out.println("Los datos de los gatos son los siguientes.");
    System.out.println("Nombre: "+ gato[i].getNombre());
    System.out.println("Raza: "+ gato[i].getRaza());
    System.out.println("Color: "+gato[i].getColor());
    }
  }
}
