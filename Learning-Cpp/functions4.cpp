#include <iostream>
using namespace std;

int plusfunint(int x, int y) {
    return x + y;
}

double plusfuncdouble(double x, double y) {
    return x + y;
}

int main() {
    int mynum = plusfunint(10, 10);
    double mynum1 = plusfuncdouble(4.3, 6.69);
    cout << "Int: " << mynum << endl;
    cout << "Double: " << mynum1 << endl;
    return 0;
}