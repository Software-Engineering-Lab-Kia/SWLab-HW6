package strategy_pattern_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import strategy_pattern.DeliveryMethod;
import strategy_pattern.ExpressDelivery;
import strategy_pattern.Package;
import strategy_pattern.StandardDelivery;

public class DeliveryTest {
    @Test
    void deliveryPrinceTest() {
        Package deliveryPackage = new Package(10);

        DeliveryMethod standardDelivery = new StandardDelivery();
        assertEquals(standardDelivery.deliveryPrice(deliveryPackage.getPrice()), 25);

        DeliveryMethod expressDelivery = new ExpressDelivery();
        assertEquals(expressDelivery.deliveryPrice(deliveryPackage.getPrice()), 35);
    }

    @Test
    void simpleStandardDeliveryTest() {

    }

    @Test
    void simpleExpressDeliveryTest() {

    }

    @Test
    void changeDeliveryMethodTest() {

    }
}
