// 멀티태스킹(카카오 먹방문제 변형)
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int a[2001];
int main() {
	//freopen("input.txt", "rt", stdin);

	int n, p = 0, cnt = 0, tot = 0;
	scanf("%d", &n);
	
	for (int i = 1; i <= n; i++) {
		scanf("%d", &a[i]);
		tot += a[i];
	}

	int k;
	scanf("%d", &k);
	if (k >= tot) {
		printf("-1\n");
		return 0;
	}

	while (1) {
		p++;
		if (p > n) p = 1;
		if (a[p] == 0) continue;
		a[p]--;
		cnt++;
		if (cnt == k) break;
	}

	while (1) {
		p++;
		if (p > n) p = 1;
		if (a[p] != 0) break;
	}

	printf("%d\n", p);
	
	return 0;
}