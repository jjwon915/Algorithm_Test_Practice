// 연도를 입력받아 윤년인지 판단.
// 윤년은 4의 배수이며 100의 배수는 아닌 연도 또는 400의 배수인 연도

#include <stdio.h>

int main() {
    int N;
    scanf("%d", &N);
    if (((N % 4) == 0) && (N % 100 != 0)) {
        printf("YES");
    }
    else if (N % 400 == 0) {
        printf("YES");
    }
    else printf("NO");

    return 0;
}