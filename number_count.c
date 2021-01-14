//백준알고리즘_2577번_숫자의 개수
#include <stdio.h>

int main() {
    int a, b, c;
    int result;
    int array[10] = { 0, };

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    int next = a * b * c;

    while (next > 0) {
        result = next % 10;
        next = next / 10;
        array[result]++;
    }

    for (int i = 0; i < 10; i++) {
        printf("%d\n", array[i]);
    }

    return 0;
}