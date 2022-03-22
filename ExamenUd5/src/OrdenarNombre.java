import java.util.Comparator;

public class OrdenarNombre implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial agrupacionOficial, AgrupacionOficial t1) {
        return agrupacionOficial.getNombre().compareTo(t1.getNombre());
    }
}
