package Clase3;

public class tranferenciabancaria implements metodoPago {

    @Override
    public String obtenerDetalles() {
        System.out.println(" estas haciendo un pago por transferencia bancaria");
        return null;
    }

    @Override
    public void procesarPago(double monto) {
 if ( validarMonto(monto)) {
     System.out.println(" pago por tranferencia bancaria exitoso");
}
     else {
 System.out.println(" pago fallido ");    
    
    }
    }

    @Override
    public boolean validarMonto(double monto) {
        if (monto >= 10) {
            return true;

        } else {
            return false;
        }
    }
}
