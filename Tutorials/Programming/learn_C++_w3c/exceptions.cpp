#include <iostream>

int main() {
    try {
        int age = 15;
        if (age >= 18) {
            std::cout << "Access granted.";
        } else {
            throw (age);
        }
    }
    catch (int mynum) {
        std::cout << "Access denied - for 18 years old.\n";
        std::cout << "Age is: " << mynum;
    }
    return 0;
}