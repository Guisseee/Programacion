package Tema8_Funciones.TareaC8_1.Viernes_03_02_23;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Dame un número: ");
    int n= s.nextInt();
    System.out.println("El sumatorio de 1 hasta "+n+" es: "+Varias.suma1aN(n));
    System.out.println("El factorial de "+n+" es: "+Varias.factorial(n));
    System.out.print("El intermedio de "+n+" entre 1 es: "+Varias.intermedio1aN(n));
  }
  
}
