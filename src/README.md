# 设计模式

## 单例模式(singleton)

## 策略模式(strategy)
```
将一个具体可能有多个实现方法，但是目的一样的东西，定义为策略
比如排序：
可以根据身高、体重、年龄等等进行排序
目的都是排序，只是里面排序的条件不一样，也就是排序策略不一样
此时就可以将排序的具体方法作为一种策略
即作为一个接口
Comparable 接口是需要实现的接口
Comparator 接口是策略模式
一定程度上来讲，策略模式可以用lambda表达来使用。
```