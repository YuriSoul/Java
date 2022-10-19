package developer.secondQuarter.homeWork1.heapSort;

import developer.secondQuarter.utility.random.RandInt;

public class Main {
    public static void main(String[] args) {

        InitArray init = new InitArray(5);
        HeapSort hs = new HeapSort();
        RandInt rnd = new RandInt(1, 100);
        // Заполняем массив
        for (int i = 0; i < 5; i++) {
            init.insert(rnd.randIntNum(1, 100));
        }
        //Изначальный массив
        init.printArr(init.getArr());

        long startTime = System.nanoTime();
        // Сортируем массив
        hs.sort(init.getArr());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;


        // Выводим массив на экран
        init.printArr(hs.sort(init.getArr()));
        System.out.println("Execution time in milliseconds: " + (float)(timeElapsed));

    }
}
