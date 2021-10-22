package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer810 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero del 1 al 10");
        num= sc.nextInt();

       while (num<1||num>=10){
           System.out.println("Ese numero no esta entre el 1 y el 10");
           num= sc.nextInt();
       }
        for (int i = 1; i <=10 ; i++) {
            System.out.println(num +" X "+i + "= " +num*i);

        }
    }
}
