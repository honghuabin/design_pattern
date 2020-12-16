package strategy;

/*
    比较策略接口 - 策略模式
    可以自己来定义比较类 或者 使用匿名内部类的方式来实现，就很灵活，不用去修改实现接口方法里面的方法
 */
@FunctionalInterface
public interface Comparator<T> {
    int compare(T o1, T o2);
}
