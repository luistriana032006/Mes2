package Clase3;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String mediodepago;
        System.out.printf( "1 para tarjeta de credito \n 2 para tranferencia bancaria \n  3 para pagos con BItcon \n  4 para pagos por tarjeta de regalo \n 5 para paypal");
        System.out.println();
        mediodepago = entrada.nextLine();

        switch (mediodepago) {

            case "1": {
                metodoPago tarjetacredito = new tarjetacredito();

                System.out.println(" digite el monto a pagar ");

                double monto;

                monto = entrada.nextDouble();
                tarjetacredito.obtenerDetalles();
                tarjetacredito.procesarPago(monto);

                break;
            }

            case "2": {
                metodoPago tranferenciabancaria = new tranferenciabancaria();
                System.out.println(" digite el monto a pagar ");
                double monto;
                monto = entrada.nextDouble();
                tranferenciabancaria.obtenerDetalles();
                tranferenciabancaria.procesarPago(monto);
                break;

            }

            case "3": {

                metodoPago bitcoin = new bitcoin();

                System.out.println("digite el monto a pagar ");
                double monto;
                monto = entrada.nextDouble();
                bitcoin.obtenerDetalles();
                bitcoin.procesarPago(monto);

                break;
            }
            case "4": {

                metodoPago tarjetaderegalo = new tarjetaderegalo();
                System.out.println(" digite el monto a pagar ");
                double monto;
                monto = entrada.nextDouble();

                tarjetaderegalo.obtenerDetalles();
                tarjetaderegalo.procesarPago(monto);

                break;

            }

            case " 5": {

                metodoPago paypal = new paypal();
                System.out.println(" digite el monto a pagar ");
                double monto;
                monto= entrada.nextDouble();

                paypal.obtenerDetalles();
                paypal.procesarPago(monto);
                break;
            }
            default: { System.out.println(" metodo de pago no encontrado");
            entrada.close();
            ;}
        }
    }
}
