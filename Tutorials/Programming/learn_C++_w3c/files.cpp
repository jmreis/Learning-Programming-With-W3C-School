#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    // Create a text file
    ofstream mywritefile("filename.txt");

    // Write to the file
    mywritefile << "Files can be tricky, but it is enough!";

    // Close file
    mywritefile.close();

    // Create a text string, which is used to output the text file
    string mytext;

    // Read from the text file
    ifstream myreadfile("filename.txt");

    // Use while with getline()
    while (getline(myreadfile, mytext)) {
        // Output the text
        cout << mytext;
    }
    // close the file
    myreadfile.close();
}