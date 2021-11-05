package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class EjerZ {
    public static void main(String[] args) {
        System.out.println("Introduce la altura");
        Scanner sc=new Scanner(System.in);
        int altura=sc.nextInt();
        for (int i = 0; i <altura; i++) {
            for (int j = 0; j <altura; j++) {
               if (i==0||i==altura-1||i+j==altura-1){
                   System.out.print("*");
               }

               else {
                   System.out.print(" ");
               }

            }
            for (int j = altura; j <altura+3 ; j++) {
                System.out.print(" ");

            }
            for (int j = altura+3; j <altura*2+3; j++) {
                if (i==0||i==altura-1||i+j==altura*2+2){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
