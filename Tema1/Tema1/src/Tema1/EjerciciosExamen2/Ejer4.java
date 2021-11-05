package Tema1.EjerciciosExamen2;

import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        long num= sc.nextLong();
        int contadorTotales=0;
        int contadorDigi=0;
        int numNuevo=0;
        int numeroAlReves=0;
        while (num>0){

            int digito= (int) (num%10);


            if (digito!=8 && digito!=0){
                numNuevo=numNuevo*10+digito;



            }else {
                contadorDigi++;
            }
            num=num/10;


        }



        while (numNuevo>0){
            int digito=(int)numNuevo%10;
            numeroAlReves=numeroAlReves*10+digito;

            numNuevo=numNuevo/10;





        }
        System.out.println("El numero nuevo es: "+numeroAlReves);
        System.out.println("La cantidad de digitos eliminados son: "+contadorDigi);



    }
}
