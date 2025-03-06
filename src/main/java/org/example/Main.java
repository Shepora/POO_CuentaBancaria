package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        Datos Titular1 = new Datos("Pepito Pepenador", 20000,12334);
        Datos Titular2 = new Datos("Mary Carmen", 300000, 34252);
        Datos Titular3 = new Datos("Mardoqueo Perez", 400000, 83241);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n--- Menú de Cuenta Bancaria ---");
            System.out.println("1. Consultar información de una cuenta");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = teclado.nextInt();
            teclado.nextLine();

            Datos cuentaSeleccionada = null;

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Ingrese el número de cuenta: ");
                int numeroCuentaIngresado = teclado.nextInt();
                teclado.nextLine();

                if (numeroCuentaIngresado == Titular1.getNumeroCuenta()) {
                    cuentaSeleccionada = Titular1;
                } else if (numeroCuentaIngresado == Titular2.getNumeroCuenta()) {
                    cuentaSeleccionada = Titular2;
                } else if (numeroCuentaIngresado == Titular3.getNumeroCuenta()) {
                    cuentaSeleccionada = Titular3;
                } else {
                    System.out.println("Número de cuenta no encontrado.");
                    continue;
                }
            }

            if (opcion == 1) {
                System.out.println("\nInformación de la cuenta:\n" + cuentaSeleccionada);
            } else if (opcion == 2) {
                System.out.print("Ingrese la cantidad a depositar: ");
                int deposito = teclado.nextInt();
                cuentaSeleccionada.depositoDinero(deposito);
            } else if (opcion == 3) {
                System.out.print("Ingrese la cantidad a retirar: ");
                int retiro = teclado.nextInt();
                cuentaSeleccionada.retirarDinero(retiro);
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                continuar = false;
            } else {
                System.out.println("Opción inválida, intente de nuevo.");
            }
        }
        teclado.close();
    }
}