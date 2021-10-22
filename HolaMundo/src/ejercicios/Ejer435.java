package ejercicios;

import java.util.Scanner;

public class Ejer435 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int numGrados;
        System.out.println("Introduce el numero de grados centigrados");
        numGrados=sc.nextInt();
        System.out.println("La equivalencia en Fahrenheit es :"+(9*numGrados/5+32));

    }
}
