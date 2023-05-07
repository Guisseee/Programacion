package Tema10.TareaC10_1;

public class Producto extends Ejercicio2 {
  private String nombre;
  private int cantidad;

public void setNombre(String n){
  this.nombre=n;
}
public void setCantidad(int c){
  this.cantidad=c;
}
public String getNombre (String n){
  return nombre;
}
public int getCantidad (int c){
  return cantidad;
}
}