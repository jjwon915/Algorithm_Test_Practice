// 삽입정렬
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	freopen("input.txt", "rt", stdin);

	int n, a[100];
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	int tmp, i, j;
	
	for (i = 0; i < n; i++) {
		tmp = a[i];
		for (j = i - 1; j >= 0; j--) {
			if (a[j] > tmp) {
				a[j + 1] = a[j];
			}
			else break;
		}
		a[j + 1] = tmp;
	}

	for (int i = 0; i < n; i++) {
		printf("%d ", a[i]);
	}
	return 0;
}