#include <stdio.h>
#pragma warning(disable:4996)

int main() {
    int n;
    scanf("%d", &n);

    double average;

    double exam[1000];
    for (int i = 0; i < n; i++) {
        scanf("%lf", &exam[i]);
    }

    double max = 0;
    int a;
    for (int i = 0; i < n; i++) {
        if (exam[i] > max) {
            max = exam[i];
            a = i;
        }
    }

    double sum = 0;
    for (int i = 0; i < n; i++) {
        sum = sum + exam[i] / max * 100;
    }

    average = sum / n;

    printf("%lf", average);

    return 0;
}