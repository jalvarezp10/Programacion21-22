package Tema1.EjerciciosExamen2;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //variables
        int altura;
        int espacios=0;



        System.out.println("Introduce la altura del reloj de arena");
        altura= sc.nextInt();
        int aux=altura;
        int alturaMitad=(altura/2)+1;
        for (int i = 0; i <alturaMitad ; i++) {

            for (int j = 0; j <espacios ; j++) {
                System.out.print(" ");

            }

            for (int j = espacios; j <altura ; j++) {
                System.out.print("*");


            }
            System.out.println();
            espacios++;
            altura--;


        }
        altura++;
        espacios--;
        for (int i = alturaMitad+1; i <=aux ; i++) {
            espacios--;
            altura++;
            for (int j = 0; j <espacios ; j++) {
                System.out.print(" ");

            }
            for (int j = espacios; j <altura ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }



    }
}
