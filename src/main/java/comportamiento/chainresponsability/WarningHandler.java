package comportamiento.chainresponsability;

public class WarningHandler extends BaseHandler {

    @Override
    public void handle(String request) {

        if (request.equals("WARNING")) {
            System.out.println("manejando mensaje de advertencia...");

        } else {
            super.handle(request);
        }
    }
}
