package Tema8_Funciones.TareaC8_1.Jueves02_02_23;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio4{
  public static void main(String[] args) { 
    Scanner s= new Scanner(System.in);
    System.out.print("Dame un número: ");
    int n= s.nextInt();
    System.out.print("Tu número tiene de signo: "+Varias.dimeSigno(n));
  }
}
