package clase2;
public class Vehiculo {

 protected  String modelo;
    protected  String marca;
    protected  int año;
    protected  int velocidadMaxima;
    protected boolean puertas;

    public void vehiculo (String modelo,String marca,int año,int velocidadMaxima, boolean puertas ) {
    
    this.modelo = modelo;
    this.marca = marca;
    this.año = año;
    this.velocidadMaxima = velocidadMaxima;
    this.puertas = puertas;
    
    }

    public void mostrardetalles() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Año: " + año);
    System.out.println("Velocidad Maxima: " + velocidadMaxima);
    System.out.println("Puertas: " + puertas);


}
    
    
    
}
