package factory.main;

import factory.abstracts.ModernFactory;
import factory.base.Car;
import factory.base.Moveable;
import factory.base.Plane;
import factory.simple.CarFactory;
import factory.simple.PlaneFactory;
import factory.simple.SimpleVehicleFactory;

public class Main {
    public static void main(String[] args) {
        // 一般写法
//        normal();

        // 简单写法
        //simple();

        // 抽象工厂
        abstracts();
    }

    private static void abstracts() {
        new ModernFactory().createVehicle().go();
    }

    private static void simple() {
        // 分开写法
        CarFactory.getInstance().create().go();
        PlaneFactory.getInstance().create().go();

        // 合并写
        SimpleVehicleFactory.getInstance().createCar().go();
        SimpleVehicleFactory.getInstance().createPlane().go();
    }

    private static void normal() {
        Moveable m = new Plane();
        m.go();

        Moveable m1 = new Car();
        m1.go();
    }
}
