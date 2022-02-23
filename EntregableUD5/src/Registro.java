import java.util.Arrays;

public class Registro{
    private Propiedad[] propiedades;

    public Registro() {
        this.propiedades = new Propiedad[0];
    }

    public Propiedad[] getPropiedades() {
        return propiedades;
    }

    public void setPropiedadades(Propiedad[] propiedades) {
        this.propiedades = propiedades;
    }
    public void addPropiedad(Propiedad propiedad){

        propiedades= Arrays.copyOf(propiedades,propiedades.length+1);
        propiedades[propiedades.length-1]=propiedad;

    }
    public boolean eliminarPropiedad(Propiedad propiedad){
        Propiedad resultado[]=new Propiedad[0];
        for (int i = 0; i < propiedades.length ; i++) {
            if (!propiedad.equals(propiedades[i])){
                resultado=Arrays.copyOf(resultado,resultado.length+1);
                resultado[resultado.length-1]=propiedades[i];
            }


        }
        if (resultado.length< propiedades.length){
            propiedades=resultado;
            return true;
        }else {
            return false;
        }


    }
    public void informeAntiguedad(){
        Arrays.sort(propiedades,new ComparadorYear());
        System.out.println(Arrays.toString(propiedades));
    }
    public void informeSuperficie(){
        Arrays.sort(propiedades);
        System.out.println(Arrays.toString(propiedades));
        

    }

    @Override
    public String toString() {
        return "Registro{" +
                "propiedades=" + Arrays.toString(propiedades) +
                '}';
    }


}
