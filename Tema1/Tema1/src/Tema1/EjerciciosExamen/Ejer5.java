package Tema1.EjerciciosExamen;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        System.out.println("Introduce una posicion del numero");
        int posicion= sc.nextInt();
        System.out.println("Introduce una segunda posicion del numero");
        int poscion2=sc.nextInt();
        int numAlReves=0;
        int contador=0;
        int numFinal=0;
        while (num>0){
            int digito=num%10;
            numAlReves=numAlReves*10+digito;
            num=num/10;



        }
        num=numAlReves;
        numAlReves=0;
        while(num>0) {

            int digito = num % 10;
            if (contador < posicion || contador > poscion2) {
                numAlReves = numAlReves * 10 + digito;

            }
            num/=10;
            contador++;

        }
        System.out.println(numAlReves);
    }
}
