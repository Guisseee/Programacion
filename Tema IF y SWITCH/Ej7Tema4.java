/*Programa que calcula la media de tres notas.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ej7Tema4 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
    
    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Por favor, introduzca la primera nota: ");
    double nota1 = s.nextDouble();
    
    System.out.print("Ahora introduzca la segunda nota: ");
    double nota2 = s.nextDouble();
    
    System.out.print("Por último introduzca la tercera nota: ");
    double nota3 = s.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.printf("La media es %.2f\n", media);
    
  }
}
