package Tema1.BuclesAdicionales;

import java.util.Scanner;
//Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
public class Ejer7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        int numNuevo=0;
        int contador=0;
        int digito;

        while (num>0){
            digito=num%10;
            num=num/10;
            numNuevo=(numNuevo*10+digito);
            contador++;





        }
        System.out.println(numNuevo);

    }
}
