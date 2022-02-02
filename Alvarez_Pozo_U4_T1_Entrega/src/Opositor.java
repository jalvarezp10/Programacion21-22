import java.util.Calendar;
import java.util.Objects;

public class Opositor {
    private String nombre;
    private String apellidos;
    private Integer nacimiento;
    private boolean adaptacion;
    private String descAdaptacion;
    private static int numOpositores=0;
    private static int numAdaptaciones=0;

    public Opositor(String nombre, String apellidos, Integer nacimiento, boolean adaptacion, String descAdaptacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.adaptacion = adaptacion;
        if (this.adaptacion==true){
            this.descAdaptacion = descAdaptacion;
            numAdaptaciones++;


        }

        numOpositores++;

    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean isAdaptacion() {
        return adaptacion;
    }

    public void setAdaptacion(boolean adaptacion) {
        this.adaptacion = adaptacion;
    }

    public String getDescAdaptacion() {
        return descAdaptacion;
    }

    public void setDescAdaptacion(String descAdaptacion) {
        this.descAdaptacion = descAdaptacion;
    }

    public static int getNumOpositores() {
        return numOpositores;
    }

    public static void setNumOpositores(int numOpositores) {
        Opositor.numOpositores = numOpositores;
    }

    public static int getNumAdaptaciones() {
        return numAdaptaciones;
    }

    public static void setNumAdaptaciones(int numAdaptaciones) {
        Opositor.numAdaptaciones = numAdaptaciones;
    }
    public void mostrarInformacion(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opositor opositor = (Opositor) o;
        return adaptacion == opositor.adaptacion && Objects.equals(nombre, opositor.nombre) && Objects.equals(apellidos, opositor.apellidos) && Objects.equals(nacimiento, opositor.nacimiento) && Objects.equals(descAdaptacion, opositor.descAdaptacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, nacimiento, adaptacion, descAdaptacion);
    }

    @Override
    public String toString() {
        return "Opositor{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nacimiento=" + nacimiento +
                ", adaptacion=" + adaptacion +
                ", descAdaptacion='" + descAdaptacion + '\'' +
                '}';
    }
}
