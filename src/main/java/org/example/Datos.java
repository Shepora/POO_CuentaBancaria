package org.example;

public class Datos {
    private String Titular;
    private int Saldo;
    private int NumeroCuenta;

    public Datos() {
    }

    public Datos(String titular, int saldo, int numeroCuenta) {
        Titular = titular;
        Saldo = saldo;
        NumeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Datos{" +
                "Titular='" + Titular + '\'' +
                ", Saldo=" + Saldo +
                ", NumeroCuenta=" + NumeroCuenta +
                '}';
    }
    public void depositoDinero(double cantidad) {
        if (cantidad > 0) {
            Saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + Saldo);
        } else {
            System.out.println("La cantidad ingresada no es válida.");
        }
    }

    public void retirarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= Saldo) {
            Saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + Saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }
}
