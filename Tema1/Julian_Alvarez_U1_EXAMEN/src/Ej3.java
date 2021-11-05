import java.util.Random;

public class Ej3 {
    public static void main(String[] args) {
        Random ramdom=new Random();
        String[] palos={"Corazones","Picas","Diamantes","Treboles"};
        int numPalos= ramdom.nextInt(3);
        System.out.println(palos[numPalos]);


        int num2=ramdom.nextInt(13);
        String num="JQKA";
        if (num2<=9){
            System.out.println(num2);
        }else{
            System.out.println(num.charAt(num2-10));
        }



    }
}
