package strategy_pattern;

public class StandardDelivery implements DeliveryMethod {
    @Override
    public int deliveryPrice(int weight) {
        return 0;
    }
}
