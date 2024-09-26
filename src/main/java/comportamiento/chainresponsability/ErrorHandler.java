package comportamiento.chainresponsability;

public class ErrorHandler extends BaseHandler {

    @Override
    public void handle(String request) {

        if (request.equals("ERROR")) {
            System.out.println("manejando mensaje de error...");

        } else {
            super.handle(request);
        }
    }
}
