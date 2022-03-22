public class Coro extends AgrupacionOficial{

    private int numBandurrias;
    private int numGuitarras;

    public Coro(String nombre, String autor, String autorMusica, String autorLetra, String tipo, int puntos, int numBandurrias, int numGuitarras) {
        super(nombre, autor, autorMusica, autorLetra, tipo, puntos);
        this.numBandurrias = numBandurrias;
        this.numGuitarras = numGuitarras;
    }

    public int getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(int numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public int getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(int numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    @Override
    public String toString() {
        return "Coro{" +
                "numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                '}';
    }
}

