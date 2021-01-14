// N부터 M까지 출력하는 프로그램을 작성.
// N과 M을 공백을 두고 입력받아 N부터 M까지 출력하는 프로그램.

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