package Tema1.EjerciciosExamen;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de cuenta");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int numPrimo;
        if (num.charAt(4) == '-' && num.charAt(9) == '-' && num.charAt(12) == '-' && num.length() == 23) {
            System.out.println("Estos son los numeros de la entidad del banco");
            for (int i = 0; i < 4; i++) {

                System.out.println(num.charAt(i));

            }
            System.out.println("Estos son los numeros de la sucursal");
            for (int i = 5; i < 9; i++) {

                System.out.println(num.charAt(i));

            }
            System.out.println("Estos son los numeros de control");
            for (int i = 10; i < 12; i++) {

                System.out.println();

            }
            numPrimo = Integer.valueOf(num.charAt(22));

            if (num.charAt(22) ==2)
                System.out.println("Este es tu numero de cuenta");
            for (int i = 13; i < 23; i++) {


            }



    }else

    {
        System.out.println("Este numero no es valido");


    }
}
}
