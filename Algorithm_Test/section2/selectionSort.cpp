// 선택정렬
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
			if (a[index] > a[j]) index = j;
		}
		tmp = a[index];
		a[index] = a[i];
		a[i] = tmp;
	}

	for (int i = 0; i < n; i++) {
		printf("%d ", a[i]);
	}
	return 0;
}