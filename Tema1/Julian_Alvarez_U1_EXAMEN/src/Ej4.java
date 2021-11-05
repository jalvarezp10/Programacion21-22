import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double gastosEnvio=3.25;
        double total=0;

        System.out.println("Introduzca el ancho de la bandera");
        int ancho=sc.nextInt();
        System.out.println("Introduzca la altura de la bandera");
        int altura= sc.nextInt();
        double precios=(ancho*altura)/100;
        System.out.println("¿Quieres escucho bordado?");
        String sOn= sc.next();
        if (sOn.equals('s')){
            total=precios+2.50;
        }else {
            total=precios;
        }
        total=total+gastosEnvio;
        System.out.println("Gracias aqui tienes el desglose de su compra");
        System.out.println("Bandera de "+ancho*altura+" m2: "+precios+" $");
        if (sOn.equals('s')){
            System.out.println("Con escudo: "+2.5+" $");
        }else {
            System.out.println("Sin escudo: "+0.0+" $");
        }
        System.out.println("Gastos de envio: "+3.25+ " $");
        System.out.println("Total: "+total+ " $");



    }
}
