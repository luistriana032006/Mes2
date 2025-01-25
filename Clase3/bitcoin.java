package Clase3;

public class bitcoin implements metodoPago {

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)) {
            System.out.println(" el pago  fue exitoso ");
        } else {
            System.out.println(" pago fallido ");
        }
    }

    @Override
    public String obtenerDetalles() {

        return null;
    }

    @Override
    public boolean validarMonto(double monto) {

        if (monto > 0.001) {
            return true;
        }

        else {
            return false;
        }

    }
 // por  qur cuando hay una condicion if se puede tener 2 return encambio cuando no hay conficion y pongo 2 returne dice codigo inalcanzable
}
