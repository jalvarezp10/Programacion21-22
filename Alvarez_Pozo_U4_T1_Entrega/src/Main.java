import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Examen e1 = new Examen( "GUYU", "idsjfijd.com");
        Sedes s1 = new Sedes("3482d", Capitales.SEVILLA, 21);
        Opositor o1 = new Opositor("Alfredo", "Garcia", 1992, true, "dsjaijd");
        Opositor o2 = new Opositor("Raquel", "Gutierrez", 1994, false, "fiej");

        Sedes s2=new Sedes("3942F",Capitales.CADIZ,23);
        Opositor o3 = new Opositor("Fer", "Garcia", 1992, true, "dsjaijd");
        Opositor o4 = new Opositor("Javier", "Navarro", 1996, false, "fiej");

        Preguntas p1=new Preguntas("Hola resuelva el siguiente..");
        Opciones op1=new Opciones("Sabueso",false);
        Opciones op2=new Opciones("Hielo",false);
        Opciones op3=new Opciones("Agua",true);
        p1.addOpciones(op1);
        p1.addOpciones(op2);
        p1.delOpciones(op2);
        System.out.println(p1);

        Preguntas p2=new Preguntas("Bfjiejfifkefdf");
        Opciones op4=new Opciones("Hola",true);
        Opciones op5=new Opciones("yepa",false);
        Opciones op6=new Opciones("Loco",false);



    }

}
