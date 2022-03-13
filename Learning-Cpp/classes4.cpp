#include <iostream>

class Employee {
    private:
    // Private attribute
    int salary;

    public:
    // Setter
    void setsalary(int s) {
        salary = s;
    }
    // Getter
    int getsalary() {
        return salary;
    }
};

int main() {
    Employee myObj;
    myObj.setsalary(50000);
    std::cout << myObj.getsalary();
    return 0;
}
