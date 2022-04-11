#include <stdio.h>

int myint;
float myfloat;
double mydouble;
char mychar;

int main() {
    printf("%lu\n", sizeof(myint));
    printf("%lu\n", sizeof(myfloat));
    printf("%lu\n", sizeof(mydouble));
    printf("%lu\n", sizeof(mychar));
    return 0;
}