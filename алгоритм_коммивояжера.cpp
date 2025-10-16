#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>

using namespace std;

int main() {
    // Матрица расстояний между городами (4 города)
    vector<vector<int>> distances = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };

    int n = distances.size(); // Количество городов
    vector<int> cities(n); // Вектор для хранения текущего маршрута
    for (int i = 0; i < n; i++) {
        cities[i] = i; // Заполняем города числами 0, 1, 2, 3
    }

    int minDistance = INT_MAX; // Инициализируем минимальное расстояние максимальным значением
    vector<int> bestRoute; // Вектор для сохранения лучшего маршрута

    // Генерируем все возможные перестановки городов
    do {
        int currentDistance = 0; // Переменная для подсчета длины текущего маршрута
        
        // Вычисляем общее расстояние для текущего маршрута
        for (int i = 0; i < n; i++) {
            // Добавляем расстояние от текущего города до следующего
            currentDistance += distances[cities[i]][cities[(i + 1) % n]];
        }

        // Проверяем, является ли текущий маршрут короче найденного ранее
        if (currentDistance < minDistance) {
            minDistance = currentDistance;
            bestRoute = cities; // Сохраняем лучший маршрут
        }
    } while (next_permutation(cities.begin(), cities.end())); // Генерируем следующую перестановку

    // Выводим результат
    cout << "Минимальное расстояние: " << minDistance << endl;
    cout << "Лучший маршрут: ";
    for (int city : bestRoute) {
        cout << city << " "; // Печатаем города в порядке маршрута
    }
    cout << bestRoute[0]; // Возвращаемся в начальный город
    cout << endl;

    return 0;
}
