package developer.secondQuarter.utility.arrays.sortings.insertSort;

public class InsertSort {
    private long[] arr; // ссылка на сортируемый массив
    private int nElems; // количество элементов данных

    // КОНСТРУКТОР
    public InsertSort(int sizeArr){
        arr = new long[sizeArr]; // создание массива
        nElems = 0; // изначальное количество элементов в массиве (массив пуст)
    }

    // ВСТАВКА ЭЛЕМЕНТОВ В МАССИВ
    public void insert(long value){ // получение элементов для вставки
        arr[nElems] = value; // вставка очередного элемента
        nElems++; // подсчет вставляемых элементов
    }

    // ПЕЧАТЬ МАССИВА
    public void printArr(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("");
    }

    // СОРТИРОВКА МАССИВА
    public void insertSort()
    {
        int in, out;
        for(out=1; out<nElems; out++) // out - разделительный маркер
        {
            long temp = arr[out]; // Скопировать помеченный элемент
            in = out; // Начать перемещения с out
            while(in>0 && arr[in-1] >= temp) // Пока не найден меньший элемент
            {
                arr[in] = arr[in-1]; // Сдвинуть элемент вправо
                --in; // Перейти на одну позицию влево
            }
            arr[in] = temp; // Вставить помеченный элемент
        }
    }



}
