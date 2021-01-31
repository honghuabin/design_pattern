package observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里我们可以事件源也传递给观察者，让观察者根据事件源和事件来进行处理
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
        WakeUpEvent wakeUpEvent = new WakeUpEvent(System.currentTimeMillis(), "bad", this);
        for (Observer observer : observers) {
            observer.actionOnWakeUp(wakeUpEvent);
        }
    }
}

class WakeUpEvent {
    long timestamp;
    String loc;
    Child source;

    public WakeUpEvent(long timestamp, String loc, Child source) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.source = source;
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


