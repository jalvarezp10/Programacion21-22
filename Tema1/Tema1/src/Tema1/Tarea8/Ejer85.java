package Tema1.Tarea8;

import java.util.Scanner;

public class Ejer85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max,min,num;
        System.out.println("Introduzca un valor maximo");
        max= sc.nextInt();
        System.out.println("Introduzca un valor minimo");
        min=sc.nextInt();
        System.out.println("Ahora introduzca un numero");
        num=sc.nextInt();
        while (num<min || num>max){
            System.out.println("Ese valor no esta dentro de tu rango marcado");
            num=sc.nextInt();
        }
        System.out.println("Ese valor esta dentro de tu rango");

    }

}
