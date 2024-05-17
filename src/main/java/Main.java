import java.util.Scanner;

import state_pattern.*;
import strategy_pattern.*;
import strategy_pattern.Package;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the weight of the package:");
        int weight = scanner.nextInt();
        Package package1 = new Package(weight);
        while (!(package1.getState() instanceof DeliveredState)){
            System.out.println("Please determine the delivery method:");
            System.out.println("1: Standard Delivery");
            System.out.println("2: Express Delivery");
            int deliveryType = scanner.nextInt();
            if (deliveryType == 1){
                StandardDelivery standardDelivery = new StandardDelivery();
                package1.setDeliveryMethod(standardDelivery);
            }
            else if (deliveryType == 2){
                ExpressDelivery expressDelivery = new ExpressDelivery();
                package1.setDeliveryMethod(expressDelivery);
            }

            System.out.println("Please determine the current state of the package:");
            System.out.println("1: Transit State");
            System.out.println("2: Delivered State");
            int stateType = scanner.nextInt();
            if (stateType == 1){
                TransitState transitState = new TransitState();
                package1.setState(transitState);
            }
            else if (stateType == 2){
                DeliveredState deliveredState = new DeliveredState();
                package1.setState(deliveredState);
            }
        }
        System.out.print("Price of delivery: ");
        System.out.println(package1.getPrice());
    }
}
