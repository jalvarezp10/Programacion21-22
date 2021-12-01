import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la dimension del array bidimensional");
        int dim= sc.nextInt();
        int max=18;
        int min=64;
        int suma=0;

        int array[][]=new int[dim][dim];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]= (int) (Math.random()*(64-18)+18);

            }

        }
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length ; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }
        System.out.println();


        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (i==j){
                    suma+=array[i][j];
                    System.out.print(array[i][j]+" ");
                    if (max<array[i][j]){
                        max=array[i][j];
                    }
                    if (min>array[i][j]){
                        min=array[i][j];
                    }
                }
            }

        }
        System.out.println();
        System.out.println("La media es: "+ suma/ array.length);
        System.out.println("El maximo es: "+ max);
        System.out.println("El minimo es: "+ min);



    }
}
