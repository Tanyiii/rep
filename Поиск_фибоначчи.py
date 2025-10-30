def fibonacci_search(arr, x):
    n = len(arr)
    fib_m2 = 0  # F(m-2)
    fib_m1 = 1  # F(m-1)
    fib_m = fib_m2 + fib_m1  # F(m)
    
    # Находим наименьшее число Фибоначчи >= n
    while fib_m < n:
        fib_m2 = fib_m1
        fib_m1 = fib_m
        fib_m = fib_m2 + fib_m1
    
    offset = -1  # Индекс начала отсеченной части
    
    while fib_m > 1:
        i = min(offset + fib_m2, n - 1)
        
        if arr[i] < x:
            fib_m = fib_m1
            fib_m1 = fib_m2
            fib_m2 = fib_m - fib_m1
            offset = i
        elif arr[i] > x:
            fib_m = fib_m2
            fib_m1 = fib_m1 - fib_m2
            fib_m2 = fib_m - fib_m1
        else:
            return i  # Элемент найден
    
    # Проверяем последний элемент
    if fib_m1 and offset + 1 < n and arr[offset + 1] == x:
        return offset + 1
    
    return -1  # Элемент не найден

if __name__ == "__main__":
    arr = [10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100]
    x = 85
    result = fibonacci_search(arr, x)
    
    if result != -1:
        print(f"Элемент найден на позиции: {result}")
    else:
        print("Элемент не найден")
