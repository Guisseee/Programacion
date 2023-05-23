package Tema10.TareaC10_1;

public class Producto{
  private String nombre;
  private int cantidad;

  //Constructor
public Producto(String n){
  this.nombre=n;
}
//Metodos
public void setNombre(String n){
  this.nombre=n;
}
public void setCantidad(int c){
  this.cantidad=c;
}
public String getNombre(){
  return nombre;
}
public int getCantidad(){
  return cantidad;
}
}