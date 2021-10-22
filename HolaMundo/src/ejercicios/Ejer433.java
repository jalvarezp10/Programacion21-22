package ejercicios;

import java.util.Scanner;

public class Ejer433 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,num2;
        System.out.println("Introduce el primer numero");
        num=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=sc.nextInt();
        System.out.println("El resto de la division es: " + (num%num2));
    }

}
