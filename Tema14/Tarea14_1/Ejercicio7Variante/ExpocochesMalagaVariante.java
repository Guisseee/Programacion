package Tema14.Tarea14_1.Ejercicio7Variante;
import java.util.Scanner;
public class ExpocochesMalagaVariante {
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    //Declaración de las variables que se van a utilizar
    String opcion;
    String opcion2;
    int n = 0;
    int opcionNum= 0;
    
    //Menú principal del programa
    do {
      System.out.println("\nEXPOCOCHES MÁLAGA");
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      
      opcion = s.nextLine();

      /*Control de las excepciones de la primera decisión del programa
      El cual hace que al poner una letra el programa no muestre el fallo y se vuelva a realizar la pedida del número.
      */
      try{
        opcionNum=Integer.parseInt(opcion);
      }catch (Exception e){
        opcionNum=0;
        //getMessage te dice mediante un mensaje el error que a ocurrido.
        System.out.print(e.getMessage());
      }
      
      //Si se introduce el número 1 aparece este menu que dice las entradas disponibles por zona.
      if (opcionNum == 1) {
        System.out.println("\nEn la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasPorVender());
        System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
      }
      
      //Si se introduce el número 2 aparece este menu que lleva a la zona de las entradas que quieres comprar
      if (opcionNum == 2) {
        System.out.println("\n1. Principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. Vip");
        System.out.print("Elige la zona para la que quieres comprar las entradas: ");
        
        //Controlador de expeccion que se asegura que no se metan letras ni números no permitidos.
        do{
          opcion2 = s.nextLine();
          try{
            opcionNum=Integer.parseInt(opcion2);
          }catch (Exception e){
            opcionNum=0;
            //getClass Te da la clase del error que esta apareciendo.
            System.out.println(e.getClass());
            System.out.print("Introduzca un número de los seleccionados: ");
          } 
        }while (opcionNum==0);


        System.out.print("¿Cuántas entradas quieres? ");
        n = Integer.parseInt(System.console().readLine());
        
        //Diferentes opciones de venta dependiendo de el tipo que sean.
        switch (opcionNum) {
          case 1:
            principal.vender(n);
            break;
          case 2:
            compraVenta.vender(n);
            break;
          case 3:
            vip.vender(n);
            break;
          default:
          System.out.print("Opción no valida");
        }
      }
    } while (opcionNum < 3); // menú principal
  }
}