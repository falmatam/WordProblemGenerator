package worksheet;


public class Instance {
    private State state;

    public Instance(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
