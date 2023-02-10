/*programa que calcula la media de tres notas.
 * 
 * Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio7Tif{
  public static void main (String[] args){
    Scanner s= new Scanner(System.in);
    
    System.out.print("Dame las tres notas y te haré la media de los examenes ");
    double nota1= s.nextDouble();
    double nota2= s.nextDouble();
    double nota3= s.nextDouble();
    
    double media= (nota1+nota2+nota3)/3;
    
    System.out.print("La nota media de tus examenes es: "+media);
}
}
