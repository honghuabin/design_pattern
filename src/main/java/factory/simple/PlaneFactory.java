package factory.simple;

import factory.base.Plane;

public class PlaneFactory {
    public static PlaneFactory INSTANCE = new PlaneFactory();
    private PlaneFactory(){
    }

    public static PlaneFactory getInstance(){
        return INSTANCE;
    }
    public Plane create(){
        return new Plane();
    }
}
