#include <stdio.h>
#pragma warning(disable:4996)

int main() {
    int N, K;
    int cnt = 0;
    scanf("%d %d", &N, &K);

    for (int i = 1; i < N; i++) {
        if (N % i == 0) {
            cnt++;
            if (cnt == K) {
                printf("%d", i);
                break;
            }
        }
    }

    if (cnt < K) {
        printf("0");
    }

    return 0;
}