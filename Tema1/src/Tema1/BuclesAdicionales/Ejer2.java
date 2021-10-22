package Tema1.BuclesAdicionales;

import java.util.Scanner;

/*Escribe un programa que muestre en tres columnas,
el cuadrado y el cubo de los 5 primeros números enteros a partir de uno
 que se introduce por teclado.*/
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        for (int i =num ; i <=num+5 ; i++) {
            System.out.println(i+"  "+(i*i)+"  "+(i*i*i));
        }
    }
}
