#include <iostream>
using namespace std;

void selectionSort(int arr[], int n) {
    // Проходим по всем элементам массива
    for (int i = 0; i < n; i++) {
        int minIndex = i; // Предполагаем, что текущий элемент минимальный
        
        // Ищем минимальный элемент в неотсортированной части
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j; // Обновляем индекс минимального элемента
            }
        }
        
        // Меняем местами текущий элемент и найденный минимальный
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
}

int main() {
    int testArray[] = {64, 25, 12, 22, 11};
    int n = sizeof(testArray) / sizeof(testArray[0]);
    
    cout << "Исходный массив: ";
    for (int i = 0; i < n; i++) {
        cout << testArray[i] << " ";
    }
    
    selectionSort(testArray, n);
    
    cout << "\nОтсортированный массив: ";
    for (int i = 0; i < n; i++) {
        cout << testArray[i] << " ";
    }
    return 0;
}
