import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int precio=0;
        System.out.println("Numero de entradas");
        int entradas= sc.nextInt();
        System.out.println("Dia de la semana");
        String dia= sc.nextLine();
        System.out.println("¿Tienes tarjeta cine?");
        String sino=sc.nextLine();
        if (dia.equals("miercoles")){
            precio=5*entradas;

        } else if (dia.equals("jueves")){

            if (entradas%2==0){
                precio= (int) (entradas*5.5);
            }
        }


    }
}
