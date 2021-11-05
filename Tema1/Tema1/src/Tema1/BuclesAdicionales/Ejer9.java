package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura de la L");
        int altura=sc.nextInt();
        System.out.println("Introduce el grosor de la L");
        int grosor=sc.nextInt();
        int parteVertical=altura-2;
        int parteHorizontal=(altura/2)+1;
        for (int i = 0; i <parteHorizontal ; i++) {
            for (int j = 0; j <grosor ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = 0; i <grosor ; i++) {
            for (int j = 0; j <parteVertical; j++) {
                System.out.print("*");

            }
            System.out.println();

        }

    }
}
