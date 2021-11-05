package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce la altura de la piramide");
        int alturaIntroducida=sc.nextInt();
        int espacios=alturaIntroducida-1;
        int anchura=alturaIntroducida;


        for (int i = 1; i <=alturaIntroducida; i++) {
            //espacios
            for (int j = 1; j <=espacios ; j++) {
                System.out.print(" ");


            }
            for (int j = espacios+1; j<=anchura ; j++) {
                if (j==anchura||j==espacios+1){
                    System.out.print("*");
                }else if (i==alturaIntroducida){
                    System.out.print("*");

                }else {
                    System.out.print(" ");
                }



            }
            System.out.println();
            anchura++;
            espacios--;


        }
    }
}
