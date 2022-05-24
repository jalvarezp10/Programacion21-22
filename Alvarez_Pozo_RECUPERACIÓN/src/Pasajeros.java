import java.util.Objects;

public class Pasajeros {
    private String nombre;
    private String apellidos;
    private String dni;

    public Pasajeros(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasajeros pasajeros = (Pasajeros) o;
        return Objects.equals(nombre, pasajeros.nombre) && Objects.equals(apellidos, pasajeros.apellidos) && Objects.equals(dni, pasajeros.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellidos, dni);
    }

    @Override
    public String toString() {
        return "Pasajeros{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
