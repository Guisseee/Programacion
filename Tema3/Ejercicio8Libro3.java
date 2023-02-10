/* Programa que calcula el salario semanal de un empleado en base a las horas trabajadas, a razón de 12 euros la hora.
 *
 *  Autor:Guillermo Jáuregui Lahoz
 * 
 */
import java.util.Scanner;
public class Ejercicio8Libro3{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    
	System.out.print("Dime cuantas horas has trabajado esta semana ");
	int horas= s.nextInt();
	
	int salario;
	salario=horas*12;
	
	System.out.print("El salario que debes cobrar esta semana es: "+salario);
}
}
