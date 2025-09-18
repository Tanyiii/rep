# добавление элементов и вывод
#include <iostream>
#include <vector>
using namespace std;

int main() {
    // Создаем стек (вектор)
    vector<string> stack;

    // Добавляем элементы в стек
    stack.push_back("a"); // Добавляем "a"
    stack.push_back("b"); // Добавляем "b"
    stack.push_back("c"); // Добавляем "c"

    // Выводим стек
    cout << "Стек после добавления: ";
    for (string s : stack) {
        cout << s << " ";
    }
    cout << endl;

    return 0;
}



# удаление элемнтов
// Удаляем последний элемент
string topElement = stack.back(); // Получаем последний элемент
stack.pop_back(); // Удаляем его
cout << "Удаленный элемент: " << topElement << endl;
cout << "Стек после удаления: ";
for (string s : stack) {
    cout << s << " ";
}
cout << endl;

// Удаляем еще один элемент
string nextElement = stack.back();
stack.pop_back();
cout << "Удаленный элемент: " << nextElement << endl;
cout << "Стек после удаления: ";
for (string s : stack) {
    cout << s << " ";
}
cout << endl;
