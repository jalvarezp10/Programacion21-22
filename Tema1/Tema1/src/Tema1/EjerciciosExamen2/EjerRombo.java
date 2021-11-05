package Tema1.EjerciciosExamen2;

import java.util.Scanner;

public class EjerRombo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura del rombo");
        int alturaIntroducida=sc.nextInt();
        int anchura=alturaIntroducida/2+1;
        int alturaMedia=anchura;
        int espacios=anchura-1;
        String cadena="SAMPLAS";
        int posicion=0;
        //espacios
        for (int i = 0; i <anchura ; i++) {
            for (int j = 0; j <espacios ; j++) {
                System.out.print(" ");

            }

            for (int j = espacios; j <alturaMedia; j++) {
                if (j<alturaIntroducida/2+1){
                    System.out.print(cadena.charAt(posicion));
                    posicion++;


                }

                if (j>=alturaIntroducida/2+1){
                    posicion=j%i;



                    System.out.print(cadena.charAt(posicion));



                }





            }
            System.out.println();
            espacios--;
           alturaMedia++;
           posicion=0;









        }
        espacios=1;
        alturaMedia=alturaIntroducida;
        alturaMedia--;

        for (int i = anchura+1; i <=alturaIntroducida; i++) {
            for (int j = 0; j <espacios; j++) {
                System.out.print(" ");

            }
            for (int j = espacios; j <alturaMedia ; j++) {
                if (j<alturaIntroducida/2+1){
                    System.out.print(cadena.charAt(posicion));
                    posicion++;

                }
                if (j>=alturaIntroducida/2+1){
                    posicion--;

                    System.out.print(cadena.charAt(posicion));

                }


            }

            System.out.println();
            alturaMedia--;
            espacios++;
            posicion=0;
        }


    }
}
