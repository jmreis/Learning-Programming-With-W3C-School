#include <iostream>

class Employee {
    protected:
    int salary;
};

// Derived class
class Programmer: public Employee {
    public:
    int bonus;
    void setsalary(int s) {
        salary = s;
    }
    int getsalary() {
        return salary;
    }
};

int main() {
    Programmer myObj;
    myObj.setsalary(50000);
    myObj.bonus = 15000;
    std::cout << "Salary: " << myObj.getsalary() << "\n";
    std::cout << "Bonus: " << myObj.bonus << "\n";
    return 0;
}