package comportamiento.command;

public class Client {

    public static void main(String[] args) {

        Editor editor = new Editor();
        editor.setText("Hola mundo!");

        Command copyCommand = new CopyCommand(editor);
        Command pasteCommand = new PasteCommand(editor);

        Button copyButton = new Button();
        Button pasteButton = new Button();

        copyButton.setCommand(copyCommand);
        pasteButton.setCommand(pasteCommand);

        copyButton.click();

        editor.setText("Hola de nuevo!");

        pasteButton.click();


    }
}
