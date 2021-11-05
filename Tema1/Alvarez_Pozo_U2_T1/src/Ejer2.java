import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int contador=0;
        int contadorPos=0;
        int numeroAlReves=0;
        System.out.println("Introduce un numero entero positivo");
        int num=23445;
        System.out.println("Introduce un numero del 0-9");
        int num2=4;
        while (num>0){

            int digito= (int) (num%10);
            if (digito==num2){
                contador++;

            }

            num=num/10;
            contadorPos++;
            numeroAlReves=(numeroAlReves*10+digito);



        }
        System.out.println("Hay un total de "+contador);
        while (numeroAlReves>0){

            for (int i = 0; i <contadorPos ; i++) {
                int digito=numeroAlReves%10;
                if (digito==num2){

                    System.out.println("El numero se encuentra en la psocion "+i);
                }
                numeroAlReves=numeroAlReves/10;


            }
        }



    }
}
