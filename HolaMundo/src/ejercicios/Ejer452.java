package ejercicios;

import java.util.Scanner;

public class Ejer452 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        short fechaNacimiento,fechaActual;
        System.out.println("Introduce la fecha de nacimiento");
        fechaNacimiento=sc.nextShort();
        System.out.println("Introduce la fecha actual");
        fechaActual=sc.nextShort();
        System.out.println("La edad es: "+ (fechaActual-fechaNacimiento));
    }
}
