import java.util.Comparator;

public class OrdenarAutor implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial agrupacionOficial, AgrupacionOficial t1) {
        return agrupacionOficial.getAutor().compareTo(t1.getAutor());
    }
}
