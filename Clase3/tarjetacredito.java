package Clase3;

public class tarjetacredito implements metodoPago {

    @Override
    public String obtenerDetalles() {
        System.out.println(" el metodo de pago es por tarjeta de credito ");
        return null;
    }

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)) {
            System.out.println(" el pago por tarjeta fue  exitoso ");

        } else {
            System.out.println(" Error en el pago  ");
        }
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto > 0) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * pregunta al profe, profe por que no es necesario un constructor aca en esta
     * clase ?
     * 
     * 2) profe el metodo construcuto es cuando se le pidan que ingresen variables
     * espeficas para una clase sea padre o hija y que lo inicialice
     * con los del main ??
     */

}
