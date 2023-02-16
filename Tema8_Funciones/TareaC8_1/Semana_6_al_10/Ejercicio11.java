package Tema8_Funciones.TareaC8_1.Semana_6_al_10;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio11{
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
    System.out.print("Dime un número y te diré la tabla de mutiplicar: ");
    int num= s.nextInt();
    System.out.print("La tabla de multiplicar de "+num+" es: "+Varias.tablaMultiplicar(num));
  }
}