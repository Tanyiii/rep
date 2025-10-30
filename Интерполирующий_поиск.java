public class InterpolationSearch {
    public static int interpolationSearch(int arr[], int lo, int hi, int x) {
        // Проверяем, находится ли x в диапазоне массива
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            // Вычисляем предполагаемую позицию
            int pos = lo + (((hi - lo) * (x - arr[lo])) / (arr[hi] - arr[lo]));
            
            if (arr[pos] == x) {
                return pos; // Элемент найден
            } else if (arr[pos] < x) {
                // Ищем в правой части
                return interpolationSearch(arr, pos + 1, hi, x);
            } else {
                // Ищем в левой части
                return interpolationSearch(arr, lo, pos - 1, x);
            }
        }
        return -1; // Элемент не найден
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23};
        int x = 18;
        int result = interpolationSearch(arr, 0, arr.length - 1, x);
        
        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
