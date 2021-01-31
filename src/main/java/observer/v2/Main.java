package observer.v2;

class Child{
    private boolean cry =false;
    // 将观察者加入到被观察者里面
    private Dad dad = new Dad();

    public boolean isCry(){return cry;}

    public void wakeUp(){
        cry = true;
        dad.feed();
    }
}

// 创建一个观察者
class Dad {
    public void feed() {
        System.out.println("dad feeding ..");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}


