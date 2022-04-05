import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Alumno> alumnos=new HashMap<>();
        Set<Alumno> alum=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        int opcion;
        cargarAlumnos(alumnos,alum);

        do {
            mostrarMenu();
            System.out.println("Introduce la opcion ");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    Alumno a=crearAlumno();
                    if (!alumnos.containsKey(a.getDni())){
                        alum.add(a);
                        alumnos.put(a.getDni(), a);

                    }else {
                        System.out.println("Error, el alumno ya esta insertado");
                    }
                    break;


                case 2:
                    System.out.println("Introduce el dni");
                    String dniBorrar= sc.nextLine();
                    eliminarPorDni(dniBorrar,alumnos,alum);
                    break;

                case 3:
                    mostrarAlumnos(alum);
                    break;
                case 4:
                    System.out.println("Introduce el curso");
                    String curso= sc.nextLine();
                    mostrarPorCurso(curso,alum);
                    break;
                case 5:
                case 6:
                    guardarAlumnos(alumnos);

                    break;
            }


        }while (opcion<6 || opcion>1);


    }
   public static Alumno crearAlumno(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce el nombre");
       String nombre=sc.nextLine();
       System.out.println("Introduce el apellido");
       String apellido=sc.nextLine();
       System.out.println("Introduce el dni");
       String dni=sc.nextLine();
       System.out.println("Introduce la direccion");
       String direccion=sc.nextLine();
       System.out.println("Introduce el email");
       String email=sc.nextLine();
       System.out.println("Introduce el curso");
       String curso=sc.nextLine();
       System.out.println("¿Esta en dual?");
       boolean dual = sc.nextBoolean();
       return new Alumno(nombre,apellido,direccion,dni,email,curso,dual);

    }
    public static void eliminarPorDni(String dni,Map<String,Alumno> alumn,Set<Alumno>alum){
        if (!alumn.containsKey(dni)){
            System.out.println("El alumno no existe");


        }else {

            Alumno alumno=alumn.remove(dni);
            alumn.remove(dni);
            alum.remove(alumno);
        }


    }
    public static void mostrarAlumnos(Set<Alumno>alumnos){
        Iterator it= alumnos.iterator();
        while (it.hasNext()){
            Alumno alu=(Alumno)it.next();
            System.out.println(alu);


        }



    }
    public static void mostrarPorCurso(String curso,Set<Alumno>alum){
        Iterator it= alum.iterator();
        while (it.hasNext()){
            Alumno alu=(Alumno)it.next();
            if (alu.getCurso().equals(curso)){
                System.out.println(alu);

            }




        }

    }

    public static void cargarAlumnos(Map<String,Alumno>alumnos,Set<Alumno>alum) {

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("alumnos.dat"));

            while (true) {

                Alumno alu = (Alumno) ois.readObject();
                alumnos.put(alu.getDni(),alu);
                alum.add(alu);
            }

        } catch (IOException e) {

        } catch (ClassNotFoundException e) {

        } finally {
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }
    public static void guardarAlumnos(Map<String,Alumno>alumnos){
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("alumnos.dat"));
            Set<Alumno>alumnos1= (Set<Alumno>) alumnos.values();
            Iterator it=alumnos1.iterator();
            while (it.hasNext()) {
                Alumno alu=(Alumno)it.next();
                oos.writeObject(alu);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void mostrarMenu(){
        System.out.println("Elige una opcion");
        System.out.println("1-Insertar alumnos");
        System.out.println("2-Borrar alumnos");
        System.out.println("3-Mostrar alumnos");
        System.out.println("4-Mostrar alumnos de un curso");
        System.out.println("5-Modificar alumnos");
        System.out.println("6-Salir");

    }


}
