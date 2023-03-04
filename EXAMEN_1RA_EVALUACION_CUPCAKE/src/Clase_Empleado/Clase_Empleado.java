package Clase_Empleado;

import java.awt.BorderLayout;

public class Clase_Empleado {

    private String nombre;
    private String apellido;
    private String direccion;
    private int añoIngreso;
    private double salario;
    private int añoActual = 2023;

    //Constructor con atributos
    public Clase_Empleado(String name, String lastName, String address, int year, double salary) {
        nombre = name;
        apellido = lastName;
        direccion = address;
        añoIngreso = year;
        salario = salary;
    }

    //Constructor default
    public Clase_Empleado() {
        nombre = "";
        apellido = "";
        direccion = "";
        añoIngreso = 0;
        salario = 0.0;
    }

    //Metodo para calcular vacaciones
    public int calcularVacaciones() {
        int vacaciones = 0;
        int antiguedad = añoActual - añoIngreso;
        //Si el empleado tiene 1 año laborado 
        //Tiene derecho a 6 días de vacaciones
        if (antiguedad == 1) {
            vacaciones = 6;

        } 
        //Si el empleado tiene más de 1 año trabajado
        //Se le suman dos días más por cada año
        else if (antiguedad > 1) {
            vacaciones = 6 + antiguedad * 2;
            //Por cada 5 años trabajando, se le agregan dos días más
            if (antiguedad % 5 == 0) {
                vacaciones = vacaciones + 2;
            }

        } else {
            vacaciones = 0;
        }
        return vacaciones;
    }

    public void printDatos() {
        System.out.println("DATOS DE TRABAJADOR");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Año de Ingreso:" + añoIngreso);
        System.out.println("Dirección: " + direccion);
        System.out.println("Salario: " + salario);
        System.out.println("Tiene derecho a " + calcularVacaciones() + " días de vacaciones");
    }

    //Metodos set
    public void setNombre(String valor) {
        nombre = valor;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public void setDireccion(String valor) {
        direccion = valor;
    }

    public void setAño(int valor) {
        añoIngreso = valor;
    }

    public void setSalario(double valor) {
        salario = valor;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getAño() {
        return añoIngreso;
    }

    public double getSalario() {
        return salario;
    }
}
