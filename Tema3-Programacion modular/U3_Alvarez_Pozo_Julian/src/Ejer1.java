import java.util.Arrays;

public class Ejer1 {
    public static void main(String[] args) {
        int a[]={2,2,3,8};
        int b[]={4,3,8,9,5,2};
        System.out.println(Arrays.toString(interseccionVectores(a,b)));


    }
    public static int[] interseccionVectores(int[]a,int []b){
        int []resultado=new int[0];
        int contador=0;
        for (int i = 0; i <a.length ; i++) {

            for (int j = 0; j <b.length ; j++) {
                if (a[i]==b[j] && !esta(a[i],resultado)){
                    resultado= Arrays.copyOf(resultado,resultado.length+1);
                    resultado[contador]=a[i];
                    contador++;
                }

            }



        }
        Arrays.sort(resultado);
        return resultado;
    }
    public static boolean esta(int num, int v[]){
        boolean esta=false;
        for (int i = 0; i <v.length ; i++) {
            if (num==v[i]){
                esta=true;
                break;
            }

        }
        return esta;
    }
}
