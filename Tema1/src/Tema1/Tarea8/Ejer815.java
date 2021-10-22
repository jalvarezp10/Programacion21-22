package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        int contadorPrimos = 0;

        for (int i = 1; i <= num; i++) {
            int contador = 0;
            for (int j = 1; j <= num; j++) {

                if (j <= i) {

                    if (j % i == 0 || i % j == 0) {
                        contador++;
                    }
                }
            }
            if (contador <= 2) {
                contadorPrimos++;
                System.out.println(i + " Es primo");

            } else {
                System.out.println(i + " No es primo");
            }
        }
        System.out.println("Entre 1 y " + num + " hay un total de " + contadorPrimos + " primos");


    }
}
