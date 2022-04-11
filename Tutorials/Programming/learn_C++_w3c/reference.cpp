#include <iostream>
#include <string>
using namespace std;

int main() {
    string food = "Pizza";
    string &meal = food;

    cout << food << endl;
    cout << meal << endl;

    return 0;
}