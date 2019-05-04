package Delivery;

import Users.Customer;

public class DeliveryManager {

    public static  final int trainShippingCost = 1500;
    public static final int airShippingCost = 2000;
    public static final int taxiShippingCost = 1000;

    public enum ShippingType {
        TRAIN,
        TAXI,
        AIR,
        AIR_TAXI,
        AIR_TRAIN,
        TRAIN_TAXI,
        AIR_TRAIN_TAXI,
        NONE;
    }

    private DeliveryService deliveryService;

    private Decorator airDecorator;
    private Decorator taxiDecorator;
    private Decorator trainDecorator;


    public DeliveryManager() {
        deliveryService = new BasicDeliveryService();

        airDecorator = new AirDeliveryService();
        taxiDecorator = new TaxiDeliveryService();
        trainDecorator = new TrainDeliveryService();
    }

    public void ship(Customer customer, ShippingType type) {
        switch (type) {
            case TRAIN: {
                train_Shipping(customer);
                break;
            }
            case TAXI: {
                taxi_Shipping(customer);
                break;
            }
            case AIR: {
                air_Shipping(customer);
                break;
            }
            case AIR_TAXI: {
                air_taxi_Shipping(customer);
                break;
            }
            case AIR_TRAIN: {
                air_train_Shipping(customer);
                break;
            }
            case TRAIN_TAXI: {
                train_taxi_Shipping(customer);
                break;
            }
            case AIR_TRAIN_TAXI: {
                air_train_taxi_Shipping(customer);
                break;
            }
            case NONE: {
                deliveryService.deliverProducts(customer);
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid type of shipping!");
            }

        }
    }

    public static int getShippingCost(ShippingType type) {
        switch (type) {
            case TRAIN: {
                return trainShippingCost;
            }
            case TAXI: {
                return taxiShippingCost;
            }
            case AIR: {
                return airShippingCost;
            }
            case AIR_TAXI: {
                return taxiShippingCost + airShippingCost;
            }
            case AIR_TRAIN: {
                return airShippingCost + trainShippingCost;
            }
            case TRAIN_TAXI: {
                return trainShippingCost + taxiShippingCost;
            }
            case AIR_TRAIN_TAXI: {
                return airShippingCost + trainShippingCost + taxiShippingCost;
            }
            case NONE: {
                return 0;
            }
            default: {
                throw new IllegalArgumentException("Invalid type of shipping!");
            }

        }
    }

    private void taxi_Shipping(Customer customer) {
        taxiDecorator.addShippingRoute(deliveryService);
        taxiDecorator.deliverProducts(customer);
    }

    private void air_Shipping(Customer customer) {
        airDecorator.addShippingRoute(deliveryService);
        airDecorator.deliverProducts(customer);
    }

    private void train_Shipping(Customer customer) {
        trainDecorator.addShippingRoute(deliveryService);
        trainDecorator.deliverProducts(customer);
    }

    private void train_taxi_Shipping(Customer customer) {
        trainDecorator.addShippingRoute(deliveryService);
        taxiDecorator.addShippingRoute(trainDecorator);
        taxiDecorator.deliverProducts(customer);
    }

    private void air_taxi_Shipping(Customer customer) {
        airDecorator.addShippingRoute(deliveryService);
        taxiDecorator.addShippingRoute(airDecorator);
        taxiDecorator.deliverProducts(customer);
    }

    private void air_train_Shipping(Customer customer) {
        airDecorator.addShippingRoute(deliveryService);
        trainDecorator.addShippingRoute(airDecorator);
        trainDecorator.deliverProducts(customer);
    }

    private void air_train_taxi_Shipping(Customer customer) {
        airDecorator.addShippingRoute(deliveryService);
        trainDecorator.addShippingRoute(airDecorator);
        taxiDecorator.addShippingRoute(trainDecorator);
        taxiDecorator.deliverProducts(customer);
    }
}
