 # documentacion mes 2 dev senior tema POO 
 en el mes 2 enfatizado a poo en la institucion Dev senior vimos clases herencia clases padres y clases hijas polimorfismos interfacez y patrones de diseño 
 
 ## A continuación documentación de los 5 ejercicios estipulados en la enseñanza

 ## clase 1.
información de estudiantes 

### archivos 
1 interface el cual contiene los metodos a utilizar en las clases del programa.
```
public interface method {

    void mostrardetalles();
    
    void almacenamientoStudiantes();
}
```
2 clases una clase padre y una clase hija 
### clase padre.
la clase padre es estudent la cual implementa los metodos de la interfaces, la clase padre contiene los siguientes metodos 
- metodo constructor
- metodo de mostrar información
- metodo de calcular si aprueba o no aprueba
#### metodo constructor 
```
public student (String name, int age, double average, int id ) {
     this.name = name;
     this.age = age;
     this.average = average;
     this.id = id;
    }
```
#### metodo mostrar información
```
 public void mostrardetalles() {
    System.out.println( "id of student "+  id + " name of student: " + name+ " age of student: " + age + " average of student: " + average);
    }

```
#### metodo  calcular promedio
```
 public double calcularpromedio( double  average) {
      if (average < 2.9) {
      System.out.println(" the student is not approved ");
      }
      else { 
        System.out.println(" the student is approved ");
    }    
      return average;
  }
```
## clase hija.
la clase hija llamada app la cual contiene la lista de los estudiantes que se crearon para hacer las operaciones y un for each para recorrer toda la informacion de los estudiantes tambien contiene un metodo constructor con un super para indicar los atributos de la clase padre, tambiene contiene una sobreescritura de los metodos de la clase padre.
### constructor con super
```
public app (String name, int age, double average, int id ) {
        super(name, age, average, id);
       }

```
### metodo principial con arrayList y for each.
```
public static void main(String[] args) {
        System.out.println(" los estudiantes son ");

        ArrayList<student> students = new ArrayList<student>();
        students.add ( new student ("juan", 20, 3.5, 1));
        students.add (new student ("pedro", 21, 2.5, 2));
        for (student student : students) {
            student.mostrardetalles();
            student.calcularpromedio(student.average);
        }
       

    }
```
# clase 2
en la clase 2 tenemos que crear una clase padre llamada vehiculo con los atributos protegidos y su metodo constructor para inicializar los atributos 
### clase padre vehiculo 
```
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
```
tenemos un metodo mostrar detalles para mostrar los detalles del vehiculo 
```
public void mostrardetalles() {
    System.out.println("Modelo: " + modelo);
    System.out.println("Marca: " + marca);
    System.out.println("Año: " + año);
    System.out.println("Velocidad Maxima: " + velocidadMaxima);
    System.out.println("Puertas: " + puertas);


}
```
### clases hijas (moto, carro).
las clases hijas moto y carro extienden (heredan) de vehiculo sus metodos y para cada clase se crea un metodo constructor el cual inicializa los atributos para las dos clases con una pequeña modificacion en el tipo de dato boolean el cual dice en la clase moto si tiene puertas el cual es un flase (las motos no tienen puertas)
tambien contiene unas listas cada clase para su tipo de objeto sea (carro o moto) la cual son recorridas con un for-each
y cada clase con su main para poder mostrar la informacion traida del metodo de la clase padre del metodo mostrardetalles la cual le ponemos un super para poder traerlo y mostrar la informacion con los atributos del metodo contructor y la lista de los objetos de las clases hijas 

## clase moto.
```
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
        // mostrar detalles de las motos 
            moto.mostrardetalles();
        }
    }
}
```
## clase carro

```
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

```
# Clase 3.
tenemos una pasarela de pagos mediante varios medios de pagos cada uno con 3 metodos de una interface metodoPago
```
public interface metodoPago {

    void procesarPago(double monto);

    String obtenerDetalles ();

    boolean validarMonto(double monto);
}
```
los cuales se implementan en las clases 
- paypal
- bitcoin
- tarjeta de regalo
- tarjeta de credito
- trasnferencia bancaria

cada clase anteriormente mencionada tiene parametros y limites a cumplir para cada clase con el monto monetario que aceptan 
o TarjetaCredito: El monto debe ser mayor que 0.

o PayPal: El monto debe estar entre 1 y 10,000.

o TransferenciaBancaria: El monto debe ser mayor o igual a 10.

o Bitcoin: El monto debe ser mayor o igual a 0.001 BTC.

o TarjetaRegalo: El monto debe ser mayor que 0 y menor o igual a 500.

## ejemplo de la implementacion en una clase con sus parametros estipulados.
```
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
```
## en la clase app 
donde vamos a mostar la informacion mediante la seleccion del usuario su tipo de metodo pago esto lo hacemos con un siwtch aplicado a cada tipo de pago y para cada pago llamamos su metodo de la interface  sobreescrito en esa clase  
```
public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String mediodepago;
        System.out.printf( "1 para tarjeta de credito \n 2 para tranferencia bancaria \n  3 para pagos con BItcon \n  4 para pagos por tarjeta de regalo \n 5 para paypal");
        System.out.println();
        mediodepago = entrada.nextLine();

        switch (mediodepago) {

            case "1": {
                metodoPago tarjetacredito = new tarjetacredito();

                System.out.println(" digite el monto a pagar ");

                double monto;

                monto = entrada.nextDouble();
                tarjetacredito.obtenerDetalles();
                tarjetacredito.procesarPago(monto);

                break;
            }
```






























































































































