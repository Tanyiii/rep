#include <iostream>
using namespace std;

int partition(int arr[], int low, int high) {
    int pivot = arr[high]; // Опорный элемент
    int i = low - 1; // Индекс меньшего элемента
    
    for (int j = low; j < high; j++) {
        // Если текущий элемент меньше опорного
        if (arr[j] <= pivot) {
            i++;
            swap(arr[i], arr[j]); // Меняем местами
        }
    }
    swap(arr[i + 1], arr[high]); // Ставим опорный элемент на место
    return i + 1;
}

void quickSort(int arr[], int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high); // Индекс разбиения
        quickSort(arr, low, pi - 1);  // Сортируем левую часть
        quickSort(arr, pi + 1, high); // Сортируем правую часть
    }
}

int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Исходный массив: ";
    for (int i = 0; i < n; i++) cout << arr[i] << " ";
    
    quickSort(arr, 0, n - 1);
    
    cout << "\nОтсортированный массив: ";
    for (int i = 0; i < n; i++) cout << arr[i] << " ";
    return 0;
}
