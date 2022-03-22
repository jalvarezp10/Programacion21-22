import java.util.Arrays;
import java.util.Comparator;

public abstract class AgrupacionOficial extends Agrupacion {
    private Integrante[] integrantes;
    private int puntos;

    public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int puntos) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.puntos = puntos;
        this.integrantes=new Integrante[0];
    }

    public Integrante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Integrante[] integrantes) {
        this.integrantes = integrantes;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void addIntregrante(Integrante integrante){
        integrantes =Arrays.copyOf(integrantes, integrantes.length+1);
        integrantes[integrantes.length-1]=integrante;


    }
    public boolean delIntegrante(Integrante integrante){
        Integrante [] resultado=new Integrante[0];
        for (int i = 0; i <integrantes.length; i++) {
            if (!integrante.equals(integrantes[i])){
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=integrantes[i];



            }

        }
        if (resultado.length==integrantes.length){
            return false;

        }else {
            integrantes=resultado;
            return true;
        }
    }
    public void caminito_del_falla(){
        System.out.println("El/la coro/comparsa/chirigota/cuarteto "+getNombre()+" va caminito del falla");
    }

    @Override
    public String toString() {
        return "AgrupacionOficial{" +
                super.toString()+
                "integrantes=" + Arrays.toString(integrantes) +
                ", puntos=" + puntos +
                '}';
    }

}
