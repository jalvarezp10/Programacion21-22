package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce 10 numeros");
        int contadorPositivos=0;
        int contadorNegativos=0;
        int contadorCeros=0;
        int num;
        for (int i = 0; i <=9 ; i++) {
            num=sc.nextInt();
            if (num>0){
                contadorPositivos++;
            }else if (num<0){
                contadorNegativos++;
            }else {
                contadorCeros++;
            }

        }
        System.out.println("Hay un total de: "+contadorPositivos+" numeros positivos");
        System.out.println("Hay un total de: "+contadorNegativos+" numeros negativos");
        System.out.println("Hay un total de: "+contadorCeros+" ceros");



    }
}
