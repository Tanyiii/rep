public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Проходим по всем элементам массива
        for (int i = 0; i < n - 1; i++) {
            // Уменьшаем диапазон, так как последние i элементов уже отсортированы
            for (int j = 0; j < n - i - 1; j++) {
                // Сравниваем соседние элементы
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами, если порядок неправильный
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("Исходный массив: ");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
        
        bubbleSort(testArray);
        
        System.out.print("\nОтсортированный массив: ");
        for (int num : testArray) {
            System.out.print(num + " ");
        }
    }
}
