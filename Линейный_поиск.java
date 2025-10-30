public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        // Проходим по всем элементам массива
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Возвращаем индекс, если нашли элемент
            }
        }
        return -1; // Элемент не найден
    }
    
    public static void main(String[] args) {
        int[] array = {3, 5, 2, 7, 9, 1, 4};
        int target = 7;
        int result = linearSearch(array, target);
        
        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
