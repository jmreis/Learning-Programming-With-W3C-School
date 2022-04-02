#include <iostream>
#include <string>
using namespace std;

void myfunction(string fname = "hack", int age = 18) {
    cout << fname << " REfsnes" << age << " years old.\n";
}

int main() {
    myfunction("Liam", 3);
    myfunction("Jonh", 30);
    myfunction();
    return 0;
}