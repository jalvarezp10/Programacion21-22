import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el tamaño del primer vector");
        int tam1= sc.nextInt();
        System.out.println("Introduce el tamaño del segundo vector");
        int tam2= sc.nextInt();
        int[] a=new int[tam1];
        int[]b=new int[tam2];
        System.out.println("Introduce los datos del primer vector");
        for (int i = 0; i <a.length ; i++) {

            a[i]= sc.nextInt();

        }
        System.out.println("Introduce los datos del segundo vector");
        for (int i = 0; i <b.length ; i++) {
            b[i]= sc.nextInt();

        }
        System.out.println(Arrays.toString(mediaVectores(a,b)));


    }
    public static float[] mediaVectores(int[]a, int[]b){
        float [] resultado=new float[0];
        int contador=0;
        if (a.length>b.length){
            for (int i = 0; i <a.length ; i++) {
                if (i<b.length){
                    resultado= Arrays.copyOf(resultado, resultado.length+1);
                    resultado[contador]=(float)(a[i]+b[i])/2;
                    contador++;

                }else {
                    resultado= Arrays.copyOf(resultado, resultado.length+1);
                    resultado[contador]=a[i];
                    contador++;

                }


            }

        }else {
            for (int i = 0; i <b.length ; i++) {
                if (i<a.length){
                    resultado= Arrays.copyOf(resultado, resultado.length+1);
                    resultado[contador]=(float) (a[i]+b[i])/2;
                    contador++;

                }else {
                    resultado= Arrays.copyOf(resultado, resultado.length+1);
                    resultado[contador]=b[i];
                    contador++;

                }



            }

        }
        return resultado;


    }
}
