package comportamiento.statepattern;

import comportamiento.statepattern.states.Draft;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        Draft draft = new Draft(document);
        document.setState(draft);

        document.publish();
        document.publish();
    }
}
