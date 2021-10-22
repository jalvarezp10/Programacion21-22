package ejercicios;

import java.util.Scanner;

public class Ejer533 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int num2;
        System.out.println("Introduce dos numeros");
        num= sc.nextInt();
        num2=sc.nextInt();
        if (num>num2){
            System.out.println(num+" es mayor que "+num2);
        } else {
            System.out.println(num2+" es mayor que "+num);
        }
    }
}
