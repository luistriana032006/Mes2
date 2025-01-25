package Clase3;
public interface metodoPago {

    void procesarPago(double monto);

    String obtenerDetalles ();

    boolean validarMonto(double monto);
}
