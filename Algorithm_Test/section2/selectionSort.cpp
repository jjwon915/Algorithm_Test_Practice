// 선택정렬
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, tmp;
	scanf("%d", &n);

	vector<int> a(n);
	for (int i = 0; i < n; i++) {
		scanf("%d", &a[i]);
	}

	for (int i = 0; i < n - 1; i++) {
		for (int j = i + 1; j < n; j++) {
			if (a[i] > a[j]) {
				tmp = a[j];
				a[j] = a[i];
				a[i] = tmp;
			}
		}
	}

	for (int i = 0; i < n; i++) {
		printf("%d ", a[i]);
	}
	return 0;
}