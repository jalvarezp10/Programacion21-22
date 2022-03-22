public class Cuarteto extends AgrupacionOficial implements Callejera{

    private int numMiembros;


    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int puntos, int numMiembros) {
        super(nombre, autor, autorMusica, autorLetra, tipo, puntos);
        this.numMiembros = numMiembros;
    }

    public int getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(int numMiembros) {
        this.numMiembros = numMiembros;
    }

    @Override
    public String toString() {
        return "Cuarteto{" +
                "numMiembros=" + numMiembros +
                '}';
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero "+getNombre());

    }
}
