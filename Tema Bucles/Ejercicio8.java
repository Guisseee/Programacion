/*Programa que Muestra la tabla de multiplicar de un número introducido por teclado
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    
    System.out.print("Introduzca un número y le mostraré su tabla de multiplicar: ");
    int numeroIntroducido = s.nextInt();
        
    for (int i = 0; i <= 10; i++) {
      System.out.println(numeroIntroducido+" x "+i+"="+numeroIntroducido*i );
}
}
}
