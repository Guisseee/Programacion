package Tema9.TareaC9_2.Ejercicio1;
import java.util.Scanner;
import  Tema9.TareaC9_2.Ejercicio1.Objetos.Gato;

public class PruebaGatos {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    Gato[] gato = new Gato[4];
    String nombre, raza, color;

    // Se piden los datos de los gatos y se almacenan en el nuevo gato.
    System.out.println("Dame los datos de los 4 gatos");
    for(int i=0; i<4; i++){
      System.out.println("Gato número "+(i+1));
      System.out.print("Nombre: ");
      nombre= s.next();
      System.out.print("Raza: ");
      raza= s.next();
      System.out.print("Color: ");
      color= s.next();
      gato[i]= new Gato(nombre, raza, color);
    }

    System.out.println(" ");

    // Se muestran por pantalla los datos de los gatos introducidos por pantalla.
    for(int i=0; i<4; i++){
      System.out.println("Los datos del gato "+(i+1)+" son los siguientes.");
      System.out.println("Nombre: "+ gato[i].getNombre());
      System.out.println("Raza: "+ gato[i].getRaza());
      System.out.println("Color: "+gato[i].getColor()+"\n");
    }
  }
}
