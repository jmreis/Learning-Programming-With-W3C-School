#include <iostream>
using namespace std;

class MyClass {
    int z;      // Private attribute

    public:
    int x;
    private:
    int y;      // Private attribute
};

int main() {
    MyClass myObj;
    myObj.x = 25;   // Allowed (public)
    myObj.y = 50;   // Not Allowed (private)
    cout << myObj.x;
    return 0;
}