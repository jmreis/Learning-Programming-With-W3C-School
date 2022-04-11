#include <stdio.h>

int time = 22;

int main() {
    if (time < 10) {
        printf("Good morning.");
    } else if (time < 20) {
        printf("Good day.");
    } else {
        printf("Good evening.");
    }
    return 0;
    
}