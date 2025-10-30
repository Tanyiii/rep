def bubble_sort(arr):
    n = len(arr)
    # Проходим по всем элементам массива
    for i in range(n - 1):
        # Уменьшаем диапазон, так как последние i элементов уже отсортированы
        for j in range(n - i - 1):
            # Сравниваем соседние элементы
            if arr[j] > arr[j + 1]:
                # Меняем местами, если порядок неправильный
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

if __name__ == "__main__":
    test_array = [64, 34, 25, 12, 22, 11, 90]
    print("Исходный массив:", test_array)
    bubble_sort(test_array)
    print("Отсортированный массив:", test_array)
