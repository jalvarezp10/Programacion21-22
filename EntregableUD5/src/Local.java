public abstract class Local extends Propiedad implements Venta{
    private String nombPropietario;
    private double precio;

    public Local(Integer year, String direccion, int metros, String nombPropietario, double precio) {
        super(year, direccion, metros);
        this.nombPropietario = nombPropietario;
        this.precio = precio;
    }

    public String getNombPropietario() {
        return nombPropietario;
    }

    public void setNombPropietario(String nombPropietario) {
        this.nombPropietario = nombPropietario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Local{" +
                "nombPropietario='" + nombPropietario + '\'' +
                ", precio=" + precio +
                '}';
    }
}
