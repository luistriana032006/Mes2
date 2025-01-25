package clase2;
import java.util.ArrayList;
public class carro extends Vehiculo {

   
    public carro (String modelo, String marca, int año, int velocidadMaxima, boolean puertas) {
        
        super.vehiculo(modelo, marca, año, velocidadMaxima, puertas = true);
    }

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
    }

    
    public static void main(String[] args) {
        ArrayList<carro> carros = new ArrayList<>();
        carros.add( new carro("Chevrolet", "Spark", 2015, 180, true));


        for (carro carro : carros) {
            carro.mostrardetalles();
        }
}}
