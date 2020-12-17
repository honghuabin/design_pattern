package factory.abstracts;

// 现代工厂
public class ModernFactory extends AbstractFactory{
    public Vehicle createVehicle(){
        return new ModernCar();
    }
}
