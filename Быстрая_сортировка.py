def partition(arr, low, high):
    pivot = arr[high]  # Опорный элемент
    i = low - 1  # Индекс меньшего элемента
    
    for j in range(low, high):
        # Если текущий элемент меньше опорного
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]  # Меняем местами
    
    arr[i + 1], arr[high] = arr[high], arr[i + 1]  # Ставим опорный элемент на место
    return i + 1

def quick_sort(arr, low, high):
    if low < high:
        pi = partition(arr, low, high)  # Индекс разбиения
        quick_sort(arr, low, pi - 1)   # Сортируем левую часть
        quick_sort(arr, pi + 1, high)  # Сортируем правую часть

if __name__ == "__main__":
    arr = [10, 7, 8, 9, 1, 5]
    print("Исходный массив:", arr)
    quick_sort(arr, 0, len(arr) - 1)
    print("Отсортированный массив:", arr)
