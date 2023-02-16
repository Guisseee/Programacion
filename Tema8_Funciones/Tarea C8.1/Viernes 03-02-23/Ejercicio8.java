package Tema8_Funciones;
import Tema8_Funciones.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Dame un número: ");
    int n= s.nextInt();
    System.out.print("El suma sumatorio de 1 hasta "+n+" es: "+Varias.suma1aN(n));
    System.out.println("El factorial de "+n+" es: "+Varias.factorial(n));
    System.out.print("El intermedio de "+n+" entre 1 es: "+Varias.intermedio1aN(n));
  }
  
}
