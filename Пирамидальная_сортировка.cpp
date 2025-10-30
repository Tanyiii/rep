#include <iostream>
#include <vector>
using namespace std;

void heapify(vector<int>& arr, int n, int i) {
    int largest = i; // Инициализируем корень
    int left = 2 * i + 1; // Левый потомок
    int right = 2 * i + 2; // Правый потомок
    
    // Если левый потомок больше корня
    if (left < n && arr[left] > arr[largest]) {
        largest = left;
    }
    
    // Если правый потомок больше корня
    if (right < n && arr[right] > arr[largest]) {
        largest = right;
    }
    
    // Если наибольший элемент не корень
    if (largest != i) {
        swap(arr[i], arr[largest]);
        heapify(arr, n, largest); // Рекурсивно преобразуем затронутое поддерево
    }
}

void heapSort(vector<int>& arr) {
    int n = arr.size();
    
    // Построение max-heap
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }
    
    // Извлекаем элементы из кучи один за другим
    for (int i = n - 1; i > 0; i--) {
        // Перемещаем текущий корень в конец
        swap(arr[0], arr[i]);
        // Вызываем heapify на уменьшенной куче
        heapify(arr, i, 0);
    }
}

int main() {
    vector<int> arr = {12, 11, 13, 5, 6, 7};
    cout << "Исходный массив: ";
    for (int num : arr) cout << num << " ";
    
    heapSort(arr);
    
    cout << "\nОтсортированный массив: ";
    for (int num : arr) cout << num << " ";
    return 0;
}
