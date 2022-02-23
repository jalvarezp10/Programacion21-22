public class LocalComercial extends Local implements Venta{
    private String desc;

    public LocalComercial(Integer year, String direccion, int metros, String nombPropietario, double precio, String desc) {
        super(year, direccion, metros, nombPropietario, precio);
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "LocalComercial{" +
                super.toString()+
                "desc='" + desc + '\'' +
                '}';
    }

    @Override
    public void mostraPrecioVenta() {
        System.out.println("Soy un LocalComercial que me dedico a "+desc+" y valgo "+ this.getPrecio());

    }
}
