package ejercicios;

import java.util.Scanner;

public class Ejer451 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        byte num,num2;
        System.out.println("Introduce el primer numero");
        num=sc.nextByte();
        System.out.println("Introduce el segundo numero");
        num2=sc.nextByte();
        System.out.println("El producto es: " + (num*num2));
    }
}
