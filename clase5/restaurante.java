package clase5;

public class restaurante {
    private cocina cocina;
    private caja caja;
    private mesero mesero;

    public restaurante(cocina cocina, mesero mesero, caja caja) {

        this.caja = caja;
        this.cocina = cocina;
        this.mesero = mesero;
    }

    public void operarRestaurante() {
     cocina.prepararplato();
    mesero.sirviendoPlato();
    caja.cobrandoPlato();
    
    }



}
