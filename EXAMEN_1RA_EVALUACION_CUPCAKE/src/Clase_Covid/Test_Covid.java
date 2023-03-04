package Clase_Covid;

public class Test_Covid {

    //Declaración de los atributos
    private int edad;
    private double peso; //Peso en kilogramos
    private double estatura; //Estatura en cm
    private boolean enfermedadC; //F si no tiene, T si tiene

    //Constructor con atributos
    public Test_Covid(int age, double weight, double heigth, boolean disease) {
        edad = age;
        peso = weight;
        estatura = heigth;
        enfermedadC = disease;

    }

    //Constructor default
    public Test_Covid() {
        edad = 0;
        peso = 0.0;
        estatura = 0.0;
        enfermedadC = false;

    }

    //Metodos get y set por cada atributo
    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double valor) {
        peso = valor;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double valor) {
        estatura = valor;
    }

    public boolean getEnfermedad() {
        return enfermedadC;
    }

    public void setEnfermedad(boolean valor) {
        enfermedadC = valor;
    }

    //Metodo para calcular si la persona tiene o no riesgo por covid
    public String calcularPersonaRiesgo() {
        //Se asigna el metodo IMC a variable dentro de este metodo
        double imc = calcularIMC();
        String resultado;
        if ((edad > 65) && (imc > 30) && (enfermedadC == true)) {
            resultado = "PERSONA CON RIESGO";
        } else {
            resultado = "PERSONA SIN RIESGO";
        }
        return resultado;
    }
    
    //Metodo en el que se imprimen los datos de la persona
    public void imprimirDatos() {
        System.out.println("Datos Almacenados");
        System.out.println("La edad de la persona es: " + edad);
        System.out.println("El peso de la persona es: " + peso);
        System.out.println("La estatura de la persona en cm es de: " + estatura);
        System.out.println(calcularPersonaRiesgo());
    }

    //Metodo para calcular el IMC
    private double calcularIMC() {
        estatura = estatura / 100;
        return peso / (estatura * estatura);
    }
}
