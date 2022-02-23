import java.util.Arrays;
import java.util.Objects;

public class Vivienda extends Propiedad implements Venta{
    private int numBanios;
    private int numHabitaciones;
    private int capPersonas;
    private double precio;
    private Persona []personas;

    public Vivienda(Integer year, String direccion, int metros, int numBanios, int numHabitaciones, int capPersonas, double precio) {
        super(year, direccion, metros);
        this.numBanios = numBanios;
        this.numHabitaciones = numHabitaciones;
        this.capPersonas = capPersonas;
        this.precio = precio;
        this.personas = new Persona[0];
    }

    public int getNumBanios() {
        return numBanios;
    }

    public void setNumBanios(int numBanios) {
        this.numBanios = numBanios;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getCapPersonas() {
        return capPersonas;
    }

    public void setCapPersonas(int capPersonas) {
        this.capPersonas = capPersonas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona[] getPersonas() {
        return personas;
    }

    public void setPersonas(Persona[] personas) {
        this.personas = personas;
    }
    public boolean addPersona(Persona persona){
        if (!esta(persona) && personas.length<capPersonas){
            personas=Arrays.copyOf(personas,personas.length+1);
            personas[personas.length-1]=persona;
            return true;
        }else {
            return false;
        }




    }
    public boolean delPersona(Persona persona){
        Persona[]resultado=new Persona[0];
        for (int i = 0; i <personas.length ; i++) {
            if (!persona.equals(personas[i])){
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=personas[i];


            }


        }
        personas=resultado;
        return true;

    }
    public boolean esta(Persona persona){
        for (int i = 0; i <personas.length ; i++) {
            if (persona.equals(personas[i])){
                return true;
            }

        }
        return false;
    }


    @Override
    public String toString() {
        return "Vivienda{" +
                super.toString()+
                "numBanios=" + numBanios +
                ", numHabitaciones=" + numHabitaciones +
                ", capPersonas=" + capPersonas +
                ", precio=" + precio +
                ", personas=" + Arrays.toString(personas) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Vivienda vivienda = (Vivienda) o;
        return numBanios == vivienda.numBanios && numHabitaciones == vivienda.numHabitaciones && capPersonas == vivienda.capPersonas && Double.compare(vivienda.precio, precio) == 0 && Arrays.equals(personas, vivienda.personas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(super.hashCode(), numBanios, numHabitaciones, capPersonas, precio);
        result = 31 * result + Arrays.hashCode(personas);
        return result;
    }

    @Override
    public void mostraPrecioVenta() {
        System.out.println("Soy una Vivienda con capacidad máxima "+capPersonas+" y valgo "+this.getPrecio());

    }

}
