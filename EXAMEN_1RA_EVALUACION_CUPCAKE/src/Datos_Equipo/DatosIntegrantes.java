package Datos_Equipo;

public class DatosIntegrantes {
    private static String integrante1 = "Carlos Rubén Gamboa Rosales";
    private static String numControl1 = "22550334";
    private static String integrante2 = "Rubén Eduardo Muñoz Nieto";
    private static String numControl2 = "22550341";
    private static String integrante3 = "Luis Fernando García Pérez";
    private static String numControl3 = "22550366";
    private static String integrante4 = "Derek Yadir Franco Martinez";
    private static String numControl4 = "22550349";
    private static String carrera = "ISC";
    private static String equipo = "Cupcake";

    public static void printDatos(){
        System.out.println("EQUIPO "+equipo);
        System.out.println("Integrante 1: "+ integrante1 + "\nNúmero de control: "+
                numControl1 + "\nCarrera: "+ carrera);
        System.out.println("Integrante 2: "+ integrante2 + "\nNúmero de control: "+
                numControl2 + "\nCarrera: "+ carrera);
        System.out.println("Integrante 3: "+ integrante3 + "\nNúmero de contro3: "+
                numControl3 + "\nCarrera: "+ carrera);
        System.out.println("Integrante 4: "+ integrante4 + "\nNúmero de control: "+
                numControl4 + "\nCarrera: "+ carrera);
        
    }
    public static void printProblemasResueltos(){
        System.out.println("Clase Datos del Equipo");
        System.out.println("Clase Test Covid");
        System.out.println("Clase Sucesión de Fibonacci");
        System.out.println("Clase Empleado");
        System.out.println("Clase Cuenta Bancaria");
    }
}



