package clase4;

public class factoryMessage {
    public  notification crearMessage(String tipo) {

        switch (tipo) {
            case "sms":
                return new sms();

            case "push":
            return new push();

            case "correo": 
            return new correo();

            default:
                throw new IllegalArgumentException(" tipo de mensaje no disponible");
                
        }
    }

   
}
