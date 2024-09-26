package comportamiento.statepattern.states;

import lombok.AllArgsConstructor;
import lombok.Data;
import comportamiento.statepattern.Document;
import comportamiento.statepattern.Utils;

@Data
@AllArgsConstructor
public class Moderation implements State {
    private Document document;

    @Override
    public void render() {

    }

    @Override
    public void publish() {

        if (Utils.isAdmin()) {
            System.out.println("documento publicado");
            document.setState(new Published(document));
        } else {
            System.out.println("no tiene los permisos necesarios para publicar el documento");
        }

    }
}
