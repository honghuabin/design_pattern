package observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 发现一个事件可以有多个观察者
 * 这样有一个新的观察者，那么需要修改被观察者的代码
 */
class Child {
    private boolean cry = false;
    // 将观察者加入到被观察者里面
    private List<Observer> observers = new ArrayList<>();

    // 加载观察者
    {
        observers.add(new Dad());
        observers.add(new Mum());
        observers.add(new Dad());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }
}

interface Observer{
    void actionOnWakeUp();
}
// 创建第一个观察者
class Dad implements Observer{
    public void feed() {
        System.out.println("dad feeding ..");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}

// 创建第二个观察者
class Mum implements Observer{
    public void hug() {
        System.out.println("mum hugging ..");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}

// 创建第三个观察者
class Dog implements Observer{
    public void wang() {
        System.out.println("dog wang ..");
    }

    @Override
    public void actionOnWakeUp() {
        wang();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}


