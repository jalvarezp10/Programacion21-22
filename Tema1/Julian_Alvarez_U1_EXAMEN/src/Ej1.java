import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la altura");
        int altura= sc.nextInt();
        int espacios=altura-3;
        int anchura=altura-2;

        for (int i = 0; i <1; i++) {
            for (int j = 0; j <espacios; j++) {
                System.out.print(" ");

            }
            for (int j = espacios; j <espacios+1 ; j++) {
                System.out.print("");

            }
            System.out.println();


        }

        for (int i = 1; i <altura-1 ; i++) {
            for (int j = 0; j <espacios ; j++) {
                System.out.print(" ");

            }
            for (int j = espacios; j <altura-1 ; j++) {
                if (j+i==altura-1){
                    System.out.print("");
                }else {
                    System.out.print(" ");
                }




            }
            for (int j = altura; j <anchura ; j++) {
                if (j-i==4){
                    System.out.print("");

                }else {
                    System.out.print(" ");
                }

            }
            espacios--;
            anchura++;
            System.out.println();


        }
        anchura--;
        for (int i = altura-1; i <altura ; i++) {
            for (int j = 0; j <anchura; j++) {
                System.out.print("");

            }
            System.out.println();

        }
        for (int i = altura; i <=altura ; i++) {
            for (int j = 0; j <altura/2+2 ; j++) {
                if (j==altura/2+1){
                    System.out.print("Y");
                }else {
                    System.out.print(" ");
                }


            }

        }
    }
}
