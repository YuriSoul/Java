package developer.secondQuarter.utility.arrays.sortings.insertSort;

import developer.secondQuarter.utility.arrays.sortings.selectionSort.SelectSortMax;
import developer.secondQuarter.utility.random.RandInt;

public class Main {
    public static void main(String[] args) {

        InsertSort ins = new InsertSort(5);
        RandInt rnd = new RandInt(1, 100);
        // Заполняем массив
        for (int i = 0; i < 5; i++) {
            ins.insert(rnd.randIntNum(1, 100));
        }
        //Изначальный массив
        ins.printArr();

        long startTime = System.nanoTime();
        // Сортируем массив
        ins.insertSort();
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;


        // Выводим массив на экран
        ins.printArr();
        System.out.println("Execution time in milliseconds: " + (float)(timeElapsed));

    }
}
