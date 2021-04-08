// 연속 부분 증가수열
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int main() {
	//freopen("input.txt", "rt", stdin);

	int n, pre, now, cnt = 0, max;
	int large = -217000000;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &now);
		if (i == 0) {
			cnt = 1;
			max = cnt;
			pre = now;
		}
		else {
			if (now >= pre) {
				cnt++;
				pre = now;
				if (cnt > max) max = cnt;
			}
			else {
				cnt = 1;
				pre = now;
			}
		}
	}

	printf("%d", max);

	return 0;
}