package clase4;

public class app {

    public static void main(String[] args) {
        factoryMessage factory = new factoryMessage();
        notification correo = factory.crearMessage("correo");
        correo.message("este es un mensaje por correo");
        notification sms = factory.crearMessage("sms");
        sms.message(" este es un SMS");
        notification push = factory.crearMessage("push");
        push.message( " esto es una notificacion push");

    }

}