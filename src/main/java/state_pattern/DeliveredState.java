package state_pattern;

public class DeliveredState implements State {
    @Override
    public void changeState(){
        System.out.println("The package has been delivered.");
    }
}
