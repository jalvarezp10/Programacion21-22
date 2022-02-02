import java.util.Objects;

public class Opciones {
    private String texto;
    private boolean tof;

    public Opciones(String texto, boolean tof) {
        this.texto = texto;
        this.tof = tof;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean isTof() {
        return tof;
    }

    public void setTof(boolean tof) {
        this.tof = tof;
    }
    public void mostrarInformacion(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opciones opciones = (Opciones) o;
        return tof == opciones.tof && Objects.equals(texto, opciones.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(texto, tof);
    }

    @Override
    public String toString() {
        return "Opciones{" +
                "texto='" + texto + '\'' +
                ", tof=" + tof +
                '}';
    }
}
