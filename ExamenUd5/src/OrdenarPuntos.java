import java.util.Comparator;

public class OrdenarPuntos implements Comparator<AgrupacionOficial> {
    @Override
    public int compare(AgrupacionOficial agrupacionOficial, AgrupacionOficial t1) {

        return t1.getPuntos()- agrupacionOficial.getPuntos();
    }
}
