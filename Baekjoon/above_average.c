#include <stdio.h>
#pragma warning(disable:4996)

int main() {
    int c, n;
    scanf("%d", &c);

    for (int i = 0; i < c; i++) {
        int arr[1000];
        int cnt = 0, sum = 0;
        double avg;
        scanf("%d", &n);


        for (int j = 0; j < n; j++) {
            scanf("%d", &arr[j]);
            sum += arr[j];
        }

        avg = (double)sum / n;

        for (int s = 0; s < n; s++) {
            if (avg < arr[s])
                cnt++;
        }

        printf("%.3f%%\n", (float)cnt * 100 / n);
    }

    return 0;
}