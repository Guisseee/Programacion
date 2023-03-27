package Tema8_Funciones.TareaC8_1.Semana_6_al_10;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
  Scanner s= new Scanner(System.in);
    System.out.print("Voy a pintar un piramide, dime el caracter y el numero de lineas");
    System.out.print("Caracter: ");
    String Caracter= s.next();
    System.out.print("Numero de lineas:");
    int lineas= s.nextInt();
    System.out.print(Varias.imprimirTriangulo);
  }
}