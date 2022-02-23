public class EquipamientoServicio extends Propiedad{
    private TipoServicios tipo;

    public EquipamientoServicio(Integer year, String direccion, int metros, TipoServicios tipo) {
        super(year, direccion, metros);
        this.tipo = tipo;
    }

    public TipoServicios getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicios tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "EquipamientoServicio{" +
                "tipo=" + tipo +
                '}';
    }
}
