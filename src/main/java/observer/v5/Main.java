package observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里我们只能针对源去做操作，与源的联系还是比较紧密的
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
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(), "bad");
        for (Observer observer : observers) {
            observer.actionOnWakeUp(wakeUpEvent);
        }
    }
}

class WakeUpEvent {
    long timestamp;
    String loc;

    public WakeUpEvent(long timestamp, String loc) {
        this.timestamp = timestamp;
        this.loc = loc;
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent event);
}

// 创建第一个观察者
class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding ..");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}

// 创建第二个观察者
class Mum implements Observer {
    public void hug() {
        System.out.println("mum hugging ..");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}

// 创建第三个观察者
class Dog implements Observer {
    public void wang() {
        System.out.println("dog wang ..");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        wang();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}


