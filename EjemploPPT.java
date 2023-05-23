public class EjemploPPT {
  public static void main (String[] args){
  int cont1= 0;
  int cont2= 0;
    System.out.println("Empezemos el juego de piedra, papel y tijera."+"\n");
  do{
  int numero1= ((int)(Math.random()*9)+1);
  switch (numero1){
    case 1:
      System.out.println("Jugador 1 elige: Tijera");
      System.out.println("Jugador 2 elige: Piedra");
      System.out.println("Ganador jugador 2"+"\n");
      cont2 ++;
      break;
    case 2:
      System.out.println("Jugador 1 elige: Tijera");
      System.out.println("Jugador 2 elige: Papel");      
      System.out.println("Ganador jugador 1"+"\n");
      cont1 ++;
      break;
    case 3:
      System.out.println("Jugador 1 elige: Piedra");
      System.out.println("Jugador 2 elige: Papel");
      System.out.println("Ganador jugador 2"+"\n");
      cont2 ++;
      break;
    case 4:
      System.out.println("Jugador 1 elige: Piedra");
      System.out.println("Jugador 2 elige: Tijera");
      System.out.println("Ganador jugador 1"+"\n");
      cont1 ++;
      break;
    case 5: 
      System.out.println("Jugador 1 elige: Papel");
      System.out.println("Jugador 2 elige: Tijera");
      System.out.println("Ganador jugador 2"+"\n");
      cont2 ++;
      break;
    case 6:
      System.out.println("Jugador 1 elige: Papel");
      System.out.println("Jugador 2 elige: Piedra");
      System.out.println("Ganador jugador 1"+"\n");
      cont1 ++;
    case 7:
      System.out.println("Jugador 1 elige: Tijera");
      System.out.println("Jugador 2 elige: Tijera");
      System.out.println("Empate"+"\n");
      break;
    case 8: 
      System.out.println("Jugador 1 elige: Papel");
      System.out.println("Jugador 2 elige: Papel");
      System.out.println("Empate"+"\n");
      break;
    case 9:
      System.out.println("Jugador 1 elige: Piedra");
      System.out.println("Jugador 2 elige: Piedra");
      System.out.println("Empate"+"\n");
      break;
  }
  }while(cont1<5 || cont2<5);
    System.out.println("La partida ha terminado.");
    System.out.println("La puntuación del jugador 1 es: "+cont1);
    System.out.println("La puntuación del jugador 2 es:"+cont2);
  }
}
