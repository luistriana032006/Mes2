package clase4;
public class sms implements notification {

    @Override
    public void message(String mensaje) {
        System.out.println(" enviando un mensaje SMS "+mensaje);
    }

   

}
