package ejercicios;

import java.util.Scanner;

public class Ejer434 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numMillas;
        System.out.println("Introduce el numero de millas");
        numMillas=sc.nextInt();
        System.out.println("El resultado en metros es: " + (numMillas*1609));
    }
}
