package comportamiento.statepattern.states;

import lombok.AllArgsConstructor;
import lombok.Data;
import comportamiento.statepattern.Document;
import comportamiento.statepattern.Utils;

@Data
@AllArgsConstructor
public class Draft implements State {

    private Document document;

    @Override
    public void render() {
        System.out.println("mostrando el documento en el estado de borrador");

    }

    @Override
    public void publish() {
        System.out.println("publishing!");

        if (Utils.isAdmin()) {
            System.out.println("documento publicado");
            document.setState(new Published(document));
        }
        else if (Utils.isAuthor()) {
            System.out.println("transicion a moderacion");
            document.setState(new Moderation(document));
        }
        else {
            System.out.println("no tienes los permisos para publicar el documento");
        }
    }
}
