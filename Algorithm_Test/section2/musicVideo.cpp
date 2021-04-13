// 뮤직비디오(이분검색 응용 : 결정 알고리즘)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int a[1001], n;

int Count(int size) {
	int i, cnt = 1, sum = 0;
	for (i = 1; i <= n; i++) {
		if (sum + a[i] > size) {
			sum = a[i];
			cnt++;
		}
		else {
			sum += a[i];
		}
	}
	return cnt;
}

int main() {
	//freopen("input.txt", "rt", stdin);

	int m, lt = 1, rt = 0, mid, res, max = -2147000000;
	scanf("%d %d", &n, &m);

	for (int i = 1; i <= n; i++) {
		scanf("%d", &a[i]);
		rt += a[i];
		if (a[i] > max) max = a[i];
	}

	while (lt <= rt) {
		mid = (lt + rt) / 2;
		if (mid >= max && Count(mid) <= m) {
			res = mid;
			rt = mid - 1;
		}
		else {
			lt = mid + 1;
		}
	}

	printf("%d\n", res);

	return 0;
}