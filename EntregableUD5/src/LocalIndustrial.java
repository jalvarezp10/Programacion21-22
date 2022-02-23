public class LocalIndustrial extends Local {
    private int consumoEner;

    public LocalIndustrial(Integer year, String direccion, int metros, String nombPropietario, double precio, int consumoEner) {
        super(year, direccion, metros, nombPropietario, precio);
        this.consumoEner = consumoEner;
    }

    public int getConsumoEner() {
        return consumoEner;
    }

    public void setConsumoEner(int consumoEner) {
        this.consumoEner = consumoEner;
    }

    @Override
    public String toString() {
        return "LocalIndustrial{" +
                super.toString()+
                "consumoEner=" + consumoEner +
                '}';
    }

    @Override
    public void mostraPrecioVenta() {
        System.out.println("Soy un LocalIndustrail con un consumo máximo de "+consumoEner+" y valgo "+ this.getPrecio());

    }
}
