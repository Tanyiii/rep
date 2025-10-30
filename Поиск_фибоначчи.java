import java.util.Arrays;

public class FibonacciSearch {
    public static int fibonacciSearch(int[] arr, int x) {
        int n = arr.length;
        int fibMM2 = 0; // F(m-2)
        int fibMM1 = 1; // F(m-1)
        int fibM = fibMM2 + fibMM1; // F(m)
        
        // Находим наименьшее число Фибоначчи >= n
        while (fibM < n) {
            fibMM2 = fibMM1;
            fibMM1 = fibM;
            fibM = fibMM2 + fibMM1;
        }
        
        int offset = -1; // Индекс начала отсеченной части
        
        while (fibM > 1) {
            int i = Math.min(offset + fibMM2, n - 1);
            
            if (arr[i] < x) {
                fibM = fibMM1;
                fibMM1 = fibMM2;
                fibMM2 = fibM - fibMM1;
                offset = i;
            } else if (arr[i] > x) {
                fibM = fibMM2;
                fibMM1 = fibMM1 - fibMM2;
                fibMM2 = fibM - fibMM1;
            } else {
                return i; // Элемент найден
            }
        }
        
        // Проверяем последний элемент
        if (fibMM1 == 1 && offset + 1 < n && arr[offset + 1] == x) {
            return offset + 1;
        }
        
        return -1; // Элемент не найден
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100};
        int x = 85;
        int result = fibonacciSearch(arr, x);
        
        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
