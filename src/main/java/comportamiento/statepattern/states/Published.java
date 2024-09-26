package comportamiento.statepattern.states;

import lombok.AllArgsConstructor;
import lombok.Data;
import comportamiento.statepattern.Document;

@Data
@AllArgsConstructor
public class Published implements State {

    private Document document;

    @Override
    public void render() {
        System.out.println("mostrando el documento ene stado publicado");
    }

    @Override
    public void publish() {
        System.out.println("el documento ya se encuentra publicado...");
    }
}
