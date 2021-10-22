package Tema1.EjerciciosExamen2;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la hora");
        int hora= sc.nextInt();
        System.out.println("Introduce los minutos");
        int min= sc.nextInt();
        System.out.println("Introduce los segundos");
        int seg= sc.nextInt();
        for (int i = 0; i <10 ; i++) {
            if (hora<10 && min<10 && seg<10){
                System.out.println("0"+hora+":0"+min+":0"+seg);
            }
            System.out.println(hora+":"+min+":"+seg);
            seg++;
            if (seg==60){
                seg=0;
                min++;

            } else if (min==60) {
                min=0;
                hora++;

            }else if (hora==24){
                hora=0;
            }

        }

    }
}
