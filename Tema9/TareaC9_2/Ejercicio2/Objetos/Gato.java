package Tema9.TareaC9_2.Ejercicio2.Objetos;

public class Gato {
  //Atributos
  private String nombre;
  private String color;
  private String raza;

  // Construtor
  public Gato(String nombre, String color, String raza) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
  }

    // Metodos
    // En este ejercicio los Seter no harian falta ya que no se desea cambiar los datos de los gatos
  public String getNombre() {
    return this.nombre;
  }
  public void setNombre(String n) {
    this.nombre = n;
  }
  public String getColor() {
    return color;
  }

  public void setColor(String c) {
    this.color = c;
  }

  public String getRaza() {
    return this.raza;
  }

  public void setRaza(String r) {
    this.raza = r;
  }
}
