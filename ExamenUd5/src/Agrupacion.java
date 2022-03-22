import java.util.Comparator;

public abstract class Agrupacion implements Comparable<Agrupacion> {
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipo;
    private int numAgrupaciones=0;

    public Agrupacion(String nombre, String autor, String autorMusica, String autorLetra, String tipo) {
        this.nombre = nombre;
        this.autor = autor;
        this.autorMusica = autorMusica;
        this.autorLetra = autorLetra;
        this.tipo = tipo;
        numAgrupaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutorMusica() {
        return autorMusica;
    }

    public void setAutorMusica(String autorMusica) {
        this.autorMusica = autorMusica;
    }

    public String getAutorLetra() {
        return autorLetra;
    }

    public void setAutorLetra(String autorLetra) {
        this.autorLetra = autorLetra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumAgrupaciones() {
        return numAgrupaciones;
    }

    public void setNumAgrupaciones(int numAgrupaciones) {
        this.numAgrupaciones = numAgrupaciones;
    }

    public void cantar_la_presentacion(){
        System.out.println("Cantando la presentación de la Chirigota/Coro/... con nombre "+getNombre());

   }
    public void hacer_tipo(){
        System.out.println("La Chirigota/Coro/..."+getNombre()+" va de"+getTipo());

    }

    @Override
    public String toString() {
        return "Agrupacion{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetra='" + autorLetra + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Agrupacion agrupacion) {
        return this.getNombre().compareTo(agrupacion.getNombre());
    }
}

