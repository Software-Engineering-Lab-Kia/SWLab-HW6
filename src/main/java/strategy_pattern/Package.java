package strategy_pattern;
import state_pattern.State;

public class Package {
    private int weight;
    private DeliveryMethod deliveryMethod;
    private State state;

    public Package(int weight) {
        this.weight = weight;
        this.state = null;
        this.deliveryMethod = null;
    }

    public void setDeliveryMethod(DeliveryMethod deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void setState(State state) {
        this.state = state;
        this.state.changeState();
    }

    public int getWeight() {
        return this.weight;
    }

    public DeliveryMethod getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public double getPrice() {
        return this.deliveryMethod.deliveryPrice(this.weight);
    }

    public State getState() {
        return this.state;
    }
}
