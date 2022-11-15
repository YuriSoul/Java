//package Seminars.homeWork3.quickSort;

public class Main {
    public static void main(String[] args) {

        InitArray init = new InitArray(20);
        QuickSort qs = new QuickSort();
        RandInt rnd = new RandInt(1, 100);
        
        // Заполняем массив
        for (int i = 0; i < 20; i++) {
            init.insert(rnd.randIntNum(1, 100));
        }
        //Изначальный массив
        init.printArr(init.getArr());

        long startTime = System.nanoTime();
        // Сортируем массив
        qs.sort(init.getArr(), 0, init.getArr().length-1);

        init.printArr(init.getArr());
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;


        // Выводим массив на экран
        //init.printArr(qs.sort(init.getArr()));
        System.out.println("Execution time in milliseconds: " + (float)(timeElapsed));

    }
}
