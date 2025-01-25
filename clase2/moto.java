package clase2;
import java.util.ArrayList;

public class moto extends Vehiculo {

    public moto(String modelo, String marca, int año, int velocidadMaxima, boolean puertas ) {

        super.vehiculo(modelo, marca, año, velocidadMaxima, false);
    }

    ArrayList<moto> motos = new ArrayList<moto>();

    @Override
    public void mostrardetalles() {
        super.mostrardetalles();
    }
 
    public static void main(String[] args) {
        ArrayList<moto> motos = new ArrayList<>();
        motos.add(new moto("Yamaha", "FZ", 2015, 180, false  ));
        motos.add(new moto("Honda", "CBR", 2018, 200, false  ));

        System.out.println(" las motos son ");
        // FOR QUE RECORRE LAS MOTOS 
        for (moto moto : motos) {
        
            moto.mostrardetalles();
        }
    }
}