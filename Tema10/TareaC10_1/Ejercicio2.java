package Tema10.TareaC10_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    ArrayList<Producto> Producto= new ArrayList<Producto>();
    Producto p1= new Producto("Manzana");
    Producto p2= new Producto("Agua");
    Producto p3= new Producto("Sarten");
    Producto p4= new Producto("Yogurt");
    Producto p5= new Producto("Aguacate");

    Producto.add(p1);
    Producto.add(p2);
    Producto.add(p3);
    Producto.add(p4);
    Producto.add(p5);

    System.out.println("Primer bucle");
  for (int i=0;i<5;i++) {
    System.out.println(" "+Producto.get(i).getNombre());
  }

  System.out.println("Segundo bucle");
  //Eliminar dos posiciones y añadir una
  Producto.remove(1);
  Producto.remove(2);
  Producto.add(p2);
  //Segundo bucle para imprimir los cambios
  for (int i=0;i<Producto.size();i++) {
    
    System.out.println(" "+Producto.get(i).getNombre());
  }
  //Bucle para eliminar todos los datos
  for (int i=0;i<Producto.size();i++) {
    
    Producto.remove(i);
  }
    //for(int i=0; i<5; i++){
      //Producto i= new Producto(); 
    //}
  }
}
