package Clase_Fibonacci;

public class Clase_Fibonacci {
    //Declaracion de atributos de la clase
    private int n;
    private int a1;
    private int a2;
    
    //Constructor default
    public Clase_Fibonacci() {
        this.n = 6;
        this.a1 = 1;
        this.a2 = 1;
    }

    //Constructor con atributos
    public Clase_Fibonacci(int n, int a1, int a2) {
        this.n = n;
        this.a1 = a1;
        this.a2 = a2;
    }

    
    //Metodos set por cada atributo
    public void setN(int n) {
        this.n = n;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    //Metodos get por cada atributo
    public int getN() {
        return n;
    }

    public int getA1() {
        return a1;
    }

    public int getA2() {
        return a2;
    }

    
    //Metodo para calcular e imprimir la serie
    public void printSeries() {
        int a = a1;
        int b = a2;
        System.out.print(a + " - " + b);
        for (int i = 4; i <= n; i++) {
            int c = a + b;
            System.out.print(" - " + c);
            a = b;
            b = c;
        }

    }
}
