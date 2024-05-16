package strategy_pattern;

public class ExpressDelivery implements DeliveryMethod {
    @Override
    public int deliveryPrice(int weight) {
        return 0;
    }
}
