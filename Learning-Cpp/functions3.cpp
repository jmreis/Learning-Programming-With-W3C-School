#include <iostream>
using namespace std;

void swapnums(int &x, int &y) {
    int z = x;
    x = y;
    y = z;
}

int main() {
    int firstnum = 10;
    int secondnum = 20;

    cout << "Before swap: " << endl;
    cout << firstnum << secondnum << endl;

    swapnums(firstnum, secondnum);

    cout << "After swap: " << endl;
    cout << firstnum << secondnum << endl;

    return 0;
    
}