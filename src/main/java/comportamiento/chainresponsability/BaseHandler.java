package comportamiento.chainresponsability;

public class BaseHandler implements Handler{

    protected Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handle(String request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
