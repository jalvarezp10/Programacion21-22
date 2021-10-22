package Tema1.BuclesAdicionales;

import java.util.Scanner;

/*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
 por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
  El número n se debe introducir por teclado.*/
public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        int a=-1;
        int b=1;
        int suma=0;
        for (int i = 1; i <=num ; i++) {
            suma=a+b;

            System.out.print(suma+" ");
            a=b;
            b=suma;
        }
    }
}
