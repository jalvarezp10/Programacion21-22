public class Romancero extends Agrupacion implements Callejera{

    private String tematicaCartelon;

    public Romancero(String nombre, String autor, String autorMusica, String autorLetra, String tipo, String tematicaCartelon) {
        super(nombre, autor, autorMusica, autorLetra, tipo);
        this.tematicaCartelon = tematicaCartelon;
    }

    public String getTematicaCartelon() {
        return tematicaCartelon;
    }

    public void setTematicaCartelon(String tematicaCartelon) {
        this.tematicaCartelon = tematicaCartelon;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha la Chirigota/Cuarteto/Romanero "+getNombre());
    }

    @Override
    public String toString() {
        return "Romancero{" +
                "tematicaCartelon='" + tematicaCartelon + '\'' +
                '}';
    }
}
