package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura");
        int altura = sc.nextInt();

        while (altura < 3 || altura % 2 == 0) {
            System.out.println("Introduce otra altura que sea impar y mayor que 3");
            altura=sc.nextInt();


        }
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= altura; j++) {
                if (i == j || i + j == altura+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
