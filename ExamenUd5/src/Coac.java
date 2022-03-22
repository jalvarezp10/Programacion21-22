import java.util.Arrays;
import java.util.Comparator;

public class Coac  {

    private AgrupacionOficial[]agrupaciones;

    public Coac(AgrupacionOficial[] agrupaciones) {
        this.agrupaciones = new AgrupacionOficial[0];

    }

    public AgrupacionOficial[] getAgrupaciones() {
        return agrupaciones;
    }

    public void setAgrupaciones(AgrupacionOficial[] agrupaciones) {
        this.agrupaciones = agrupaciones;
    }
    public void inscribir_agrupacion(AgrupacionOficial agrupacion){
        agrupaciones=Arrays.copyOf(agrupaciones,agrupaciones.length+1);
        agrupaciones[agrupaciones.length-1]=agrupacion;
    }

    public boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        AgrupacionOficial[]resultado=new AgrupacionOficial[0];
        for (int i = 0; i <agrupaciones.length ; i++) {
            if (!agrupacion.equals(agrupaciones[i])){
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=agrupaciones[i];

            }

        }
        if (agrupaciones.length==resultado.length){
            return false;
        }else {
            agrupaciones=resultado;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Coac{" +
                "agrupaciones=" + Arrays.toString(agrupaciones) +
                '}';
    }

   public void ordenar_por_puntos(){
        Arrays.sort(agrupaciones,new OrdenarPuntos());

   }
    public void ordenar_por_nombre(){
        Arrays.sort(agrupaciones,new OrdenarNombre());
    }
    public void ordenar_por_autor(){
        Arrays.sort(agrupaciones,new OrdenarAutor());

    }

}
