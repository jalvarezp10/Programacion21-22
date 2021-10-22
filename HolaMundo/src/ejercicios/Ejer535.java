package ejercicios;

import java.util.Scanner;

public class Ejer535 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero");
        num= sc.nextInt();
        if (num%2==0){
            System.out.println("El numero introducido es par");
        }else {
            System.out.println("El numero introducido es impar");
        }
    }
}
