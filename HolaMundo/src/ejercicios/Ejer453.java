package ejercicios;

import java.util.Scanner;

public class Ejer453 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double num,num2;
        System.out.println("Introduce el primer numero");
        num=sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        num2=sc.nextDouble();
        System.out.println("La division es: " + (num/num2));
    }
}
