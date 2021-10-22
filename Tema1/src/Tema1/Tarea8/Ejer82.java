package Tema1.Tarea8;
/*Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos
 de los alumnos. Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
 La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad,
  y cuántos alumnos son mayores de edad.*/

import java.util.Scanner;

public class Ejer82 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Introduce la edad del alumno");
        int num;
        int suma=0;
        int contador=0;
        int contadorMayor=0;

        num=sc.nextInt();
        while(num>=0){
            contador++;
            suma=suma+num;
            if (num>=18){
                contadorMayor++;

            }
            System.out.println("Introduce la edad de otro alumno");
            num= sc.nextInt();



        }
        System.out.println("La suma de las edades es: " + suma);
        System.out.println("La media de las edades es: " + (double)suma/contador);
        System.out.println("La cantidad de alumnos mayores de edad es: " +contadorMayor);



    }
}
