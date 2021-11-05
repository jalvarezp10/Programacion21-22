package Tema1.EjerciciosExamen;

import java.util.Scanner;

/*Realizar un programa que  solicite al usuario un número entero y que lo siga solicitando mientras ese número no sea positivo.

Una vez hecho esto solicitará al usuario una posición de inicio y una posición de final y
mostrará el número habiéndole quitado todos los dígitos entre esas dos posiciones.
(Supondremos que el usuario es "bueno" y mete correctamente las posiciones y
que la primera posición es la posición 0.*/
public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //variables
        long num;
        int pos1;
        int pos2;
        int contadorPos=0;
        int numeroAlReves=0;
        //ordenes
        System.out.println("Introduce un numero entero");
        num= sc.nextLong();

        System.out.println("Introduce una posicion del numero anterior");
        pos1= sc.nextInt();

        System.out.println("Introduce una segunda posicion");
        pos2= sc.nextInt();
        //le damos la vuelta al numero
        while (num>0){

            int digito= (int) (num%10);
            num=num/10;
            numeroAlReves=(numeroAlReves*10+digito);


        }
        //Hacemos que muestre los numeros de las posiciones nombradas
        while(numeroAlReves>0){
            int digito;
            digito=(numeroAlReves%10);
             numeroAlReves=numeroAlReves/10;
            contadorPos++;
            for (int i = pos1; i <=pos2 ; i++) {
                if (contadorPos!=i){
                    System.out.print(digito);

                }


            }

        }





    }
}
