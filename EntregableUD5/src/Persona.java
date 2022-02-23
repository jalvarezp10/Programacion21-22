import java.util.Objects;

public class Persona {
    private String Dni;
    private String nomCompleto;
    private  int id;
    private static int contId=0;

    public Persona(String dni, String nomCompleto) {
        Dni = dni;
        this.nomCompleto = nomCompleto;
        this.id=contId;
        contId++;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNomCompleto() {
        return nomCompleto;
    }

    public void setNomCompleto(String nomCompleto) {
        this.nomCompleto = nomCompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContId() {
        return contId;
    }

    public static void setContId(int contId) {
        Persona.contId = contId;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Dni='" + Dni + '\'' +
                ", nomCompleto='" + nomCompleto + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
