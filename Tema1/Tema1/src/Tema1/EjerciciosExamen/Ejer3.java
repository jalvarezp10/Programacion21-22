package Tema1.EjerciciosExamen;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //variables
        int alturaIntroducida;



        //ordenes
        System.out.println("Introduce la altura de la flecha");
        alturaIntroducida=sc.nextInt();
        int espacios=(alturaIntroducida/2);


            //espacios
            for (int i = 1; i <=(alturaIntroducida/2)+1 ; i++) {
                //espacios
                for (int j = 1; j <=espacios ; j++) {
                    System.out.print(" ");

                }
                //asteriscos
                for (int j = espacios; j < (alturaIntroducida/2)+1; j++) {
                    System.out.print("*");

                }
                if (i==(alturaIntroducida/2)+1){
                    for (int j = 0; j <5 ; j++) {
                        System.out.print("*");

                    }
                }


                System.out.println();
                espacios--;

            }


           for (int i = (alturaIntroducida/2)+2; i <=alturaIntroducida ; i++) {
               espacios++;
                for (int j =0; j <=espacios ; j++) {
                    System.out.print(" ");
                }
                for (int j =espacios ; j <(alturaIntroducida/2); j++) {
                    System.out.print("*");

                }
               System.out.println();


            }



    }
}
