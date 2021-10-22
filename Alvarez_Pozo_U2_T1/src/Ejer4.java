import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero con un total de cifras pares");
        String num= sc.nextLine();
        int contador=0;
        int contador2=0;
        while (num.length()%2!=0){
            System.out.println("Introduce otro numero");
            num= sc.nextLine();
        }
       int numDiv= Integer.parseInt(num.substring(0,num.length()/2));
       int numDiv2=Integer.parseInt(num.substring((num.length()/2),num.length()));
        for (int i = 1; i <= numDiv; i++) {
            if (numDiv%i==0){
                contador++;
            }


        }
        if (contador>2){
            System.out.println(numDiv+" No es primo");

        }else {
            System.out.println(numDiv+"Es primo");
        }
        for (int i = 1; i <= numDiv2; i++) {

            if (numDiv2%i==0){
                contador2++;
            }


        }
        if (contador2>2){
            System.out.println(numDiv2+" No es primo");

        }else {
            System.out.println(numDiv2+" Es primo");
        }
    }
}

