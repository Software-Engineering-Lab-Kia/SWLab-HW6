package strategy_pattern_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import org.junit.jupiter.api.Test;

import state_pattern.DeliveredState;
import state_pattern.TransitState;
import strategy_pattern.DeliveryMethod;
import strategy_pattern.ExpressDelivery;
import strategy_pattern.Package;
import strategy_pattern.StandardDelivery;

public class DeliveryTest {
    @Test
    void deliveryPriceTest() {
        Package deliveryPackage = new Package(10);

        DeliveryMethod standardDelivery = new StandardDelivery();
        assertEquals(standardDelivery.deliveryPrice(deliveryPackage.getWeight()), 25);

        DeliveryMethod expressDelivery = new ExpressDelivery();
        assertEquals(expressDelivery.deliveryPrice(deliveryPackage.getWeight()), 35);
    }


    @Test
    void strategyTest(){
        Package package1 = new Package(10);

        StandardDelivery standardDelivery = new StandardDelivery();
        package1.setDeliveryMethod(standardDelivery);

        assertInstanceOf(StandardDelivery.class, package1.getDeliveryMethod());
        assertEquals(package1.getPrice(), 25);

        ExpressDelivery expressDelivery = new ExpressDelivery();
        package1.setDeliveryMethod(expressDelivery);
        assertInstanceOf(ExpressDelivery.class, package1.getDeliveryMethod());
        assertEquals(package1.getPrice(), 35);
    }

    @Test
    void stateTest(){
        Package package1 = new Package(10);

        TransitState transitState = new TransitState();
        package1.setState(transitState);

        assertInstanceOf(TransitState.class, package1.getState());

        DeliveredState deliveredState = new DeliveredState();
        package1.setState(deliveredState);
        assertInstanceOf(DeliveredState.class, package1.getState());
    }
}
