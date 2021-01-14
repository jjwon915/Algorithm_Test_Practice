#include <stdio.h>

int main() {
    int N;

    scanf("%d", &N);

    if ((N % 2) == 0) {
        printf("even\n");
    }
    else {
        printf("not even\n");
    }


    return 0;
}