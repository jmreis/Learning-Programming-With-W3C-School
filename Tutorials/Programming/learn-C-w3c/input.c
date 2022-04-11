#include <stdio.h>

int mynum;
char name[30];

void main() {
    // User msg
    printf("Type a number: \n");
    // Get number of user
    scanf("%d", &mynum);
    // Result msg
    printf("The number is: %d\n", mynum);

    // Get string
    printf("Type your name: \n");
    scanf("%s", &name);
    printf("The name is: %s", name);

}