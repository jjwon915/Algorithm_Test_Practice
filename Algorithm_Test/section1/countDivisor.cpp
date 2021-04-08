// 모두의 약수
#include <stdio.h>
using namespace std;
#pragma warning(disable: 4996)

int cnt[50001];
int main() {
	//freopen("input.txt", "rt", stdin);

	int n, i, j;
	scanf("%d", &n);

	for (i = 1; i <= n; i++) {
		for (j = i; j <= n; j = j + i) {
			cnt[j]++;
		}
	}

	for (i = 1; i <= n; i++) {
		printf("%d ", cnt[i]);
	}
	

	/* 제한시간 1초 초과(시간복잡도 n제곱)
	for (int i = 1; i <= a; i++) {
		for(int j = 1; j <= i; j++) {
			if (i % j == 0)
				cnt++;
		}
		printf("%d ", cnt);
		cnt = 0;
	}
	*/
	return 0;
}