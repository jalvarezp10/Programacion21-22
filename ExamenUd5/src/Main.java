import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Coro c1=new Coro("Berer","Pedro","Luis","Jaime","Furros",674,6,5);
        Chirigota ch1=new Chirigota("Hjeje","Celia","Javier","Paco","Lere",890,6);
        c1.cantar_la_presentacion();
        System.out.println();
        c1.caminito_del_falla();
        System.out.println();
        c1.hacer_tipo();
        System.out.println();




        Integrante i1=new Integrante(2,"Pedro",24,"Sevilla");
        Integrante i2=new Integrante(4,"Mario",24,"Cadiz");
        Integrante i3=new Integrante(5,"Carlos",24,"Madrid");


        c1.addIntregrante(i1);
        c1.addIntregrante(i2);
        c1.addIntregrante(i3);

        System.out.println(c1);
        System.out.println();
        c1.delIntegrante(i3);
        System.out.println(c1);


        AgrupacionOficial[]agrup1=new AgrupacionOficial[0];




        Coac co1=new Coac(agrup1);
        co1.inscribir_agrupacion(c1);
        System.out.println(co1);
        co1.eliminar_agrupacion(c1);
        System.out.println(co1);

        co1.inscribir_agrupacion(c1);
        co1.inscribir_agrupacion(ch1);
        co1.ordenar_por_puntos();
        System.out.println(co1);
        co1.ordenar_por_autor();
        System.out.println(co1);
        co1.ordenar_por_nombre();
        System.out.println(co1);












    }
}
