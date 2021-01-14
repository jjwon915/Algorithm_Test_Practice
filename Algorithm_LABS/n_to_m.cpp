#include <stdio.h>

int main() {
    int N, M;
    int cnt = 0;
    scanf("%d %d", &N, &M);

    for (N; N <= M; N++) {
        if (cnt < 7) {
            printf("%d ", N);
            cnt++;
        }
        else if (cnt == 7) {
            printf("%d\n", N);
            cnt = 0;
        }
    }


    return 0;
}