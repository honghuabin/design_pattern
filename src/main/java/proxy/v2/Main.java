package proxy.v2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Object o = Proxy.newProxyInstance(cat.getClass().getClassLoader(), new Class[]{Animal.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = method.invoke(cat, args);
                return invoke;
            }
        });
        Animal animal = (Animal)o;
        animal.play();
    }
}

interface Animal{
    void play();
}

// 被代理对象 - 猫
class Cat implements Animal {
    public void play(){
        System.out.println("抓老鼠");
    }
}

// 被代理对象 - 狗
class Dog implements Animal{

    @Override
    public void play() {
        System.out.println("玩球");
    }
}
