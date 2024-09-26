package comportamiento.chainresponsability;

public class InfoHandler extends BaseHandler {

    @Override
    public void handle(String request) {

        if (request.equals("INFO")) {
            System.out.println("manejando mensaje de informacion...");

        } else {
            super.handle(request);
        }
    }
}
