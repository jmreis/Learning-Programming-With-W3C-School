#include <iostream>
using namespace std;

class MyClass {
    public:
    MyClass() {         // Constructors
        cout << "Hello World!";
    }
};

int main() {
    MyClass myObj;      // This will call the constructor
    return 0;
}