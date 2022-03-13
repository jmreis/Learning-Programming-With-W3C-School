#include <iostream>
using namespace std;


int main() {
    int time = 20;

    if (time < 10) {
        cout << "Good morning";
    } else if (time < 20) {
        cout << "Good day";
    } else {
        cout << "Good evening";
    }

    // short hand if..else
    string result = (time < 18) ? "Good day" : "Good evening";
    return 0;
}