#include <iostream>
using namespace std;

int myfunction(int x, int y) {
    return x + y;
}

int main() {
    cout << myfunction(5, 3) << endl;
    int z = myfunction(10, 10);
    cout << z;
    return 0;
}