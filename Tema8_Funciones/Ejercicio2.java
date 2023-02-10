package Tema8_Funciones;
import Tema8_Funciones.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio2{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.print("Dime tu edad y te diré si eres mayor o menor de edad: ");
    int edad= s.nextInt();
    boolean edadMayor= Varias.esMayorEdad(edad);
    System.out.print(edadMayor);
  }
}
