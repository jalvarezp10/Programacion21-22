public class Chirigota extends AgrupacionOficial implements Callejera{

    private int numCuples;


    public Chirigota(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int puntos, int numCuples) {
        super(nombre, autor, autorMusica, autorLetra, tipo, puntos);
        this.numCuples = numCuples;
    }

    public int getNumCuples() {
        return numCuples;
    }

    public void setNumCuples(int numCuples) {
        this.numCuples = numCuples;
    }


    @Override
    public String toString() {
        return "Chirigota{" +
                "numCuples=" + numCuples +
                '}';
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero "+getNombre());

    }
}
