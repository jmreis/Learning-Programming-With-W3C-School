#include <iostream>
using namespace std;

class MyClass {
    public:
      void myfunction() {
          cout << "Some content in parent class.";
      }
};

// Another base class
class MyOtherClass {
    public:
      void myotherfunction() {
          cout << "Some content in another class.";
      }
};

// Derived class
class MyChildClass: public MyClass, public MyOtherClass {
};

int main() {
    MyChildClass myObj;
    myObj.myfunction();
    myObj.myotherfunction();
    return 0;
}