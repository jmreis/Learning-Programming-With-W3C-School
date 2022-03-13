#include <iostream>
using namespace std;

class MyClass {
    public:
      void myfunction() {
          cout << "Some content in parent class.";
      }
};

// Derived class (child)
class MyChild: public MyClass {
};

// Derived class (grandchild)
class MyGrandChild: public MyChild {
};

int main() {
    MyGrandChild myObj;
    myObj.myfunction();
    return 0;
}