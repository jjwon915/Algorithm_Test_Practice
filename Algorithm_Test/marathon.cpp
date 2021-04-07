// 마라톤
#include <stdio.h>
#include <algorithm>
#include <vector>
using namespace std;
#pragma warning(disable: 4996)

int a[100];
int minus[100];
int main() {
	//freopen("input.txt", "rt", stdin);

	int n, cnt;
	scanf("%d", &n);

	vector<int> a(n + 1);

	for (int i = 1; i <= n; i++) {
		scanf("%d", &a[i]);
	}

	printf("1 ");

	for (int i = 2; i <= n; i++) {
		cnt = 0;
		for (int j = i - 1; j >= 1; j--) {
			if (a[j] >= a[i])
				cnt++;
		}
		printf("%d ", cnt + 1);
	}

	return 0;
}