package Tema1.BuclesAdicionales;
/*Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 El programa nos pedirá la combinación para abrirla.
  Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
  y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
  Tendremos cuatro oportunidades para abrir la caja fuerte.
* */

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        int numeroCorrecto=1234;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero de 4 cifras para abrir la caja fuerte");
        int num= sc.nextInt();
        for (int i = 0; i <3 ; i++) {
            if (num==numeroCorrecto){
                System.out.println("Enhorabuena has abierto la caja");

            }else{
                System.out.println("Numero incorrecto, introduce otro");
                num= sc.nextInt();
            }
            break;
        }
        System.out.println("Lo siento has gastado todas las oportunidades");

    }
}
