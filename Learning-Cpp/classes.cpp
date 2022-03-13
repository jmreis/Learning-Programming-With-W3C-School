#include <iostream>
#include <string>
using namespace std;

class MyClass {     // the class
    public:         // access specifier
    int mynum;
    string mystring;    // Atributes

    void mymethod();   // Method/function declaration
    int speed(int maxspeed);
};

void MyClass::mymethod() {
    cout << "Hello World!";
}

int MyClass::speed() {
    return maxspeed;
}

int main() {
    MyClass myObj;  // Create an object of class

    // Access attributes
    myObj.mynum = 15;
    myObj.mystring = "Some text";

    // Show values
    cout << myObj.mynum << endl;
    cout << myObj.mystring << endl;
    myObj.mymethod();
    cout << myObj.speed(200);
    return 0;

}
