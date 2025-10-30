def insertion_sort(arr):
    # Начинаем со второго элемента
    for i in range(1, len(arr)):
        key = arr[i]  # Текущий элемент для вставки
        j = i - 1
        
        # Сдвигаем элементы большие key вправо
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key  # Вставляем key на правильную позицию

if __name__ == "__main__":
    array = [12, 11, 13, 5, 6]
    print("Исходный массив:", array)
    insertion_sort(array)
    print("Отсортированный массив:", array)
