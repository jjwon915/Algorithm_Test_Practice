#include <stdio.h>
#pragma warning(disable:4996)

int main() {
	int n, sum = 0;
	scanf("%d", &n);

	char numbers[100];
	scanf("%s", &numbers);

	for (int i = 0; i < n; i++) {
		sum += numbers[i] - '0';
	}

	printf("%d", sum);

	return 0;
}