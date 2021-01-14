// 숫자 A, B, C를 입력받아 A부터 B까지의 숫자 중에서 C의 배수의 개수를 출력

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