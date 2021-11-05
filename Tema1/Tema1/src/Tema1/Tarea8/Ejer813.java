package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer813 {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
        System.out.println("Introduce seis notas");
        int notas= sc.nextInt();
        int contadorSus=0;
        int contadorApr=0;
        int contadorCond=0;
        for (int i = 0; i <5; i++) {
            notas=sc.nextInt();
            if (notas<4){
                contadorSus++;
            }else if (notas==4){
                contadorCond++;


            }else {
                contadorApr++;
            }
        }
        System.out.println("La cantidad de aprobados es: " + contadorApr);
        System.out.println("La cantidad de condicionados es: " + contadorCond);
        System.out.println("La cantidad de suspensos es: " + contadorSus);

    }
}
