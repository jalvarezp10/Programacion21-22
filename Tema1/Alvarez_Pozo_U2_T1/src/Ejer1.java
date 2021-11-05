import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Introduce la altura");
        int altura=7;
        for (int i = 1; i <=altura; i++) {
            for (int j = 0; j <altura*2+3; j++) {
                if (i==1&&j<=7){
                    System.out.print("*");

                }else if (i==1&&j>=10){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }



            }






        }
    }
}
