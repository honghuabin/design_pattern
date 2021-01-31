package observer.v1;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        while (child.isCry()) { // 需要等到别人修改child里面的cry的值
            // 执行事件
        }
    }
}

class Child{
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void wakeUp(){
        System.out.println("i am weak up");
        this.cry = true;
    }
}