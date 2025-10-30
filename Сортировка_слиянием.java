public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) return; // Базовый случай рекурсии
        
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        // Копируем данные во временные массивы
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        // Рекурсивно сортируем левую и правую части
        mergeSort(left);
        mergeSort(right);
        
        // Сливаем отсортированные части
        merge(arr, left, right);
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Сливаем элементы, пока есть элементы в обоих массивах
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Добавляем оставшиеся элементы из left
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        
        // Добавляем оставшиеся элементы из right
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
    
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.print("Исходный массив: ");
        for (int num : array) System.out.print(num + " ");
        
        mergeSort(array);
        
        System.out.print("\nОтсортированный массив: ");
        for (int num : array) System.out.print(num + " ");
    }
}
