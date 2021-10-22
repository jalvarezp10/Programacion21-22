package Tema1.EjerciciosExamen2;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tus tres numeros favoritos");
        int num= sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        int contadorNumIntro=0;
        int contadorNumLot=0;
        System.out.println("Introduce el numero de loteria");
        int numLoteria= sc.nextInt();
        while (numLoteria>0){
            int digito=numLoteria%10;
            if (digito==num2||digito==num||digito==num3){
                contadorNumIntro++;
            }
            numLoteria=numLoteria/10;
            contadorNumLot++;
        }
        if (contadorNumIntro>contadorNumLot/2){
            System.out.println("Este numero va a dar suerte");
        }else {
            System.out.println("Este numero no va a dar suerte");
        }



    }
}
