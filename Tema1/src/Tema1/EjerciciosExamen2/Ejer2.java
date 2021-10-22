package Tema1.EjerciciosExamen2;

import java.util.Scanner;

/*Escribe un programa que, dado un número entero,
diga cuáles son y cuánto suman los dígitos pares por un lado, y los impares por otro.
Los dígitos  se deben mostrar en orden, de izquierda a derecha.
Usa long en lugar de int  donde sea necesario para admitir números largos.*/
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num;
        int numTotalPar=0;
        int numTotalImp=0;
        long numeroAlReves=0;
        int aux =0;
        System.out.println("Introduce un numero");
        num=sc.nextLong();
        while (num>0){

            int digito= (int) (num%10);

            num=num/10;
            numeroAlReves=(numeroAlReves*10+digito);


        }
        while (numeroAlReves>0){

            int digito= (int) (numeroAlReves%10);
            if (digito%2==0){

                numTotalPar+=digito;
                System.out.println("Digitos pares:" +digito);

            }else {
                numTotalImp+=digito;
                System.out.println("Digitos Impares: "+digito);
            }
            numeroAlReves=numeroAlReves/10;


        }
        System.out.println("La suma total de pares: "+numTotalPar);
        System.out.println("La suma total de impares: "+numTotalImp);


    }
}
