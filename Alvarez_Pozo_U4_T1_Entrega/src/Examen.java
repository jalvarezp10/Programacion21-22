import java.util.Arrays;
import java.util.Calendar;

public class Examen {
    private Preguntas[] preguntas;
    private Sedes[] sedes;
    private Calendar fecha;
    private String conserjeria;
    private String url;
    private final int capacidad=100;

    //contructor
    public Examen( String conserjeria, String url) {
        this.fecha = Calendar.getInstance();
        this.conserjeria = conserjeria;
        this.url = url;
        this.preguntas=new Preguntas[0];
        this.sedes=new Sedes[0];
    }
    //getters y setters


    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }

    public Sedes[] getSedes() {
        return sedes;
    }

    public void setSedes(Sedes[] sedes) {
        this.sedes = sedes;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public String getConserjeria() {
        return conserjeria;
    }

    public void setConserjeria(String conserjeria) {
        this.conserjeria = conserjeria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getCapacidad() {
        return capacidad;
    }

    //add y del sedes
    public void addSede(Sedes sede){
        sedes= Arrays.copyOf(sedes,sedes.length+1);
        sedes[sedes.length-1]=sede;

    }
    public boolean delSede(Sedes sede){
        if (sedes.length>0 && esta(sede) == true) {
            Sedes[] resultado = new Sedes[0];
            for (int i = 0; i < resultado.length; i++) {
                if (!sedes[i].equals(sede)) {
                    resultado=Arrays.copyOf(resultado,resultado.length+1);
                    resultado[resultado.length-1]=sedes[i];

                }

            }
            sedes=resultado;
            return true;


        }
        return false;

    }
    public boolean esta(Sedes sede){
        for (int i = 0; i <sedes.length ; i++) {
            if (sedes[i].equals(sede)){
                return true;
            }

        }
        return false;
    }
    //añadir y borrar preguntas
    public boolean addPreguntas(Preguntas pregunta){
        if (preguntas.length<capacidad){
            preguntas= Arrays.copyOf(preguntas,preguntas.length+1);
            preguntas[preguntas.length-1]=pregunta;
            return true;



        }
        return false;
    }
    public boolean delPregunta(Preguntas pregunta){
        if (preguntas.length>0 && esta(pregunta) == true) {
            Preguntas[] resultado = new Preguntas[sedes.length - 1];
            for (int i = 0; i < resultado.length; i++) {
                if (!pregunta.equals(preguntas[i])) {
                    resultado[i] = preguntas[i];

                }

            }
            preguntas=resultado;
            return true;


        }
        return false;

    }
    public boolean esta(Preguntas pregunta){
        for (int i = 0; i <sedes.length ; i++) {
            if (pregunta.equals(preguntas[i])){
                return true;
            }

        }
        return false;
    }
    public void mostrarInformacion(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Examen{" +
                "preguntas=" + Arrays.toString(preguntas) +
                ", sedes=" + Arrays.toString(sedes) +
                ", fecha=" + fecha +
                ", conserjeria='" + conserjeria + '\'' +
                ", url='" + url + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
