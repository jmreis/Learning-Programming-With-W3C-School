#include <stdio.h>  

char greetings[] = "Hello World!";

void main() {
    greetings[0] = 'J';
    printf("%s\n", greetings);
}