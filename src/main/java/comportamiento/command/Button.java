package comportamiento.command;

public class Button {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
}
