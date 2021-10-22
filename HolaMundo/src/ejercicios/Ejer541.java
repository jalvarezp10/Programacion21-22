package ejercicios;

import java.util.Scanner;

public class Ejer541 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,num2;
        System.out.println("Introduce dos numeros");
        num= sc.nextInt();
        num2= sc.nextInt();
        if (num>0 && num2>0){
            System.out.println("Los dos numeros son positivos");
        }else if (num>0 && num2<0){
            System.out.println(num+" Es positivo");

        } else if (num<0 && num2>0){
            System.out.println(num2+" Es positivo");
        }else{
            System.out.println("Ninguno es positivo");
        }
    }
}
