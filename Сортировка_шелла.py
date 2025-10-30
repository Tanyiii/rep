def shell_sort(arr):
    n = len(arr)
    gap = n // 2  # Начальный шаг
    
    while gap > 0:
        for i in range(gap, n):
            temp = arr[i]  # Сохраняем текущий элемент
            j = i
            # Сдвигаем элементы, пока не найдем правильную позицию
            while j >= gap and arr[j - gap] > temp:
                arr[j] = arr[j - gap]
                j -= gap
            arr[j] = temp  # Вставляем сохраненный элемент
        gap //= 2  # Уменьшаем шаг

if __name__ == "__main__":
    arr = [12, 34, 54, 2, 3]
    print("Исходный массив:", arr)
    shell_sort(arr)
    print("Отсортированный массив:", arr)
