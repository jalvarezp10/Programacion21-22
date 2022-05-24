import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Vuelos {
    HashSet<Vuelos> vuelos=new HashSet<>();
    private String codVuelo;
    private String aeropuertoOrigen;
    private String getAeropuertoDestino;
    private String fecha;
    private HashSet<Pasajeros> pasajeros;


    public Vuelos(String codVuelo, String aeropuertoOrigen, String getAeropuertoDestino, String fecha) {
        this.codVuelo = codVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.getAeropuertoDestino = getAeropuertoDestino;
        this.fecha = fecha;

    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public String getGetAeropuertoDestino() {
        return getAeropuertoDestino;
    }

    public void setGetAeropuertoDestino(String getAeropuertoDestino) {
        this.getAeropuertoDestino = getAeropuertoDestino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public HashSet<Pasajeros> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(HashSet<Pasajeros> pasajeros) {
        this.pasajeros = pasajeros;
    }
    public HashSet<Vuelos> getVuelos() {
        return vuelos;
    }

    public void setVuelos(HashSet<Vuelos> vuelos) {
        this.vuelos = vuelos;
    }
    public boolean addVuelo(Vuelos o){

        Iterator it =vuelos.iterator();
        if (vuelos.size()>0){
            while (it.hasNext()){
                if (o.getCodVuelo().equals(codVuelo)){
                    return false;
                }else {
                    vuelos.add(o);

                }
            }

        }else {
            vuelos.add(o);
        }

       return true;

    }
    public boolean addPasajero(String codigo, Pasajeros p){
        Iterator it = vuelos.iterator();
        if (vuelos.size()>0){
            while (it.hasNext()) {
                if (codigo.equals(codVuelo)){
                    pasajeros.add(p);
                    return true;

                }


            }

        }else {
            pasajeros.add(p);
            return true;
        }

        return false;

    }
public boolean removePasajero(String codigo, Pasajeros p){
        Iterator it = vuelos.iterator();
        while (it.hasNext()){
            if (codigo.equals(getCodVuelo())){
                Iterator it2= pasajeros.iterator();
                while (it2.hasNext()){
                    if (it2.next().equals(p)){
                        pasajeros.remove(p);
                        return true;
                    }
                }
            }
        }
        return false;
}



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vuelos vuelos = (Vuelos) o;
        return Objects.equals(codVuelo, vuelos.codVuelo) && Objects.equals(aeropuertoOrigen, vuelos.aeropuertoOrigen) && Objects.equals(getAeropuertoDestino, vuelos.getAeropuertoDestino) && Objects.equals(fecha, vuelos.fecha) && Objects.equals(pasajeros, vuelos.pasajeros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codVuelo, aeropuertoOrigen, getAeropuertoDestino, fecha, pasajeros);
    }

    @Override
    public String toString() {
        return "Vuelos{" +
                "codVuelo='" + codVuelo + '\'' +
                ", aeropuertoOrigen='" + aeropuertoOrigen + '\'' +
                ", getAeropuertoDestino='" + getAeropuertoDestino + '\'' +
                ", fecha='" + fecha + '\'' +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
