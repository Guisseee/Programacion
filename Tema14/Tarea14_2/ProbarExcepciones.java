package Tema14.Tarea14_2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class ProbarExcepciones{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    int gg;
    String opcionFallo;
    do{
    System.out.println("Elige el tipo de fallo que quieres que ocurra:");
    System.out.println("1. Provocar error StackOverFlowError");
    System.out.println("2. Provocar error NumberFormatException");
    System.out.println("3. Provocar error ArrayIndexOutOfBoundsException");
    System.out.println("4. Provocar error FileNotFoundException");
    System.out.println("5. Provocar error ArithmeticException");
    System.out.println("6. Salir");

    opcionFallo= s.nextLine();
    try {
      gg= Integer.parseInt(opcionFallo);
    } catch (Exception e){
      gg= 0;
      System.out.println("Opcion no valida.");
    }
    switch (gg) {
      case 1:
        try{
          falloStackOverFlowError();
        } catch (StackOverflowError e){
          System.out.println(e.getClass());
        }
        break;

      case 2:
        try{
          falloNumberFormatException(gg);
        }catch (NumberFormatException e){
          System.out.println(e.getClass());
        }
        break;

      case 3:
        try{
          falloArrayIndexOutOfBoundsException(gg);
        }catch (ArrayIndexOutOfBoundsException e){
          System.out.println(e.getClass());
        }
        break;

      case 4:
        try{
          falloFileNotFoundException();
        }catch (FileNotFoundException e){
          System.out.println(e.getClass());
        }
        break;

      case 5:
        try{
          falloArithmeticException(gg);
        }catch (ArithmeticException e){
          System.out.println(e.getClass());
        }
        break;
      default:
    }
  }while(gg!=6);
  }
  public static void falloStackOverFlowError() throws StackOverflowError{
    falloStackOverFlowError();
  }
  public static void falloNumberFormatException(int x) throws NumberFormatException{
    Integer.parseInt("Hola");
  }
  public static void falloArrayIndexOutOfBoundsException (int x) throws ArrayIndexOutOfBoundsException{
    int i[] = new int [1];
    i[2]=0;
  }
  public static void falloFileNotFoundException () throws FileNotFoundException{
    FileReader archivo= new FileReader("hola.txt");
  }
  public static int falloArithmeticException (int x) throws ArithmeticException{
    int num= 0;
    int division= x/num;
    return division;
  }
}