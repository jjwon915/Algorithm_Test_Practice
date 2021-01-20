#include <stdio.h>
#include <string.h>
#pragma warning(disable:4996)

int main() {
    int T;
    scanf("%d", &T);

    char arr[80];

    for (int i = 0; i < T; i++) {
        int score = 0;
        int sum = 0;
        scanf("%s", &arr);
        for (int j = 0; j < strlen(arr); j++) {
            if (arr[j] == 'O') {
                score++;
                sum = sum + score;
            }
            else {
                score = 0;
            }
        }

        printf("%d\n", sum);
    }

    return 0;
}