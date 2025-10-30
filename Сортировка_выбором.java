public class SelectionSort {
    public static void selectionSort(int[] arr) {
        // Проходим по всем элементам массива
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i; // Предполагаем, что текущий элемент минимальный
            
            // Ищем минимальный элемент в неотсортированной части
            for (int j = i + 1; j < arr.length; j++) {
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

    public static void main(String[] args) {
        int[] testArray = {64, 25, 12, 22, 11};
        System.out.print("Исходный массив: ");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
        
        selectionSort(testArray);
        
        System.out.print("\nОтсортированный массив: ");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
    }
}
