import java.util.Comparator;

public class ComparadorNumHab implements Comparator<Vivienda> {

    @Override
    public int compare(Vivienda v1, Vivienda v2) {
        return v1.getNumHabitaciones()-v2.getNumHabitaciones();


    }
}
