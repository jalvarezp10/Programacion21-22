package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num;

        System.out.println("Introduce un numero");
        num= sc.nextLong();
        long a=num;
        for (int i = (int) (num-1); i >1 ; i--) {
            a=a*i;
            System.out.println(a);




            
        }
        

    }
}
