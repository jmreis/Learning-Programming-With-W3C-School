#include <iostream>
#include <string>
using namespace std;

class Car {
    public:
    string brand;
    string model;
    int year;

    // Constructor
    Car(string x, string y, int z) {
        brand = x;
        model = y;
        year = z;
    }
};

int main() {
    Car carObj1("BMw", "X5", 1999);
    cout << carObj1.brand << endl;
    cout << carObj1.model << endl;
    cout << carObj1.year;
    return 0;

}