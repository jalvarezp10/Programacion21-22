package ejercicios;

import java.util.Scanner;

public class Ejer454 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float millas=23;
        System.out.println("Introduce el numero de millas");
        millas=sc.nextFloat();
        System.out.println("Las milas equivalen a "+(millas*1609)+"km");

    }
}
