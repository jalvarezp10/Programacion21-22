package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer812 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int notas= sc.nextInt();
        int contador=0;
        for (int i = 0; i <4; i++) {
            notas=sc.nextInt();
            if (notas<5){
                contador++;
            }




        }
        if (contador>1){
            System.out.println("Hay algun suspenso");
        }else {
            System.out.println("No hay ningun suspenso");
        }

    }
}
