package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("小白", 5, 6), new Cat("小黑",3,4), new Cat("小红", 8,9)};
//        Sorter.sort(cats);
//        System.out.println(Arrays.toString(cats));

        final Sorter<Cat> catSorter = new Sorter<>();

        // 根据体重，降序
        System.out.println("------ 根据体重，降序 ----------");
//        catSorter.sortStrategy(cats, new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                if (o1.getWeight() > o2.getWeight()) return 1;
//                else if (o1.getWeight() < o2.getWeight()) return -1;
//                else return 0;
//            }
//        });
        catSorter.sortStrategy(cats, (o1, o2) -> {
                if (o1.getWeight() > o2.getWeight()) return 1;
                else if (o1.getWeight() < o2.getWeight()) return -1;
                else return 0;
        });
        System.out.println(Arrays.toString(cats));

        // 根据高度来排序(升序)
        System.out.println("------ 根据高度，升序 ----------");
//        catSorter.sortStrategy(cats, new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                if (o1.getHeight() < o2.getHeight()) return 1;
//                else if (o1.getHeight() > o2.getHeight()) return -1;
//                else return 0;
//            }
//        });
        catSorter.sortStrategy(cats, (o1, o2) -> {
            if (o1.getHeight() < o2.getHeight()) return 1;
            else if (o1.getHeight() > o2.getHeight()) return -1;
            else return 0;
        });

        System.out.println(Arrays.toString(cats));
    }
}
