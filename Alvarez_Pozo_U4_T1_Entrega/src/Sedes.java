import java.util.Arrays;
import java.util.Objects;

public class Sedes {
    private String codSede;
    private Capitales capital;
    private int numMaxOpo;
    private Opositor[] opositores;

    public Sedes(String codSede, Capitales capital, int numMaxOpo) {
        this.codSede = codSede;
        this.capital = capital;
        this.numMaxOpo = numMaxOpo;
    }

    public String getCodSede() {
        return codSede;
    }

    public void setCodSede(String codSede) {
        this.codSede = codSede;
    }

    public Capitales getCapital() {
        return capital;
    }

    public void setCapital(Capitales capital) {
        this.capital = capital;
    }

    public int getNumMaxOpo() {
        return numMaxOpo;
    }

    public void setNumMaxOpo(int numMaxOpo) {
        this.numMaxOpo = numMaxOpo;
    }
    public boolean addOpositores(Opositor opositor){
        if (opositores.length<numMaxOpo){
            opositores= Arrays.copyOf(opositores,opositores.length+1);
            opositores[opositores.length-1]=opositor;
            return true;

        }
        return false;


    }
    public boolean delOpositores(Opositor opositor) {
        if (opositores.length>0 && esta(opositor) == true) {
            Opositor[] resultado = new Opositor[0];
            for (int i = 0; i < resultado.length; i++) {
                if (!opositores[i].equals(opositor)) {
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=opositores[i];

                }

            }
            opositores=resultado;
            return true;


        }
        return false;
    }
    public boolean esta(Opositor opositor){
        for (int i = 0; i <opositores.length ; i++) {
            if (opositores[i].equals(opositor)){
                return true;
            }

        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sedes sedes = (Sedes) o;
        return numMaxOpo == sedes.numMaxOpo && Objects.equals(codSede, sedes.codSede) && capital == sedes.capital && Arrays.equals(opositores, sedes.opositores);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(codSede, capital, numMaxOpo);
        result = 31 * result + Arrays.hashCode(opositores);
        return result;
    }

    @Override
    public String toString() {
        return "Sedes{" +
                "codSede='" + codSede + '\'' +
                ", capital=" + capital +
                ", numMaxOpo=" + numMaxOpo +
                ", opositores=" + Arrays.toString(opositores) +
                '}';
    }
}
