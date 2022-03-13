#include <stdio.h>

// Function declaration
void myfunction();
int soma();

// the main method
int main() {
    myfunction();   // call the function
    int result = soma(10, 111);
    printf("Result is: %d", result);
}

// Function definition 
void myfunction() {
    printf("I just got executed!\n");
}

int soma(int x, int y) {
    return x + y;
}