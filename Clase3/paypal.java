package Clase3;
public class paypal implements metodoPago {

    @Override
    public String obtenerDetalles() {
        
        return null;
    }

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)) {
        System.out.println(" el pago fue exitoso ");
        }
        else {System.out.println(" el pago no fue exitoso ");}
    }

    @Override
    public boolean validarMonto(double monto) {
       if ( monto >1 && monto < 10.000) {return true;}

       else {  return false;}
      
    }

}
