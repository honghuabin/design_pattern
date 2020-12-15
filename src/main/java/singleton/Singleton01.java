package singleton;

public class Singleton01 {
    public static Singleton01 INSTANCE = new Singleton01();

    private String name;

    private Singleton01(){

    }

    private static Singleton01 getInstance(){
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args){
        Singleton01 instance = Singleton01.getInstance();
        Singleton01 instance1 = Singleton01.getInstance();
        System.out.println(instance == instance1);
    }
}
