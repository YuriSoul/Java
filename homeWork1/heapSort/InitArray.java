public class InitArray {
    static long[] arr; // ссылка на сортируемый массив
    private int nElems; // количество элементов данных

    // КОНСТРУКТОР
    public InitArray(int sizeArr) {
        arr = new long[sizeArr]; // создание массива
        nElems = 0; // изначальное количество элементов в массиве (массив пуст)
    }

    // ВСТАВКА ЭЛЕМЕНТОВ В МАССИВ
    public void insert(long value) { // получение элементов для вставки
        arr[nElems] = value; // вставка очередного элемента
        nElems++; // подсчет вставляемых элементов
    }

    // ПЕЧАТЬ МАССИВА
    public void printArr(long[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }
    // ВЫЗОВ МАССИВА
    public long[] getArr(){
        return arr;
    }
}
