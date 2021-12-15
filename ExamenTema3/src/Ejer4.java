import java.util.Arrays;

public class Ejer4 {
    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                matriz[i][j]= (int) (Math.random()*(100-0)-0);


            }

        }
        for (int []row:matriz) {
            System.out.println(Arrays.toString(row));

        }
        System.out.println();
        System.out.println("El resultado de eliminarFilasImpres: ");
        for (int row[]:eliminarFilasImpares(matriz)) {
            System.out.println(Arrays.toString(row));

        }
        System.out.println();
        System.out.println("El resultado de eliminarFilasPares: ");
        for (int row[]:eliminarFilasPares(matriz)) {
            System.out.println(Arrays.toString(row));

        }



    }
    public static int[][] eliminarFilasPares(int[][] matriz){
        int[][]resultado=new int[matriz.length/2][matriz[0].length];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if (i%2!=0){
                    resultado[i/2][j]=matriz[i][j];
                }

            }


        }
        return resultado;
    }
    public static int[][] eliminarFilasImpares(int[][] matriz){
        int[][]resultado=new int[matriz.length/2][matriz[0].length];
        for (int i = 0; i <matriz.length ; i++) {

            for (int j = 0; j < matriz[i].length ; j++) {
                if (i%2==0){
                    resultado[i/2][j]=matriz[i][j];


                }


            }



        }

        return resultado;


    }
}
