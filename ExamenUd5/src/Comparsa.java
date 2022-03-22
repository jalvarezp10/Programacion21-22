import java.util.Objects;

public class Comparsa extends AgrupacionOficial {

    private String empresa;

    public Comparsa(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int puntos, String empresa) {
        super(nombre, autor, autorMusica, autorLetra, tipo, puntos);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Comparsa{" +
                "empresa='" + empresa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comparsa comparsa = (Comparsa) o;
        return Objects.equals(empresa, comparsa.empresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empresa);
    }
}


