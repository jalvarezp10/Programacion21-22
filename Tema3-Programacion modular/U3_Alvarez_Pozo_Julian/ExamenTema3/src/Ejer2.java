import java.util.Arrays;

public class Ejer2 {
    public static void main(String[] args) {
        int[]vector={2,5,4,6,5};
        System.out.println(Arrays.toString(insertarValor(vector,5,2)));

    }
    public static int[] insertarValor(int[]vector,int valor,int pos){
        int resultado[]=new int[vector.length+1];
        int aux=0;


        for (int i = 0; i <vector.length ; i++) {
            for (int j = 0; j < resultado.length ; j++) {
                if (pos==i){
                    aux=vector[i];
                    resultado[i]=valor;
                    resultado[i+1]=aux;





                }else {
                    resultado[i]=vector[i];
                }

            }






        }

        return resultado;
    }
}
