import java.util.Arrays;

public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        
        // Начинаем с большого шага и уменьшаем его
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Применяем сортировку вставками для этого шага
            for (int i = gap; i < n; i++) {
                int temp = arr[i]; // Сохраняем текущий элемент
                int j;
                
                // Сдвигаем элементы, пока не найдем правильную позицию
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp; // Вставляем сохраненный элемент
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 2, 3};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        shellSort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}
