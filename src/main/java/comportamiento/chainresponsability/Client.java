package comportamiento.chainresponsability;

public class Client {

    public static void main(String[] args) {

        Handler infoHandler = new InfoHandler();
        Handler warningHandler = new WarningHandler();
        Handler errorHandler = new ErrorHandler();


        infoHandler.setNext(warningHandler);
        warningHandler.setNext(errorHandler);

        System.out.println("Enviando solicitud de INFO");
        infoHandler.handle("INFO");

        System.out.println("Enviando solicitud de WARNING");
        infoHandler.handle("WARNING");

        System.out.println("Enviando solicitud de ERROR");
        infoHandler.handle("ERROR");
    }
}
