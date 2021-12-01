import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        int matriz[][]={
                {3,4,6,5},
                {2,6,34,12},
                {54,3,2,13},
        };
        System.out.println(Arrays.toString(desplazarMatriz(matriz,6)));

    }
    public static int[][] desplazarMatriz(int[][]a, int num){
        int resultado[][]=new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {

                resultado[i][j+(num%a[i].length)]=a[i][j];









            }

        }
        return resultado;


    }
}
