package strategy_pattern;

public class StandardDelivery implements DeliveryMethod {
    @Override
    public double deliveryPrice(double weight) {
        return weight * 2.5;
    }
}
