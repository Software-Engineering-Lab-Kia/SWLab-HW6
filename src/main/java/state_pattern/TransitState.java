package state_pattern;

public class TransitState implements State {
    @Override
    public void changeState(){
        System.out.println("The package is in transit.");
    }
}
