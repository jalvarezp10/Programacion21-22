package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contadorDias=0;
        int contadorHoras=0;
        System.out.println("Introduce un numero del dia de la semana");
        int numDia= sc.nextInt();
        System.out.println("Introduce una hora de ese dia");
        int horaDia=sc.nextInt();
        System.out.println("Introduce otro numero del dia de la semana");
        int numDia2=sc.nextInt();
        System.out.println("Introduce otra hora de este mismo dia");
        int horaDia2=sc.nextInt();
        while (numDia!=numDia2 || horaDia!=horaDia2){
            if (numDia<numDia2){
                contadorDias=numDia2-numDia;
                contadorHoras=(contadorDias*24)-(horaDia-horaDia2);
                break;


            }else{

                contadorDias++;
                if (numDia==7){
                    numDia=1;
                }
                if (numDia==numDia2) {
                    contadorHoras=(contadorDias*24)+(horaDia-horaDia2);
                    break;
                }
                numDia++;




            }



        }
        System.out.println("El total de horas es: "+contadorHoras);

    }
}
