import java.util.Arrays;
import java.util.Objects;

public class Preguntas {
    private String enunciado;
    private Opciones[] opcion;
    private final int capacidad=3;

    public Preguntas(String enunciado) {
        this.enunciado = enunciado;
        this.opcion = new Opciones[0];
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Opciones[] getOpcion() {
        return opcion;
    }

    public void setOpcion(Opciones[] opcion) {
        this.opcion = opcion;
    }

    public int getCapacidad() {
        return capacidad;
    }
    public boolean addOpciones(Opciones opcione){
        if (opcion.length<capacidad){
            opcion= Arrays.copyOf(opcion,opcion.length+1);
            opcion[opcion.length-1]=opcione;
            return true;



        }
        return false;
    }
    public boolean delOpciones(Opciones opcione){
        if (opcion.length>0 && esta(opcione)) {
            Opciones[] resultado = new Opciones[0];
            for (int i = 0; i < opcion.length; i++) {
                if (!opcion[i].equals(opcione)) {
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=opcion[i];

                }

            }
            opcion=resultado;
            return true;


        }
        return false;

    }
    public boolean esta(Opciones opcione){
        for (int i = 0; i <opcion.length ; i++) {
            if (opcion[i].equals(opcione)){
                return true;
            }

        }
        return false;
    }
    public void mostrarInformacion(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Preguntas preguntas = (Preguntas) o;
        return capacidad == preguntas.capacidad && Objects.equals(enunciado, preguntas.enunciado) && Arrays.equals(opcion, preguntas.opcion);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(enunciado, capacidad);
        result = 31 * result + Arrays.hashCode(opcion);
        return result;
    }

    @Override
    public String toString() {
        return "Preguntas{" +
                "enunciado='" + enunciado + '\'' +
                ", opcion=" + Arrays.toString(opcion) +
                ", capacidad=" + capacidad +
                '}';
    }
}
