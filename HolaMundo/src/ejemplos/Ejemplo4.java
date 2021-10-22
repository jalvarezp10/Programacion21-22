package ejemplos;

import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        System.out.println("Introduce un segundo numero");
        int num2=sc.nextInt();
        System.out.println("La suma de los dos numeros es :"+ (num+num2));
    }
}
