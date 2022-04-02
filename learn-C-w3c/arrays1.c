#include <stdio.h>

int mynumbers[] = {25, 50, 75, 100};
int i;

void main() {
    for (i = 0; i < 4; i++) {
        printf("%d\n", mynumbers[i]);
    }
}