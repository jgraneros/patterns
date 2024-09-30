package comportamiento.command;

public class Editor {

    private String clipboard;
    private String text;

    public void copy() {
        clipboard = text;
        System.out.println("texto copiado...");
    }

    public void paste() {
        text += clipboard;
        System.out.println("texto pegado... " + text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}
