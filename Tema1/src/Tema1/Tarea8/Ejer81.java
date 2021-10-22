package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num;
        num=sc.nextInt();
        while (num!=0){

            if (num>0){
                System.out.println("El numero es positivo");
            }else {
                System.out.println("El numero es negativo");
            }
            num= sc.nextInt();

        }








    }
}
