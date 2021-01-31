package proxy.v1;

public class Main {
    public static void main(String[] args) {
        new AnimalProxy(new Cat()).play();
        new AnimalProxy(new Dog()).play();
    }
}

interface Animal{
    void play();
}

// 代理类
class AnimalProxy implements Animal{
    Animal animal;
    public AnimalProxy(Animal animal){
        this.animal = animal;
    }

    public void play(){
        animal.play();
    }
}

// 被代理对象 - 猫
class Cat implements Animal{
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
