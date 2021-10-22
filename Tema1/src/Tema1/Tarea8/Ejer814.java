package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer814 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una altura para el triangulo rectangulo");
        int altura=sc.nextInt();
        for (int i = altura; i >=1 ; i--) {

            for (int j = 0; j <=i-1 ; j++) {
                System.out.print("*");


            }
            System.out.println();

        }
    }
}
