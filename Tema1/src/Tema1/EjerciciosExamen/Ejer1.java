package Tema1.EjerciciosExamen;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de cuenta");
        Scanner sc=new Scanner(System.in);
        String numBanco= "1234-1234-22-0000000000";
        String[] parts = numBanco.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String part4 = parts[3];
        if (numBanco.contains("-")){


            int numeroPrimos=Integer.valueOf(part4);
            while (numeroPrimos>0){
                int digito=numeroPrimos%10;
                for (int i = digito; i >0 ; i--) {
                    int contador=0;
                    if (digito%i==0){
                        contador++;


                    }
                    if (contador>2){
                        System.out.println("Numero de cuenta no valido");
                        break;
                    }


                }

            }

        }else if (part1.length()>4||part2.length()>4){
            System.out.println("Numero de cuenta no valido");
        }else if (part3.length()>2){
            System.out.println("Numero de cuenta no valido");

        }else if (part4.length()>10){

        } else {
            System.out.println("Numero de cuenta valido");
        }



    }
}
