package comportamiento.statepattern;

import lombok.Data;
import comportamiento.statepattern.states.State;

@Data
public class Document {

    private State state;

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish();
    }



}
