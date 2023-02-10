import java.util.Scanner;
public class Ejemplo1{
    public static void main (String[] args){
        
        int[] num= new int[10];

        num[0] = Math.pow(2,0);
        num[1] = Math.pow(2,1);
        num[2] = Math.pow(2,2);
        num[3] = Math.pow(2,3);
        num[4] = Math.pow(2,4);
        num[5] = Math.pow(2,5);
        num[6] = num[2] * 10;
        num[7] = num[2] / 10;
        num[8] = num[0] + num[1] + num[2];
        num[9] = num[8];
    }
}