package Tema1.Tarea8;

import java.util.Random;
import java.util.Scanner;

public class Ejer83 {
    public static void main(String[] args) {
        Random r1=new Random();
        Scanner sc=new Scanner(System.in);
        int numAleatorio= r1.nextInt(100)+1;
        System.out.println("Hemos generado un numero del 1-100, Introduce un numero para tratar de adivinarlo");
        int num= sc.nextInt();
        while (num!=-1){
            if (num==numAleatorio){
                System.out.println("Enhorabuena has acertado el numero");
                break;
            } else if (num>numAleatorio){
                System.out.println("Menor , intentelo de nuevo");
                num= sc.nextInt();
            }else {
                System.out.println("Mayor , intentalo de nuevo");
                num= sc.nextInt();
            }

        }



    }
}
