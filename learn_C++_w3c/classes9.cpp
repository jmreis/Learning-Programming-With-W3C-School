#include <iostream>

// Base class
class Animal {
    public:
    void animalsound() {
        std::cout << "The animal makes a sound \n";
    }
};

// Derived class
class Pig: public Animal {
    public:
    void animalsound() {
        std::cout << "The pig says: wee wee \n";
    }
};

// Derived Class
class Dog : public Animal {
    public:
    void animalsound() {
        std::cout << "The dog says: bow wow \n";
    }
};

int main() {
    Animal myanimal;
    Pig mypig;
    Dog mydog;

    myanimal.animalsound();
    mypig.animalsound();
    mydog.animalsound();
    return 0;
}
