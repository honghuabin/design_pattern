package observer.v3;

/**
 * 发现一个事件可以有多个观察者
 * 这样有一个新的观察者，那么需要修改被观察者的代码
 */
class Child {
    private boolean cry = false;
    // 将观察者加入到被观察者里面
    private Dad dad = new Dad();
    private Mum mum = new Mum();
    private Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        dad.feed();
        mum.hug();
        dog.wang();
    }
}

// 创建第一个观察者
class Dad {
    public void feed() {
        System.out.println("dad feeding ..");
    }
}

// 创建第二个观察者
class Mum {
    public void hug() {
        System.out.println("mum hugging ..");
    }
}

// 创建第三个观察者
class Dog {
    public void wang() {
        System.out.println("dog wang ..");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}


