#include <iostream>
using namespace std;

void insertionSort(int array[], int size) {
    // Начинаем со второго элемента
    for (int i = 1; i < size; i++) {
        int key = array[i]; // Текущий элемент для вставки
        int j = i - 1;
        
        // Сдвигаем элементы большие key вправо
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = key; // Вставляем key на правильную позицию
    }
}

int main() {
    int array[] = {12, 11, 13, 5, 6};
    int size = sizeof(array) / sizeof(array[0]);
    
    cout << "Исходный массив: ";
    for (int i = 0; i < size; i++) {
        cout << array[i] << " ";
    }
    
    insertionSort(array, size);
    
    cout << "\nОтсортированный массив: ";
    for (int i = 0; i < size; i++) {
        cout << array[i] << " ";
    }
    return 0;
}
