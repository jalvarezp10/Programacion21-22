import java.util.Comparator;

public class ComparadorYear implements Comparator<Propiedad> {

    @Override
    public int compare(Propiedad pr1, Propiedad pr2) {
        int result= pr2.getYear()- pr1.getYear();
        if (result==0){
            return pr2.getMetros()-pr1.getMetros();

        }else {
            return result;
        }

    }
}
