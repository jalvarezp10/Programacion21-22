import java.util.Comparator;
import java.util.Objects;

public abstract class Propiedad implements Comparable<Propiedad>{
    private Integer year;
    private String direccion;
    private int metros;

    public Propiedad(Integer year, String direccion, int metros) {
        this.year = year;
        this.direccion = direccion;
        this.metros = metros;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "year=" + year +
                ", direccion='" + direccion + '\'' +
                ", metros=" + metros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Propiedad propiedad = (Propiedad) o;
        return metros == propiedad.metros && year.equals(propiedad.year) && direccion.equals(propiedad.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, direccion, metros);
    }

    @Override
    public int compareTo(Propiedad propiedad) {
        return this.metros-propiedad.metros;
    }


}
