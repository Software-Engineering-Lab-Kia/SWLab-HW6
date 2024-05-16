package strategy_pattern;

public class ExpressDelivery implements DeliveryMethod {
    @Override
    public double deliveryPrice(double weight) {
        return weight * 3.5;
    }
}
