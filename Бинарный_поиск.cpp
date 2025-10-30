#include <iostream>
using namespace std;

int binarySearch(int array[], int size, int target) {
    int left = 0;
    int right = size - 1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2; // Вычисляем середину
        
        if (array[mid] == target) {
            return mid; // Элемент найден
        } else if (array[mid] < target) {
            left = mid + 1; // Ищем в правой половине
        } else {
            right = mid - 1; // Ищем в левой половине
        }
    }
    return -1; // Элемент не найден
}

int main() {
    int sortedArray[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    int target = 7;
    int size = sizeof(sortedArray) / sizeof(sortedArray[0]);
    
    int result = binarySearch(sortedArray, size, target);
    
    if (result != -1) {
        cout << "Элемент найден на позиции: " << result << endl;
    } else {
        cout << "Элемент не найден" << endl;
    }
    return 0;
}
