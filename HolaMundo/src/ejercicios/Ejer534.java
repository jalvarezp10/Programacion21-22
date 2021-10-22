package ejercicios;

import java.util.Scanner;

public class Ejer534 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num;
        System.out.println("introduce un numero");
        num= sc.nextInt();
        if (num%3==0){
            System.out.println("El numero introducido es multiplo de 3");
        }else {
            System.out.println("El numero no es multiplo de 3");
        }
    }
}
