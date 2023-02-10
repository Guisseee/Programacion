/*El programa pide tu nombre y despues lo imprime en pantalla junto a un mensaje
 * 
 * Autor: Guillermo Jáuregui Lahoz
 */
public class EjercicioIntroducirNombre{
  public static void main (String[] args){
    String nombre;
    System.out.print("Por favor, dime como te llamas: ");
    nombre = System.console().readLine();
    System.out.println("Hola " + nombre + "¡Encantado de conocerte!");
    
    String apellido;
    System.out.print("Por favor, dime tus apellidos tambien ");
    apellido = System.console().readLine();
    System.out.println("Gracias ahora se que tus apellidos son "+apellido);
}
}
