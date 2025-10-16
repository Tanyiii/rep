import java.util.*;

public class TSP {
    public static void main(String[] args) {
        // Матрица расстояний между городами (4 города)
        int[][] distances = {
            {0, 10, 15, 20},
            {10, 0, 35, 25},
            {15, 35, 0, 30},
            {20, 25, 30, 0}
        };

        int n = distances.length; // Количество городов
        List<Integer> cities = new ArrayList<>(); // Список для хранения городов
        for (int i = 0; i < n; i++) {
            cities.add(i); // Заполняем города числами 0, 1, 2, 3
        }

        int minDistance = Integer.MAX_VALUE; // Инициализируем минимальное расстояние
        List<Integer> bestRoute = new ArrayList<>(); // Список для лучшего маршрута

        // Генерируем все возможные перестановки городов
        do {
            int currentDistance = 0; // Переменная для подсчета длины текущего маршрута
            
            // Вычисляем общее расстояние для текущего маршрута
            for (int i = 0; i < n; i++) {
                // Добавляем расстояние от текущего города до следующего
                currentDistance += distances[cities.get(i)][cities.get((i + 1) % n)];
            }

            // Проверяем, является ли текущий маршрут короче найденного ранее
            if (currentDistance < minDistance) {
                minDistance = currentDistance;
                bestRoute = new ArrayList<>(cities); // Сохраняем лучший маршрут
            }
        } while (nextPermutation(cities)); // Генерируем следующую перестановку

        // Выводим результат
        System.out.println("Минимальное расстояние: " + minDistance);
        System.out.print("Лучший маршрут: ");
        for (int city : bestRoute) {
            System.out.print(city + " "); // Печатаем города в порядке маршрута
        }
        System.out.print(bestRoute.get(0)); // Возвращаемся в начальный город
        System.out.println();
    }

    // Метод для генерации следующей перестановки
    private static boolean nextPermutation(List<Integer> array) {
        // Находим самый правый элемент, который меньше следующего
        int i = array.size() - 2;
        while (i >= 0 && array.get(i) >= array.get(i + 1)) {
            i--;
        }
        if (i < 0) return false; // Если перестановок больше нет

        // Находим элемент для обмена с array[i]
        int j = array.size() - 1;
        while (array.get(j) <= array.get(i)) {
            j--;
        }

        // Обмен элементов
        Collections.swap(array, i, j);
        
        // Разворачиваем последовательность после i
        Collections.reverse(array.subList(i + 1, array.size()));
        return true;
    }
}
