// 마구간 정하기(이분검색 응용)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int n;
int Count(int len, int a[]) {
	int i, cnt = 1, pos = a[1];
	for (i = 2; i <= n; i++) {
		if (a[i] - pos >= len) {
			cnt++;
			pos = a[i];
		}
	}
	return cnt;
}

int main() {
	//freopen("input.txt", "rt", stdin);

	int c;
	scanf("%d %d", &n, &c);

	int* a = new int[n + 1];

	for (int i = 1; i <= n; i++) {
		scanf("%d", &a[i]);
	}

	sort(a + 1, a + n + 1);
	int rt = a[n], lt = 1, mid, res;

	while (lt <= rt) {
		mid = (lt + rt) / 2;
		if (Count(mid, a) >= c) {
			res = mid;
			lt = mid + 1;
		}
		else rt = mid - 1;
	}

	printf("%d", res);
	delete[] a;
	
	return 0;
}