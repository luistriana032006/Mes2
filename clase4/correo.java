package clase4;
public class correo implements notification {

    @Override
    public void message(String mensaje) {
     System.out.println(" enviando un correo "+ mensaje);
        
    }

}
