import java.util.Scanner;
public class PruebaVehiculos {
  private static boolean isNumeric(String str){
    return str != null && str.matches("[0-9.]+");
  }
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String opcion;
    int km;
    int opcionNum= 0;
    
    Bicicleta bici = new Bicicleta(9);
    Coche coche = new Coche(1900);

    while (opcionNum != 8) {
      System.out.println("\n1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      
      opcion = s.nextLine();
      
      if(isNumeric(opcion)){
        opcionNum=Integer.parseInt(opcion);
      }else 
        opcionNum= 0;

      switch (opcionNum) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = s.nextInt();
          bici.recorre(km);
          break;
        case 2:
          bici.hazCaballito();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = s.nextInt();
          coche.recorre(km);
          break;
        case 4:
          coche.quemaRueda();
          break;
        case 5:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(bici.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.print("El coche lleva recorridos ");
          System.out.println(coche.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.print("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
        System.out.print("Opcion no valida");
      }
    }
  }
}