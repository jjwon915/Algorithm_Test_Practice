// 3등의 성적은?(선택정렬)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int a[100], n, index, tmp;

	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < n-1; i++) {
		index = i;
		for (int j = index; j < n; j++) {
			if (a[index] < a[j]) index = j;
		}
		tmp = a[index];
		a[index] = a[i];
		a[i] = tmp;
	}

	int res = 1;
	for (int i = 1; i < n; i++) {
		if (a[i] < a[i - 1])res++;
		if (res == 3) {
			printf("%d", a[i]);
			break;
		}
	}
	return 0;
}