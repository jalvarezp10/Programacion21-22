import java.util.Objects;
import java.util.stream.Stream;

public class Alumnos {
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;

    public Alumnos(String dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return dni == alumnos.dni && nombre.equals(alumnos.nombre) && apellido.equals(alumnos.apellido) && direccion.equals(alumnos.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellido, direccion);
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
