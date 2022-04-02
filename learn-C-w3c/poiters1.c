#include <stdio.h>

int myage = 43;     // int variable
int* ptr = &myage;  // poiter variable store addr of myage

void main() {
    printf("%d\n", myage);
    printf("%p\n", &myage);
    printf("%p\n", ptr);

    // Use deference
    printf("%d\n", *ptr);
}