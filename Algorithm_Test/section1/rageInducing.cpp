// 분노 유발자
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n;
	scanf("%d", &n);

	int a[100];
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}
	
	int max = a[n - 1];
	int count = 0;

	for (int i = n-2; i > -1; i--) {
		if (a[i] > max) {
			max = a[i];
			count++;
		}
	}

	printf("%d", count);

	return 0;
}