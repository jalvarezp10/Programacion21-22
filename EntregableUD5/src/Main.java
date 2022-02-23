import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Persona p1= new Persona("2334234f", "juan garcia");
        Persona p2= new Persona("38427834G", "Alfredo garcia");
        Persona p3= new Persona("2sdfd234f", "Pedro garcia");
        Persona p4= new Persona("e8237428347J", "Amtonio garcia");
        Persona[]personas=new Persona[0];
        Vivienda v1= new Vivienda(1983,"dkoekd",544,4,5,7,2342.3);

        System.out.println();

        //viviendas add y del personas
        v1.addPersona(p1);
        v1.addPersona(p2);
        v1.addPersona(p3);
        v1.addPersona(p4);
        System.out.println(v1);
        v1.delPersona(p1);
        System.out.println(v1);

        System.out.println();

        //Mostra precio y demas
        LocalComercial lc1=new LocalComercial(1994,"f9fjiefj",3242,"ALfredo",42323.1,"Tienda de zapatos");
        LocalIndustrial lI1=new LocalIndustrial(1994,"f9fjiefj",3242,"ALfredo",42323.1,2343);
        lc1.mostraPrecioVenta();
        lI1.mostraPrecioVenta();
        v1.mostraPrecioVenta();

        System.out.println();



        //propiedades add y del
        Propiedad[]propiedads=new Propiedad[0];
        Registro r1=new Registro();
        r1.addPropiedad(v1);
        r1.addPropiedad(lc1);
        r1.addPropiedad(lI1);
        System.out.println(r1);
        r1.eliminarPropiedad(v1);
        System.out.println(r1);

        System.out.println();

        //comparadores
        r1.informeSuperficie();
        r1.informeAntiguedad();
        System.out.println();



        //comparador hab
        Vivienda v2=new Vivienda(1893,"sudfhsud",4543,34,8,10,345.3);
        Vivienda v3=new Vivienda(1233,"sudfhsud",4543,34,7,10,345.3);
        Vivienda[]viviendas={v1,v2,v3};
        Arrays.sort(viviendas,new ComparadorNumHab());
        System.out.println(Arrays.toString(viviendas));





    }
}
