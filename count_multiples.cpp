#include <stdio.h>

int main() {
    int A, B, C;
    int cnt = 0;
    scanf("%d %d %d", &A, &B, &C);

    for (A; A <= B; A++) {
        if (A % C == 0) {
            cnt++;
        }
    }

    for (B; B <= A; B++) {
        if (B % C == 0) {
            cnt++;
        }
    }
    printf("%d", cnt);

    return 0;
}