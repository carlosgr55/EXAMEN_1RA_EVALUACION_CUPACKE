package Clase_Cuenta_Bancaria;

public class Clase_Cuenta_Bancaria {

    private String numeroCuenta;
    private String nombreCliente;
    private double saldo;

    //Constructor default
    public Clase_Cuenta_Bancaria() {
        this.numeroCuenta = "";
        this.nombreCliente = "";
        this.saldo = 0.0;
    }

    //Constructor con parametros
    public Clase_Cuenta_Bancaria(String numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    //Metodos get y set para cada atributo de la cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    //Metodo para depositar saldo en cuenta
    public void depositarEnCuenta(double monto) {
        this.saldo += monto;
    }

    //Metodo para retirar saldo de la cuenta    
    public void retirarDeCuenta(double monto) {
        //Validación si saldo hay suficiente saldo en la cuenta
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= monto;
        }
    }

    //Metodo que imprime los datos de la cuenta
    public void imprimirDatos() {
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Nombre del cliente: " + this.nombreCliente);
        System.out.println("Saldo: " + this.saldo);
    }
}

