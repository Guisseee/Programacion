/*Programa que pide una hora por teclado y que muestre luego buenos días, buenas tardes o buenas noches según la hora.
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */

import java.util.Scanner;
public class Ej2Tema4 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);

    System.out.print("Por favor, introduzca una hora del día (0 - 23): ");
    int hora= s.nextInt();
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días");
    }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.println("Buenas noches");
    }
      
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("La hora introducida no es correcta.");
    }
  }
}
