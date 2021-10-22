package ejercicios;

import java.util.Scanner;

public class Ejer532 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        num=sc.nextInt();
        if (num<0){
            System.out.println("El numero es negativo");
        }
        else if (num>0){
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es cero");
        }
    }

}
