#include <iostream>
#include <string>   // string library
using namespace std;

string text = "Hello!";
string text1 = "World";
string full = text + text1;
string full2 = text.append(text1);

int main() {
    cout << full << endl;
    cout << full2;
    return 0;
}