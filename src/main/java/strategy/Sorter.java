package strategy;

public class Sorter<T> {
    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            // 选择排序
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[i]) == -1 ? j : minPos;
            }

            // 交换位置
            if (minPos != i) {
                Comparable tmp = arr[i];
                arr[i] = arr[minPos];
                arr[minPos] = tmp;
            }
        }
    }

    /*
        根据策略来进行比较
     */
    public void sortStrategy(T[] arr, Comparator<T> compartor){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;

            for (int j = i; j < arr.length; j++) {
                minPos = compartor.compare(arr[i], arr[j]) == -1 ? j : minPos;
            }

            if (minPos != i) {
                T tmp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = tmp;
            }
        }
    }
}
