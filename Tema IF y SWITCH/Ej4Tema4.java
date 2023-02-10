/* programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias se pagan a 12 euros la hora
 * 
 * Autor: Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ej4Tema4 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
    
    int sueldoSemanal;

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = s.nextInt();
    
    if (horasTrabajadas <= 40) {
      sueldoSemanal = 12 * horasTrabajadas;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo semanal que le corresponde es de " + sueldoSemanal + " euros");
  }
}
