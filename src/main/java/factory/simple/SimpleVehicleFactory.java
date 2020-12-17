package factory.simple;

import factory.base.Car;
import factory.base.Plane;

public class SimpleVehicleFactory {
    public static SimpleVehicleFactory INSTANCE = new SimpleVehicleFactory();
    private SimpleVehicleFactory(){
    }

    public static SimpleVehicleFactory getInstance(){
        return INSTANCE;
    }

    public Car createCar(){
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
