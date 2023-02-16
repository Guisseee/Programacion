package Tema8_Funciones.TareaC8_1.Viernes_03_02_23;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
  System.out.print("Dame 3 números y te diré el mayor de todos.");
  System.out.print("Tus tres números son: ");
  int num1= s.nextInt();
  int num2= s.nextInt();
  int num3= s.nextInt();
  System.out.print("El numero mayor es: "+Varias.maximo(num1, num2, num3));
  }
}
