// 공주 구하기(조세퍼스)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)


int main() {
	//freopen("input.txt", "rt", stdin);

	int n, k;
	scanf("%d %d", &n, &k);

	vector<int> a(n+1);
	int pos = 0, cnt = 0, bp = 0;

	while (true) {
		pos++;
		if (pos > n) {
			pos = 1;
		}

		if (a[pos] == 0) {
			cnt++;
			if (cnt == k) {
				a[pos] = 1;
				cnt = 0;
				bp++;
			}
		}
		
		if (bp == n - 1) {
			break;
		}
	}

	for (int i = 1; i <= n; i++) {
		if (a[i] == 0) {
			printf("%d\n", i);
			break;
		}
	}

	return 0;
}