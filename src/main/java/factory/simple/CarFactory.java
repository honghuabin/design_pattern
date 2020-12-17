package factory.simple;

import factory.base.Car;

public class CarFactory {
    public static CarFactory INSTANCE = new CarFactory();
    private CarFactory(){
    }

    public static CarFactory getInstance(){
        return INSTANCE;
    }

    public Car create(){
        return new Car();
    }
}
