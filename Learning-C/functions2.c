#include <stdio.h>

void myfunction(char name[], int age) {
    printf("Hello %s. You are %d years old.\n", name, age);
}

int myfunction1(int x, int y) {
    return x + y;
}

int main() {
    myfunction("Ana", 13);
    myfunction("Liam", 30);
    printf("Result is: %d", myfunction1(5, 3));
    return 0;
}