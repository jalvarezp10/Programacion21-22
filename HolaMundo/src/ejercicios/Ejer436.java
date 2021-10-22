package ejercicios;

import java.util.Scanner;

public class Ejer436 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura;
        System.out.println("Introduce la base y la altura");
        base= sc.nextInt();
        altura=sc.nextInt();
        System.out.println("La superficie de el triangulo es: " + ((base*altura)/2));

    }


}
