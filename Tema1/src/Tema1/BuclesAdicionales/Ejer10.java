package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura de la U");
        int altura= sc.nextInt();

        //primera parte de la U
        for (int i = 1; i <=altura-1 ; i++) {
            //primera columna
            for (int j = 1; j <=2 ; j++) {
                System.out.print("*");


            }
            //espacios
            for (int j =3; j <=5; j++) {
                System.out.print(" ");


            }
            //segunda columna
            for (int j = 6; j <8 ; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
        //parte inferior
        for (int i = altura-1; i <altura ; i++) {
            //primer espacio
            for (int j = 1; j <2 ; j++) {
                System.out.print(" ");

            }
            //parte de asteriscos

            for (int j = 2; j <7; j++) {
                System.out.print("*");

            }
            System.out.println();

        }










    }
}
