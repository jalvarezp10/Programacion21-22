import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        int[]numeros=new int[3];
        int []cuadrados=new int[3];
        int []cubo=new int[3];
        for (int i = 0; i < numeros.length ; i++) {
            numeros[i]= (int) (Math.random()*100+1);
            cuadrados[i]=numeros[i]*numeros[i];
            cubo[i]=numeros[i]*numeros[i]*numeros[i];

        }
        for (int i = 0; i <numeros.length ; i++) {
            System.out.print(numeros[i]+" ");
            System.out.print(cuadrados[i]+" ");
            System.out.print(cubo[i]);
            System.out.println();

        }


    }
}
