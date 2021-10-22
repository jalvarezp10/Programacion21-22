package ejercicios;

import java.util.Scanner;

public class Ejer431 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num,num2;
        System.out.println("Introduce el primer numero");
        num=sc.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=sc.nextInt();
        System.out.println("El producto es: " + (num*num2));
    }
}
