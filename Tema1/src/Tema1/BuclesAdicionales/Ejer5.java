package Tema1.BuclesAdicionales;

import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una altura");
        int altura_introducida= sc.nextInt();
        System.out.println("Introduce un caracter");
        String a=sc.next();

        int altura= 1;

        int espacios=altura_introducida-1;
        while(altura<=altura_introducida){
            for (int i = 1; i <=espacios ; i++) {
                System.out.print(" ");

                
            }
            for (int i = 1; i <altura ; i++) {
                System.out.print(a);



                
            }
            for (int i = altura; i >0 ; i--) {
                System.out.print(a);

            }
            System.out.println();
            altura++;
            espacios--;

        }


    }
}
