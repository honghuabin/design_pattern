package strategy;

public class Cat implements Comparable<Cat>{
    private String name;
    private int weight;
    private int height;

    public Cat() {
    }

    public Cat(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Cat(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int compareTo(Cat cat) {
        if (this.weight > cat.getWeight()) return 1;
        else if (this.weight < cat.getWeight()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
