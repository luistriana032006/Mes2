package Clase3;

public class tarjetaderegalo implements metodoPago {
    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)) {
            System.out.println(" el pago fue exitoso ");
        }

        else {
        System.out.println(" pago fallido");
        } 

    }

    @Override
    public String obtenerDetalles() {


        return null;
    }

    @Override
    public boolean validarMonto(double monto) {

        if (monto >0 && monto <= 500) {
        return true;
        }

        else { return false;}
        
 
    }
}
