package clase5;



public class app {
public static void main(String[] args) {
    cocina cocina = new cocina();
    mesero mesero = new mesero();
    caja caja = new caja();
    
    restaurante restaurante = new restaurante(cocina, mesero, caja);

    restaurante.operarRestaurante();
}
}
