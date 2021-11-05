import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num=sc.nextInt();
        int numAlreves=0;

        while (num>0){
            int digito=num%10;
            numAlreves=numAlreves*10+digito;
            num/=10;
        }
        num=numAlreves;

        while (num>0){
            int digito=num%10;
            for (int i = 0; i <digito ; i++) {
                if (digito==0){
                    System.out.print("-");
                }else {
                    System.out.print("*");

                }



            }
            if (num>10){
                System.out.print("-");

            }

            num=num/10;
        }
    }
}
