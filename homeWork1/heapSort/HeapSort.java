// СОРТИРОВКА МАССИВА
// Реализация пирамидальной сортировки на Java
public class HeapSort {
    public long[] sort(long arr[]) {
        int size = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(arr, size, i);

        // Один за другим извлекаем элементы из кучи
        for (int i = size - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец
            swap(0, i);

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
        return arr;
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
    // индексом в arr[]. n - размер кучи
    private void heapify(long arr[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // левый = 2*i + 1
        int r = 2 * i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i) {
            swap(i, largest);
            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }
    // ПЕРЕСТАНОВКА ЭЛЕМЕНТОВ В МАССИВЕ
    private void swap(int one, int two) {
        long temp = InitArray.arr[one];
        InitArray.arr[one] = InitArray.arr[two];
        InitArray.arr[two] = temp;
    }
}
