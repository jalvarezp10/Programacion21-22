public class Ejer3 {
    public static void main(String[] args) {
        int matriz[][]=new int[4][4];
        for (int i = 0; i <matriz.length ; i++) {
            for (int j = 0; j <matriz.length ; j++) {
                matriz[i][j]= (int) (Math.random()*(200-100)-100);



            }

        }
        numPicos(matriz);

    }
    public static int numPicos(int matriz[][]){
        int contadorPicos=0;
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                if (matriz[i][j]>=matriz[i-1][j]&& matriz[i][j]>=matriz[i-1][j-1]&&matriz[i][j]>=matriz[i][j-1]&&matriz[i][j]>=matriz[i+1][j-1]&&matriz[i][j]>=matriz[i+1][j]&&matriz[i][j]>=matriz[i+1][j+1]&&matriz[i][j]>=matriz[i][j+1]&&matriz[i][j]>=matriz[i-1][j+1]){
                    contadorPicos++;
                }

            }

        }
        return contadorPicos;

    }


}
