//package Seminars.homeWork3.quickSort;
// СОРТИРОВКА МАССИВА
// Реализация сортировки QuickSort на Java
public class QuickSort {
    static int[] sortArr; // ссылка на сортируемый массив

    public void sort(int[]arr, int start, int end)
    {   
        // условие выхода из рекурсии
        if(start >= end) 
        {   
            //printArr(arr);
            return; //выходим из сортировки когда начальный и конечный элементы подмассивов равны
        }
        int pivot = partition(arr, start, end); // выбор точки опоры
        sort(arr, start, pivot-1); //сортировка левой части массива
        sort(arr, pivot+1, end); //сортировка правой части массива
    }

    // метод для выбора опорного элемента массива где все элементы меньшие опорного располоаются слева
    // а элементы большие опорного распологаются справа
    static int partition(int[]targetArray, int start, int end)
    {
        int value = targetArray[end]; //изначально в качестве опорного элемента выбирам 
                                    // последний элемент в массиве а все остальные элементы будем с ним сравнивать  
        int position = start; // начальная позиция с которой будем начинать сравнение элементов

        for(int i = start; i < end; i++)
        { 
            if(targetArray[i] <= value)
            {
                int temp = targetArray[i];
                targetArray[i] = targetArray[position];
                targetArray[position] = temp;
                position++;
            }
        }
        // после того как мы прошлись по всему массиву и сравнили все его элементы 
        // с опорным конечным элементом массива мы перемещаем опорный элемент на 
        // фактическую его позицию где он будет разделять массив на 2 части (слева меньшие элементы
        // а справа большие элементы)
        targetArray[end] = targetArray[position];
        targetArray[position] = value;
        return position; // возвращаем позицию опорного элемента
    }    
}
