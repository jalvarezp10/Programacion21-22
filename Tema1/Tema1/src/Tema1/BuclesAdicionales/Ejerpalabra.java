package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejerpalabra {
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        Scanner sc=new Scanner(System.in);
        String frase= sc.nextLine();
        int contador=1;

        String[] parts = frase.split(" ");


        for (int i = 0; i <frase.length() ; i++) {
            if (frase.charAt(i)!=' '){




            }

        }
        System.out.println("Hay un total de: "+contador+" palabras");
    }
}
