package Tema8_Funciones.TareaC8_1.Viernes_03_02_23;
import Tema8_Funciones.TareaC8_1.Jueves02_02_23.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.print("Dame el ancho del rectangulo: ");
    double ancho= s.nextDouble();
    System.out.print("Dame el alto del rectangulo: ");
    double alto= s.nextDouble();
    System.out.println("El área del rectangulo es: "+Varias.areaRectangulo(ancho, alto));
    System.out.print("El perímetro del rectangulo es: "+Varias.perimetroRectangulo(ancho, alto));
  }
}
